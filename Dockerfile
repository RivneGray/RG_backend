## container for client
## alpine linux + install java + tomcat + code running in tomcat +
## MySql + front end all running in the same container
## We expect one command to run everything
#
# Use the base Alpine image with MariaDB
FROM alpine:latest
RUN apk update && \
    apk add --no-cache mariadb mariadb-client

COPY my.cnf /etc/mysql/my.cnf

ENV MYSQL_ROOT_PASSWORD=root

RUN mkdir /docker-entrypoint-initdb.d

COPY docker-entrypoint.sh /usr/local/bin/

RUN chmod +x /usr/local/bin/docker-entrypoint.sh

EXPOSE 3306

ENTRYPOINT ["docker-entrypoint.sh"]

CMD ["mysqld"]

