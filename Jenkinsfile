pipeline {
    agent any
    environment {
        mavenhome = tool 'mymaven'
        javahome = tool 'jdk17'
        githome = tool 'mygit'
        dockerhome = tool 'docker'
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
        // stage('Build Docker Image') {
        //     steps {
                
        //         script {
        //            dockerimage = docker.build("83497/jdkimage:latest");
        //         }
                
        //     }
        // }
        // stage('Push Docker Image') {
        //     steps {
        //         script{
        //             docker.withRegistry('', 'dockerhub') {
        //             dockerimage.push();
        //             dockerimage.push('latest');
        //         }
                   
        //         }
                
        //     }
        // }
    }
    post {
        always {
            echo "always"
            emailext body: 'build is successful', subject: 'build success', to: 'dheerajsinghrana0914@gmail.com'
        }
        success {
            echo "success"
        }
        failure {
            echo "fail"
        }
    }
}