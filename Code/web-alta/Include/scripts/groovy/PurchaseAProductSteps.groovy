//import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
//import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
//import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//
//import com.kms.katalon.core.annotation.Keyword
//import com.kms.katalon.core.checkpoint.Checkpoint
//import com.kms.katalon.core.checkpoint.CheckpointFactory
//import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
//import com.kms.katalon.core.model.FailureHandling
//import com.kms.katalon.core.testcase.TestCase
//import com.kms.katalon.core.testcase.TestCaseFactory
//import com.kms.katalon.core.testdata.TestData
//import com.kms.katalon.core.testdata.TestDataFactory
//import com.kms.katalon.core.testobject.ObjectRepository
//import com.kms.katalon.core.testobject.TestObject
//import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//
//import internal.GlobalVariable
//
//import org.openqa.selenium.WebElement
//import org.openqa.selenium.WebDriver
//import org.openqa.selenium.By
//
//import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
//import com.kms.katalon.core.webui.driver.DriverFactory
//
//import com.kms.katalon.core.testobject.RequestObject
//import com.kms.katalon.core.testobject.ResponseObject
//import com.kms.katalon.core.testobject.ConditionType
//import com.kms.katalon.core.testobject.TestObjectProperty
//
//import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
//import com.kms.katalon.core.util.KeywordUtil
//
//import com.kms.katalon.core.webui.exception.WebElementNotFoundException
//
//import cucumber.api.java.en.And
//import cucumber.api.java.en.Given
//import cucumber.api.java.en.Then
//import cucumber.api.java.en.When
//
//
//
//class PurchaseAProductSteps {
//
//	@Given("open URL")
//	def openURL() {
//		WebUI.callTestCase(findTestCase('Reusable Test/Launch Login'), [:], FailureHandling.STOP_ON_FAILURE)
//	}
//
////	@When("I input valid email (.*) and invalid password (.*)")
////	def verifyValidEmailAndInvalidPassword(String email, String password) {
////		WebUI.refresh()
////
////		WebUI.setText(findTestObject('Object Repository/Login/inpt_email'), email)
////
////		WebUI.setText(findTestObject('Object Repository/Login/inpt_password'), password)
////	}
//
//	@And("I click login button")
//	def clickLoginButton() {
//		WebUI.click(findTestObject('Object Repository/Login/btn_login'))
//	}
//
//	@Then("error message should be showed")
//	def verifyErrorMessageShowed() {
//		WebUI.verifyElementPresent(findTestObject('Login/txt_email_or_password_is_invalid'), 0)
//	}
//
//	@When("I input valid email (.*) and valid password (.*)")
//	def verifyValidEmailAndValidPassword(String email, String password) {
//		WebUI.refresh()
//
//		WebUI.setText(findTestObject('Object Repository/Login/inpt_email'), email)
//
//		WebUI.setText(findTestObject('Object Repository/Login/inpt_password'), password)
//	}
//
//	@Then("shopping page should be showed")
//	def onShoppingPage() {
//		WebUI.verifyElementPresent(findTestObject('Login/txt_AltaShop_header'), 0)
//	}
//
//
//	@When("I click detail button")
//	def clickDetailButton() {
//		WebUI.click(findTestObject('Object Repository/Add to Cart/btn_detail'))
//	}
//
//	@Then("The detail of the product should be showed")
//	def verifyDetailPage() {
//		WebUI.verifyElementPresent(findTestObject('Object Repository/Add to Cart/txt_Sony PS5'), 0)
//	}
//
//	@When("I select the product and click the beli button")
//	def selectProductAndClickBeliButton() {
//		WebUI.click(findTestObject('Object Repository/Add to Cart/txt_AltaShop_header'))
//
//		WebUI.click(findTestObject('Object Repository/Add to Cart/txt_Beli'))
//	}
//
//	@And("click cart button")
//	def clickCartButton() {
//		WebUI.click(findTestObject('Object Repository/Add to Cart/btn_cart_header'))
//	}
//
//	@Then("The cart item should be showed")
//	def clickCartItem() {
//		WebUI.verifyElementPresent(findTestObject('Object Repository/Add to Cart/btn_Bayar'), 0)
//	}
//
//	@When("I click bayar button")
//	def clickBayarButton() {
//		WebUI.click(findTestObject('Object Repository/Add to Cart/btn_Bayar'))
//	}
//
//	@Then("The transaction page should be displayed")
//	def onTransactionPage() {
//		WebUI.verifyElementPresent(findTestObject('Add to Cart/txt_Transaction'), 0)
//	}
//
//	@When("I click logout button")
//	def verifyLogout() {
//		WebUI.click(findTestObject('Object Repository/Add to Cart/txt_AltaShop_header'))
//
//		WebUI.click(findTestObject('Add to Cart/btn_icon_logout'))
//
//		WebUI.click(findTestObject('Add to Cart/btn_logout'))
//	}
//
//	@Then("I return to login page")
//	def verifyLoginPage() {
//		WebUI.verifyElementPresent(findTestObject('Object Repository/Register/txt_Login'), 0)
//		WebUI.verifyElementPresent(findTestObject('Object Repository/Add to Cart/btn_login'), 0)
//		WebUI.closeBrowser()
//	}
//}