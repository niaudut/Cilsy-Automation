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

def datasetDeclinedCC = findTestData('Data/Payment Declined Data CC SP1')

for (def rowDeclinedCC = 1; rowDeclinedCC <= datasetDeclinedCC.getRowNumbers(); rowDeclinedCC++) {
    WebUI.verifyElementPresent(findTestObject('SP1/Ttl_Select_Payment'), 0)

    WebUI.click(findTestObject('SP1/Btn_CreditDebit_Card'))

    WebUI.click(findTestObject('SP1/Btn_Pay_Now'))

    WebUI.verifyElementPresent(findTestObject('SP1/Ttl_OrderID'), 0)

    WebUI.setText(findTestObject('SP1/Txt_Card_Number'), datasetDeclinedCC.getValue('cardnumber', rowDeclinedCC))

    WebUI.setText(findTestObject('SP1/Txt_Exp_Date'), datasetDeclinedCC.getValue('expdate', rowDeclinedCC))

    WebUI.setEncryptedText(findTestObject('SP1/Txt_CVV'), datasetDeclinedCC.getValue('cvv', rowDeclinedCC))

    WebUI.click(findTestObject('SP1/Btn_Pay_Now'))

    WebUI.setEncryptedText(findTestObject('SP1/Txt_Bank_OTP'), datasetDeclinedCC.getValue('otp', rowDeclinedCC))

    WebUI.click(findTestObject('SP1/Btn_OK'))

    def actualWarning = WebUI.getText(findTestObject('SP1/Ttl_Transaction_Failed'))

    WebUI.verifyMatch(actualWarning, datasetDeclinedCC.getValue('expected_result', rowDeclinedCC), false)

    WebUI.click(findTestObject('SP1/Btn_Retry'))
}

WebUI.delay(2)

