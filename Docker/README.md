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
* default docker virtual network is bridge which is nat'ed behind the host ip
* default subnet: 172.17.0.0 which can be changed
* host network: special network that skips virtual networking of docker and attachs dirrectly to host interface
* none - not attached to anything
* we can create our own networks
### Contianer port check

`docker contianer port <container>`

### To get more info like Ip address of and container
`docker inspect <container>`
`docker container inspect --format "{{ .NetworkSettings.IPAddress}}" <contianer name> `

### some commands
`
docker network ls #show networks
docker network inspect #inspect a network
    docker network inspect bridge # will also list out the container connected to the network
docker network create --driver # create new network
docker network connect #attach a network to container | networkname containername 
docker network disconnect
`

* docker network create my_app_net # creates defualt bridge nw
* docker network create --help
* `docker run -d --name nginbox --network my_app_net nginx`
        `docker network inspect my_app # will show that the container nginbox is connected` 
        
* default bridge network doeesnt have DNS server so we have to use --link when creating container

### Images
* `docker history nginx:latest`
* `docker image inspect`
### Other Commands
`
docker image tag --help
docker image tag <image going to be tagged> <your tag goes here> # docker image tag nginx sharonbinto/nginx
docker image push
docker login
docker logout

`

### Dockerfile

`
docker build -f some-dockerfile
`

### Sample nginx dockerfile

`
FROM nginx:latest
WORKDIR /usr/share/nginx/html
COPY index.html index.html
`
### Docker cleaning

`docker system clean`

## Volume

### commands

`
docker volume inspect
docker volume ls
docker run -d --name mysql -e MYSQL_ALLOW_EMPTY_PASSWORD=True -v mysql-db:/var/lib/mysql mysql # naming the volume.

docker volume create --help `
### bind mounting - 
* starts with forward slash
* cannot be written in dockerfile
` run -v /Users/binto/stuff:/path/container   - mac/linux
run -v //c/Users/binto/stuff:/path/container - windows

docker run -d --nginx -p 80:80 -v $(pwd):/usr/share/nginx/html nginx
`
docker container logs -f <container name>

    
 ## docker compose
    
 `   docker-compose.yml
    can be used with docker-compose -f `
    
    `
    version:
    services:
      servicename:
        image:
        command:
        environment:
      servicename2"
    volumes:
    network
    `
    
## important link
- ***[Docker file Syntax](https://docs.docker.com/engine/reference/builder/)***
- ***[Compose file Syntax](https://docs.docker.com/compose/compose-file/compose-file-v3/)***
 
### Docker compose commands
`
 docker-compose help
 docker-compose up
 docker-compose down
 docker-compose logs
 docker-compose down -v
 docker-compose down -rmi
    
    
    `
### Docker Swarm commands
`
    docker swarm init
    docker node ls
    docker node --help
    docker swarm --help
    docker service --help #docker run
    docker service create alpine ping 8.8.8.8
`
    
  
