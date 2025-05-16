pipeline {
    agent any

    tools {
        maven 'Maven 3.8.5' // ajuste para o nome da instalação configurada no Jenkins
        jdk 'JDK 17'        // ajuste para o nome da instalação do JDK no Jenkins
    }

    environment {
        // Variáveis de ambiente, se necessário
        APP_NAME = 'minha-aplicacao-java'
    }

    stages {
        stage("Build") {
            steps {
                echo 'Iniciando build da aplicação...'
                sh 'mvn clean compile'
            }
        }

        stage("Test") {
            steps {
                echo 'Executando testes unitários...'
                sh 'mvn test'
            }
        }

        stage("Package") {
            steps {
                echo 'Empacotando aplicação...'
                sh 'mvn package -DskipTests'
            }
        }

        stage("Deploy") {
            steps {
                echo 'Realizando deploy...'
                // Exemplo: copiar o JAR para um servidor remoto (ajuste conforme necessário)
                // sh 'scp target/*.jar user@servidor:/caminho/do/deploy'

                // Ou, se estiver usando Docker:
                // sh 'docker build -t minha-aplicacao .'
                // sh 'docker run -d -p 8080:8080 minha-aplicacao'

                echo "Deploy concluído (simulado)."
            }
        }
    }

    post {
        success {
            echo 'Pipeline finalizada com sucesso!'
        }
        failure {
            echo 'Falha na pipeline. Verifique os logs para mais detalhes.'
        }
    }
}
