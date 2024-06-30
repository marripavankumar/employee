**Application:**
1) Endpoints created using spring-webflux (employee)
2) Created the docker image of employee and pushed to docker hub
3) created deployment, service , configmap, pvc  yaml files for sevice and database
	configmap.yml
	employee-app-deployment.yaml
	employee-app-service.yaml
	mysql-deployment.yaml
	mysql-pvc.yaml
	mysql-service.yaml
4) pulled the docker image as part of AKS deployment.

Azure
- created Resource group
- created AKS cluster
-deployed docker hub employee application image


**Azure CLI login commands**
- `az --version`
- `az login`

**Docker Commands**
- `docker login`
- `docker build -t marripavankumar/employee-app .`
- `docker tag marripavankumar/employee-app:latest marripavankumar/employee-app:1.0.0`
- `docker push marripavankumar/employee-app:1.0.0`

**Kubernetes Commands: (handy)**
- `kubectl apply -f k8s/mysql-deployment.yaml`
- `kubectl apply -f k8s/mysql-service.yaml`
- `kubectl apply -f k8s/employee-app-deployment.yaml`
- `kubectl apply -f k8s/employee-app-service.yaml`
- `kubectl apply -f k8s/configmap.yml`
- `kubectl get pods`
- `kubectl get services`
- `kubectl describe service pod mysql-54cb98cbf5-8mv4p`
- `kubectl describe service mysql-service`
- `kubectl describe pod mysql-54cb98cbf5-8mv4p`
- `kubectl get configmap mysql-init-scripts`
- `kubectl get configmap mysql-init-scripts -n default`



   kubectl delete configmap mysql-init-scripts
   
   kubectl logs employee-app-5fccd955dc-5h8rv

  
