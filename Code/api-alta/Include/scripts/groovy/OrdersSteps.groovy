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



class OrdersSteps {
	/////////////tc42

	ResponseObject response

	@Given("the API request for TC42 is sent")
	def sendRequestAndVerify_TC42() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC42'))
	}


	@When("the response status code should be appeared")
	def verifyResponseStatusCode() {
		def responseStatusCode = response.getStatusCode()
		if (responseStatusCode == 200) {
			println("Response Status: OK - 200")
		} else {
			println("Response Status: " + responseStatusCode)
		}
	}


	@Then("expected error message")
	def verifyResponseBody() {
		def responseBody = response.getResponseBodyContent()
		if (responseBody.contains('email is required')) {
			println("Response contains the expected error message: 'email is required'")
		} else if (responseBody.contains('password is required')) {
			println("Response contains the expected error message: 'password is required'")
		} else if (responseBody.contains('email or password is invalid')) {
			println("Response contains the expected error message: 'email or password is invalid'")
		} else {
			println("Response does not contain the expected error message")
		}
	}



	/////////////tc43

	@Given("the API request for TC43 is sent")
	def sendRequestAndVerify_TC43() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC43'))
	}


	/////////////tc44

	@Given("the API request for TC44 is sent")
	def sendRequestAndVerify_TC44() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC44'))
	}

	/////////////tc45

	@Given("the API request for TC45 is sent")
	def sendRequestAndVerify_TC45() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC45'))
	}

	/////////////tc46

	@Given("the API request for TC46 is sent")
	def sendRequestAndVerify_TC46() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC46'))
	}

	/////////////tc47

	@Given("the API request for TC47 is sent")
	def sendRequestAndVerify_TC47() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC47'))
	}

	/////////////tc48

	@Given("the API request for TC48 is sent")
	def sendRequestAndVerify_TC48() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC48'))
	}


}