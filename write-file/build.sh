#!/bin/bash

mvn clean package -f ./pom.xml -DskipTests

docker image build . -t file-management-write

docker-compose -f ./docker-compose.yml up