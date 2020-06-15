# docker-demo
## build

>mvn clean install 

>docker build --tag demo:1.0.0 .

## run

>docker run --publish 9080:9080 --env SPRING_PROFILES_ACTIVE=dev --detach --name demo demo:1.0.0

## check running containers

>docker ps -a

## logs

>docker logs -f demo

## stop & remove

>docker stop demo

>docker rm --force demo
