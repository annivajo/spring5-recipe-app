# Spring Boot Recipe Application

Spring Boot Recipe Application for practicing and becoming a Spring Guru 

## Getting Started

0.  Checkout to the branch 'feature/add-actuator'
1.  Go to Maven plugin: 'spring5-recipe-app' (the root) and do a clean & intall.
2.  Run class Spring5RecipeAppApplication in module 'client'. Tomcat will be started at: localhost:8082
3.  Run class SpringBootAdminServerApplication in module 'server'. Tomcat will be started at: localhost:8080

## Usage
To login to 'client' use next credentials:

```
login: ben
pwd: benspassword

login: pedro
pwd: pedrospassword

etc.
more logins you can find in 'resources/users.ldif', where: login = uid; password = userPassword

```
To login to 'server' use next credentials:

```
login: admin
pwd: admin
```
