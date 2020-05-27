# LeanIX SDK for Java #

LeanIX API version v1, https://developer.leanix.net

## Overview ##
This SDK contains wrapper code used to call the LeanIX GraphQL and REST APIs from Java.

The SDK also contains one simple example. The code in [samples/simpleCalls](samples/simpleCalls/src/main/java/net/leanix/pathfinder/samples/simpleCalls/Main.java) demonstrates the basic use of the SDK to read Applications from the leanIX Inventory.

## Prerequisites ##

### API token
In order to use the code in this SDK, you need an API token to access a workspace.
As a workspace administrator, you can generate it yourself in the LeanIX application under Administration.

The API token acts as credentials to access a LeanIX workspace as the user who generated the token.
Hence you should take care to keep it private, for example by using a password safe application.

The LeanIX REST API uses OAuth2 access tokens to protect its resources. The SDK transparently uses the
API token that is set in the ApiClient to obtain such an access token from the token provider.
The host name of the token provider is normally "svc.leanix.net".

### Swagger documentation

You can find the LeanIX GraphQL API documentation here [https://dev.leanix.net/docs](https://dev.leanix.net/docs) and the LeanIX REST API documentation here [https://app.leanix.net/services/pathfinder/v1/docs/](https://app.leanix.net/services/pathfinder/v1/docs/). The documentation of the REST API is interactive - if you are logged in to your workspace and the REST API is activated, you can try out every function directly from the documentation. Alternatively, you can enter an API Token in the text field at the top.

For the GraphQL API, there is a nice tool to explore the schema and experiment with querys. It is called GraphiQL and can be found in the Administration/Developers/Tools section.  


## Including the SDK in your project ##

The easiest way to incorporate the SDK into your Java project is to use Maven. If you're using Maven already, simply add a new dependency to your `pom.xml`. The sdk is published into the central maven repository at http://search.maven.org/

```xml
<dependency>
    <groupId>net.leanix</groupId>
    <artifactId>leanix-sdk-java</artifactId>
    <version>3.9.29</version>
</dependency>
```

If you'd prefer to build the SDK yourself, it's as simple as running

```bash
$ mvn package
```

You'll find `leanix-sdk-java-3.9.29.jar`, together with a sources jar and a javadoc jar in the target directory after the build completes.
In `target/lib` you will find the required libraries to use the SDK.

## Usage ##

In order to use the SDK in your Java application, import the following packages:

```java
import net.leanix.api.*;
import net.leanix.api.common.*;
import net.leanix.api.models.*;
```

You need to instantiate a LeanIX API Client (ApiClient) which can be easily created using the builder class ApiClientBuilder.
You need to provide the API token and the hostname of the token provider here. The workspace will be determined by the API token used. If you use a dedicated instance you need to adapt the base path correspondingly.

```java
ApiClient apiClient = new ApiClientBuilder()
    .withBasePath("https://app.leanix.net/services/pathfinder/v1")
    .withApiToken("NOnrUpMXEh87xbDCYkLfrBmfbzLOFznjqVqEbNMp")
    .withTokenProviderHost("app.leanix.net")
    .build();
```

You can then use an API class to execute functions. For each of the different REST resources of LeanIX, there is one API class (for the Fact Sheet resource the class is called FactSheetsApi). Additionally, there is one API class called GraphqlApi for GraphQL queries. 
In order to print the names of all applications which match the full-text search of "design", the GraphQL request could look like this:

```java
GraphqlApi graphqlApi = new GraphqlApi(apiClient);

String query = "{" + 
  "allFactSheets(filter: {fullTextSearch: \"design\"}) {" + 
    "edges { node {id displayName}}" + 
  "}" + 
"}";

GraphQLRequest graphqlRequest = new GraphQLRequest();
graphqlRequest.setQuery(query);

GraphQLResult graphqlResult = graphqlApi.processGraphQL(graphqlRequest);

Map<String, Map<String, Object>> data = (Map<String, Map<String, Object>>) graphqlResult.getData();
List<Map<String, Object>> edgeList = (List<Map<String, Object>>) data.get("allFactSheets").get("edges");

for (Map<String, Object> edge : edgeList) {
  Map<String, Object> node = (Map<String, Object>) edge.get("node");
  System.out.println(node.get("displayName"));
}
```

This is the simplest approach to use the GraphQL API. If you want to page through the records found for your request, we suggest you create helper functions for iterating over the results and mapping them directly into POJOs. 
Using variables to set the startCursor value seems to be a good way to implement this, since this avoids the string replacement within a query.

If you want to change data via GraphQL you need to create a mutation an example for this looks like this:

```java
GraphQLRequest graphQLRequest = new GraphQLRequest();

String mutationQuery = "mutation ($patches: [Patch]!) {"
    + "  createFactSheet(input: {name: \"New Test App\", type: Application}, patches: $patches) {"
    + "    factSheet {"
    + "      id name"
    + "      ... on Application { release }"
    + "    }"
    + "  }"
    + "}";

graphQLRequest.setQuery(mutationQuery);

Map<String, Object> patches = new HashMap<>();
Patch patch = new Patch(PatchOperation.ADD, "/release", "4.4");
patches.put("patches", patch);
graphQLRequest.setVariables(patches);

GraphQLResult result = graphqlApi.processGraphQL(graphQLRequest);
```

In order to check if the request was successful, you need to check for the existence of an `errors` element in the GraphQLResult.

### Using a proxy
In case that you need to use a proxy to access LeanIX you can setup a https proxy by setting the standard proxy system properties:

```
-Dhttps.proxyHost=<proxy hostname>
-Dhttps.proxyPort=<proxy port> (default is 443)
```

## Instructions for SDK developers

Instructions for developers can be found here [Dev Instructions](Dev-instructions.md)

## Thank You ##
This API made use of the swagger-* libraries which help you to describe REST APIs in an elegant way. See here for more details: https://github.com/wordnik/swagger-codegen

## Copyright and license ##

Copyright 2015, 2016, 2017 LeanIX GmbH under [the MIT license](LICENSE).
