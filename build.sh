#!/bin/bash

mvn clean package -f ./read-file/pom.xml -DskipTests
mvn clean package -f ./write-file/pom.xml -DskipTests

docker image build  read-file/ -t file-management-read
docker image build  write-file/ -t file-management-write

docker-compose -f ./file-compose.yml up