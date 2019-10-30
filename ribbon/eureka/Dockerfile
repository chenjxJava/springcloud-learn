FROM chenjx1994/jdk8
VOLUME /tmp
ADD target/eureka-0.0.1-SNAPSHOT.jar app.jar
#RUN bash -c 'touch /app.jar'
CMD  java -jar app.jar
EXPOSE 8761