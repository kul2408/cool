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

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.setText(findTestObject('Object Repository/Facebook Login/Page_Facebook  log in or sign up/Page_Facebook  log in or sign up/Page_Log in to Facebook/Page_Facebook  log in or sign up/input_email'), 
    'mkrajput1524@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Facebook Login/Page_Facebook  log in or sign up/Page_Facebook  log in or sign up/Page_Log in to Facebook/Page_Facebook  log in or sign up/input_pass'), 
    '1AmIDvstrhuOMOvwahdcoA==')

WebUI.click(findTestObject('Object Repository/Facebook Login/Page_Facebook  log in or sign up/Page_Facebook  log in or sign up/Page_Log in to Facebook/Page_Facebook  log in or sign up/button_Log in'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Facebook Login/Page_Facebook  log in or sign up/Page_Facebook  log in or sign up/Page_Log in to Facebook/Page_(7) Facebook/div_x9f619 x1n2onr6 x1ja2u2z x78zum5 xdt5yt_217c05'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Facebook Login/Page_Facebook  log in or sign up/Page_Facebook  log in or sign up/Page_Log in to Facebook/Page_(7) Facebook/div_x1i10hfl x6umtig x1b1mbwd xaqea5y xav7g_d32c55'))

WebUI.closeBrowser()

