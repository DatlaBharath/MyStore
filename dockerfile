FROM openjdk:17
EXPOSE 8092
ADD target/bootdocker.jar bootdocker.jar
ENTRYPOINT ["java","-jar","bootdocker.jar"]