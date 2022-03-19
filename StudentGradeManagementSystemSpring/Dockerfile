FROM openjdk:11-jre-slim
VOLUME /var/log/my-app
ARG JAR_FILE
ADD build/libs/StudentGradeManagementSystemSpring-0.0.1-SNAPSHOT.jar /app/my-app.jar
RUN chgrp -R 0 /app
RUN chmod -R g+rwX /app
RUN chgrp -R 0 /var/log/my-app
RUN chmod -R g+rwX /var/log/my-app
CMD [ "-jar", "/app/my-app.jar" ]
ENTRYPOINT ["java"]
EXPOSE 8080