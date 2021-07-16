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

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/3_Información_bancaria/Page_/a_Nmina'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/3_Información_bancaria/Page_/a_Nmina'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/3_Información_bancaria/Page_/a_PARRA GUZMAN ANGELA MARA'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/3_Información_bancaria/Page_/a_PARRA GUZMAN ANGELA MARA'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/3_Información_bancaria/Page_/a_Informacin Contratacin'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/3_Información_bancaria/Page_/a_Informacin Contratacin'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/3_Información_bancaria/Page_/label_Medio de Pago'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/3_Información_bancaria/Page_/label_Medio de Pago'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/3_Información_bancaria/Page_/a_Medio de Pago _us-icon-edit'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/3_Información_bancaria/Page_/a_Medio de Pago _us-icon-edit'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/3_Información_bancaria/Page_/select_-- Seleccione --Av VillasBanco'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/3_Información_bancaria/Page_/select_-- Seleccione --Av VillasBanco'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/1_Actualización_colaborador/3_Información_bancaria/Page_/select_-- Seleccione --Av VillasBanco'), 
    8)

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/3_Información_bancaria/Page_/input_Nmero de Cuenta _consultarInformacionBasica'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/3_Información_bancaria/Page_/input_Nmero de Cuenta _consultarInformacionBasica'))

/**WebUI.waitForElementClickable(findTestObject('Object Repository/Page_/Uptdate_colaborador/Page_/Informacion bancaria1.1'), 5,
	FailureHandling.CONTINUE_ON_FAILURE)**/
WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/3_Información_bancaria/Page_/input_Nmero de Cuenta _consultarInformacionBasica'), 
    '345678999')

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/3_Información_bancaria/Page_/select_-- Seleccione Tipo de Cuenta --Cuenta Ahorros'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/3_Información_bancaria/Page_/select_-- Seleccione Tipo de Cuenta --Cuenta Ahorros'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/1_Actualización_colaborador/3_Información_bancaria/Page_/select_-- Seleccione Tipo de Cuenta --Cuenta Ahorros'), 
    2)

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/3_Información_bancaria/Page_/input_Fecha Cambio _consultarInformacionBasica_'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/3_Información_bancaria/Page_/input_Fecha Cambio _consultarInformacionBasica_'))

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/3_Información_bancaria/Page_/input_Fecha Cambio _consultarInformacionBasica_'), 
    '27/11/2020')

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/3_Información_bancaria/Page_/a_Medio de Pago _us-icon-yes'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/3_Información_bancaria/Page_/a_Medio de Pago _us-icon-yes'))

WebUI.closeBrowser()

