    #sudo su -
    #Use 
    #bash dockerubuntu.sh
    
# Docker Mastery: with Kubernetes +Swarm from a Docker Captain Notes
    
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

    
