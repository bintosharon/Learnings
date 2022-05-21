`echo "admin" | base64` ->YWRtaW4K
`echo "pass" | base64` ->cGFzcwo=

```kubectl create secret generic f-secret --from-literal=user=YWRtaW4K --from-literal=pass=cGFzcwo=```
now go create pod to use this create 
