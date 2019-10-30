pipeline {
    
    agent { label 'maven-agent' }

    tools { 
        maven 'maven_3.6.2' 
        jdk 'jdk_8u221' 
    }

    stages {

        stage ('Checkout'){
            steps{
                 checkout scm
            }
        }

        stage ('Java version'){
      	    steps{
                 sh 'java -version'
            }
        } 

    	stage ('Maven version'){
	     steps{
                 sh 'mvn -version'
      	     }
    	}
    }
}
