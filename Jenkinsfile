pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'sh \'cd app && make\''
      }
    }

    stage('Test') {
      steps {
        sh 'sh \'cd app && make test\''
      }
    }

    stage('Package') {
      steps {
        sh '''sh \'cd app && make package\'
                archiveArtifacts artifacts: \'app/target/*\''''
      }
    }

    stage('Smoke Test') {
      steps {
        sh 'sh \'curl -f http://localhost:8080/ || exit 1\''
      }
    }

    stage('Deploy Production') {
      steps {
        sh 'sh \'cd deploy && ${DOCKER_COMPOSE_PATH} -f docker-compose.prod.yml up -d\''
      }
    }

  }
}