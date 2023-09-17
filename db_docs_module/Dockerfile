FROM maven:3.8.4-amazoncorretto-17
WORKDIR /bruh
EXPOSE 9090
COPY . .
RUN mvn clean compile
CMD ["mvn", "spring-boot:run"]