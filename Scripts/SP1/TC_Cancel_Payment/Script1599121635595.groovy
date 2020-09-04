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

WebUI.click(findTestObject('SP1/Btn_CreditDebit_Card'))

WebUI.click(findTestObject('SP1/Btn_Pay_Now'))

WebUI.verifyElementPresent(findTestObject('SP1/Ttl_OrderID'), 0)

WebUI.setText(findTestObject('SP1/Txt_Card_Number'), '4911 1111 1111 1113')

WebUI.setText(findTestObject('SP1/Txt_Exp_Date'), '01 / 25')

WebUI.setEncryptedText(findTestObject('SP1/Txt_CVV'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('SP1/Btn_Pay_Now'))

WebUI.setEncryptedText(findTestObject('SP1/Txt_Bank_OTP'), '4tAN/DuJV7Y=')

WebUI.click(findTestObject('SP1/Btn_Cancel'))

WebUI.verifyElementPresent(findTestObject('SP1/Ttl_Transaction_Failed'), 0)

