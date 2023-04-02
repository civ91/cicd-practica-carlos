# Variables
JAVA_HOME := /usr/lib/jvm/java-11-openjdk-amd64/
MAVEN_OPTS := -Dmaven.test.skip=true

# Targets
.PHONY: all
all: clean compile test

.PHONY: clean
clean:
	@echo "Cleaning..."
	@mvn clean

.PHONY: compile
compile:
	@echo "Compiling..."
	@mvn compile

.PHONY: test
test:
	@echo "Testing..."
	@mvn test

.PHONY: run
run:
	@echo "Running..."
	@mvn exec:java -Dexec.mainClass=com.example.app.App

.PHONY: build-jar
build-jar:
	@echo "Building jar..."
	@mvn package

.PHONY: run-jar
run-jar:
	@echo "Running jar..."
	@java -jar target/app.jar

.PHONY: help
help:
	@echo "Available targets:"
	@echo "  all        - clean, compile, and test the project"
	@echo "  clean      - clean the project"
	@echo "  compile    - compile the project"
	@echo "  test       - run the tests for the project"
	@echo "  run        - run the project"
	@echo "  build-jar  - build a JAR file for the project"
	@echo "  run-jar    - run the JAR file for the project"
	@echo "  help       - display this help message"
