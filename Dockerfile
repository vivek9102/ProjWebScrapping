FROM java:8
EXPOSE 8080
ADD /target/WebScrappingDocker.jar WebScrappingDocker.jar
ENTRYPOINT ["java","-jar","WebScrappingDocker.jar"]