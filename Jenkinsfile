pipeline {
      agent any
      stages {
            stage('Init'){
                  steps{
                        echo 'Hi, this is Anshul from LevelUp360' 
                        echo 'We are starting Testing'
                  }
            }
            stage('Build'){
                  steps{
                        echo 'Building Sampl Maven Project'
                  }
            }
            stage('Deploy Staging'){
                  steps{
                        echo 'Deploying in Staging Area'
                  }
            }
            stage('Deploy Production'){
                  steps{
                        echo 'Deploying in Production Area'
                  }
            }
      }
}