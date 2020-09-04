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
import org.openqa.selenium.Keys as Keys

def email = 'niania@gmail.com'
def input_email = 'niania@gmail.com'

def password = '65jZPU6SEVw='
def input_password = 'eVihgis/Bfs='

WebUI.openBrowser('')

WebUI.navigateToUrl('https://vuln.cilsy.id/member/signin')

WebUI.setText(findTestObject('Decision Making/Page_Masuk/Email'), 'niania@gmail.com')

//WebUI.setEncryptedText(findTestObject('Decision Making/Page_Masuk/Password'), '65jZPU6SEVw=')
WebUI.setEncryptedText(findTestObject('Decision Making/Page_Masuk/Password'), input_password)

WebUI.click(findTestObject('Decision Making/Page_Masuk/Btn_Masuk'))

if ((input_email == email) && (input_password == password)) {
    WebUI.verifyElementPresent(findTestObject('Decision Making/Page_Masuk/Dashboard'), 0, FailureHandling.STOP_ON_FAILURE)
} else if ((input_email != email) || (input_password != password)) {
    WebUI.verifyElementPresent(findTestObject('Decision Making/Page_Masuk/Txt_Error'), 0, FailureHandling.STOP_ON_FAILURE)
} else {
	WebUI.verifyElementNotPresent(findTestObject('Decision Making/Page_Masuk/Dashboard'), 0, FailureHandling.STOP_ON_FAILURE)
}

