#!/bin/bash
mvn compile exec:java -Dexec.mainClass=BenchmarkA -Dapi.basePath=https://local-eam.leanix.net/benchmarka1/api/v1 -Dapi.key=8cfc99f32092449190a1fc63f413492b -Dservices.count=50 -DresourcesPerServices.count=5
