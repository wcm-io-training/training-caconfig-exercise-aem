Context-Aware Configuration Training: AEM
=========================================
[![Build Status](https://travis-ci.com/wcm-io-training/training-caconfig-exercise-aem.png?branch=master)](https://travis-ci.com/wcm-io-training/training-caconfig-exercise-aem)

This training projects targets the following training modules:
* [PVTRAIN-167 wcm.io Context-Aware Configuration](http://training.wcm.io/caconfig/PVTRAIN-167-wcm.io-Context-Aware-Configuration.html)


Requirements
------------

* AEM 6.5 author instance running on port 4502


Deploy sample project
---------------------

You can use this script for a full deployment (application, sample content, configuration) into a local AEM instance running at http://localhost:4502:

```
build-deploy.sh
```

This script also cleans and builds all maven projects and generates eclipse project files.

For the exercise you will work in the `bundles/base` and `bundles/editorial` bundles. Example to redeploy only one of these bundles:

```
cd bundles/editorial
mvn cq:install
```


Configure File System Resource Provider
---------------------------------------

You can mount the files system of your eclipse project to directly see changes in Sightly HTML, JSON oder other files in your running AEM application without having to redeploy the OSGi bundles. Deploying the OSGi bundle is only required if you change Java code.

To setup the files system synchronization go to the folder of the bundle project below `bundles/` and execute on it:

```
mvn sling:fsmount
```


Exercises
---------

See [PVTRAIN-168-02 AEM Context-Aware Configuration](http://training.wcm.io/caconfig/PVTRAIN-168-02-AEM-Context-Aware-Configuration.html)


Maven Settings
--------------

To build the project you have to configure additional [Maven Repositories](http://wcm.io/maven.html) in your settings.xml.

Alternatively you can build the project by specifying:

```
mvn --settings .travis.maven-settings.xml clean install
```
