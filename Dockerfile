FROM java:8
LABEL maintainer=“pizhigang@huawei.com”
VOLUME /tmp
ADD target/spring-data-redis-1.0-SNAPSHOT.jar spring-data-redis-1.0-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-data-redis-1.0-SNAPSHOT.jar"]
