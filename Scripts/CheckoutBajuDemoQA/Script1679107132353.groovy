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

WebUI.click(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/h1_Checkout'))

WebUI.scrollToElement(findTestObject('Checkout/Page_Checkout  ToolsQA Demo Site/input__billing_first_name'), 1)

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/input__billing_first_name'), 'Muhammad')

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/input__billing_last_name'), 'Riswanda Hasan')

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/input_(optional)_billing_company'), 
    'Juara Coding')

WebUI.click(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/span_Indonesia'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/span_Indonesia_select2-selection__arrow'))

WebUI.scrollToElement(findTestObject('Checkout/Page_Checkout  ToolsQA Demo Site/input__billing_city'), 1)

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/input__billing_address_1'), 'Sumur')

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/input_(optional)_billing_address_2'), 
    'Bandung')

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/input__billing_city'), 'Bandung')

WebUI.click(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/div_Billing detailsFirst nameLast nameCompa_36354a'))

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/input__billing_postcode'), '12345')

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/input__billing_phone'), '0853647890')

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/input__billing_email'), 'mriswandahasan22@gmail.com')

WebUI.click(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/input_privacy policy_terms'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/button_Place order'))

WebUI.scrollToPosition(0, 550)

WebUI.click(findTestObject('Object Repository/Checkout/Page_Checkout  ToolsQA Demo Site/p_Thank you. Your order has been received'))

WebUI.getText(findTestObject('Checkout/Page_Checkout  ToolsQA Demo Site/p_Thank you. Your order has been received'))

WebUI.verifyElementText(findTestObject('Checkout/Page_Checkout  ToolsQA Demo Site/p_Thank you. Your order has been received'), 
    'Thank you. Your order has been received.')

WebUI.closeBrowser()

