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

```
openssl x509 -req -in emp.csr -CA ca.crt -CAkey ca.key -CAcreateserial -out emp.crt -days 365
kubectl --kubeconfig emp.config config set-cluster minikube --server https://____ --certificate-authority=ca.crt  
```
kubectl config view for https
```
kubectl --kubeconfig emp.kubeconfig config set-credentials emp --client-certificate /root/emp.crt --client-key /root/emp.key
kubectl --kubeconfig emp.kubeconfig config set-context dev-ctx --cluster minikube --namespace dev --user emp
```
