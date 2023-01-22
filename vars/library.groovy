def newGit(repo)
{
  git "${repo}"
}

def newMaven()
{
  sh 'mvn package'
}

def newDeployment(ip,appname)
{
  deploy adapters: [tomcat9(credentialsId: '986ae753-77fb-4d82-86de-010a9bc00d3c', path: '', url: "${ip}")], contextPath: "${appname}", war: '**/*.war'
}

def newSelenium(path)
{
  sh 'java -jar "${path}"testing.jar'
}
