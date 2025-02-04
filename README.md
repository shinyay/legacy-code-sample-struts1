# Struts1 Sample Project

## Description

This is a sample project demonstrating the use of Struts 1 with Java 1.5. The project includes a simple Struts-based web application and a Dev Container configuration for running it on GitHub Codespaces.

## Demo

The demo demonstrates a basic Struts 1 application that displays a "Hello, World!" message.

## Features

- Basic Struts 1.3 implementation
- Basic Action class to handle requests
- JSP page to display the message

## Requirement

- Java 1.5 or later
- Apache Maven
- (Optional) GitHub Codespaces (for running in Dev Containers)
- (Optional) Docker (for running in Dev Containers)

## Usage

1. Clone the repository
   ```bash
   git clone https://github.com/your-repo/struts1-java15-demo.git
   cd struts1-java15-demo
   ```
2. Open in GitHub Codespaces or set up a local environment.
3. Run the application using the following Maven command:
   ```bash
   mvn clean install
   mvn tomcat7:run
   ```
4. Access the application at `Access the application via http://localhost:8080/your-app-context/`
   (`http://localhost:8080/struts1-java15-demo/hello.do`)
