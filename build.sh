rm  docker/*.jar
mvn clean package  -DskipTests
cp ./target/*.jar  docker/

sudo docker build  docker -t jojiisacth/logcreator
rm  docker/*.jar


sudo docker push jojiisacth/logcreator