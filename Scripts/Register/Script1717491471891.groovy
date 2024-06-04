import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.SelectorMethod

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert
import com.kms.katalon.core.testdata.CSVData
import org.openqa.selenium.Keys as Keys

SoftAssert softAssertion = new SoftAssert();
WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://www.automationexercise.com/")
selenium.click("link=Signup / Login")
selenium.click("name=name")
selenium.type("name=name", "mazen")
selenium.click("xpath=//section[@id='form']/div/div/div[3]/div/form/input[3]")
selenium.type("xpath=//section[@id='form']/div/div/div[3]/div/form/input[3]", ("demdemodemuushsd@gmail.com").toString())
selenium.click("xpath=//section[@id='form']/div/div/div[3]/div/form/button")
selenium.click("id=id_gender1")
selenium.click("id=password")
selenium.type("id=password", "demodemo123")
selenium.click("id=days")
selenium.select("id=days", "label=20")
selenium.click("id=months")
selenium.select("id=months", "label=February")
selenium.click("id=years")
selenium.select("id=years", "label=2002")
selenium.click("id=first_name")
selenium.type("id=first_name", "mazen")
selenium.click("id=last_name")
selenium.type("id=last_name", "walid")
selenium.click("id=address1")
selenium.type("id=address1", "cairo")
selenium.click("id=address2")
selenium.type("id=address2", "123")
selenium.click("id=country")
selenium.select("id=country", "label=New Zealand")
selenium.click("id=state")
selenium.type("id=state", ("new cairo").toString())
selenium.click("id=city")
selenium.type("id=city", ("new giza").toString())
selenium.click("id=zipcode")
selenium.type("id=zipcode", "1234")
selenium.click("id=mobile_number")
selenium.type("id=mobile_number", "098828635618")
selenium.click("xpath=//button[@type='submit']")
