def call(String Image_name, String dockerhubuser){
withCredentials([usernamePassword('credentialsId': "dockerhub_cred", 
                passwordVariable: "dockerHubPass", 
                usernameVariable: "dockerHubUser")]){
                sh """
                docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}
                docker push ${env.dockerHubUser}/"${image_name}":latest
                """
}
