pipeline {
    agent none
    stages {
//        stage('Example Build') {
//            agent {
//                docker 'maven:3-alpine'
//                args '-v /var/jenkins_home/maven/.m2:/root/.m2'
//            }
//            steps { echo 'Hello, Maven' sh 'mvn --version' }
//        }
        stage('Example Test') {
            agent {
                docker 'openjdk:8-jre'
            }
            steps {
                echo 'Hello, JDK'

            }
        }
    }
}