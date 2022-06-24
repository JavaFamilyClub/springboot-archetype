#!/bin/bash

chmod 777 mvnw

./mvnw clean verify -Dmaven.test.skip=true -s /opt/apache-maven-3.5.4/conf/settings.xml
