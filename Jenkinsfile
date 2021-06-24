pipeline {
    agent any
    tools {
        maven 'maven' 
    }
    stages {
        
        stage("build") {
            steps {
                echo 'predicting the future...'
                sh 'mvn clean install'
            }
            post {
                 always {
                      junit '**/target/surefire-reports/TEST-*.xml'
                     
                 }
             }
        }
        
        
        stage("deploy") {
            steps {
                echo 'deploying...'
            }
            
        }
    }
}
