# LeanIX SDK for Java #

LeanIX API version v1, https://developer.leanix.net

## Overview ##
This SDK contains wrapper code used to call the LeanIX REST API from Java.

The SDK also contains two simple examples. The code in [samples/ServicesTest.java](samples/console/ServicesTest.java) demonstrates the basic use of the SDK to read Applications from the leanIX Inventory. The code in [samples/ProjectsTest.java](samples/console/ProjectsTest.java) demonstrates the basic use of the SDK for Projects in leanIX.

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

You can find the LeanIX REST API documentation here [https://app.leanix.net/demo/api/v1/](https://app.leanix.net/demo/api/v1/). The documentation is interactive - if you are logged in to your workspace and the REST API is activated, you can try out every function directly from the documentation.


## Including the SDK in your project ##

The easiest way to incorporate the SDK into your Java project is to use Maven. If you're using Maven already, simply add a new dependency to your `pom.xml`. The sdk is published into the central maven repository at http://search.maven.org/

```xml
<dependency>
    <groupId>net.leanix</groupId>
    <artifactId>leanix-sdk-java</artifactId>
    <version>2.1.5</version>
</dependency>
```

If you'd prefer to build the SDK yourself, it's as simple as running

```bash
$ mvn package
```

You'll find `leanix-sdk-java-2.1.5.jar`, together with a sources jar and a javadoc jar in the target directory after the build completes.
In `target/lib` you will find the required libraries to use the SDK.

## Usage ##

In order to use the SDK in your Java application, import the following packages:

```java
import net.leanix.api.*;
import net.leanix.api.common.*;
import net.leanix.api.models.*;
```

You need to instantiate a LeanIX API Client (ApiClient) which can be easily created using the builder class ApiClientBuilder.
An important property of the ApiClient is the URL to the REST API of your workspace. Please replace `demo` with the name of your workspace.
You also need to provide the API token and the hostname of the token provider here.

```java
ApiClient apiClient = new ApiClientBuilder()
    .withBasePath("https://app.leanix.net/demo/api/v1")
    .withApiToken("NOnrUpMXEh87xbDCYkLfrBmfbzLOFznjqVqEbNMp")
    .withTokenProviderHost("svc.leanix.net"))
    .build();
```

You can then use an API class to execute functions. For each Fact Sheet in LeanIX there is one API class, e.g. for the Fact Sheet "Application" the API class is called `ServicesApi`. To print the names of all applications which match the full-text search of "design", you could do the following:

```java
ServicesApi servicesApi = new ServicesApi(apiClient);
List<Service> services = servicesApi.getServices(false, "design");
for (Service cur : services) {
	System.out.println(cur);
}
```

### Using a proxy
In case that you need to use a proxy to access LeanIX you can setup a http proxy by setting the standard proxy system properties:

```
-Dhttp.proxyHost=<proxy hostname>
-Dhttp.proxyPort=<proxy port> (default is 80)
```

## Instructions for SDK developers

### Testing

The SDK contains units tests, but note: to operate on a defined data stock,
each test creates a fresh workspace and deletes it afterwards.
So it is really intended to be used by LeanIX developers only.

The tests can be executed as follows:

```bash
$ mvn test \\
    -Dapi.hostname=local-eam.leanix.net \\
    -Dapi.clientId=<clientID used generate workspace and permissions, optional, default: eam> \\
    -Dapi.clientSecret=<secret for clientID> \\
    -Dapi.token=<Personal Access Token, optional, only required, when no clientID/clientSecret is used> \\
    -Dapi.mtm.hostname=<host on which mtm is running, optional, default is: api.hostname>
    -Djava.util.logging.config.file=./target/test-classes/logging.properties

# E.G.: When running on development environment with virtual hostname 'boot2docker.leanix.net':
$ mvn test \\
  -Dapi.hostname=boot2docker.leanix.net \\
  -Dapi.clientSecret=ldtP4b9o3K6IkKm3SolA_eam \\
  -Djava.util.logging.config.file=./target/test-classes/logging.properties
  
# Using the API-Token and running against 'local-eam.leanix.net'
# with Contract 'leanix eam REGULAR 2016-05-30'
$ mvn test -Dapi.hostname=local-eam.leanix.net \
    -Dapi.token=SvP6eADtbyC6PzLpSK9CmsxQcxnWEcXQxaEkxvan \
    -Dcontract.displayname="leanix eam REGULAR 2016-05-30"
```
> In case of using an API-Token for authentication, be aware that the owner of the API-Token has the role SUPERADMIN.

### Updating

#### Generate from swagger.json

To generate the SDK from the latest REST API use the following maven commands:

```bash
$ mvn clean package -Pcodegen

# generate junit test classes
$ cd codegen
$ mvn package
```
> Update the pom.xml properties section so specify the host where the swagger doc-api is pulled from.


#### Deploy to Maven Central ###

Details can be read here: http://central.sonatype.org/pages/apache-maven.html

Add LeanIX Developer GPG key and make sure gpg is installed
```bash
$ gpg --import private.key
```

Create maven settings.xml file (in ~/.m2/settings.xml) with Sonatype account info:
```xml
<settings>
  <servers>
    <server>
      <id>ossrh</id>
      <username>andre_christ</username>
      <password>PASSWORD</password>
    </server>
  </servers>
</settings>
```

To create a package without tests do:
```bash
mvn package -Dmaven.test.skip=true
```

## Thank You ##
This API made use of the swagger-* libraries which help you to describe REST APIs in an elegant way. See here for more details: https://github.com/wordnik/swagger-codegen

## Copyright and license ##

Copyright 2015, 2016 LeanIX GmbH under [the MIT license](LICENSE).
