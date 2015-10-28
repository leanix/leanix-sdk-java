 # LeanIX EAM SDK Benchmark

Allows to run benchmarks via REST API

## Benchmarks

### Benchmark A

Creates X Services and for each Service Y IT Components

#### Using a dedicated workspace and seed
	Seed = 0, Services = 100, resourceHasServices = 5
	./benchmark-a.sh https://local-eam.leanix.net/santander1 9c6b792695ed4add953e278c0f0c7a75 0 100 5

When inserting again into same workspace, make sure you increase the seed, to ensure that names stay unique

#### Automatic increasing the seed
	./benchmark-a2.sh <virutal host name> <API Key> <eam client secret> [#services] [#resourceHasService]
	# eg:	Services = 1, resourcesHasServices = 2
	./benchmark-a2.sh boot2docker.leanix.net 47df6d16f009461082abaa9378eec0b8 ldtP4b9o3K6IkKm3SolA_eam 1 2
When using this variante, the benchmarks test first creates a new Workspace and increases the seed each time a new service is inserted. The increased seed will be save in file system, so a rerun of this script will not cause any name conflicts. When using the system property 'api.workspaceName' you can work always on the same workspace.

### Benchmark B

Creates X Services with User Groups, Business Capabilities and for each Service Y IT Components. Also creates
Lifecycles for Services and for IT Components in order to show matrix and technology risk.

	Seed = 0, Services = 100, resourceHasServices = 5
	./benchmark-b.sh https://local-eam.leanix.net/santander1 9c6b792695ed4add953e278c0f0c7a75 0 100 5

## Results

See Excel file
