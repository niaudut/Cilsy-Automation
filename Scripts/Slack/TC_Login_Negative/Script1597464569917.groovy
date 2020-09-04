import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Slack/Lnk_Sign_In'))

WebUI.verifyElementPresent(findTestObject('Slack/Ttl_Sign_In'), 0)

println('Actual URL-nya: ' + WebUI.getUrl())

WebUI.verifyMatch(WebUI.getUrl(), 'https://slack.com/signin', false)

WebUI.setText(findTestObject('Slack/Txt_Workspace'), GlobalVariable.workspace)

WebUI.click(findTestObject('Slack/Btn_Continue'))

def datasetLogin = findTestData('Data/Login Data Slack')

for (def rowLogin = 1; rowLogin <= datasetLogin.getRowNumbers(); rowLogin++) {
	//for (def rowLogin : (1..datasetLogin.getRowNumbers())) {
	WebUI.setText(findTestObject('Slack/Txt_Email'), datasetLogin.getValue('username', rowLogin))
	
	WebUI.setText(findTestObject('Slack/Txt_Password'), datasetLogin.getValue('password', rowLogin))
	
	WebUI.click(findTestObject('Slack/Btn_Sign_In'))
	
	def actualWarning = WebUI.getText(findTestObject('Slack/Ttl_Sekolah_QA_4'))
	
	WebUI.verifyMatch(actualWarning, datasetLogin.getValue('expected_result', rowLogin), false)
	
	//WebUI.sendKeys(findTestObject('Slack/Txt_Email'), Keys.chord(Keys.CONTROL, 'a'))
	
	// WebUI.sendKeys(findTestObject('Slack/Txt_Email'), Keys.chord(Keys.BACK_SPACE))
	
	//WebUI.sendKeys(findTestObject('Slack/Txt_Password'), Keys.chord(Keys.CONTROL, 'a'))
	
	//WebUI.sendKeys(findTestObject('Slack/Txt_Password'), Keys.chord(Keys.BACK_SPACE))
	
	WebUI.clearText(findTestObject('Slack/Txt_Email'))
	WebUI.clearText(findTestObject('Slack/Txt_Password'))
}

WebUI.delay(2)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)