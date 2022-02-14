pipeline {
agent any

tools {
    // Install the Maven version configured as "M3" and add it to the path.
	maven "MAVEN_HOME"
}

stages 
  {
        stage('Clean WorkSpace')
   {
         steps 
     {
             cleanWs()
         }
     }
     stage('Clone the repo')
     {
         steps
         {
             // Get some code from a GitHub repository
             git branch: 'main', credentialsId: 'c57d4c63-17ee-4f39-b0b3-5e21b6394b9d', url: 'https://github.com/satishkumar96/PaySchoolAdmin_Cucumber_Automation.git'
         }
     }
     
    stage('Test and emailable-report')
    {

        steps
        {
            // To run Maven on a Windows agent, use
            bat 'mvn clean verify'
        }

        post {
            failure
            {
                emailext attachmentsPattern: 'target/test-output/SparkReport/Index.html, target/test output/PdfReport/ExtentPdf.pdf', body: '''Hello Everybody,
The execution of PSA Automation Testing has failed. We are looking into the issue and would re-run the automation job upon rectifying the issue.

Regards,
QA Team''', subject: '[$BUILD_STATUS] - $PROJECT_NAME - Build # $BUILD_NUMBER ($BUILD_ID)', to: 'sk.kumar805@gmail.com'
            }
            
            success 
            {            
               emailext attachmentsPattern: 'target/test-output/SparkReport/Index.html, target/test output/PdfReport/ExtentPdf.pdf', body: '''Hello Everybody,
The execution of PSA Automation Testing is completed. Please find the test report in the below ,

Regards,
QA Team''', subject: '[$BUILD_STATUS] - $PROJECT_NAME - Build # $BUILD_NUMBER ($BUILD_ID)', to: 'deepakd@chimeratechnologies.com, cc:sk.kumar805@gmail.com'
                }
        }
    }
}
}