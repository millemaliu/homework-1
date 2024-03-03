FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/junitsample-1.0-SNAPSHOT.jar guitar-inventory.jar
ENTRYPOINT ["java", "-jar", "guitar-inventory.jar"]
