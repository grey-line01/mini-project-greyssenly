import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class RegisterSteps {

	@Given("open browser")
	def openBrowser() {
		WebUI.callTestCase(findTestCase('Reusable Test/Launch Register'), [:], FailureHandling.STOP_ON_FAILURE)
	}


	/////////////////////////// TC01
	@When("I clear all inputs")
	def verifyEmptyAllInputs() {
		WebUI.setText(findTestObject('Object Repository/Register/inpt_Nama_Lengkap'), '')

		WebUI.setText(findTestObject('Object Repository/Register/inpt_email'), '')

		WebUI.setText(findTestObject('Object Repository/Register/inpt_password'), '')

		WebUI.click(findTestObject('Object Repository/Register/btn_register'))

		WebUI.click(findTestObject('Object Repository/Register/btn_register'))
	}

	@Then("error message should be displayed")
	def verifyErrorMessage() {
		WebUI.verifyElementPresent(findTestObject('Register/txt_email_is_required'), 0)
		//		WebUI.closeBrowser()
		WebUI.refresh()
	}

	////////////////////////////TC02
	@When("I input email and password")
	def inputEmailAndPassword() {
		def randomNumber = org.apache.commons.lang.RandomStringUtils.randomNumeric(5)

		def password = 'password' + randomNumber

		def randomDefinedNumber = CustomKeywords.'kw.utility.randomNumber.RandomNumberCustom'(6)

		def email = ('email' + randomDefinedNumber) + '@gmail.com'

		WebUI.setText(findTestObject('Object Repository/Register/inpt_Nama_Lengkap'), '')

		WebUI.setText(findTestObject('Object Repository/Register/inpt_email'), email)

		WebUI.setText(findTestObject('Object Repository/Register/inpt_password'), password)

	}

	@And("I click register")
	def clickRegister() {
		WebUI.click(findTestObject('Object Repository/Register/btn_register'))

		WebUI.click(findTestObject('Object Repository/Register/btn_register'))

	}

	@Then("error message for empty name should be displayed")
	def errorEmptyName() {
		WebUI.verifyElementPresent(findTestObject('Register/txt_fullname is required'), 0)
		//		WebUI.closeBrowser()
		WebUI.refresh()
	}

	/////////////////////TC03

	@When("I input name and password")
	def inputNameAndPassword() {
		def randomNumber = org.apache.commons.lang.RandomStringUtils.randomNumeric(5)

		def name = 'name' + randomNumber

		def password = 'password' + randomNumber

		WebUI.setText(findTestObject('Object Repository/Register/inpt_nama_lengkap'), name)

		WebUI.setText(findTestObject('Object Repository/Register/inpt_email'), '')

		WebUI.setText(findTestObject('Object Repository/Register/inpt_password'), password)


	}

	@Then("error message for empty email should be displayed")
	def errorEmptyEmail() {
		WebUI.verifyElementPresent(findTestObject('Register/txt_email_is_required'), 0)
		//		WebUI.closeBrowser()
		WebUI.refresh()
	}

	///////////////////////////TC04

	@When("I input name and email")
	def inputNameAndEmail() {
		def randomNumber = org.apache.commons.lang.RandomStringUtils.randomNumeric(5)

		def name = 'name' + randomNumber

		def randomDefinedNumber = CustomKeywords.'kw.utility.randomNumber.RandomNumberCustom'(6)

		def email = ('email' + randomDefinedNumber) + '@gmail.com'

		WebUI.setText(findTestObject('Object Repository/Register/inpt_nama_lengkap'), name)

		WebUI.setText(findTestObject('Object Repository/Register/inpt_email'), email)

		WebUI.setText(findTestObject('Object Repository/Register/inpt_password'), '')

	}

	@Then("error message for empty password should be displayed")
	def errorEmptyPassword() {
		WebUI.verifyElementPresent(findTestObject('Register/txt_email_is_required'), 0)
		//		WebUI.closeBrowser()
		WebUI.refresh()
	}

	/////////////////////////////////////TC08
	@When("I enter all inputs")
	def verifyAllInputs() {
		//		WebUI.refresh()

		def randomNumber = org.apache.commons.lang.RandomStringUtils.randomNumeric(5)

		def name = 'name' + randomNumber

		def password = 'password' + randomNumber

		def randomDefinedNumber = CustomKeywords.'kw.utility.randomNumber.RandomNumberCustom'(6)

		def email = ('email' + randomDefinedNumber) + '@gmail.com'

		WebUI.setText(findTestObject('Object Repository/Register/inpt_Nama_Lengkap'), name)

		WebUI.setText(findTestObject('Object Repository/Register/inpt_email'), email)

		WebUI.setText(findTestObject('Object Repository/Register/inpt_password'), password)

		WebUI.click(findTestObject('Object Repository/Register/btn_register'))

	}

	@Then("login page should be displayed")
	def verifyLoginPage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Register/txt_Login'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Add to Cart/btn_login'), 0)
		WebUI.closeBrowser()
	}



}