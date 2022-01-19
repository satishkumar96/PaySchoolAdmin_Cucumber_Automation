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
             git branch: 'main', credentialsId: '8e735933-9389-48ae-97dd-e337b74240a7', url: 'https://github.com/satishkumar96/PaySchoolAdmin_Cucumber_Automation.git'
         }
     }

    stage('Test and emailable-report')
    {

        steps
        {
            // To run Maven on a Windows agent, use
            bat 'mvn clean test'
        }

        post {

             failure
            {
                emailext attachmentsPattern: 'target/test output/PdfReport/ExtentPdf.pdf, target/test-output/SparkReport/Index.html', body: '''Hello Everybody,

The execution of PSC Automation Testing in Dev environment has failed. We are looking into the issue and would re-run the automation job upon rectifying the issue.

Regards,
QA Team''', subject: '[$BUILD_STATUS] - $PROJECT_NAME - Build # $BUILD_NUMBER ($BUILD_ID)', to: 'automationwithsatish@gmail.com'
            }
            
            success 
            {            
                emailext attachmentsPattern: 'target/test output/PdfReport/ExtentPdf.pdf, target/test-output/SparkReport/Index.html', body: '''Hello Everybody,

The automated test execution of PSC Smoke Test Cases is completed. Please find the test report in the below FTP folder,
PSC Automation Testing Report - Beta.

Regards,
QA Team''', subject: '[$BUILD_STATUS] - $PROJECT_NAME - Build # $BUILD_NUMBER ($BUILD_ID)', to: 'automationwithsatish@gmail.com, deepakd@chimeratechnologies.com'
                }
        }
    }
}
}