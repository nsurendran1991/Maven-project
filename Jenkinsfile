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
                      jiraSendBuildInfo site: 'nsurendran1991.atlassian.net'
                 }
             }
        }
        
        
        stage("deploy") {
            steps {
                echo 'deploying...'
            }
            post {
                always {
                    jiraSendDeploymentInfo site: 'nsurendran1991.atlassian.net', enableGating: false, environmentId: 'jenkins-testing-prod-1', environmentName: 'jenkins-testing-prod-1', environmentType: 'production'
                }
            }
        }
    }
}
