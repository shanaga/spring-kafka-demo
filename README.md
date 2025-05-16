# spring-kafka-demo


# Build the app

./mvnw clean package


# Start the containers

docker-compose up --build

# Send a message

curl -X POST localhost:8080/api/messages -H "Content-Type: text/plain" -d "Hello, Kafka!"
