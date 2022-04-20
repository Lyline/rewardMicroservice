FROM openjdk:8-alpine3.9
ARG JAR_FILE=build/libs/rewardCentralMicroservice-1.0.0.jar
COPY $JAR_FILE rewardCentralMicroservice-1.0.0.jar
ENTRYPOINT [ "java", "-jar","rewardCentralMicroservice-1.0.0.jar"]