#  Docker Deployment Test Project

**Step1: Build the docker images for mongo and Spring boot app**
Build application image. 
    
    docker build -t zeeshan-springboot .
    docker pull mongo
Now type `docker images` to see the two build images

**Step2: Deploy Spring-boot and mongo images in docker container** 

Run the docker compose file to link spring-boot and mongo.
```
cd src/main/resources
docker-compose up
 ```
**Step3: Run the application in your browser** 
Hit this url in browser to check application in up and running
`http://localhost:8080/`

import this curl cmd to post man 

`POST:`
```
curl --location 'http://localhost:8080/user' \
--header 'Content-Type: application/json' \
--data '{
"userId": "1",
"username": "test_user",
"mobileNumber": "9738235628",
"location": "UK"
}'
```
`GET:`
```
curl --location 'http://localhost:8080/users' \
--data ''
```


    
