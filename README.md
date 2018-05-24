# ara

<h3> Prerequisite </h3>

> Java JDK 8 <br>
> Maven <br>
> Firefox or Chrome <br>
 
<h3> Run command <h3>

 Run single test:
>mvn -Dwebdriver.driver=firefox -DtestSuite=TC001CalculateListsTest verify <br>
 
 Generate reports:
>mvn serenity:aggregate

 View Reports: <br>
> /target/site/serenity/index.html