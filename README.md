leanIX SDK for Java
===================

leanIX API version v1, https://developer.leanix.net

Overview
--------
This SDK contains wrapper code used to call the leanIX REST API from Java.

The SDK also contains two simple examples. The code in [samples/ServicesTest.java](samples/console/ServicesTest.java) demonstrates the basic use of the SDK to read Applications from the leanIX Inventory. The code in [samples/ProjectsTest.java](samples/console/ProjectsTest.java) demonstrates the basic use of the SDK for Projects in leanIX.

Prerequisites
-------------
In order to use the code in this SDK, the REST API needs to be activated in your workspace and you need your personal API Key. When you are logged in to leanIX, please go to your profile (click on the user icon in the top menu). You find a menu entry called "API / 3rd party apps". If the REST API is activated, you can generate an API Key here.

You can find the leanIX REST API documentation here https://developer.leanix.net. The documentation is interactive - if you are logged in to your workspace and the REST API is activated, you can try out every function directly from the documentation.

Including the SDK in your project
---------------------------------
The easiest way to incorporate the SDK into your Java project is to use Maven. If you're using Maven already, simply add a new dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>net.leanix</groupId>
    <artifactId>leanix-sdk-java</artifactId>
    <version>1.0.0</version>
</dependency>
```

If you'd prefer to build the SDK yourself, it's as simple as running

```bash
$ mvn package
```

You'll find `leanix-sdk-java-1.0.0.jar` in the target directory after the build completes. This single JAR contains everything needed to use the API.

Usage
-----
In order to use the SDK in your Java application, import the following packages:
```java
import net.leanix.api.*;
import net.leanix.api.common.*;
import net.leanix.api.models.*;
```

You need to instantiate a leanIX API Client. Here you define the URL to the REST API of your workspace. Please replace `demo` with the name of your workspace. Also here you need to provide the Api-Key.
```java
ApiClient client = new ApiClient();
client.setBasePath("https://app.leanix.net/demo/api/v1");
client.setApiKey("31c7cfa0b5cb755f4c7f146c92d0ad6b");
```

You can then use the API class to execute functions. For each Fact Sheet in leanIX there is one API class, e.g. for the Fact Sheet "Application" the API class is called `ServicesApi`. To print the names of all applications which match the full-text search of "design", you could do the following:
```java
ServicesApi servicesApi = new ServicesApi(client);
List<Service> services = servicesApi.getServices(false, "design");
for (Service cur : services)
{
	System.out.println(cur);
}
```

Thank You
---------
This API made use of the swagger-* libraries which help you to describe REST APIs in an elegant way. See here for more details: https://github.com/wordnik/swagger-codegen

Copyright and license
------------------------
Copyright 2013 LeanIX GmbH under [the MIT license](LICENSE).
