pipeline {
  agent any
  stages {
    stage('Syntax 1') {
      parallel {
        stage('Syntax 1') {
          steps {
            sh 'echo Syntax check'
          }
        }

        stage('Syntax 2') {
          steps {
            echo 'Syntax check 2'
          }
        }

      }
    }

    stage('Build') {
      steps {
        sleep 10
      }
    }

    stage('Deployment') {
      steps {
        echo 'Deploying'
      }
    }

  }
}