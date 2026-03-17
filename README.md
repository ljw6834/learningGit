This is a project where I use docker-compose.yml to pull claude code into container, then run:
docker exec -it learning_claude_code-claude-1 claude

View logs: docker logs learning_claude_code-claude-1
Stop: docker stop learning_claude_code-claude-1
Restart: docker restart learning_claude_code-claude-1
Shell access: docker exec -it learning_claude_code-claude-1 bash


once learningGit springboot application starts inside container, you can open browswer on host machine
http://localhost:8080/students
http://localhost:8080/books
because in docker-compose, there is port mapping: learning_claude_code/docker-compose.yml:6

steps:
1. docker compose up // start docker container in terminal 1
2. docker ps -a 
3. docker exec -it learning_claude_code-claude-1 claude   // start Claude in terminal 2
4. ask claude to clone learningGit.git repo from https://github.com/ljw6834/learningGit.git
5. you can ask claude to make changes to learningGit springboot application
6. if you want to push the changes Claude made, you have to run: docker exec -it learning_claude_code-claude-1 bash
7. refer to the comands_used.sh git section to push changes
