#!/bin/bash
if [[ $# -eq 0 ]] ; then
    echo "./benchmark-demo [seed]"
    exit 0
fi

START_TIME=$SECONDS
mvn compile exec:java -Dexec.mainClass=BenchmarkA -Dapi.basePath=https://local-eam.leanix.net/demo/api/v1 -Dapi.key=55b7b4453a5845ed8370ab3a806e63f7 -Drandom.seed=${1:-0} -Dservices.count=${2:-10} -DresourcesPerServices.count=${3:-5} 
echo $(($SECONDS - $START_TIME))
echo " seconds elapsed"

