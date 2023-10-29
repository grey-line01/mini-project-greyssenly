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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

def randomNumber = org.apache.commons.lang.RandomStringUtils.randomNumeric(5)

//name 
println('nama: ' + name)

println('random numbernya: ' + randomNumber)

def name = name + randomNumber

println('Nama barunya: ' + name)

//password
println('password: ' + password)

println('password nya : ' + randomNumber)

def password = password + randomNumber

println('Password barunya: ' + password)

WebUI.callTestCase(findTestCase('Reusable Test/Launch Register'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Register/inpt_nama_lengkap'), name)

WebUI.setText(findTestObject('Object Repository/Register/inpt_email'), email)

WebUI.setText(findTestObject('Object Repository/Register/inpt_password'), password)

WebUI.click(findTestObject('Object Repository/Register/btn_register'))

WebUI.click(findTestObject('Object Repository/Register/btn_register'))

WebUI.verifyElementPresent(findTestObject('Register/txt_email_is_required'), 0)

WebUI.closeBrowser()

