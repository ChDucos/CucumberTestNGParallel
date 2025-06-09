
maven-surefire-plugin  

 <suiteXmlFiles>
      <suiteXmlFile>${testngFilePath}</suiteXmlFile>
</suiteXmlFiles>

## Tests without Cucumber

### Paralell tests and paralle classes in each test   
mvn clean test -DsuiteFile=testngAllParallel.xml

In TestClass3_test2. , Thread id is 27
In TestClass3_test3. , Thread id is 28
In TestClass2_test2. , Thread id is 25
In TestClass1_test1. , Thread id is 23
In TestClass3_test1. , Thread id is 26
In TestClass2_test1. , Thread id is 24

### Parallel tests only  
mvn clean test -DsuiteFile=testngTestsParallel.xml

In TestClass2_test1. , Thread id is 22
In TestClass1_test1. , Thread id is 21
In TestClass2_test2. , Thread id is 22
In TestClass3_test1. , Thread id is 22
In TestClass3_test2. , Thread id is 22
In TestClass3_test3. , Thread id is 22


## Tests with  Cucumber

### Parallel tests only
mvn clean test -DsuiteFile=cucumberTestsParallel.xml

Scenario: F1 Sc1       # src/test/resources/features/F1.feature:3

Scenario: F2 Sc1       # src/test/resources/features/F2.feature:3
[Thread 17] Running: F2 Sc1
[Thread 16] Running: F1 Sc1
Given Tout est OK F1 # stepdefinitions.StepsDef.toutEstOKF1()
Given Tout est OK F2 # stepdefinitions.StepsDef.toutEstOKF2()

Scenario: F2 Sc2       # src/test/resources/features/F2.feature:7

Scenario: F1 Sc2       # src/test/resources/features/F1.feature:7
[Thread 16] Running: F1 Sc2
[Thread 17] Running: F2 Sc2
Given Tout est OK F1 # stepdefinitions.StepsDef.toutEstOKF1()
Given Tout est OK F2 # stepdefinitions.StepsDef.toutEstOKF2()



### Cucumber  + Chrome lancement en local

mvn clean test -DsuiteFile=cucumberWebTestsParallel.xml