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

WebUI.comment('FALTA Comprobacion')

WebUI.callTestCase(findTestCase('1_Logueo/Logueo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

WebUI.click(findTestObject('1.1_General_Objects/a_Nmina'))

if (WebUI.waitForElementVisible(findTestObject('3_Nómina/10_Provisiones/a_Provisiones'), 1)) {
    WebUI.click(findTestObject('3_Nómina/10_Provisiones/a_Provisiones'))
} else {
    WebUI.click(findTestObject('3_Nómina/10_Provisiones/a_Aprobar Nmina'))

    WebUI.click(findTestObject('3_Nómina/10_Provisiones/a_Aceptar'))

    WebUI.click(findTestObject('3_Nómina/10_Provisiones/a_Provisiones'))
}

if (WebUI.waitForElementVisible(findTestObject('3_Nómina/10_Provisiones/a_lupa'), 1)) {
    WebUI.click(findTestObject('3_Nómina/10_Provisiones/a_Regresar'))
}

WebUI.waitForElementVisible(findTestObject('3_Nómina/10_Provisiones/td_CAUSACION DE CESANTIAS'), 0)

WebUI.click(findTestObject('3_Nómina/10_Provisiones/td_CAUSACION DE CESANTIAS'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('3_Nómina/10_Provisiones/div_CAUSACION DE CESANTIAS'), 0)

WebUI.click(findTestObject('3_Nómina/10_Provisiones/div_CAUSACION DE CESANTIAS'))

WebUI.click(findTestObject('3_Nómina/10_Provisiones/a_Histrico Provisiones'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/10_Provisiones/select_Seleccione20212020'), 1)

WebUI.selectOptionByIndex(findTestObject('3_Nómina/10_Provisiones/select_SeleccioneEneroFebreroMarzo'), 2)

WebUI.click(findTestObject('3_Nómina/10_Provisiones/a_Descripcin_imagenMiniBuscar'))

WebUI.click(findTestObject('3_Nómina/10_Provisiones/a_Reportes'))

WebUI.click(findTestObject('3_Nómina/10_Provisiones/td_Variacion Provision Actual Vs Mes Anterior'))

WebUI.click(findTestObject('3_Nómina/10_Provisiones/div_Generar_ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active ui-state-hover'))

WebUI.click(findTestObject('3_Nómina/10_Provisiones/span_Descargar'))

WebUI.click(findTestObject('3_Nómina/10_Provisiones/a_Generar'))

WebUI.acceptAlert()

WebUI.closeBrowser()

