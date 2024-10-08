FROM openjdk:22-jdk-slim

WORKDIR src/main/java

COPY target/BudjetProject-0.0.1-SNAPSHOT.jar src/main/java/App.java

CMD ["java", "-jar", "App.java"]