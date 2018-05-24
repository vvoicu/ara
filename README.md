<<<<<<< HEAD
# ECSD Tech Test
Welcome to the ECSD Tech Test 

Please make a copy of this repository

## Running the application

### To run Local Version of the App
You will need to have [node] and [yarn] both installed on your machine to run the app.

- Clone this repository and make sure you are in this directory (the one containing `README.md`!)
- Run `yarn && yarn start` to start the app
- Visit `localhost:3000` in a browser

### To run Docker Version of the App 

You will need to have [docker] installed and running to start the site.

- `docker build -t ecsd-tech-test .`
- `docker run -it -p 3000:3000 ecsd-tech-test:latest`
- Visit `localhost:3000` in a browser

## Challenge 
Once the app is started follow the instructions on the screen.

Each part of the challenge gets increasingly harder. The futher you progress the more we will be impressed.
Complete as much as you can!

## Limitations
There are no limitations set on this. If you are struggling to select elements you are free to edit the app source code where needed.
What we are looking for is a good understanding of what makes a robust test and a good understanding of engineering principles.

Note: you will not find the challenge answers in the application. Although you could hack the challenge or spam the API that verifies your answer, you still need to submit your test for us to review. 

## Submit your test
Once completed push the solution up to your own repository and link ECS the url 

Good Luck!

[docker]: https://www.docker.com/
[node]: https://nodejs.org/en/
[yarn]: https://yarnpkg.com/en/
=======
<h1> ARA <h1>

<h3> Prerequisite </h3>

> Java JDK 8 <br>
> Maven <br>
> Firefox or Chrome <br>
 
<h3> Run command <h3>

<a>run commands in the project root (where the pom.xml file is located) </a> 
<br>
	
 <b>Run single test: </b>
>mvn -Dwebdriver.driver=firefox -DtestSuite=TC001CalculateListsTest verify <br>
 
 <b>Generate reports:</b>
>mvn serenity:aggregate

 <b>View Reports: </b>`<br>
> /target/site/serenity/index.html
>>>>>>> 1a0d806d08c92a22d96b6db1b026aca517b86654
