# log4j demo

## init
+ http://www.mkyong.com/maven/how-to-create-a-java-project-with-maven/
+ mkmdir log4jEx
+ mvn archetype:generate -DgroupId=com.celia -DartifactId=Log4jEx -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
+ mvn eclipse:eclipse

## compiling
+ mvn eclipse:eclipse
+ mvn package

## running
+ java -cp target/Log4jEx-1.0-SNAPSHOT.jar com.celia.App

