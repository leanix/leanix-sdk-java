# LeanIX EAM SDK Benchmark

Allows to run benchmarks via REST API

## Benchmarks

### Benchmark A

Creates X Services and for each Service Y IT Components

	Seed = 0, Services = 100, resourceHasServices = 5
	./benchmark-a.sh https://local-eam.leanix.net/santander1 9c6b792695ed4add953e278c0f0c7a75 0 100 5

When inserting again into same workspace, make sure you increase the seed, to ensure that names stay unique

### Benchmark B

Creates X Services with User Groups, Business Capabilities and for each Service Y IT Components. Also creates
Lifecycles for Services and for IT Components in order to show matrix and technology risk.

	Seed = 0, Services = 100, resourceHasServices = 5
	./benchmark-b.sh https://local-eam.leanix.net/santander1 9c6b792695ed4add953e278c0f0c7a75 0 100 5

## Results

See Excel file
