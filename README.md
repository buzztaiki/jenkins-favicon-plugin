Jenkins Favicon Plugin
======================

This plugin allows you to set a favicon to your jenkins.


Installation
------------

- Prepare plugin development environment (see. [Plugin tutorial](https://wiki.jenkins-ci.org/display/JENKINS/Plugin+tutorial)).

- Build hpi using maven.

        $ mvn package

- Install hpi into your jenkins.


Usage
-----

1. Put your favicon file into your jenkins environment (e.g. `/var/lib/jenkins/userContent/favicon.ico`).

2. Specify favicon path in config page (e.g. `/userContent/favicon.ico`).
