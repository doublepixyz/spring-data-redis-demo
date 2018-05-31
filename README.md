# spring-data-redis-docker-example

```
mvn clean build

sudo docker-compose build

sudo docker-compose up
```



-- test
--- rest client 
http://localhost:8083/api/v2/downloads

{
  "appId": 1,
  "downloadCount": 1
}

http://localhost:8083/api/v2/downloads/count/1


--- curl
curl -X POST -H 'Content-Type: application/json' -i http://localhost:8083/api/v2/downloads --data '{
  "appId": 1,
  "downloadCount": 1
}'

curl -X GET -i http://localhost:8083/api/v2/downloads/count/1 --data '{
  "appId": 1
}'