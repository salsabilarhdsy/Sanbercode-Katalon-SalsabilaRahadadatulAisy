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

WebUI.callTestCase(findTestCase('TC_Login/Block_TC Success_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC_Buy Product/card_Product in Homepage'))

product_title = WebUI.getText(findTestObject('TC_Buy Product/title_Product in detail page'))

WebUI.click(findTestObject('TC_Buy Product/title_Product in detail page'))

WebUI.click(findTestObject('TC_Buy Product/button_Add to cart'))

WebUI.click(findTestObject('TC_Buy Product/menu_Cart'))

WebUI.waitForElementPresent(findTestObject('TC_Buy Product/card_Product in Cart'), 10)

WebUI.verifyElementText(findTestObject('TC_Buy Product/card_Product in Cart'), product_title)

WebUI.closeBrowser()

