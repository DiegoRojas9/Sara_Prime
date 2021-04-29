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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Page_/Configuración nuevo concepto/Page_/a_Configuracin'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Object Repository/Page_/Configuración nuevo concepto/Page_/a_Configuracin'))

WebUI.waitForElementClickable(findTestObject('Page_/Configuración nuevo concepto/Page_/a_Conceptos y Cuentas Contables'),
	GlobalVariable.G_timeout)

WebUI.click(findTestObject('Object Repository/Page_/Configuración nuevo concepto/Page_/a_Conceptos y Cuentas Contables'))

WebUI.waitForElementClickable(findTestObject('Page_/Configuración nuevo concepto/Page_/a_Nuevo Concepto'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Object Repository/Page_/Configuración nuevo concepto/Page_/a_Nuevo Concepto'))

WebUI.waitForElementClickable(findTestObject('Page_/Configuración nuevo concepto/Page_/select_-- Seleccione --DEVENGODEDUCCIN'),
	GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Configuración nuevo concepto/Page_/select_-- Seleccione --DEVENGODEDUCCIN'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_/Configuración nuevo concepto/Page_/select_-- Seleccione --DEVENGODEDUCCIN'),
	'1')

WebUI.waitForElementClickable(findTestObject('Page_/Configuración nuevo concepto/Page_/label_Nuevo Concepto'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Configuración nuevo concepto/Page_/label_Nuevo Concepto'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_/Configuración nuevo concepto/Page_/select_-- Seleccione --AUXILIO NO SALARIAL'),
	GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Configuración nuevo concepto/Page_/select_-- Seleccione --AUXILIO NO SALARIAL'))

WebUI.selectOptionByIndex(findTestObject('Page_/Configuración nuevo concepto/Page_/select_-- Seleccione --AUXILIO NO SALARIAL'),
	'4')

WebUI.waitForElementClickable(findTestObject('Page_/Configuración nuevo concepto/Page_/label_Nuevo Concepto'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Configuración nuevo concepto/Page_/label_Nuevo Concepto'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_/Configuración nuevo concepto/Page_/input_Nombre_popupNuevoConceptonombreConcepto'),
	'DEVENGO PRIMER SEMESTRE')

WebUI.waitForElementClickable(findTestObject('Page_/Configuración nuevo concepto/Page_/a_Agregar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Object Repository/Page_/Configuración nuevo concepto/Page_/a_Agregar'))

WebUI.closeBrowser()