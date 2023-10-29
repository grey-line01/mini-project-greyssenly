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



class ProductsSteps {
	/////////////tc30
	
	ResponseObject response
	
	@Given("the API request for TC30 is sent")
	def sendRequestAndVerify_TC30() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC30'))
	}
	

	@When("the response status code should be displayed")
	def verifyResponseStatusCode() {
		def responseStatusCode = response.getStatusCode()
		if (responseStatusCode == 200) {
			println("Response Status: OK - 200")
		} else {
			println("Response Status: " + responseStatusCode)
		}
	}
	

	@Then("the response body is expected to have the specified error message")
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

	

	/////////////tc31

	@Given("the API request for TC31 is sent")
	def sendRequestAndVerify_TC31() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC31'))
	}
	
	
	/////////////tc32

	@Given("the API request for TC32 is sent")
	def sendRequestAndVerify_TC32() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC32'))
	}
	
	
	/////////////tc33

	@Given("the API request for TC33 is sent")
	def sendRequestAndVerify_TC33() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC33'))
	}
	
	/////////////tc34
	
	@Given("the API request for TC34 is sent")
	def sendRequestAndVerify_TC34() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC34'))
	}
	/////////////tc35
	
	@Given("the API request for TC35 is sent")
	def sendRequestAndVerify_TC35() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC35'))
	}
	
	/////////////tc36
	
	@Given("the API request for TC36 is sent")
	def sendRequestAndVerify_TC36() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC36'))
	}
	
	/////////////tc37
	
	@Given("the API request for TC37 is sent")
	def sendRequestAndVerify_TC37() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC37'))
	}
	
	
	/////////////tc38
	
	@Given("the API request for TC38 is sent")
	def sendRequestAndVerify_TC38() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC38'))
	}
	
	/////////////tc39
	
	@Given("the API request for TC39 is sent")
	def sendRequestAndVerify_TC39() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC39'))
	}
	
	/////////////tc40
	
	@Given("the API request for TC40 is sent")
	def sendRequestAndVerify_TC40() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC40'))
	}
	
	/////////////tc41
	
	@Given("the API request for TC41 is sent")
	def sendRequestAndVerify_TC41() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC41'))
	}
}