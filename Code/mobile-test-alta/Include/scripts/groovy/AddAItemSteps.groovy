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



class AddAItemSteps {

	@Given("open App")
	def openApp() {
		WebUI.callTestCase(findTestCase('Reusable Test/Lauch App'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	/////////////////////TC01
	@When("I click plus button and I clear all inputs")
	def clickPlusButtonAndClearAllInputs() {
		Mobile.tap(findTestObject('Item/btn_plus(add)'), 0)

		Mobile.tap(findTestObject('Item/btn_Quantity'), 0)

		Mobile.setText(findTestObject('Item/inpt_Quantity'), '0', 0)
	}

	@And("I click add item button")
	def clickAddItem() {
		Mobile.tap(findTestObject('Item/btn_add_item'), 0)


	}

	@Then("The error message would be displayed")
	def errorMessage() {
		Mobile.checkElement(findTestObject('Item/txt_must_be_between_1_and_50_characters'), 0)

		Mobile.checkElement(findTestObject('Item/txt_Must_be_a_valid_positif'), 0)

		Mobile.tap(findTestObject('Item/btn_back_sign'), 0)
	}



	////////////////////////TC02
	@When("I click plus button and I input quantity and item type")
	def clickPlusButtonAndinputQuantity() {
		Mobile.tap(findTestObject('Item/btn_plus(add)'), 0)

		Mobile.tap(findTestObject('Item/btn_name'), 0)

		Mobile.setText(findTestObject('Item/inpt_name'), '', 0)

		Mobile.tap(findTestObject('Item/btn_Quantity'), 0)

		Mobile.setText(findTestObject('Item/inpt_Quantity'), '3', 0)

		Mobile.tap(findTestObject('Item/btn_vegetable'), 0)

		Mobile.tap(findTestObject('Item/btn_fruit'), 0)
	}

	@Then("The error message for empty name would be displayed")
	def errorMessageEmptyName() {
		Mobile.checkElement(findTestObject('Item/txt_must_be_between_1_and_50_characters'), 0)

		Mobile.tap(findTestObject('Item/btn_back_sign'), 0)
	}

	//////////////////////////////TC03
	@When("I click plus button and I input name and item type")
	def clickPlusButtonAndinputName() {
		Mobile.tap(findTestObject('Item/btn_plus(add)'), 0)

		Mobile.tap(findTestObject('Item/btn_name'), 0)

		Mobile.setText(findTestObject('Item/inpt_name'), 'koko', 0)

		Mobile.tap(findTestObject('Item/btn_Quantity'), 0)

		Mobile.setText(findTestObject('Item/inpt_Quantity'), '0', 0)

		Mobile.tap(findTestObject('Item/btn_vegetable'), 0)

		Mobile.tap(findTestObject('Item/btn_fruit'), 0)
	}

	@Then("The error message for empty quantity would be displayed")
	def errorMessageEmptyQuantity() {
		Mobile.checkElement(findTestObject('Item/txt_Must_be_a_valid_positif'), 0)

		Mobile.tap(findTestObject('Item/btn_back_sign'), 0)
	}

	////////////TC04
	@When("I click plus button and I input name with only alphabets")
	def clickPlusButtonAndAllinputs() {
		Mobile.tap(findTestObject('Item/btn_plus(add)'), 0)

		Mobile.tap(findTestObject('Item/btn_name'), 0)

		Mobile.setText(findTestObject('Item/inpt_name'), 'aaaaaaaaaaccccccccccddddddddddssssssssss', 0)

		Mobile.tap(findTestObject('Item/btn_Quantity'), 0)

		Mobile.setText(findTestObject('Item/inpt_Quantity'), '3', 0)

		Mobile.tap(findTestObject('Item/btn_vegetable'), 0)

		Mobile.tap(findTestObject('Item/btn_fruit'), 0)
	}

	@Then("The added item would be displayed")
	def addedItemDisplayed() {
		Mobile.checkElement(findTestObject('Item/txt_your_groceries'), 0)
	}

	////////////TC05
	@When("I click plus button and I input name with only numbers")
	def clickPlusButtonAndNameWithOnlyNumbers() {
		Mobile.tap(findTestObject('Item/btn_plus(add)'), 0)

		Mobile.tap(findTestObject('Item/btn_name'), 0)

		Mobile.setText(findTestObject('Item/inpt_name'), '11111111112222222222333333333344444444445555555555', 0)

		Mobile.tap(findTestObject('Item/btn_Quantity'), 0)

		Mobile.setText(findTestObject('Item/inpt_Quantity'), '3', 0)

		Mobile.tap(findTestObject('Item/btn_vegetable'), 0)

		Mobile.tap(findTestObject('Item/btn_fruit'), 0)
	}

	@Then("The added item would be showed")
	def addedItemShowed() {
		Mobile.checkElement(findTestObject('Item/txt_your_groceries'), 0)
	}



	////////////TC06
	@When("I click plus button and I input name with both alphabets and numbers")
	def clickPlusButtonAndNameWithBothAlphabetsAndNumbers() {
		Mobile.tap(findTestObject('Item/btn_plus(add)'), 0)

		Mobile.tap(findTestObject('Item/btn_name'), 0)

		Mobile.setText(findTestObject('Item/inpt_name'), '11111111112222222222333333333344444444445555555555', 0)

		Mobile.tap(findTestObject('Item/btn_Quantity'), 0)

		Mobile.setText(findTestObject('Item/inpt_Quantity'), '3', 0)

		Mobile.tap(findTestObject('Item/btn_vegetable'), 0)

		Mobile.tap(findTestObject('Item/btn_fruit'), 0)
	}

	@Then("The added item would be appeared")
	def addedItemAppeared() {
		Mobile.checkElement(findTestObject('Item/txt_your_groceries'), 0)
	}

	////////////TC07
	@When("I click plus button and I input name and negative value to quantity")
	def clickPlusButtonAndInputNegativeValue() {
		Mobile.tap(findTestObject('Item/btn_plus(add)'), 0)

		Mobile.tap(findTestObject('Item/btn_name'), 0)

		Mobile.setText(findTestObject('Item/inpt_name'), 'koko', 0)

		Mobile.tap(findTestObject('Item/btn_Quantity'), 0)

		Mobile.setText(findTestObject('Item/inpt_Quantity'), '-8', 0)

		Mobile.tap(findTestObject('Item/btn_vegetable'), 0)

		Mobile.tap(findTestObject('Item/btn_fruit'), 0)

	}

	@Then("The error message for negative value should be displayed")
	def errorMessageNegativeValue() {
		Mobile.checkElement(findTestObject('Item/txt_Must_be_a_valid_positif'), 0)

		Mobile.tap(findTestObject('Item/btn_back_sign'), 0)
	}

	////////////TC08
	@When("I click plus button and I input name and float number to quantity")
	def clickPlusButtonAndInputFloatNumber() {
		Mobile.tap(findTestObject('Item/btn_plus(add)'), 0)

		Mobile.tap(findTestObject('Item/btn_name'), 0)

		Mobile.setText(findTestObject('Item/inpt_name'), 'koko', 0)

		Mobile.tap(findTestObject('Item/btn_Quantity'), 0)

		Mobile.setText(findTestObject('Item/inpt_Quantity'), '1.5', 0)

		Mobile.tap(findTestObject('Item/btn_vegetable'), 0)

		Mobile.tap(findTestObject('Item/btn_fruit'), 0)

	}

	@Then("The error message for float number should be displayed")
	def errorMessageFloatNumber() {
		Mobile.checkElement(findTestObject('Item/txt_Must_be_a_valid_positif'), 0)

		Mobile.tap(findTestObject('Item/btn_back_sign'), 0)
	}

	/////////TC09
	@When("I click plus button")
	def clickPlusButton() {
		Mobile.tap(findTestObject('Item/btn_plus(add)'), 0)

	}

	@Then("The add a new item page should be displayed")
	def onAddANewItemPage() {
		Mobile.checkElement(findTestObject('Item/btn_name'), 0)
		Mobile.checkElement(findTestObject('Item/btn_add_item'), 0)

		Mobile.tap(findTestObject('Item/btn_back_sign'), 0)

	}

	/////////TC11

	@And("I Enter all the entries")
	def enterAllEntries() {
		Mobile.tap(findTestObject('Object Repository/Item/btn_name'), 0)

		Mobile.setText(findTestObject('Object Repository/Item/inpt_name'), 'lala', 0)

		Mobile.tap(findTestObject('Object Repository/Item/btn_Quantity'), 0)

		Mobile.setText(findTestObject('Object Repository/Item/inpt_Quantity'), '2', 0)

		Mobile.tap(findTestObject('Object Repository/Item/btn_vegetable'), 0)

		Mobile.tap(findTestObject('Object Repository/Item/btn_fruit'), 0)


	}

	@Then("The new item should be displayed")
	def newItemDisplayed() {
		Mobile.verifyElementVisible(findTestObject('Item/txt_your_groceries'), 0)

	}

}