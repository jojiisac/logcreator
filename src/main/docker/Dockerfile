FROM openjdk:11
#COPY ./../../../target/*.jar    /app/myapp.jar
COPY logcreator-0.0.1-SNAPSHOT.jar /app/myapp.jar
WORKDIR /app
CMD ["java", "-jar  /app/myapp.jar"]
