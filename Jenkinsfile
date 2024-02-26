pipeline {
    agent any
    environment {
        PATH = "${env.PATH};C:\\Windows\\System32"
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', credentialsId: 'Arkkaaa', url: 'https://github.com/Arkkaaa/untitled'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
            post {
                success {
                    junit '**/target/surefire-reports/Test-*.xml'
                    jacoco (execPattern: '**/target/jacoco.exec')
                }
            }
        }
    }
}
