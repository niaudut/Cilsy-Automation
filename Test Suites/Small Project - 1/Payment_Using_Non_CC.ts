<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Payment_Using_Non_CC</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>2f06b728-059f-47bf-a494-5623f922db0a</testSuiteGuid>
   <testCaseLink>
      <guid>25e90a00-0fba-4a16-9189-733016d175f5</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/SP1/TC_NavigateToURL</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>85c2c7c8-f44d-48e9-9b75-4b2909cddca2</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/SP1/TC_Open_Shopping_Cart_Page</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>56191c12-dd2f-48fa-92d0-da31ea8fa599</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/SP1/TC_Checkout_Negative</testCaseId>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>7bbf8760-f129-48f4-ab3a-5c2495106c17</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>26f9554c-9e6a-454e-8932-08892a4742a5</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>22cf93b7-5c94-4062-b6c9-3072c3f15a11</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/SP1/TC_Checkout_Positive</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>21ba3b2f-efaf-4685-ac07-742e9415cf32</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/SP1/TC_Payment_Non_CC_Negative</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>1bef6866-1a6f-4df3-82e6-3f41dcfa2f5e</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/Data/Payment Data Non CC SP1</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>1bef6866-1a6f-4df3-82e6-3f41dcfa2f5e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>user</value>
         <variableId>3b41ee72-1632-4ac4-957e-5f9624b66629</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1bef6866-1a6f-4df3-82e6-3f41dcfa2f5e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>expected_result</value>
         <variableId>12df463a-3897-4b3e-8a8b-0b7eb811ee83</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>d25c3858-5ece-4c27-96dd-93a48c3193fe</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/SP1/TC_Payment_Non_CC_Positive</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
