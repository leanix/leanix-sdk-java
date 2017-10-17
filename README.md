# LeanIX SDK for Java #

LeanIX API version v1, https://developer.leanix.net

## Overview ##
This SDK contains wrapper code used to call the LeanIX GraphQL and REST API from Java.

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

You can find the LeanIX GraphQL API documentation here [https://dev.leanix.net/docs](https://dev.leanix.net/docs) and the LeanIX REST API documentation here [https://app.leanix.net/services/pathfinder/v1/docs/](https://app.leanix.net/services/pathfinder/v1/docs/). The documentation of the REST API is interactive - if you are logged in to your workspace and the REST API is activated, you can try out every function directly from the documentation. For the GraphQL API a nice tool to explore the schema and experiment with querys, can be found in the administration in the Tools section. This tool is called GraphiQL.  


## Including the SDK in your project ##

The easiest way to incorporate the SDK into your Java project is to use Maven. If you're using Maven already, simply add a new dependency to your `pom.xml`. The sdk is published into the central maven repository at http://search.maven.org/

```xml
<dependency>
    <groupId>net.leanix</groupId>
    <artifactId>leanix-sdk-java</artifactId>
    <version>3.9.8</version>
</dependency>
```

If you'd prefer to build the SDK yourself, it's as simple as running

```bash
$ mvn package
```

You'll find `leanix-sdk-java-3.9.8.jar`, together with a sources jar and a javadoc jar in the target directory after the build completes.
In `target/lib` you will find the required libraries to use the SDK.

## Usage ##

In order to use the SDK in your Java application, import the following packages:

```java
import net.leanix.api.*;
import net.leanix.api.common.*;
import net.leanix.api.models.*;
import net.leanix.api.filter.*;
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

You can then use an API class to execute functions. For the different REST resources of LeanIX one API class exists (for Fact Sheets the class is called FactSheetsApi). Additionally one API class for graphQL queries is present (called GraphqlApi). 
In order to print the names of all applications which match the full-text search of "design", the graphQL request could look like this:

```java
GraphqlApi graphqlApi = new GraphqlApi(apiClient);

String fields = "id displayName";
Map<String, String> arguments = new HashMap<>();
arguments.put("filter", "$filter");
String variableDeclaration = "$filter: FilterInput!";
QueryFilter filter = new QueryFilter("Applications", null, "design");

GraphQlQueryIterator<FactSheet> applications = new GraphQLQueryIterator<>(
  "allFactSheets",
  arguments,
  fields,
  null,
  variableDeclaration,
  GraphQLHelper.buildVariables(filter, null),
  100,
  FactSheet.class,
  graphqlApi
);

while(applications.hasNext()) {
  FactSheet factSheet = queryIterator.next();
  System.out.println(factSheet.getDisplayName()); 
}
```

This uses a lot of helper functions in order to be able to use the graphQL result directly in java. You can ommit the helper functions and call the graphqlApi directly, and send a string containing the query and expect a JSON response.

### Using a proxy
In case that you need to use a proxy to access LeanIX you can setup a http proxy by setting the standard proxy system properties:

```
-Dhttps.proxyHost=<proxy hostname>
-Dhttps.proxyPort=<proxy port> (default is 80)
```

## Instructions for SDK developers

Instructions for developers can be found here [Dev-instructions.md](Dev-instructions.md)

## Thank You ##
This API made use of the swagger-* libraries which help you to describe REST APIs in an elegant way. See here for more details: https://github.com/wordnik/swagger-codegen

## Copyright and license ##

Copyright 2015, 2016, 2017 LeanIX GmbH under [the MIT license](LICENSE).
