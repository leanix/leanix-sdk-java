#!/bin/bash
mvn compile exec:java -Dexec.mainClass=BenchmarkA -Dapi.basePath=https://local-eam.leanix.net/benchmark/api/v1 -Dapi.key=482a56b550de467c9508575d93de000a -Dservices.count=500 -DresourcesPerServices.count=10
