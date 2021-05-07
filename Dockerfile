FROM adoptopenjdk:16-jre-hotspot

WORKDIR /usr/app

COPY target/*.jar /usr/app/scheduler.jar

ENTRYPOINT ["java","-jar","scheduler.jar"]

