    #sudo su -
    #Use 
    #bash dockerubuntu.sh
    
    
  
# Docker Mastery: with Kubernetes +Swarm from a Docker Captain Notes
## --help
### Sample Dockerfile for python with flask framework
    
    ` 
    FROM python
    RUN pip install flask
    WORKDIR /app
    COPY . .
    CMD python app.py
    `
### running up a httpd

`
docker run -d -p 8800:80 httpd

`
open port 8800 on my host I will access remotely. go into container 80 where apache is listening on
httpd - apache daemon

### Running stopped container
`
docker container start -ai <name of stopped container>
`
### Start new container interactively
`
docker container run -it <container name> <command you want to execute  inside eg:bash>
`
### Run additional command in existing container
`
docker container exec -it <container name> <command you want to execute  inside eg:bash>
`  
### Alpine

* Light weight linux distribution - very small - 3.98MB

* bash isnt present in the container - alpine, but sh is present which isnt as full fledged as bash

* use apk if really needed

## Docker networks

### Contianer port check

`docker contianer port <container>`

### To get more info like Ip address of and container
`docker inspect <container>`
`docker container inspect --format "{{ .NetworkSwttings.IPAdress}}" `
