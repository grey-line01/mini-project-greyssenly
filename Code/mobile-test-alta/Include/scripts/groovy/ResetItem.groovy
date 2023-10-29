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



class ResetItem {

	/////////////////////TC10
	@When("I reset the items")
	def resetItems() {
		Mobile.tap(findTestObject('Item/btn_plus(add)'), 0)

		Mobile.tap(findTestObject('Item/btn_name'), 0)

		Mobile.setText(findTestObject('Item/inpt_name'), 'koko', 0)

		Mobile.tap(findTestObject('Item/btn_Quantity'), 0)

		Mobile.setText(findTestObject('Item/inpt_Quantity'), '3', 0)

		Mobile.tap(findTestObject('Item/btn_vegetable'), 0)

		Mobile.tap(findTestObject('Item/btn_fruit'), 0)

		Mobile.tap(findTestObject('Item/btn_reset'), 0)
	}

	@Then("The new data of the item should be displayed")
	def newData() {
		Mobile.tap(findTestObject('Item/btn_name'), 0)

		Mobile.setText(findTestObject('Item/inpt_name'), 'lala', 0)

		Mobile.tap(findTestObject('Item/btn_Quantity'), 0)

		Mobile.setText(findTestObject('Item/inpt_Quantity'), '2', 0)

		Mobile.tap(findTestObject('Item/btn_add_item'), 0)

		Mobile.checkElement(findTestObject('Item/btn_plus(add)'), 0)

	}
}