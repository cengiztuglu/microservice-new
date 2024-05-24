***Microservice Project***

This project was developed to learn and practice a modern microservices architecture. The following technologies and tools are used in the project:

**Technologies and Tools Used**

**1. Event Driven Architecture using Kafka**


>We employ Apache Kafka to implement event-driven architecture in our project. Kafka enables us to manage data streams in a highly performant, low-latency, and distributed manner. We utilize Kafka for communication between microservices and data integration.

** 2. Distributed Tracing with Zipkin **


>To ensure traceability of requests between microservices and quickly identify performance issues, we utilize Zipkin. Zipkin enables distributed tracing, allowing us to easily visualize latency and pinpoint error points between services.

**3. Circuit Breaker with Resilience4J**


>Resilience4J is utilized to enhance application resilience. It helps us implement the circuit breaker pattern, enabling services to gracefully recover from failures. This ensures that our services remain operational even in transient error conditions.

**4. Spring Security with JWT **


>We ensure security using Spring Security and integrate identity authentication mechanism with JSON Web Token (JWT). This allows users to securely authenticate and access our APIs.

**5. API Gateway**


>An API Gateway is used to manage the interaction between microservices and the external world. It routes requests to appropriate microservices, performs load balancing, and enforces security policies.

**6. Discovery Server with Netflix Eureka**


>Netflix Eureka is employed to enable dynamic discovery of microservices. Eureka facilitates service registration and discovery, allowing services to communicate with each other without needing to know where they are running.
