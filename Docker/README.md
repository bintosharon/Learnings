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
### Get into a container

`
docker container exec -it <container name> <command you want to execute  inside eg:bash>
`
   
### Alpine

Light weight linux distribution - very small - 3.98MB

bash isnt present in the container - alpine
