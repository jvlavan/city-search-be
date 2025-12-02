

# City Search Backend

This is the backend service for the City Search application, written in Java. It provides APIs for searching and retrieving city-related data.

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Technologies Used](#technologies-used)
- [Contributing](#contributing)
- [License](#license)

## Features

- Search for cities based on various filters.
- Efficient and scalable backend architecture.
- Dockerized for easy deployment.

## Installation

### Prerequisites

- Java 8 or later
- Docker (optional, for containerized deployment)

### Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/jvlavan/city-search-be.git
   cd city-search-be
   ```

2. Build the project:
   ```bash
   ./gradlew build
   ```

3. Run the application:
   ```bash
   java -jar build/libs/city-search-be.jar
   ```

### Using Docker

1. Build and run the Docker container:
   ```bash
   docker build -t city-search-be .
   docker run -p 8080:8080 city-search-be
   ```

## Usage

Once the application is running, you can access the APIs. Here are some example endpoints:

- Search for cities:
  ```
  GET /api/cities?query={query}
  ```

- Retrieve city details:
  ```
  GET /api/cities/{id}
  ```

## Technologies Used

- **Java**: Backend development.
- **Docker**: Containerization for deployment.

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-name`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature-name`).
5. Open a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
