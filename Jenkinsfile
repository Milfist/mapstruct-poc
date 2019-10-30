pipeline {
    
    agent { label 'maven-agent' }

    //tools { 
        //maven 'maven_3.6.2' 
        //jdk 'jdk_8u221' 
    //}

    stages {

        stage ('Checkout'){
            steps{
                 checkout scm
            }
        }

        stage ('Java version'){
      	    steps{
	        container('jnlp') {
			sh 'java -version'
		}
            }
        } 

    	stage ('Maven version'){
	     steps{
	         container('maven') {
                     sh 'mvn -version'
                 }
      	     }
    	}
    }
}

