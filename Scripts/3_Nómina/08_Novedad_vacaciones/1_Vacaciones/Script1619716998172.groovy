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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

String dato = ''

WebUI.callTestCase(findTestCase('1.0_Logueo/Logueo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

WebUI.waitForElementClickable(findTestObject('1.1_General_Objects/a_Nmina'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('1.1_General_Objects/a_Nmina'))

if (WebUI.waitForElementVisible(findTestObject('3_Nómina/8_Novedad_vacaciones/td_ENFERMEDAD GENERAL'), 1) || WebUI.waitForElementVisible(
    findTestObject('3_Nómina/8_Novedad_vacaciones/td_COMISIONES'), 1)) {
    if (WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/link_ver_mas/a_ ver ms'), 1)) {
        WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/link_ver_mas/a_ ver ms'))
    }
    
    WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/a_LICENCIA DE LUTO_popupDetalle_eliminar'), 
        GlobalVariable.G_timeout)

    if (WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/a_LICENCIA DE LUTO_popupDetalle_eliminar'), 
        GlobalVariable.G_timeout, FailureHandling.OPTIONAL)) {
        WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/a_LICENCIA DE LUTO_popupDetalle_eliminar'))

        WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/a_Aceptar'), GlobalVariable.G_timeout)

        WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/a_Aceptar'))
    }
    
    WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/a_Cerrar'), GlobalVariable.G_timeout)

    WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/a_Cerrar'))
}

WebUI.waitForElementVisible(findTestObject('3_Nómina/8_Novedad_vacaciones/icon_vacaciones/a_Fecha 10022021_formulario_nominaj'), 
    1)

WebUI.scrollToElement(findTestObject('3_Nómina/8_Novedad_vacaciones/icon_vacaciones/a_Fecha 10022021_formulario_nominaj'), 
    0)

if (WebUI.waitForElementVisible(findTestObject('3_Nómina/8_Novedad_vacaciones/td_LICENCIA DE LUTO'), 1)) {
    dato = WebUI.getText(findTestObject('3_Nómina/8_Novedad_vacaciones/td_LICENCIA DE LUTO'), FailureHandling.CONTINUE_ON_FAILURE)
}

if (dato == 'LICENCIA DE LUTO') {
    WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/link_ver_mas/a_ ver ms'))

    WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/a_LICENCIA DE LUTO_popupDetalleNovedadestablaNovedades0j_idt1554'))

    WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/a_Aceptar'))
}

if (WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/icon_vacaciones/a_Fecha 10022021_formulario_nominaj - 0'), 
    1)) {
    WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/icon_vacaciones/a_Fecha 10022021_formulario_nominaj'))
} else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/icon_vacaciones/a_Fecha 10022021_formulario_nominaj - 1'), 
    1)) {
    WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/icon_vacaciones/a_Fecha 10022021_formulario_nominaj - 1'))
} else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/icon_vacaciones/a_Fecha 10022021_formulario_nominaj - 2'), 
    1)) {
    WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/icon_vacaciones/a_Fecha 10022021_formulario_nominaj - 2'))
} else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/icon_vacaciones/a_Fecha 10022021_formulario_nominaj - 3'), 
    1)) {
    WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/icon_vacaciones/a_Fecha 10022021_formulario_nominaj - 3'))
} else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/icon_vacaciones/a_Fecha 10022021_formulario_nominaj - 4'), 
    1)) {
    WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/icon_vacaciones/a_Fecha 10022021_formulario_nominaj - 4'))
} else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/icon_vacaciones/a_Fecha 10022021_formulario_nominaj - 5'), 
    1)) {
    WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/icon_vacaciones/a_Fecha 10022021_formulario_nominaj - 5'))
} else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/icon_vacaciones/a_Fecha 10022021_formulario_nominaj - 6'), 
    1)) {
    WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/icon_vacaciones/a_Fecha 10022021_formulario_nominaj - 6'))
} else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/icon_vacaciones/a_Fecha 10022021_formulario_nominaj - 7'), 
    1)) {
    WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/icon_vacaciones/a_Fecha 10022021_formulario_nominaj - 7'))
} else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/icon_vacaciones/a_Fecha 10022021_formulario_nominaj - 8'), 
    1)) {
    WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/icon_vacaciones/a_Fecha 10022021_formulario_nominaj - 8'))
} else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/icon_vacaciones/a_Fecha 10022021_formulario_nominaj - 9'), 
    1)) {
    WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/icon_vacaciones/a_Fecha 10022021_formulario_nominaj - 9'))
} else {
    WebUI.acceptAlert()
}

WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/input_LICENCIA DE LUTO_fechainicial_input'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/input_LICENCIA DE LUTO_fechainicial_input'))

WebUI.setText(findTestObject('3_Nómina/8_Novedad_vacaciones/input_LICENCIA DE LUTO_fechainicial_input'), '10/05/2021')

WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/input_LICENCIA DE LUTO_Novedad_dias'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/input_LICENCIA DE LUTO_Novedad_dias'))

WebUI.setText(findTestObject('3_Nómina/8_Novedad_vacaciones/input_LICENCIA DE LUTO_Novedad_dias'), '1')

WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/a_Aplicar'), 0)

/*------------------------Estructura----------------------*/
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('3_Nómina/8_Novedad_vacaciones/a_Aplicar'), 30)

/*--------------------------------------------------*/
WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

WebUI.waitForElementVisible(findTestObject('Result/p_Resultado'), 0)

String Result = WebUI.getText(findTestObject('Result/p_Resultado'))

if (Result == 'Registro guardado') {
    String Resultado1 = 'PRUEBA OK'

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

