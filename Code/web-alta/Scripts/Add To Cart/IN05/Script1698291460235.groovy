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

WebUI.click(findTestObject('Object Repository/Add to Cart/btn_detail'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Add to Cart/txt_Sony PS5'), 0)

WebUI.click(findTestObject('Object Repository/Add to Cart/txt_AltaShop_header'))

WebUI.click(findTestObject('Object Repository/Add to Cart/txt_Beli'))

WebUI.click(findTestObject('Object Repository/Add to Cart/btn_cart_header'))

WebUI.click(findTestObject('Object Repository/Add to Cart/btn_Bayar'))

WebUI.verifyElementPresent(findTestObject('Add to Cart/txt_Transaction'), 0)

WebUI.click(findTestObject('Object Repository/Add to Cart/txt_AltaShop_header'))

WebUI.click(findTestObject('Add to Cart/btn_icon_logout'))

WebUI.click(findTestObject('Add to Cart/btn_logout'))

WebUI.verifyElementPresent(findTestObject('null'), 0)

WebUI.closeBrowser()

