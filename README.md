### How To Jenkin Setup & Run


 #### Initial Level Setup & Run:

##### Step 1: Prerequisites
Ensure Java Development Kit (JDK) is installed on your system( Recommend version 17.0.3.1)
Download the latest Jenkins 

##### Step 2: Install Jenkins:
Install Jenkins.msi file.
Go to  “ http://localhost:8080 ” or your selected port 8080
Check that the Jenkin unlock page shows properly
For the Password go to the file path given on the Jenkin unlock page.


  ##### Step 3: Setup Jenkins:
 Follow the on-screen instructions to complete the initial setup wizard. 
 Install recommended plugins or select plugins as per your requirements.

 ##### Step 4: Create Admin User:
Create an admin user with a username and password.
Note down the credentials for future logins.

 Now we can use Jenkins 💁







 ##### Stage-wise Setup & Run:

##### Stage 1: Basic Configuration
System Configuration:
Navigate to   Manage Jenkins > Configure System.
If you need to Configure Jenkins URL, system properties, email notification settings, etc.
Plugin Management:
Navigate to   Manage Jenkins > Plugins.
Install Necessary Plugins.[Mavan, Allure,git, git server,Echart,Etc,Github Gitlab]




##### Stage 2: Pipeline Job Creation Configuration:

Create a Jenkins Pipeline Job:
Navigate to the Jenkins dashboard and click on New Item.
Enter a name for your job and select Pipeline as the job type.
Click OK to create the job.
.

 Connecting GitLab and GitHub with Jenkins:




##### Step 1: Configure Jenkins Credentials:
In the Jenkins dashboard, go to Manage Jenkins > Manage Credentials:
Log in to the Jenkins dashboard.
Click on Manage Jenkins in the sidebar.
Select Manage Credentials from the dropdown menu.
Add Github/Gitlab username and password credentials
 Click on the Global domain (or any domain where you want to store the         credentials).
Click on Add Credentials.
Choose SSH Username and Password as the kind of credentials.
Enter the username (usually your GitLab/GitHub username or any other SSH username).
Enter the password
Click OK to save the credentials.




##### Step 2: Create Jenkins Jobs with GitLab/GitHub Integration
Create new Jenkins jobs and choose Git as the source code management option:
Navigate to the Jenkins dashboard and click on New Item.
Enter a name for your job and select the appropriate job type (e.g., Pipeline).
Under Source Code Management, select Git.
Provide the repository URL of your GitLab/GitHub repository.
Select the credentials configured in the previous step from the dropdown menu.
Configure build triggers and other settings as required:
Define build triggers (e.g., poll SCM, webhook triggers).
Specify additional settings such as branches to build, pre-build and post-build actions, etc.


Pipeline Script:
Local project run:
pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                
                echo 'Skipping checkout step as the project is already on the local machine'
            }
        }
        stage('Build') {
            steps {
                dir('Your project path') {
                    bat 'mvn clean package -DskipTests'
                }
            }
        }
        stage('Test') {
            steps {
                dir('Your project path') {
                    bat 'mvn test'
                }
            }
        }
        stage('Report') {
            steps {
                dir('Your project path') {
                   allure includeProperties:
                     false,
                     jdk: '',
                     results: [[path: 'build/allure-results']]
                }
            }
        }
    }
}



#### GitHub Project/Gitlab Project script  :



pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                echo 'Debugging step: Print Git remote URLs'
                checkout([$class: 'GitSCM',
                          branches: [[name: 'main']],
                          userRemoteConfigs: [[url: 'your github/gitlab project link’,
                                               credentialsId: 'your credentialsId']]])
            }
        }
        stage('Debug') {
            steps {
                echo 'Debugging step: Print branch information'
                bat 'git branch -a'
                bat 'git log --oneline'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Result') {
            steps {
                allure includeProperties:
                     false,
                     jdk: '',
                     results: [[path: 'build/allure-results']]
            }
        }
    }
}


Select Pipeline script from the Definition dropdown.
Paste the pipeline script into the Script text area.
Click Save to save the job configuration.
Click Build Now to trigger a build of the pipeline.

