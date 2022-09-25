FROM openjdk:8
EXPOSE 8080/springboot-github-action.jar
ADD target/springboot-github-action.jar springboot-github-action.jar
ENTRYPOINT ["java","-jar","/springboot-github-action.jar"]