pipeline {
    agent any
    environment {
        mavenhome = tool 'mymaven'
        javahome = tool 'jdk17'
        githome = tool 'mygit'
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                echo "$PATH"
                echo "$env.BUILD_NUMBER"
                
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