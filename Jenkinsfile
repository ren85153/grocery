pipeline {
    agent {
        // 此处设定构建环境，目前可选有
        // default, java-8, python-3.5, ruby-2.3, go-1.11 等
        // 详情请阅 https://dev.tencent.com/help/knowledge-base/how-to-use-ci#agents
        label "java-8"
    }
       
    stages  {
      stage("环境") {
        steps {
          parallel "Maven": {
            script{
              sh 'mvn -version'
            }
          }, "Java": {
            sh 'java -version'
          //}, "sshpass": {
            // script{
             	//sh 'apt -y install sshpass'
             	//sh 'sshpass -v'
             //}
          }
        }
          
      }
      
        stage("检出") {
            steps {
                sh 'ci-init'
                checkout(
                  [$class: 'GitSCM', branches: [[name: env.GIT_BUILD_REF]], 
                  userRemoteConfigs: [[url: env.GIT_REPO_URL]]]
                )
            }
        }

 		stage("构建") {
            steps {
                echo "构建中..."
              	sh 'mvn install -Dmaven.test.skip=true'
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
                echo "获取andmin应用..."
              	archiveArtifacts artifacts: '**/**/target/*.jar', fingerprint: true
                echo "构建完成."
            }
        }

      
		stage("部署"){
      	   steps {
              parallel "上传": {
                    sh 'scp **/jx-upms-service/target/jx-upms-service.jar jiangxue@47.97.195.85:/jx/'
       //             sh 'sshpass -p wo201228 scp target/java-0.0.1-SNAPSHOT.jar root@47.97.195.85:/jx/jx-upms-service/'
       //         }, "运行": {
       //             sh 'sshpass -p wo201228  ssh root@47.97.195.85 cd /jx/jx-upms-service && rm /jx/jx-upms-service/nohup.out && sh start.sh'
                
                }
    	    }
    	}
    }
}