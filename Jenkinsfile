pipeline {
    //agent any
      
      agent { 
        docker 
        {image 'maven:3.9.3-eclipse-temurin-17'}
         }
    stages {
        stage('Build') {
            steps {
                sh 'mvn --version'
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
    post {
        always {
            echo "always"
        }
        success {
            echo "success"
        }
        failure {
            echo "fail"
        }
    }
}