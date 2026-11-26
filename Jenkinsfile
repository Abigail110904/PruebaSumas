pipeline{
   agent {
      'built-in'
   }
   tools{
      maven 'devops_maven'
   }
   triggers{
      githubPush()
   }
   environment{
        POM="CalculadoraBasica/pom.xml"
   }
   stages{
      stage('Descarga'){
         steps{
            git url:'https://github.com/Abigail110904/PruebaSumas.git', branch:'main'
         }
      }
      stage('Compilacion'){
        steps{
            sh 'mvn -f $POM -B package'
        }
      }
      stage('Prueba'){
        steps{
            sh 'mvn -f $POM test'
        }
        post{
            always{
                junit 'CalculadoraBasica/target/surefire-reports/*.xml'
            }
        }
      }
      stage('Empaquetado'){
        steps{
            archiveArtifacts artifacts: 'CalculadoraBasica/target/*.jar', fingerprint:true
        }
      }  
   }
}
