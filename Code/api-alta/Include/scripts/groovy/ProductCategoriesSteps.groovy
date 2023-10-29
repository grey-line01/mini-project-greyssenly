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



class ProductCategoriesSteps {
	ResponseObject response
	
	@Given("the API request for TC19 is sent")
	def sendRequestAndVerify_TC19() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC19'))
	}
	

	@When("the response status code should be showed")
	def verifyResponseStatusCode() {
		def responseStatusCode = response.getStatusCode()
		if (responseStatusCode == 200) {
			println("Response Status: OK - 200")
		} else {
			println("Response Status: " + responseStatusCode)
		}
	}
	

	@Then("The expected error message should be present within the response body")
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

	//////////tc20

	@Given("the API request for TC20 is sent")
	def sendRequestAndVerify_TC20() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC20'))
	}
	
	//////////tc21
	
	@Given("the API request for TC21 is sent")
	def sendRequestAndVerify_TC21() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC21'))
	}
	

	//////////tc22
	
	@Given("the API request for TC22 is sent")
	def sendRequestAndVerify_TC22() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC22'))
	}
	
	
	//////////tc23
	
	@Given("the API request for TC23 is sent")
	def sendRequestAndVerify_TC23() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC23'))
	}
	
	
	//////////tc24
	
	@Given("the API request for TC24 is sent")
	def sendRequestAndVerify_TC24() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC24'))
	}
	
	
	
	//////////tc25
	
	@Given("the API request for TC25 is sent")
	def sendRequestAndVerify_TC25() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC25'))
	}
	
	
	//////////tc26
	
	@Given("the API request for TC26 is sent")
	def sendRequestAndVerify_TC26() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC26'))
	}
	
	
	//////////tc27
	
	@Given("the API request for TC27 is sent")
	def sendRequestAndVerify_TC27() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC27'))
	}
	
	//////////tc28
	
	@Given("the API request for TC28 is sent")
	def sendRequestAndVerify_TC28() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC28'))
	}
	
	//////////tc29
	
	@Given("the API request for TC29 is sent")
	def sendRequestAndVerify_TC29() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC29'))
	}
	
}