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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.bistrainer.com/v1/index.cfm?action=home.loginForm&reason=2&redirect=%2Fv1%2Findex%2Ecfm%3Faction%3Dlearner%2Enewhome&auth=0')

WebUI.setText(findTestObject('Object Repository/input_Log In to Continue_username'), 'VNair8')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Please enter your username_password'), '+1NnrC00uNt1s07tQ71ijg==')

WebUI.click(findTestObject('Object Repository/span_Admin'))

WebUI.click(findTestObject('Object Repository/i_Admin_fa fa-cog'))

WebUI.click(findTestObject('Object Repository/BIS Admin tab'))

WebUI.click(findTestObject('Object Repository/i_Admin_fa fa-cog'))

WebUI.click(findTestObject('Object Repository/span_Birthdate_switch-slider'))

WebUI.setText(findTestObject('Object Repository/iSearch'), 'Vivek')

WebUI.setText(findTestObject('Object Repository/textarea_T'), 'T')

WebUI.setText(findTestObject('Object Repository/textarea_Te'), 'Te')

WebUI.setText(findTestObject('Object Repository/textarea_Tes'), 'Tes')

WebUI.setText(findTestObject('Object Repository/textarea_Test'), 'Test')

WebUI.click(findTestObject('Object Repository/button_OK'))

WebUI.click(findTestObject('Object Repository/button_Save'))

WebUI.click(findTestObject('Object Repository/button_OK'))

WebUI.setText(findTestObject('Object Repository/iSearch'), 'VNair8')

WebUI.click(findTestObject('Object Repository/button__searchButton'))

WebUI.switchToWindowTitle('eLearning System - Search')

WebUI.click(findTestObject('Object Repository/a_Edit'))

