**# Hybrid-Automation-Framework**

This project is based on selenium using java. For execution of Test Cases, we are usibg testng framework.
This project runs on varoius browser like chrome, firefox and Internet Explorer. It is on user's that through which browser he/she wants to run their test cases.
All the required dependencies are successfully installed through pom.xml file.
On completion of test cases, this framework also generate an extent-report in the test-output folder. For getting these reports we create an xml file and named it as extent-config.xml. 
From extent-report we can get a brief idea about number of test cases that are passed or failed. Suppose if any test case is failed, we write a menthod inside base class through which its screenshot is being taken. So that we can easily identify the cause of failing the test case. This screenshot can found under test-output folder.
For easy understanding, we are also using logs.

**Framework**:

inetBaningV1
src/main/java
src/test/java
  com.inetbanking.pageObjects
    AddCustomerPage.java
    LoginPage.java
  com.inetbanking.testCases
    BaseClass.java
    TC_AddCustomerTest_003.java
    TC_LoginDDT_002.java
    TC_LoginTest_001.java
  com.inetbanking.testData
    LoginData.xlsx
  com.inetbanling.utilities
    ReadConfig.java
    Reporting.java
    XLUtils.java
JRE System Library
Maven Dependencies
Configuration
  config.properties
Drivers
  chromedriver
  geckodriver
  IEDriverServer
log
Screenshots
src
target
test-output
extent-config.xml
log4j.properties
pom.xml
TestNG.xml


**For running the project:**
Right click on TestNG.xml
Run as
Test NG suite
