# LeanIX EAM SDK Benchmark

Allows to run benchmarks against LeanIX eam via REST API.

## General start of a benchmark class

	mvn exec:java -Dexec.mainClass=BenchmarkC \\
		-Dapi.hostname=<host the test runs against> \\
		-Dapi.clientSecret=<client secret of EAM> \\
		-DkeepWorkspace=< 'y' or 'n' if you want do remain workspace after test>
	
	# eg:
	mvn exec:java -Dexec.mainClass=BenchmarkC \\
		-Dapi.hostname=boot2docker.leanix.net \\
		-Dapi.clientSecret=ldtP4b9o3K6IkKm3SolA_eam \\
		-DkeepWorkspace=y

## Benchmarks
> Update the run-bench-local.sh script with your settings!
 
The benchmarks are intendet to measure the speed of LeanIX EAM system. You can configure each test to use a specified workspace during its run (api.workspaceName) and to remove or remain the test workspace after the benchmark run has finished (keepWorkspace). See `BaseBenchmarkTests`and `ConfigurationProvider`for more details how to configure the tests.

### Benchmark A

Creates X Services in LeanIX and for each Service Y IT Components.

#### Using a dedicated workspace and seed
	Seed = 0, Services = 100, resourceHasServices = 5
	./benchmark-a.sh https://local-eam.leanix.net/demo 9c6b792695ed4add953e278c0f0c7a75 0 100 5

When inserting again into same workspace, make sure you increase the seed, to ensure that names stay unique

#### Automatic increasing the seed
	./benchmark-a2.sh <virutal host name> <API Key> <eam client secret> [#services] [#resourceHasService]
	# eg:	Services = 1, resourcesHasServices = 2
	./benchmark-a2.sh boot2docker.leanix.net 47df6d16f009461082abaa9378eec0b8 ldtP4b9o3K6IkKm3SolA_eam 1 2
When using this variante, the benchmarks test first creates a new Workspace and increases the seed each time a new service is inserted. The increased seed will be save in file system, so a rerun of this script will not cause any name conflicts.

### Benchmark B

Creates X Services with User Groups, Business Capabilities and for each Service Y IT Components. Also creates
Lifecycles for Services and for IT Components in order to show matrix and technology risk.

	Seed = 0, Services = 100, resourceHasServices = 5
	./benchmark-b.sh https://local-eam.leanix.net/santander1 9c6b792695ed4add953e278c0f0c7a75 0 100 5

#### Automatic increasing the seed
	./benchmark-b2.sh <virutal host name> <API Key> <eam client secret> [#services] [#resourceHasService]
	# eg:	Services = 1, resourcesHasServices = 2
	./benchmark-b2.sh boot2docker.leanix.net 47df6d16f009461082abaa9378eec0b8 ldtP4b9o3K6IkKm3SolA_eam 1 2

### System properties
* -Dapi.workspaceName : used to specify a dedicated workspace to use
* -D keepWorkspace : true, y or false, n, true means the workspace wil not deleted after run
* -Drandom.seed : used to specify the seed used to generate random words
* -dapi.hostname: host name, like local-eam.leanix.net
* -Dapi.clientSecret: the client secret, like mlka4C2mYr0zqyOecLqN
* -Dservices.count: number of services to create
* -DresourcesPerServices.count: number of resources per services to create
* ... See the concrete Benchmark test classes for more configuration properties.

## Results

The result of each test will be stored in a junit result file with filename:

	/benchmark/**/TEST-BENCHMARK_*.xml
