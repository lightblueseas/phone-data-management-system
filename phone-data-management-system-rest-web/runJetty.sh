#!/bin/bash
export MAVEN_OPTS="-Xmx4096m -Xms4096m"
cd /root/git/phone-data-management-system/phone-data-management-system/phone-data-management-system-rest-web
echo $MAVEN_OPTS;
mvn exec:java -Dexec.mainClass="de.alpharogroup.phone.data.management.system.ApplicationJettyRunner"