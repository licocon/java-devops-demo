//file:noinspection GrUnresolvedAccess
pipeline {

    agent any
    stages {

        stage('环境检查') {
            steps {
                sh 'pwd & ls -alh'
                sh 'printenv'
                sh 'git --version'
                sh 'java -version'
//                sh 'docker --version'
//                sh 'mvn -version'
            }

        }
        stage('编译') {
            agent {
                docker {
                    image 'maven:3-alpine'
                }
            }
            steps {
                echo '编译'
                sh ' pwd & ls -alh'
                sh 'mvn -version'

            }

        }

        stage('测试') {
            steps {
                echo '测试'
            }
        }
        stage('打包') {
            steps {
                echo '打包'
            }

        }

        stage('部署') {

            steps {
                echo '部署'
            }

        }


    }


}