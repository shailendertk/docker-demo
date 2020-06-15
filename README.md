# docker-demo
## clone & build

> cd ~/src (or any other location where you keep your source code)

> git clone https://github.com/shailendertk/docker-demo.git

> cd docker-demo

> mvn clean install 

> docker build --tag demo:1.0.0 .

## run

start Docker Desktop application/instance, and wait till its (status) running

> docker run --publish 9080:9080 --env SPRING_PROFILES_ACTIVE=dev --detach --name demo demo:1.0.0

## check running containers

> docker ps -a

## test

go to http://localhost:9080/demo/time

## check logs

> docker logs -f demo

## stop & remove

> docker stop demo

> docker rm --force demo
