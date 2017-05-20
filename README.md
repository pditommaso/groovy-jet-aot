Groovy JET AOT 
===============

Proof of concept of Groovy AOT compilation with [Excelsior JET](https://www.excelsiorjet.com/).

Getting started 
---------------

1. Download and install [Excelsior JET](https://www.excelsiorjet.com/), 
then add compiler `bin/` folder to your `$PATH` variable. 


2. Clone  this repository: 

```
git clone https://github.com/pditommaso/groovy-jet-aot.git && cd groovy-jet-aot
``` 
 
3. Compile the project with the following command: 

```
./gradlew jetBuild
```

4. Run it 

```
./build/jet/app/hello Hello world
```
 
 