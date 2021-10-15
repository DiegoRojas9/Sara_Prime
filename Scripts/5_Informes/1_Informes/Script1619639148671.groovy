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
import org.junit.After as After
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('1_Logueo/Logueo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

WebUI.click(findTestObject('1.1_General_Objects/a_Informes'))

WebUI.waitForElementClickable(findTestObject('5_Informes/a_Ir'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('5_Informes/a_Ir'))

WebUI.click(findTestObject('5_Informes/td_2 GT - Reporte Programacin'))

WebUI.setText(findTestObject('5_Informes/input_CONTRATO_popupReportetablaParametro'), '0')

WebUI.setText(findTestObject('5_Informes/input_Fecha Inicial'), '03/12/2020')

WebUI.waitForElementClickable(findTestObject('5_Informes/span_Fecha Final'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('5_Informes/span_Fecha Final'))

WebUI.setText(findTestObject('5_Informes/input_Fecha Final'), '10/12/2020')

WebUI.click(findTestObject('5_Informes/span_Que desea hacer_ui-radiobutton-icon ui-icon ui-icon-blank ui-c'))

WebUI.click(findTestObject('5_Informes/a_Generar'))

WebUI.click(findTestObject('5_Informes/a_Continuar'))

WebUI.click(findTestObject('5_Informes/a_Descargar'))

if (WebUI.waitForElementClickable(findTestObject('5_Informes/a_Descargar'), GlobalVariable.G_timeout)) {
    WebUI.waitForElementClickable(findTestObject('5_Informes/span_Informes_ui-icon ui-icon-closethick'), GlobalVariable.G_timeout)

    WebUI.click(findTestObject('5_Informes/span_Informes_ui-icon ui-icon-closethick'))
}

WebUI.closeBrowser()

