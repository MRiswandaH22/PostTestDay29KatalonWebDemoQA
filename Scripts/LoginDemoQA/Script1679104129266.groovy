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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://shop.demoqa.com/my-account/')

WebUI.setText(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input__username'), 'riswanda22')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/input__password'), '3rvKNOFfptoxMxdxkQxU1g==')

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/h2_Login'))

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/h2_Login'))

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/button_Log in'))

WebUI.getText(findTestObject('Page_My Account  ToolsQA Demo Site/strong_riswanda22'))

WebUI.verifyElementText(findTestObject('Page_My Account  ToolsQA Demo Site/strong_riswanda22'), 'riswanda22')

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/strong_riswanda22'))

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/p_Hello riswanda22 (not riswanda22 Log out)'))

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/div_nomailtoolsqa.com                      _2224a2'))

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/span_ToolsQA Demo Site'))

