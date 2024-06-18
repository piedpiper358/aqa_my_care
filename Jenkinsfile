pipeline {
    agent {
        label 'master'
    }
    environment{
        TEST_CONTAINER_IMAGE = 'maven:3.9.7'
        GIT_REPO_URL = 'https://git.astondevs.ru/aston/my-care/aqa_my_care.git'
        GIT_CREDS_ID = 'gitlab-aston'
        INNER_CONTAINER_WORK_DIR = "/usr/src/myapp"
    }
    stages{
        stage('Copy GIT') {
            steps{
                git branch: 'MYCR-194', credentialsId: GIT_CREDS_ID, url: GIT_REPO_URL
            }
        }
        stage('Run tests') {
			agent {
        		docker {
					image TEST_CONTAINER_IMAGE
					args "-w ${INNER_CONTAINER_WORK_DIR}"
					reuseNode true
				}
			}
				steps {
					sh 'mvn clean install -U -X'
					sh 'mvn test -X'
					sh 'ls -al'
				}
    	}
        stage('Collect Allure report') {
			steps {
				allure([
					includeProperties: false,
					reportBuildPolicy: 'ALWAYS',
					results: [[path: 'api_target_allure-results']]
				])
			}
		}
    }
}
