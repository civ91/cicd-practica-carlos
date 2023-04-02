// Script para ejecución periódica de tests
job('run-tests') {
  triggers {
    cron('H/30 * * * *')
  }

  steps {
    git branch: 'main', url: 'https://github.com/civ91/cicd-practica-carlos'
    sh 'mvn clean test'
  }
}
