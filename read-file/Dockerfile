FROM amazoncorretto:17.0.5
ENV JAR_NAME=read-file
COPY ./target/$JAR_NAME.jar  /home/$JAR_NAME.jar
RUN ln -s /home/$JAR_NAME.jar /home/run.jar
CMD ["java", "-jar", "/home/run.jar"]