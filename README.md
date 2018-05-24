# ara

<h3> Prerequisite </h3>

> Java JDK 8 <br>
> Maven <br>
> Firefox or Chrome <br>
 
<h3> Run command <h3>
	* run commands in the project root (where the pom.xml file is located) <br>
	<br>
 Run single test:
>mvn -Dwebdriver.driver=firefox -DtestSuite=TC001CalculateListsTest verify <br>
 
 Generate reports:
>mvn serenity:aggregate

 View Reports: <br>
> /target/site/serenity/index.html