def call(String user_name, String image_name){
echo 'building it'
sh """docker build -t "${user_name}"/"${image_name}":latest .""" 
}
