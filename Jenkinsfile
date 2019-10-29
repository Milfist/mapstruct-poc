pipeline {
    
    agent { label 'maven-agent' }

    stages {

        stage ('Checkout'){
            steps{
                checkout scm
            }
        }

        stage ('Install modules'){
            steps{
                sh 'mvn install'
            }
        } 
    }
}
