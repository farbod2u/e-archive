
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

## Services  Port

- branch-service: **8091**
- archive-service: **8092**
- read-file: **8081**
- write-file: **8082**
