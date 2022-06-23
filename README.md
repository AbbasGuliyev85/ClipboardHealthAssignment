# Instructions

## Dependencies
These are the project dependencies
```
slf4j-simple:1.7.36
selenium-java:4.1.4
junit:4.13.2
cucumber-junit:7.2.3
cucumber-core:7.2.3
webdrivermanager:5.1.0
```
Also you need to have Maven installed

## Run
```
mvn install
```

## Possible Improvements

- To keep it simple I did not made all the steps customizable, in the actual production code usually we make the steps generic to keep the code DRY
- Switch window functionality can also be improved to match and switch to the exact tab
- I have experience with running the docker images but not so much when it comes to the building the custom ones. I made work at some point but there were some issues therefore to not prolong the process I did not dockerize the project
