#指定基础镜像，在其上进行定制
#FROM openjdk:8-jre
# 基于的镜像
FROM openjdk:8-jdk-alpine

#维护者信息
MAINTAINER yetong <68762746@qq.com>

#这里的 /tmp 目录就会在运行时自动挂载为匿名卷，任何向 /tmp 中写入的信息都不会记录进容器存储层
VOLUME /tmp

#RUN  mkdir -p /usr/share/myservice

#指定容器启动程序及参数   <ENTRYPOINT> "<CMD>"
ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/myservice/myservice.jar"]

#ADD target/lib    /usr/share/myservice/lib

ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/myservice/myservice.jar