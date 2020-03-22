FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} TruwayMobileAPIServer-1.0.jar
ENTRYPOINT ["java","-jar","/TruwayMobileAPIServer-1.0.jar"]