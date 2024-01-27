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

WebUI.navigateToUrl('https://www.amazon.in/')

WebUI.click(findTestObject('Object Repository/E-commerce Web/Page_Online Shopping site in India Shop Onl_10c5f3/a_Mobiles'))

WebUI.click(findTestObject('Object Repository/E-commerce Web/Page_Mobile Phones Buy New Mobiles Online a_11ca6d/span_Smartphones  Basic Mobiles'))

WebUI.click(findTestObject('Object Repository/E-commerce Web/Page_Amazon.in Smartphones  Basic Mobiles E_6181d1/img__deals-hero-shoveler_style_image__39grG'))

WebUI.scrollToPosition(0, 2)

WebUI.click(findTestObject('Object Repository/E-commerce Web/Page_Redmi 13C 5G (Starlight Black, 4GB RAM_af6538/span_Add to Cart'))

WebUI.closeBrowser()

