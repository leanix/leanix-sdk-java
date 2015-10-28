#!/bin/bash
mvn compile exec:java -Dexec.mainClass=BenchmarkB -Dapi.hostname=$1 -Dapi.key=$2 -Dapi.clientSecret=$3 -Dservices.count=${4:-2} -DresourcesPerServices.count=${5:-2} 
