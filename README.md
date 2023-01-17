
# E-Archive

An electronic archiving system to store all image files of all Branches of an Organization.

## Build and Run
```bash
  cd [to e-archive directory]
  $ ./build.sh
```
## Stopping 
```bash
  cd [to e-archive directory]
  $ docker-compose -f ./file-compose.yml down
```

## Ports

``` bash
    branch-service: 8091
    mongodb: 27091
    mongo-express: 8081
```
``` bash
    archive-service: 8092
    mongodb: 27092
    mongo-express: 8082
```
```bash
    read-file: 8093
```
```bash
    write-file: 8094
```
