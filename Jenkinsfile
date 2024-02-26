pipeline {
    agent any
    environment {
        PATH = "${env.PATH};C:\\Program Files\\JetBrains\\IntelliJ IDEA 2023.2\\plugins\\maven\\lib\\maven3\\bin"
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', credentialsId: 'Mursuxb', url: 'https://github.com/Mursuxb/untitled'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
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