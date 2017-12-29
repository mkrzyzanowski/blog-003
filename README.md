# A sample delivery pipeline
This repository contains the codebase of example presented in a blog post at AutomatingGuy.com (Exploring Jenkins Pipelines - Shared Libraries).

The code here is a fully functional system, with a sample application, automated API and UI tests and necessary Dockerfiles and pipeline-as-code in form of a Jenkinsfile.

The whole system is the same as in [this repository](https://github.com/mkrzyzanowski/blog-002), with the difference being that the Jenkinsfile is based on [this Shared Library](https://github.com/mkrzyzanowski/simple-jenkins-pipeline-library)

# Contents

* a sample ToDo application implemented using [Spark Framework](http://sparkjava.com/)
* UI tests implemented using [Bobcat framework](https://github.com/Cognifide/bobcat)
* API tests implemented using [REST Assured](https://github.com/rest-assured/rest-assured)
* Dockerfile for creating application containers
* Jenkinsfile describing the whole delivery pipeline of the application

For Jenkins configuration, please refer to [this blog post](https://automatingguy.com/2017/11/06/jenkins-pipelines-simple-delivery-flow/).
