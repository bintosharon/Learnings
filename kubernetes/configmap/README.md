```
minikube start
minikube -p minikube docker-env
eval $(minikube docker-env)

kubectl create configmap f-config --from-literal=SERVER_URL=https://www.f.me
```
verify by kubectl get cm or kubectl describe cm f-config

create the configmap yaml file
`kubectl create -f f-nginx-pod.yaml`
To verify whether properly created:
`kubectl exec -it fresco-nginx-pod -- sh -c | grep SERVER_URL_ENV`
output expected: https://www.f.me






 
