pipeline {
    
    agent maven
    
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
