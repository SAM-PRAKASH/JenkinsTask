FROM  eclipse-temurin:17
COPY target/taskfordocker.jar taskfordocker.jar
CMD ["java","-jar","taskfordocker.jar"]
