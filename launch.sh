#!/bin/bash

/opt/apache-tomcat-7.0.75/bin/shutdown.sh

cd /home/paul/workspace/ssm/
mvn clean package
rm -r /opt/apache-tomcat-7.0.75/webapps/*
cp target/ssm.war /opt/apache-tomcat-7.0.75/webapps/

/opt/apache-tomcat-7.0.75/bin/startup.sh