//noinspection GrUnresolvedAccess
//file:noinspection GrUnresolvedAccess
//file:noinspection GroovyAssignabilityCheck
pipeline {
    agent none
    stages {
        agent {
            docker { image 'maven:latest' }
        }
        stage('Build') {
            steps {
                sh 'pwd && ls -lah'
                sh 'mvn -v'
            }
        }

    }
}