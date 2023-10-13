FROM openjdk:17
EXPOSE 9001
ADD target/FirebaseAuthMS.jar FirebaseAuthMS.jar
ENTRYPOINT ["java","-jar","/FirebaseAuthMS.jar"]