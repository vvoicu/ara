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
