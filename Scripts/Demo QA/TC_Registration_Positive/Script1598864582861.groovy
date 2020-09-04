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

WebUI.setText(findTestObject('Demo QA/Txt_First_Name'), 'Ratih')

WebUI.setText(findTestObject('Demo QA/Txt_Last_Name'), 'Sasmita')

WebUI.setText(findTestObject('Demo QA/Txt_Email'), 'ratihsas@gmail.com')

WebUI.check(findTestObject('Demo QA/Gender_Other_Radio'))

WebUI.check(findTestObject('Demo QA/Gender_Female_Radio'))

WebUI.setText(findTestObject('Demo QA/Txt_Mobile'), '081234567890')

WebUI.click(findTestObject('Demo QA/Date_Picker'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('Demo QA/Month'), '6', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Demo QA/Year'), '1951', false)

WebUI.click(findTestObject('Demo QA/Date'))

