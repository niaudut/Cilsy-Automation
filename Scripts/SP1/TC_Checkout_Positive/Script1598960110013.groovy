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

WebUI.sendKeys(findTestObject('SP1/Txt_Amount'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.setText(findTestObject('SP1/Txt_Amount'), '175000')

WebUI.sendKeys(findTestObject('SP1/Txt_Name'), Keys.chord(Keys.CONTROL, 'a'))

//WebUI.sendKeys(findTestObject('SP1/Txt_Name'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('SP1/Txt_Name'), 'Nofi Ratih')

WebUI.sendKeys(findTestObject('SP1/Txt_Email'), Keys.chord(Keys.CONTROL, 'a'))

//WebUI.sendKeys(findTestObject('SP1/Txt_Email'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('SP1/Txt_Email'), 'nofi.ratih@email.com')

WebUI.sendKeys(findTestObject('SP1/Txt_Phone_No'), Keys.chord(Keys.CONTROL, 'a'))

//WebUI.sendKeys(findTestObject('SP1/Txt_Phone_No'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('SP1/Txt_Phone_No'), '08123456789')

WebUI.sendKeys(findTestObject('SP1/Txt_City'), Keys.chord(Keys.CONTROL, 'a'))

//WebUI.sendKeys(findTestObject('SP1/Txt_City'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('SP1/Txt_City'), 'Bogor')

WebUI.sendKeys(findTestObject('SP1/Txt_Address'), Keys.chord(Keys.CONTROL, 'a'))

//WebUI.sendKeys(findTestObject('SP1/Txt_Address'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('SP1/Txt_Address'), 'Jl. Bougenvile Raya No. 95 Bogor')

WebUI.sendKeys(findTestObject('SP1/Txt_Postal_Code'), Keys.chord(Keys.CONTROL, 'a'))

//WebUI.sendKeys(findTestObject('SP1/Txt_Postal_Code'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('SP1/Txt_Postal_Code'), '12345')

WebUI.click(findTestObject('SP1/Btn_Checkout'))

WebUI.verifyElementPresent(findTestObject('SP1/Ttl_Order_Summary'), 0)

WebUI.click(findTestObject('SP1/Btn_Continue'))

