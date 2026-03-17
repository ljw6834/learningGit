#!/bin/bash
  # Commands used during the learningGit session

  # === Clone the repo ===
  git clone https://github.com/ljw6834/learningGit.git

  # === Install SDKMAN, Java 17, and Maven ===
  curl -s "https://get.sdkman.io" | bash
  source "$HOME/.sdkman/bin/sdkman-init.sh"
  sdk install java 17.0.13-tem
  sdk install maven

  # === Build and run the Spring Boot app ===
  cd ~/learningGit
  mvn spring-boot:run

  # === Test REST endpoints ===
  curl -s http://localhost:8080/students
  curl -s http://localhost:8080/books

  # === Git: configure user and push changes ===
  git config --global user.name "Janet"
  git config --global user.email "ljw6834@gmail.com"
  git remote set-url origin https://ljw6834@github.com/ljw6834/learningGit.git
  git add src/main/java/com/aaa/learninggit/ApiController.java
  git commit -m "Add REST controller for students and books"
  git push origin master

  # === Stop the Spring Boot app ===
  kill $(lsof -t -i:8080)