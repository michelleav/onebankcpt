FROM bellsoft/liberica-openjdk-alpine:21.0.3

WORKDIR /usr/share/app

COPY target/*.jar onebankcpt.jar

CMD ["java","-jar", "onebankcpt.jar"]