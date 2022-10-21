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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('1_Logueo/Logueo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('8_Nomina_Electrónica/8.2-Reporte_Nomina_Electronica/a_Administrador_masivo_cerrar_menu'))

WebUI.click(findTestObject('8_Nomina_Electrónica/8.2-Reporte_Nomina_Electronica/a_Nmina Electrnica'))

WebUI.setText(findTestObject('8_Nomina_Electrónica/8.2-Reporte_Nomina_Electronica/input_Fecha Corte_listado_nominaelectronicaj_idt95'), 
    '2021')

WebUI.sendKeys(findTestObject('8_Nomina_Electrónica/8.2-Reporte_Nomina_Electronica/input_Fecha Corte_listado_nominaelectronicaj_idt95'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('8_Nomina_Electrónica/8.2-Reporte_Nomina_Electronica/td_2021-08'))

WebUI.click(findTestObject('8_Nomina_Electrónica/8.3-Descargar_Nomina_Electronica/div_Intentos_nomina_electronicatabla_detalle0j_idt158'))

WebUI.click(findTestObject('8_Nomina_Electrónica/8.3-Descargar_Nomina_Electronica/a_Descargar - Copy'))

WebUI.waitForElementVisible(findTestObject('8_Nomina_Electrónica/8.3-Descargar_Nomina_Electronica/span_Si'), 0)

WebUI.click(findTestObject('8_Nomina_Electrónica/8.3-Descargar_Nomina_Electronica/span_Si'))

WebUI.waitForElementVisible(findTestObject('8_Nomina_Electrónica/8.3-Descargar_Nomina_Electronica/a_Descargar'), 0)

WebUI.click(findTestObject('8_Nomina_Electrónica/8.3-Descargar_Nomina_Electronica/a_Descargar'))

WebUI.switchToWindowIndex('1', FailureHandling.STOP_ON_FAILURE)

if (WebUI.waitForElementVisible(findTestObject('8_Nomina_Electrónica/8.3-Descargar_Nomina_Electronica/span_This XML file does not appear to have any style information associated with it. The document tree is shown below'), 
    2)) {
    String Result = 'Prueba ok'

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

