FROM adoptopenjdk:14-jre-hotspot

WORKDIR /usr/app

COPY target/*.jar /usr/app/scheduler.jar

ENTRYPOINT ["java","-jar","scheduler.jar"]

