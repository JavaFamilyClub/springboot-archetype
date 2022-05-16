#!/bin/bash

chmod 777 mvnw

#./mvnw --non-recursive clean install

echo Start build springboot-jpa-template

cd springboot-jpa-template/

chmod 777 mvnw

./mvnw clean archetype:create-from-project -s /opt/apache-maven-3.5.4/conf/settings.xml

cd target/generated-sources/archetype/

chmod 777 mvnw
./mvnw install deploy -s /opt/apache-maven-3.5.4/conf/settings.xml

echo back to home
cd ../../../../

pwd




