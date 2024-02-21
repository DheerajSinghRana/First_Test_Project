pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
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
            mail bcc: '', body: '', cc: 'dharworld17@gmail.com', from: '', replyTo: '', subject: 'build successful', to: 'dheerajsinghrana0914@gmail.com'
        }
        failure {
            echo "fail"
        }
    }
}