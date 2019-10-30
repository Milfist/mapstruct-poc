pipeline {
    
    agent { label 'maven-agent' }

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
