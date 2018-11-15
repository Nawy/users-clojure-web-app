FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/my-test-0.0.1-SNAPSHOT-standalone.jar /my-test/app.jar

EXPOSE 8080

CMD ["java", "-jar", "/my-test/app.jar"]
