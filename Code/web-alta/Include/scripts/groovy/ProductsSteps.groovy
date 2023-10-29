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

	@Given("user is logged in")
	def verifyLogin() {
		WebUI.callTestCase(findTestCase('Login/TC14'), [('email') : 'lala@gmail.com', ('password') : 'lala123'], FailureHandling.STOP_ON_FAILURE)
	}
	///////////////////TC15
	@When("I select category")
	def selectCategory() {
		WebUI.click(findTestObject('Product/select_AltaShop_v-select__selections'))

		WebUI.click(findTestObject('Product/select_gaming'))

	}

	@Then("the category should be showed")
	def categoryShowed() {
		WebUI.verifyElementPresent(findTestObject('Product/txt_Products is empty'), 0)
		//		WebUI.closeBrowser()
		WebUI.click(findTestObject('Transaction/txt_AltaShop_header'))
	}


	///////////////TC16
	@When("I click cart")
	def clickCart() {
		WebUI.click(findTestObject('Product/btn_cart'))
	}

	@Then("the cart should be showed")
	def cartShowed() {
		WebUI.verifyElementPresent(findTestObject('Product/txt_Order is empty'), 0)
		//		WebUI.closeBrowser()
		WebUI.click(findTestObject('Transaction/txt_AltaShop_header'))
	}

	/////////////////TC17
	@When("I click detail")
	def clickDetail() {
		WebUI.click(findTestObject('Product/btn_Detail'))

	}

	@Then("the detail of the product should be showed")
	def detailProductShowed() {
		WebUI.verifyElementPresent(findTestObject('Product/txt_Sony PS5'), 0)
		//		WebUI.closeBrowser()
		WebUI.click(findTestObject('Transaction/txt_AltaShop_header'))
	}

	///////////////TC20
	@When("I click beli and click cart")
	def clickBeliAndCart() {
		WebUI.click(findTestObject('Product/btn_Beli'))

		WebUI.click(findTestObject('Product/btn_cart'))

	}

	@Then("the cart item should be showed")
	def cartitemShowed() {
		WebUI.verifyElementPresent(findTestObject('Product/txt_Total_bayar'), 0)
		//		WebUI.closeBrowser()
		WebUI.click(findTestObject('Transaction/txt_AltaShop_header'))
	}

	///////////////////TC21

	@When("I click plus sign")
	def clickPlusSign() {
		WebUI.click(findTestObject('Product/btn_tambah_jumlah'))

	}

	@Then("the quantity of the product should be increased")
	def quantityIncreased() {
		WebUI.verifyElementPresent(findTestObject('Product/txt_Total_Qty'), 0)
		//		WebUI.closeBrowser()
		WebUI.click(findTestObject('Transaction/txt_AltaShop_header'))
	}

	///////////////////TC22

	@When("I click minus sign")
	def clickMinusSign() {
		WebUI.click(findTestObject('Product/btn_tambah_jumlah'))

		WebUI.click(findTestObject('Product/btn_kurang_jumlah'))
	}

	@Then("the quantity of the product should be decreased")
	def quantityDecreased() {
		WebUI.verifyElementPresent(findTestObject('Product/txt_Total_Qty'), 0)
		//		WebUI.closeBrowser()
		WebUI.click(findTestObject('Transaction/txt_AltaShop_header'))
	}

	///////////////////TC23

	@When("I click minus sign until it reached 0")
	def clickMinusSignUntil0() {
		WebUI.click(findTestObject('Product/btn_kurang_jumlah'))

	}

	@Then("the error message for empty order should be showed")
	def errorMessageEmptyOrder() {
		WebUI.verifyElementPresent(findTestObject('Product/txt_Order is empty'), 0)
		//		WebUI.closeBrowser()
		WebUI.click(findTestObject('Transaction/txt_AltaShop_header'))
	}


	///////////////////TC24

	@And("I click Bayar")
	def clickBayar() {
		WebUI.click(findTestObject('Product/btn_Bayar'))

	}

	@Then("The transaction page should showed")
	def onTransactionPage() {

		WebUI.verifyElementPresent(findTestObject('Product/txt_Transactions'), 0)
		//		WebUI.closeBrowser()
	}


}