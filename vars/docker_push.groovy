def call(String image_name){
withCredentials([usernamePassword('credentialsId': "dockerhub_cred", 
                passwordVariable: "dockerHubPass", 
                usernameVariable: "dockerHubUser")]){
                sh """
                docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}
                docker push ${env.dockerHubUser}/${image_name}:latest
                """
}
}
