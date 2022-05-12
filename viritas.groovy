pipeline {
    agent any

    stages {
        stage('Cleaning Workspace') {
            steps {
                cleanWs()
            }
        }
        stage('Pull code') {
            steps {
                git branch: 'main',
                changelog: false,
                credentialsId: 'jenkingit',
                poll: false,
                url: 'https://github.com/Sowmyatht/jenkinpipeline.git'
            }
        }
        stage('code scan') {
            steps {
                echo "scan code"
            }
        }
        stage('code quality') {
            steps {
                echo "check code quality"
            }
        }
        stage('Building code') {
            steps {
                echo "Build code"
            }
        }
         
         stage('deploy code') {
            steps {
               sh '''
             #! /bin/bash
               pwd
               
             ll
               
               '''
            }
        }
    }
}
