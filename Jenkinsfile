pipeline {
    agent any
    environment {
        mavenhome = tool 'mymaven'
        javahome = tool 'jdk17'
        githome = tool 'mygit'
        dockerhome = tool 'mydocker'
        PATH = "$mavenhome/bin:$javahome/bin:$githome/bin:$dockerhome/bin:$PATH"
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
        stage('Build Docker Image') {
            steps {
                script {
                   dockerimage = docker.build("83497/jdkimage:${env.BUILD_TAG}")
                }
                
            }
        }
        stage('Push Docker Image') {
            steps {
                script{
                    docker.withRegistry('', 'dockerhub') {
                    dockerimage.push();
                    dockerimage.push('latest');
                }
                   
                }
                
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