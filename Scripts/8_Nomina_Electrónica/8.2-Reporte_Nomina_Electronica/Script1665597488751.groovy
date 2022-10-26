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

WebUI.comment('no hay reporte existente')

WebUI.callTestCase(findTestCase('1.0_Logueo/Logueo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('8_Nomina_Electrónica/8.2-Reporte_Nomina_Electronica/a_Administrador_masivo_cerrar_menu'))

WebUI.click(findTestObject('8_Nomina_Electrónica/8.2-Reporte_Nomina_Electronica/a_Nmina Electrnica'))

WebUI.setText(findTestObject('8_Nomina_Electrónica/8.2-Reporte_Nomina_Electronica/input_Fecha Corte_listado_nominaelectronicaj_idt95'), 
    '2021')

WebUI.sendKeys(findTestObject('8_Nomina_Electrónica/8.2-Reporte_Nomina_Electronica/input_Fecha Corte_listado_nominaelectronicaj_idt95'), 
    Keys.chord(Keys.ENTER))

if (WebUI.waitForElementVisible(findTestObject('8_Nomina_Electrónica/8.2-Reporte_Nomina_Electronica/td_2021-08'), 1)) {
    WebUI.click(findTestObject('8_Nomina_Electrónica/8.2-Reporte_Nomina_Electronica/td_2021-08'))

    WebUI.click(findTestObject('8_Nomina_Electrónica/8.2-Reporte_Nomina_Electronica/a_Reporte'))

    WebUI.click(findTestObject('8_Nomina_Electrónica/8.2-Reporte_Nomina_Electronica/td_Reporte Nomina'))

    WebUI.click(findTestObject('8_Nomina_Electrónica/8.2-Reporte_Nomina_Electronica/div_Que desea hacer_ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active ui-state-hover'))

    WebUI.click(findTestObject('8_Nomina_Electrónica/8.2-Reporte_Nomina_Electronica/a_Generar'))

    WebUI.click(findTestObject('8_Nomina_Electrónica/8.2-Reporte_Nomina_Electronica/a_Continuar'))

    WebUI.click(findTestObject('8_Nomina_Electrónica/8.2-Reporte_Nomina_Electronica/a_Descargar3'))
} else {
    WebUI.callTestCase(findTestCase('8_Nomina_Electrónica/8.1-Crear_Nomina_Electrónica'), [:], FailureHandling.STOP_ON_FAILURE)

    if (WebUI.waitForElementVisible(findTestObject('8_Nomina_Electrónica/8.2-Reporte_Nomina_Electronica/td_2021-08'), 1)) {
        WebUI.click(findTestObject('8_Nomina_Electrónica/8.2-Reporte_Nomina_Electronica/td_2021-08'))

        WebUI.click(findTestObject('8_Nomina_Electrónica/8.2-Reporte_Nomina_Electronica/a_Reporte'))
    }
}

