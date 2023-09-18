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

def randomNumber = org.apache.commons.lang.RandomStringUtils.randomNumeric(5)

def username = 'salsabila'

def random_usn = username + randomNumber

println(random_usn)

WebUI.openBrowser(GlobalVariable.web_url)

WebUI.setViewPortSize(GlobalVariable.width, GlobalVariable.height)

WebUI.click(findTestObject('TC_Register/menu_Sign up'))

WebUI.setText(findTestObject('TC_Register/input_Username'), random_usn)

WebUI.setEncryptedText(findTestObject('TC_Register/input_Password'), 'sUKugCyjtpx16cGSCMyJzX09M3+gFM+z')

WebUI.click(findTestObject('TC_Register/button_Sign up'))

WebUI.waitForAlert(5)

alert_register = WebUI.getAlertText(FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(alert_register, 'Sign up successful.')

WebUI.closeBrowser()

