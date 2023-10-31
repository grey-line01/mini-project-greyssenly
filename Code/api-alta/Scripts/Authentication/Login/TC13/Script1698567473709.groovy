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

import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.ResponseObject

// Send the POST request
ResponseObject response = WS.sendRequestAndVerify(findTestObject('Object Repository/TC10'))

// Get the response HTTP status code
def responseStatusCode = response.getStatusCode()

// Verify the HTTP status code
		if (responseStatusCode == 200) {
		    println("Response Status: OK - 200")
		} else {
		    println("Response Status: " + responseStatusCode)
		}

// Verify the response body
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
