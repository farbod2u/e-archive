#!/bin/bash

mvn clean package -f ./pom.xml -DskipTests

mvn install:install-file \
   -Dfile=`ls target/*.jar` \
   -DgroupId=io.github.farbod2u \
   -DartifactId=lib-exception \
   -Dversion=1.0 \
   -Dpackaging=jar \
   -DgeneratePom=true