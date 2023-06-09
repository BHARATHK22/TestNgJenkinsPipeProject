pipeline {
    agent any
    environment{
        NEW_VERSION='1.3.0' 
        def scriptDir = "getClass().protectionDomain.codeSource.location.path"
        
    }
    stages {
    
    	stage('Clean') {
            steps {
        	sh "$Job"
            }
        }
          
     } 
     post {
        
        failure {

       		}
    	success {
    				
                }	
    }  	
}