rm  docker/*.jar
mvn clean package
cp ./target/*.jar  docker/

sudo docker build  docker -t jojiisacth/logcreator
rm  docker/*.jar