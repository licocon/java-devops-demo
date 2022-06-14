//file:noinspection GrUnresolvedAccess
pipeline {

    agent any
    stages {

        stage('编译') {
            steps {
                echo '编译'
                sh ' pwd & ls -alh'
                sh 'printenv'
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