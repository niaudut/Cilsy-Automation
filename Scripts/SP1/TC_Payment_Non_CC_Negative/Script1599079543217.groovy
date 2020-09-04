import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.verifyElementPresent(findTestObject('SP1/Ttl_Select_Payment'), 0)

WebUI.click(findTestObject('SP1/Btn_KlikBCA'))

WebUI.click(findTestObject('SP1/Btn_Pay_Now'))

def datasetPaymentNonCC = findTestData('Data/Payment Data Non CC SP1')

for (def rowPaymentNonCC = 1; rowPaymentNonCC <= datasetPaymentNonCC.getRowNumbers(); rowPaymentNonCC++) {
    WebUI.setText(findTestObject('SP1/Txt_KlikBCA_UserID'), datasetPaymentNonCC.getValue('user', rowPaymentNonCC))

    WebUI.click(findTestObject('SP1/Btn_Pay_Now'))

    def actualWarning = WebUI.getText(findTestObject('SP1/Ttl_Error_UserID'))

    WebUI.verifyMatch(actualWarning, datasetPaymentNonCC.getValue('expected_result', rowPaymentNonCC), false)

    WebUI.click(findTestObject('SP1/Btn_X_Error_UserID'))
}

//WebUI.verifyElementPresent(findTestObject('SP1/Ttl_Continue_Payment'), 0)

