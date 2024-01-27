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

WebUI.navigateToUrl('https://academy.katalon.com/')

WebUI.click(findTestObject('Object Repository/Katalon/Page_Courses - Katalon Academy/Page_Sign in  Katalon Software Quality Mana_cfddb7/Page_Katalon Academy - Automation Testing C_4c4a56/a_Log in'))

WebUI.click(findTestObject('Object Repository/Katalon/Page_Courses - Katalon Academy/Page_Sign in  Katalon Software Quality Mana_cfddb7/Page_Sign in  Katalon Software Quality Mana_cfddb7/div_Continue with email'))

WebUI.setText(findTestObject('Object Repository/Katalon/Page_Courses - Katalon Academy/Page_Sign in  Katalon Software Quality Mana_cfddb7/Page_Sign in  Katalon Software Quality Mana_cfddb7/input_username'), 
    'mkrajput1524@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Katalon/Page_Courses - Katalon Academy/Page_Sign in  Katalon Software Quality Mana_cfddb7/Page_Sign in  Katalon Software Quality Mana_cfddb7/input_password'), 
    'GTlPq8sqzIAVcUdIXgqPeg==')

WebUI.click(findTestObject('Object Repository/Katalon/Page_Courses - Katalon Academy/Page_Sign in  Katalon Software Quality Mana_cfddb7/Page_Sign in  Katalon Software Quality Mana_cfddb7/input_login'))

WebUI.click(findTestObject('Object Repository/Katalon/Page_Courses - Katalon Academy/Page_Sign in  Katalon Software Quality Mana_cfddb7/Page_Katalon Academy - Automation Testing C_4c4a56/a_Courses'))

WebUI.click(findTestObject('Object Repository/Katalon/Page_Courses - Katalon Academy/Page_Sign in  Katalon Software Quality Mana_cfddb7/Page_Courses - Katalon Academy/a_Enroll Now'))

WebUI.click(findTestObject('Object Repository/Katalon/Page_Courses - Katalon Academy/Page_Sign in  Katalon Software Quality Mana_cfddb7/Page_Course Achieving Cross-Platform Testin_8744a3/h1_Achieving Cross-Platform Testing with Ka_5eb582'))

WebUI.closeBrowser()

