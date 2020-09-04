import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

//WebUI.sendKeys(findTestObject('SP1/Txt_Amount'), Keys.chord(Keys.CONTROL, 'a'))

//WebUI.setText(findTestObject('SP1/Txt_Amount'), '175000')

def datasetCheckout = findTestData('Data/Checkout Data SP1')

for (def rowCheckout = 1; rowCheckout <= datasetCheckout.getRowNumbers(); rowCheckout++) {
    WebUI.sendKeys(findTestObject('SP1/Txt_Email'), Keys.chord(Keys.CONTROL, 'a'))

    WebUI.sendKeys(findTestObject('SP1/Txt_Email'), Keys.chord(Keys.BACK_SPACE))

    WebUI.setText(findTestObject('SP1/Txt_Email'), datasetCheckout.getValue('email', rowCheckout))

    WebUI.click(findTestObject('SP1/Btn_Checkout'))

    def actualWarning = WebUI.getText(findTestObject('SP1/Ttl_Error_Message'))

    WebUI.verifyMatch(actualWarning, datasetCheckout.getValue('expected_result', rowCheckout), false)

    //WebUI.delay(2)

    //WebUI.executeJavaScript('document.querySelector(\'div.close\').click()', null)
	
	WebElement element = WebUiCommonHelper.findWebElement(findTestObject('SP1/Btn_X_Error_Message'),30)
	WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(element))

    WebUI.click(findTestObject('SP1/Btn_Buy_Now'))
}

WebUI.delay(2)

