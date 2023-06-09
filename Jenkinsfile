pipeline {
    agent any
    environment{
        NEW_VERSION='1.3.0' 
        def scriptDir = "getClass().protectionDomain.codeSource.location.path"
        
    }
    stages {
    
    	stage('Print') {
            steps {
        	echo "Welcome to learning"
            }
        }
        stage('Git') {
            steps {
        	git 'https://github.com/BHARATHK22/TestNgJenkinsPipeProject.git'
            }
        }
        stage('Clean') {
            steps {
        	sh "$Job"
            }
        } 
     }   	
}