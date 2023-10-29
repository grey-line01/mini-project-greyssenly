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



class LoginSteps {

	@Given("open login URL")
	def openLoginURL() {
		WebUI.callTestCase(findTestCase('Reusable Test/Launch Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	/////////////////TC09
	@When("I clear email and password")
	def clearEmailAndPassword() {
		WebUI.verifyElementPresent(findTestObject('Login/txt_login_header'), 0)

		WebUI.setText(findTestObject('Login/inpt_email'), '')

		WebUI.setText(findTestObject('Login/inpt_password'), '')
	}

	@And("I click login")
	def clickLogin() {
		WebUI.click(findTestObject('Login/btn_login'))
	}

	@Then("error message for all empty entries should be displayed")
	def errorAllEmptyEntries() {
		WebUI.verifyElementPresent(findTestObject('Login/txt_email is required'), 0)
		WebUI.refresh()
	}


	///////////////////////////TC10

	@When("I input password")
	def inputPassword() {
		WebUI.verifyElementPresent(findTestObject('Login/txt_login_header'), 0)

		WebUI.setText(findTestObject('Login/inpt_email'), '')

		WebUI.setText(findTestObject('Login/inpt_password'), 'lala123')
	}


	@Then("error message for empty email should be showed")
	def errorEmptyEmail() {
		WebUI.verifyElementPresent(findTestObject('Login/txt_email is required'), 0)
		WebUI.refresh()
	}

	///////////////////////////TC11

	@When("I input email")
	def inputEmail() {
		WebUI.verifyElementPresent(findTestObject('Login/txt_login_header'), 0)

		WebUI.setText(findTestObject('Login/inpt_email'), 'lala@gmail.com')

		WebUI.setText(findTestObject('Login/inpt_password'), '')
	}


	@Then("error message for empty password should be showed")
	def errorEmptyPassword() {
		WebUI.verifyElementPresent(findTestObject('Login/txt_password is required'), 0)
		WebUI.refresh()
	}

	/////////////////////////TC12

	@When("I input invalid email (.*) and valid password (.*)")
	def invalidEmailAndValidPassword(String email, String password) {
		WebUI.verifyElementPresent(findTestObject('Login/txt_login_header'), 0)

		WebUI.setText(findTestObject('Login/inpt_email'), email)

		WebUI.setText(findTestObject('Login/inpt_password'), password)
	}


	@Then("error message for invalid email should be showed")
	def errorInvalidEmail() {
		WebUI.verifyElementPresent(findTestObject('Login/txt_email_or_password_is_invalid'), 0)
		WebUI.refresh()
	}

	/////////////////////////TC13

	@When("I input valid email (.*) and invalid password (.*)")
	def validEmailAndInvalidPassword(String email, String password) {

		WebUI.setText(findTestObject('Login/inpt_email'), email)

		WebUI.setText(findTestObject('Login/inpt_password'), password)
	}


	@Then("error message for invalid password should be showed")
	def errorInvalidPassword() {
		WebUI.verifyElementPresent(findTestObject('Login/txt_email is required'), 0)
		WebUI.refresh()

	}
	/////////////////////////////////////////TC14
	@When("I input valid email (.*) and valid password (.*)")
	def validEmailAndValidPassword(String email, String password) {

		WebUI.setText(findTestObject('Login/inpt_email'), email)

		WebUI.setText(findTestObject('Login/inpt_password'), password)
	}


	@Then("the shopping page should be displayed")
	def onShoppingPage() {
		WebUI.verifyElementPresent(findTestObject('Login/txt_AltaShop_header'), 0)


	}

}