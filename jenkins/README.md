sudo su -
use bash jenkinsubunt.sh



some recommended Plugins:

Maven integration
capitomcat
deploy to container
build pipeline
docker build snd publish 

pre step
#For a static code analysis, build enviroment as sonar, add maven goal as
$SONAR_MAVEN_GOAL -Dsonar.host.url=$SONAR_HOST_URL

#Properties,
sonar.sources=.
sonar.tests=.
sonar.inclusions=**/test/java/servlet/createpage_junit.java
sonar.test.exclusions=**/test/java/servlet/createpage_junit.java
sonar.login=admin
sonar.password=admin
