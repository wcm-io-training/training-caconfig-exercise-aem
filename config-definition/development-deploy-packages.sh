#!/bin/sh

mvn -Pdeploy-packages clean install conga-aem:package-install

read -n1 -r -p "Press any key to continue..." key
