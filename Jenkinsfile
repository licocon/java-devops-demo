//noinspection GrUnresolvedAccess
//file:noinspection GrUnresolvedAccess
//file:noinspection GroovyAssignabilityCheck
pipeline {
    agent {
        docker { image 'maven:latest' }
    }
    stages {

        stage('Build') {
            steps {
                sh 'pwd && ls -lah'
                sh 'mvn -v'
            }
        }

    }
}