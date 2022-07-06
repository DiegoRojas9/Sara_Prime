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

WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Nmina'))

if (WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Aprobar Nmina'), GlobalVariable.G_TimeShort, 
    FailureHandling.STOP_ON_FAILURE)) {
    WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Aprobar Nmina'))

    WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Aceptar_'), 0)

    WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Aceptar_'))
} else {
    WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Archivo Para Pagos'))
}

if (WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Abonar Periodo'), 1)) {
    WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Abonar Periodo'))

    WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Aceptar_1'), 0)

    WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Aceptar_1'))
}

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Seguridad Social'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Descargar Archivo'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Descargar Archivo'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Descargar'), GlobalVariable.G_timeout)

WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/span_Union Soluciones 2019_ui-icon ui-icon-closethick'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/span_Union Soluciones 2019_ui-icon ui-icon-closethick'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Ajustes'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Ajustes'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/span_ARANGO CAMACHO CAMILA_ui-icon ui-icon-pencil'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/span_ARANGO CAMACHO CAMILA_ui-icon ui-icon-pencil'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/select_-- Seleccione --Eps - Aliansalud EpsEps - Asociacin'), 
    '3')

WebUI.selectOptionByIndex(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/select_-- Seleccione --Afp - Caja De Auxilios Y De Prestaciones'), 
    '5')

WebUI.selectOptionByIndex(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/select_-- Seleccione --Clase I Riesgo Minimo (0522 )Clase II'), 
    '2')

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/input_ARANGO CAMACHO CAMILA_formulario_fecha'))

WebUI.setText(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/input_ARANGO CAMACHO CAMILA_formulario_fecha'), '10/02/2021')

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/span_ARANGO CAMACHO CAMILA_ui-icon ui-icon-check ui-c'))

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Archivo Para Pagos'))

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Reversar Abono'))

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Aceptar_2'))

WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Nmina'))

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Reversar Confirmacin'))

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Aceptar_3'))

String Result = WebUI.getText(findTestObject('Result/p_Resultado'))

if (Result == 'Registro Actualizado') {
    String Resultado = 'PRUEBA OK'

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

