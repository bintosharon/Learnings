```
minikube start
minikube -p minikube docker-env
eval $(minikube docker-env)

kubectl create configmap f-config --from-literal=SERVER_URL=https://www.fresco.me
```




 
