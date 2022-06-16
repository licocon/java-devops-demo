//file:noinspection GrUnresolvedAccess
//file:noinspection SpellCheckingInspection
pipeline {
    agent none
    stages {
        stage('编译') {
            steps {
                echo '编译'
                sh ' pwd & ls -alh'
                sh 'printenv'
                sh 'git --version'
                sh 'java -version'
            }

        }

        stage('测试') {
            agent {
                docker 'maven:3-alpine'
                //args 是指定 docker run 的所有指令
                args '-v /var/jenkins_home/maven/.m2:/root/.m2'
            }
            steps {
                echo 'Hello, Maven'
                sh 'mvn --version'

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
