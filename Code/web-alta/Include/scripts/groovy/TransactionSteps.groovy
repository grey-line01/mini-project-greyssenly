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



class TransactionSteps {
	//////////////////////////////TC26
	@Given("user is already purchased the product")
	def userPurchasedProduct() {
		WebUI.callTestCase(findTestCase('Transaction/TC25'), [:], FailureHandling.STOP_ON_FAILURE)

	}

	@When("the transaction page showed")
	def onTransactionPage() {
		WebUI.click(findTestObject('Transaction/select_row'))

	}

	@Then("set the rows per page to 5")
	def rowsPerPage5() {
		WebUI.click(findTestObject('Transaction/select_row_5'))
		WebUI.refresh()
	}

	///////////////////TC27
	@Then("set the rows per page to all")
	def rowsPerPagetoAll() {
		WebUI.click(findTestObject('Product/select_row_All'))
		WebUI.refresh()
	}


	///////////////////TC28
	@Then("click the next page")
	def clickNextPage() {
		WebUI.click(findTestObject('Transaction/btn_next_page'))
		WebUI.refresh()
	}

	///////////////////TC29
	@Then("click the previous page")
	def clickPreviousPage() {
		WebUI.click(findTestObject('Transaction/btn_next_page'))

		WebUI.click(findTestObject('Transaction/btn_previous_page'))
		WebUI.refresh()
	}

	///////////////////TC30
	@Then("click back")
	def clickBack() {
		WebUI.click(findTestObject('Transaction/txt_AltaShop_header'))
		WebUI.closeBrowser()
	}


}