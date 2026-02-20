def call(String url, String branch) {
echo 'Checkingout the code'
git url: "${url}", branch: "${branch}"
}
