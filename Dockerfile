FROM openjdk:8

ADD /target/springboot-demo-0.1.jar cricketerapp.jar

EXPOSE 8080

ENTRYPOINT [  "java" ,"-jar", "cricketerapp.jar" ]



 apiVersion: apps/v1
 kind: Deployment
 metadata:
   name: mysql
   labels:
     app: mysql
     tier: database
spec:
    selector:
       matchLabels:
          app: mysql
    strategy:
       type: Recreate
     template:
        metadata: 
          labels:
            apps: mysql
            tier: database
        spec:
          containers:
             - name : mysql
               image: mysql:latest
               env:
                 - name: MYSQL_ROOT_PASSWORD
                    value: root
                - name: MYSQL_DATABASE
                   value: axis_b9
               ports:
                 - containerPort: 3307
                    name: mysql
           volumes:
                 - name: mysql-persistent-storage
                    persistentVolumeClaim:
                          calimName: mysql-pv-claim