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
import groovy.swing.factory.ActionFactory as ActionFactory
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(home_site)

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('Page_Safety Software/input_Log In to Continue_username'), 'VNair8', FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Page_Safety Software/input_Please enter your username_password'), pass)

WebUI.click(findTestObject('Page_Safety Software/button_Log In'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('div__prof_img_icon'))

WebUI.click(findTestObject('Page_Safety Software/Page_eLearning System - Admin/div_Techversant'))

WebUI.click(findTestObject('Page_Safety Software/Page_eLearning System - Admin/span_Admin'))

WebUI.click(findTestObject('Page_Safety Software/a_Admin_padding-lr10'))

WebUI.click(findTestObject('Page_Safety Software/BIS Admin tab'))

WebUI.click(findTestObject('span_Security Key'))

bday = WebUI.getAttribute(findTestObject('Page_Safety Software/Bday button'), 'Class')

if ('switch-slider unchecked '.equals(bday)) {
    WebUI.waitForElementClickable(findTestObject('Page_Safety Software/Page_eLearning System - Admin/span_Birthdate_switch-slider'), 
        30)

    WebUI.click(findTestObject('Page_Safety Software/Page_eLearning System - Admin/span_Birthdate_switch-slider'))

    WebUI.sendKeys(findTestObject('Page_Safety Software/Page_eLearning System - Admin/input_Username_form-control form-control-lg'), 
        'Vivek')

    WebUI.sendKeys(findTestObject('Page_Safety Software/textarea_Comment_form-control form-control-lg'), 'Test')

    WebUI.click(findTestObject('Page_Safety Software/button_OK'))

    WebUI.waitForElementPresent(findTestObject('Page_Safety Software/Page_eLearning System - Admin/button_Save'), 30)

    WebUI.click(findTestObject('Page_Safety Software/Page_eLearning System - Admin/button_Save'))
}

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl(user_profile)

WebUI.waitForElementHasAttribute(findTestObject('Page_Safety Software/Page_eLearning System - Admin/input_Birthdate_BirthDate'), 
    'Type', 5)

'Verify that the attribute is text'
WebUI.verifyElementAttributeValue(findTestObject('Page_Safety Software/Page_eLearning System - Admin/input_Birthdate_BirthDate'), 
    'Type', 'password', 5)

