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
```
> Update the pom.xml properties section so specify the host where the swagger doc-api is pulled from.


#### Deploy to Maven Central ###

The following is done by the CI server when pushing a new version to master.
To release, just use the ordinary maven-jgitflow mechanism:

Make sure your local develop and master branches are up-to-date and clean, then

```
mvn jgitflow:release-start
mvn jgitflow:release-finish
```

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
