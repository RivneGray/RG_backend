1) how to launch
```shell
docker run -d \
           --name db \
           -e MYSQL_ROOT_PASSWORD=root \
           -e MYSQL_DATABASE=shop \
           -p 3316:3306 \
           mysql:8.0.33-debian
```

