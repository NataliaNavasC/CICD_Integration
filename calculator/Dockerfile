FROM openjdk:17-alpine
EXPOSE 8081
ADD target/cicd-integration.jar cicd-integration.jar
ENTRYPOINT [ "java", "-jar", "./calculator/cicd-integration.jar" ]
