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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('1_Logueo/Logueo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('3_Nómina/6_Neto/a_Nmina'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/6_Neto/a_Nmina'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/6_Neto/span_5.179.900,00'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/6_Neto/span_5.179.900,00'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('3_Nómina/6_Neto/span_E_ui-icon ui-icon-closethick'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/6_Neto/span_E_ui-icon ui-icon-closethick'))

WebUI.closeBrowser()

