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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('TC_Buy Product/Block_TC Success_Add Product to Cart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('TC_Buy Product/text_Total payment'), 5)

WebUI.click(findTestObject('TC_Buy Product/button_Place Order'))

WebUI.setText(findTestObject('TC_Buy Product/input_Name'), 'Salsa')

WebUI.setText(findTestObject('TC_Buy Product/input_Country'), 'Indonesia')

WebUI.setText(findTestObject('TC_Buy Product/input_City'), 'Semarang')

WebUI.setText(findTestObject('TC_Buy Product/input_Credit card'), '123498765')

WebUI.setText(findTestObject('TC_Buy Product/input_Month'), '12')

WebUI.setText(findTestObject('TC_Buy Product/input_Year'), '2027')

WebUI.click(findTestObject('TC_Buy Product/button_Purchase'))

WebUI.verifyElementPresent(findTestObject('TC_Buy Product/text_Thank you for your purchase'), 0)

WebUI.click(findTestObject('TC_Buy Product/button_OK'))

WebUI.closeBrowser()

