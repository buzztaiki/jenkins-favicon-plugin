Jenkins Favicon Plugin
======================

This plugin allows you to set a favicon to your jenkins.


Installation
------------

1. Prepare plugin development environment (see. [Plugin tutorial](https://wiki.jenkins-ci.org/display/JENKINS/Plugin+tutorial)).

2. Build hpi using maven.

        $ mvn package

3. Install hpi into your jenkins.


Usage
-----

1. Put your favicon file into your jenkins environment (e.g. `/var/lib/jenkins/userContent/favicon.ico`).

2. Specify favicon path in config page (e.g. `/userContent/favicon.ico`).
