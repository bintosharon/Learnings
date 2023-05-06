    #sudo su -
    #Use 
    #bash dockerubuntu.sh
    
    # Docker Mastery: with Kubernetes +Swarm from a Docker Captain Notes
    
    ## Sample Dockerfile for python with flask framework
    
    ` 
    FROM python
    RUN pip install flask
    WORKDIR /app
    COPY . .
    CMD python app.py
    `
    ##

    
