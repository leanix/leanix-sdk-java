#!/bin/bash

mvn clean test -Dapi.baseurl=https://local-eam.leanix.net -Dapi.mtm.baseurl=https://local-svc.leanix.net -Dapi.tokenUrl=https://local-svc.leanix.net/services/mtm/v1/oauth2/token -Dapi.verificationUrl=https://local-svc.leanix.net/services/mtm/v1/oauth2/verify -Dapi.clientId=eam -Dapi.clientSecret=muiyai6eewax6exei5Da -Dapi.userEmail=adm@leanix.net -Dapi.key=superadminkey -Djava.util.logging.config.file=./target/test-classes/logging.properties -Dtest=**/UserSubscriptionApiTest
