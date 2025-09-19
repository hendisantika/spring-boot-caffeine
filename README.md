# Spring Boot Caffeine Cache Demo

A demonstration project showing how to integrate Caffeine cache with Spring Boot for high-performance caching.

## Overview

This project demonstrates the implementation of Caffeine cache in a Spring Boot application. Caffeine is a
high-performance, near-optimal caching library for Java 8+ that provides an in-memory cache with excellent performance
characteristics.

## Features

- **Spring Boot 3.5.6** with Java 21
- **Caffeine Cache** integration
- **REST API** with caching demonstration
- **Customer Service** showing cache hits and misses
- **Book Service** with cached book lookup
- **Lombok** for boilerplate code reduction

## Technologies Used

- Java 21
- Spring Boot 3.5.6
- Spring Cache
- Caffeine Cache 3.2.2
- Lombok 1.18.40
- Maven
- JUnit 5

## Project Structure

```
src/main/java/com/hendisantika/springbootcaffeine/
├── SpringBootCaffeineApplication.java    # Main application class
├── config/
│   ├── CaffeineCacheConfig.java          # Cache configuration
│   └── NetworkSpeedSimulator.java        # Simulates slow network calls
├── controller/
│   └── BookController.java               # REST controller for book operations
├── data/
│   ├── Book.java                         # Book entity
│   └── Customer.java                     # Customer entity
└── service/
    ├── BookService.java                  # Book service with caching
    ├── CustomerService.java              # Customer service interface
    └── DefaultCustomerService.java       # Customer service implementation
```

## Getting Started

### Prerequisites

- Java 21 or higher
- Maven 3.6+

### Running the Application

1. Clone the repository:

```bash
git clone <repository-url>
cd spring-boot-caffeine
```

2. Build the project:

```bash
mvn clean compile
```

3. Run the application:

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

### Testing

Run the tests:

```bash
mvn test
```

## API Endpoints

### Book Controller

- **GET** `/book/{isbn}` - Retrieve book information by ISBN
    - Example: `GET http://localhost:8080/book/978-0134685991`
    - Response: Returns cached book data after first request

## Cache Configuration

The application uses Caffeine cache with the following configuration:

- **Cache Name**: `getBookWithCache` (for book lookups)
- **Cache Name**: Customer cache (for customer data)
- **Eviction Policy**: Size-based and time-based
- **Statistics**: Enabled for monitoring cache performance

## Cache Demonstration

When you run the application, it automatically demonstrates caching behavior:

1. **First request** for customer ID 1: Cache miss (slow)
2. **First request** for customer ID 2: Cache miss (slow)
3. **Subsequent requests** for customer ID 1: Cache hit (fast)

You'll see log messages showing cache hits vs. cache misses in the console output.

## Key Components

### CaffeineCacheConfig

Configures the Caffeine cache manager with optimal settings for the application.

### NetworkSpeedSimulator

Simulates slow network calls to demonstrate the performance benefits of caching.

### BookService

Demonstrates method-level caching using `@Cacheable` annotation.

### CustomerService

Shows cache behavior with multiple requests to the same data.

## Cache Benefits Demonstrated

- **Performance**: Subsequent requests are significantly faster
- **Resource Efficiency**: Reduces database/external service calls
- **Scalability**: Improves application throughput
- **Monitoring**: Built-in cache statistics and metrics

## Configuration Options

Cache settings can be customized in `application.properties`:

```properties
# Cache configuration
demo.wait.duration=3000  # Simulated delay in milliseconds
# Logging levels
logging.level.com.hendisantika.springbootcaffeine=DEBUG
```

## Learning Objectives

This project helps you understand:

1. How to integrate Caffeine cache with Spring Boot
2. Method-level caching with `@Cacheable`
3. Cache configuration and customization
4. Performance benefits of caching
5. Cache hit/miss monitoring
6. Best practices for caching in Spring applications

## Contributing

Feel free to submit issues and enhancement requests!

## License

This project is for educational purposes and demonstration of Spring Boot + Caffeine integration.
