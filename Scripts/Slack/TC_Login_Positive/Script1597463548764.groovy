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

WebUI.click(findTestObject('Slack/Lnk_Sign_In'))

WebUI.verifyElementPresent(findTestObject('Slack/Ttl_Sign_In'), 0)

println('Actual URL-nya: ' + WebUI.getUrl())

WebUI.verifyMatch(WebUI.getUrl(), 'https://slack.com/signin', false)

WebUI.setText(findTestObject('Slack/Txt_Workspace'), GlobalVariable.workspace)

WebUI.click(findTestObject('Slack/Btn_Continue'))

WebUI.verifyElementPresent(findTestObject('Slack/Ttl_Sign_In_Workspace'), 0)

println('Actual URL-nya: ' + WebUI.getUrl())

WebUI.verifyMatch(WebUI.getUrl(), 'https://sekolahqa4.slack.com/', false)

WebUI.setText(findTestObject('Slack/Txt_Email'), 'niamariana3@gmail.com')

WebUI.setEncryptedText(findTestObject('Slack/Txt_Password'), 'i+85kCaagqbQdIz+oOWJ0w==')

WebUI.click(findTestObject('Slack/Btn_Sign_In'))

WebUI.verifyElementPresent(findTestObject('Slack/Ttl_Client_Slack'), 0)

