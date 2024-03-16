pipeline {
    agent any
    
    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "mvn"
    }

    stages {
        stage('SCM') {
            steps {
                git branch: 'main', url: 'https://github.com/muhammadumairsabir/springboot-mysql-demo'
            }
        }
        
        stage('build') {
            steps {
                sh '''ls 
                    pwd'''
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
                sh "ls"
            }
        }
    }
}
