pipeline {
    agent any
    environment {
        mavenhome = tool 'mymaven'
        javahome = tool 'jdk17'
        githome = tool 'mygit'
        PATH = "$mavenhome/bin:$javahome/bin:$githome/bin:$PATH"
    }
    stages {
        stage('Checkout') {
            steps {
                sh "mvn --version"
                sh "java --version"
                sh "git version"
                echo 'Building..'
                echo "$PATH"
                echo "$env.BUILD_NUMBER"
                
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo 'testing'
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