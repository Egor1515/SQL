FROM mysql:lastest

MAINTAINER Me

ENV MYSQL_DATABASE=<schema_name> \
    MYSQL_ROOT_PASSWORD=<password>

ADD schema.sql /docker-entrypoint-initdb.d

EXPOSE 3306