FROM openjdk:17
RUN pwd
COPY /Users/dheeraj/.m2/repository/com/ruchi/helloworld/0.0.1-SNAPSHOT/*.jar /usr/src/myapp/test.jar
WORKDIR /usr/src/myapp
CMD ["java", "-jar", "test.jar"]