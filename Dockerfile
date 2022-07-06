FROM openjdk:11
ADD ./target/HealthTrioExercise-0.0.1-SNAPSHOT.jar /usr/src/HealthTrioExercise-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar", "HealthTrioExercise-0.0.1-SNAPSHOT.jar"]