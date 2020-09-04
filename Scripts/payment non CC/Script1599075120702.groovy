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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.midtrans.com/')

WebUI.click(findTestObject('Object Repository/payment non CC/a_BUY NOW'))

WebUI.click(findTestObject('Object Repository/payment non CC/div_CHECKOUT'))

WebUI.click(findTestObject('Object Repository/payment non CC/a_Continue'))

WebUI.click(findTestObject('Object Repository/payment non CC/div_KlikBCA'))

WebUI.setText(findTestObject('Object Repository/payment non CC/input'), 'budi0101')

WebUI.click(findTestObject('Object Repository/payment non CC/a_Pay Now'))

WebUI.click(findTestObject('Object Repository/payment non CC/a_COMPLETE PAYMENT AT KlikBCA'))

WebUI.click(findTestObject('Object Repository/payment non CC/a_Done'))

WebUI.click(findTestObject('Object Repository/payment non CC/span_Weve booked your payment'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.midtrans.com/')

WebUI.click(findTestObject('Object Repository/payment non CC/a_COMPLETE PAYMENT AT KlikBCA (1)'))

WebUI.click(findTestObject('Object Repository/payment non CC/div_Finish your transaction by opening wwwk_e0dbcd'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.midtrans.com/')

WebUI.setEncryptedText(findTestObject('Object Repository/payment non CC/input_Password_PaRes'), '4tAN/DuJV7Y=')

WebUI.click(findTestObject('Object Repository/payment non CC/button_OK'))

WebUI.click(findTestObject('Object Repository/payment non CC/span_Transaction failed'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.midtrans.com/')

WebUI.click(findTestObject('Object Repository/payment non CC/strong_Order ID'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.midtrans.com/')

WebUI.click(findTestObject('Object Repository/payment non CC/a_Retry'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.midtrans.com/')

WebUI.click(findTestObject('Object Repository/payment non CC/strong_Order ID (1)'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.midtrans.com/')

WebUI.click(findTestObject('Object Repository/payment non CC/span_Please continue the payment process vi_6eca10'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.midtrans.com/')

WebUI.click(findTestObject('Object Repository/payment non CC/span_TEST_sprite modal-close-dark'))

