FROM  eclipse-temurin:17
COPY target/mydevopsapp.jar mydevopsapp.jar
CMD ["java","-jar","mydevopsapp.jar"]