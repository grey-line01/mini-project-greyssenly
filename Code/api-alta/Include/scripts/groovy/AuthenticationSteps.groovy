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



class AuthenticationSteps {
	/////////////tc10
	
	ResponseObject response
	
	@Given("the API request for TC10 is sent")
	def sendRequestAndVerify_TC10() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC10'))
	}
	

	@When("the response status code should be verified")
	def verifyResponseStatusCode() {
		def responseStatusCode = response.getStatusCode()
		if (responseStatusCode == 200) {
			println("Response Status: OK - 200")
		} else {
			println("Response Status: " + responseStatusCode)
		}
	}
	

	@Then("the response body should contain the expected error message")
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

	

	/////////////tc11

	@Given("the API request for TC11 is sent")
	def sendRequestAndVerify_TC11() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC11'))
	}
	



	/////////////tc12

	@Given("the API request for TC12 is sent")
	def sendRequestAndVerify_TC12() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC12'))
	}
	

	/////////////tc13

	@Given("the API request for TC13 is sent")
	def sendRequestAndVerify_TC13() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC13'))
	}
	
	/////////////tc14

	@Given("the API request for TC14 is sent")
	def sendRequestAndVerify_TC14() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC14'))
	}

	/////////////tc15

	@Given("the API request for TC15 is sent")
	def sendRequestAndVerify_TC15() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC15'))
	}

	
	/////////////tc16

	@Given("the API request for TC16 is sent")
	def sendRequestAndVerify_TC16() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC16'))
	}

	/////////////tc17

	@Given("the API request for TC17 is sent")
	def sendRequestAndVerify_TC17() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC17'))
	}

	/////////////tc18
	@Given("the API request for TC18 is sent")
	def sendRequestAndVerify_TC18() {
		response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC18'))
	}
	


}