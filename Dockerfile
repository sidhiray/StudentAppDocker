FROM openjdk:22
ADD target/student-docker.jar student-docker.jar

ENTRYPOINT ["java", "-jar", "/student-docker.jar"]