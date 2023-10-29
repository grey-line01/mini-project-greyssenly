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

WebUI.callTestCase(findTestCase('Reusable Test/Lauch App'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Item/btn_plus(add)'), 0)

Mobile.tap(findTestObject('Object Repository/Item/btn_Quantity'), 0)

Mobile.setText(findTestObject('Object Repository/Item/inpt_Quantity'), '2', 0)

Mobile.tap(findTestObject('Object Repository/Item/btn_vegetable'), 0)

Mobile.tap(findTestObject('Object Repository/Item/btn_fruit'), 0)

Mobile.tap(findTestObject('Object Repository/Item/btn_add_item'), 0)

Mobile.checkElement(findTestObject('Item/txt_must_be_between_1_and_50_characters'), 0)

