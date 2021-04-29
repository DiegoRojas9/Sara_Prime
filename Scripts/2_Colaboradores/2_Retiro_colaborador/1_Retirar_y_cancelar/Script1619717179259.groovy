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

WebUI.waitForElementClickable(findTestObject('Object Repository/Retiro_colaborador/Page_/a_Colaboradores'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Object Repository/Retiro_colaborador/Page_/a_Colaboradores'))

WebUI.waitForElementClickable(findTestObject('Retiro_colaborador/Page_/a_ACTIVO_us-icon-remover'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Retiro_colaborador/Page_/a_ACTIVO_us-icon-remover'))

WebUI.setText(findTestObject('Object Repository/Retiro_colaborador/Page_/input_Fecha ultimo da Laborado _consultarCo_5ef00d'),
	'26/12/2020')

WebUI.selectOptionByValue(findTestObject('Object Repository/Retiro_colaborador/Page_/select_-- Seleccione --FALLECIMIENTOJUSTA C_a197b1'),
	'T.1                             ', true)

WebUI.waitForElementClickable(findTestObject('Object Repository/Retiro_colaborador/Page_/a_Aplicar Retiro'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Object Repository/Retiro_colaborador/Page_/a_Aplicar Retiro'))

WebUI.waitForElementClickable(findTestObject('Retiro_colaborador/Ver_Retirados/Page_/a_Aceptar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Retiro_colaborador/Ver_Retirados/Page_/a_Aceptar'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Retiro_colaborador/Page_/a_Si'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Object Repository/Retiro_colaborador/Page_/a_Si'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Retiro_colaborador/Page_/a_Continuar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Object Repository/Retiro_colaborador/Page_/a_Continuar'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Retiro_colaborador/Page_/a_Cancelar proceso'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Object Repository/Retiro_colaborador/Page_/a_Cancelar proceso'))

WebUI.waitForElementClickable(findTestObject('Retiro_colaborador/Ver_Retirados/Page_/a_Aceptar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Retiro_colaborador/Ver_Retirados/Page_/a_Aceptar'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Retiro_colaborador/Page_/span_INFO'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Object Repository/Retiro_colaborador/Page_/span_INFO'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Retiro_colaborador/Page_/a_Regresar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Object Repository/Retiro_colaborador/Page_/a_Regresar'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Retiro_colaborador/Page_/span_Activos'), GlobalVariable.G_timeout)

WebUI.closeBrowser()