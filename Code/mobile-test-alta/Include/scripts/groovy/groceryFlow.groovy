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
//class groceryFlow {
//
//
//	@When("I click add button")
//	def clickAddButton() {
//		Mobile.tap(findTestObject('Item/btn_plus(add)'), 0)
//	}
//
//	@And("I clear all inputs")
//	def clearAllInputs() {
//		Mobile.checkElement(findTestObject('Object Repository/Item/inpt_name'), 0, FailureHandling.STOP_ON_FAILURE)
//
//		Mobile.checkElement(findTestObject('Object Repository/Item/inpt_Quantity'), 0, FailureHandling.STOP_ON_FAILURE)
//	}
//
//	@And("I click add item button")
//	def clickAddItemButton() {
//		Mobile.tap(findTestObject('Object Repository/Item/btn_add_item'), 0)
//	}
//
//	@Then("error message should be displayed")
//	def errorMessageDisplayed() {
//		Mobile.checkElement(findTestObject('Item/txt_must_be_between_1_and_50_characters'), 0)
//	}
//
//	@When("I enter all inputs")
//	def enterAllInputs() {
//		Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
//
//		Mobile.tap(findTestObject('Object Repository/Item/btn_name'), 0)
//
//		Mobile.setText(findTestObject('Object Repository/Item/inpt_name'), 'koko', 0)
//
//		Mobile.tap(findTestObject('Object Repository/Item/btn_Quantity'), 0)
//
//		Mobile.setText(findTestObject('Object Repository/Item/inpt_Quantity'), '3', 0)
//
//		Mobile.tap(findTestObject('Object Repository/Item/btn_vegetable'), 0)
//
//		Mobile.tap(findTestObject('Object Repository/Item/btn_fruit'), 0)
//	}
//
//	@And("I click reset button")
//	def clickResetButton() {
//		Mobile.tap(findTestObject('Item/btn_reset'), 0)
//	}
//
//	@And("I re-entered all the inputs")
//	def reenteredAllInputs() {
//		Mobile.tap(findTestObject('Object Repository/Item/btn_name'), 0)
//
//		Mobile.setText(findTestObject('Object Repository/Item/inpt_name'), 'lala', 0)
//
//		Mobile.tap(findTestObject('Object Repository/Item/btn_Quantity'), 0)
//
//		Mobile.setText(findTestObject('Object Repository/Item/inpt_Quantity'), '2', 0)
//	}
//
//
//	@Then("The item should be showed in dashboard")
//	def onDashboard() {
//		Mobile.verifyElementVisible(findTestObject('Item/txt_lala_grocery'), 0)
//
//		Mobile.tap(findTestObject('Item/txt_lala_grocery'), 0)
//	}
//
//	@When("The item is showed in dashboard")
//	def verifyItem() {
//		Mobile.verifyElementVisible(findTestObject('Item/txt_lala_grocery'), 0)
//
//		Mobile.tap(findTestObject('Item/txt_lala_grocery'), 0)
//	}
//
//	@Then("I swipe for deleting the item")
//	def verifyDeleteItem() {
//		Mobile.swipe(200, 300, -500, 0)
//	}
//}