FROM openjdk:11

EXPOSE 8080
ADD target/zeeshan-springboot.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]