#!/bin/bash

mvn exec:java -Dexec.mainClass=${1:-BenchmarkA} -Dapi.hostname=local-eam.leanix.net -Dapi.clientSecret=mlka4C2mYr0zqyOecLqN \
-Dservices.count=10 \
-DresourcesPerServices.count=5

