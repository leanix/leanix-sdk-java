#!/bin/bash
mvn compile exec:java -Dexec.mainClass=BenchmarkA -Dapi.basePath=$1/api/v1 -Dapi.key=$2 -Drandom.seed=${3:-0} -Dservices.count=${4:-10} -DresourcesPerServices.count=${5:-5} 
