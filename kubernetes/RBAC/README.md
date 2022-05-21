`minikube start`
`kubectl api-versions`
should show `.rbac.authorization.k8s.io/v1`

it means RBAC is enabled and we can proceed. If not then use this command
```minikube start --extra-config=apiserver.authorization-mode=RBAC```
not
`minikube start --extra-config=apiserver.Authorization.Mode=RBAC`

continue with our problem now,

create namespace dev

```
  kubectl create ns dev
  openssl genrsa -out emp.key 2048
  openssl req -new -key emp.key -out emp.csr -subj "/CN=emp/O=dev"
```

copy the ca.crt, caa.key from ~/.minikube/

```
  cp ~/.minikube/ca.crt ca.crt
  cp ~/.minikube/ca.key ca.key
```
or you can paste the location directly on the following command like `openssl x509 -req -in emp.csr -CA ~/.mninikube/ca.crt -CAkey ~/.mninikube/ca.key -CAcreateserial -out emp.crt -days 365`
```
openssl x509 -req -in emp.csr -CA ca.crt -CAkey ca.key -CAcreateserial -out emp.crt -days 365
kubectl config set-context dev-ctx --cluster=minikube --namespace=dev --user=emp
```
kubectl config view for https
```
kubectl config set-credentials emp --client-certificate=./emp.crt  --client-key=./emp.key
```
This changes will be reflected in `cat ~/.kube/config` simultaneously

```kubectl --context=employee-context get pods```
will give us a forbidden message, we are good to go

```kubectl create role emp-role --verb=get,list --resource=pods,deployments --namespace=dev```

get the yaml by `kubectl -n dev get role emp-role -o yaml`

```kubectl create rolebinding emp-bind --role=emp-role --user=emp --namespace=dev```

get the yaml by `kubectl -n dev get rolebinding emp-bind -o yaml`

edit role by using, 
```kubectk -n dev edit role emp-role``` and add create permission there

create a pod using 
 ```kubectl --context=employee-context run nginx --image=nginx```
 view it by
 ```kubectl --context=dev-ctx get pods -o wide```
 
we will get denied if we try to access default namespace, check using:
```kubectl --context=dev-ctx get pods -n default```

done
