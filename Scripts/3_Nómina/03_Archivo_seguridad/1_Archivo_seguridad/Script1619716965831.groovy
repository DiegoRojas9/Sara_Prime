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

WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Nmina'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Nmina'))

if (WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Aprobar Nmina'), GlobalVariable.G_TimeShort, 
    FailureHandling.STOP_ON_FAILURE)) {
    WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Aprobar Nmina'))

    WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Aceptar_'), GlobalVariable.G_TimeShort)

    WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Aceptar_'))
} else {
    WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Archivo Para Pagos'))
}

if (WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Abonar Periodo'), GlobalVariable.G_TimeShort, 
    FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Abonar Periodo'))

    WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Aceptar_1'), GlobalVariable.G_TimeShort)

    WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Aceptar_1'))
}

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Seguridad Social'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Descargar Archivo'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Descargar Archivo'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Si'), GlobalVariable.G_timeout)

WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/span_Union Soluciones 2019_ui-icon ui-icon-closethick'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/span_Union Soluciones 2019_ui-icon ui-icon-closethick'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Ajustes'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Ajustes'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/span_ARANGO CAMACHO CAMILA_ui-icon ui-icon-pencil'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/span_ARANGO CAMACHO CAMILA_ui-icon ui-icon-pencil'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/select_-- Seleccione --Eps - Aliansalud EpsEps - Asociacin'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/select_-- Seleccione --Eps - Aliansalud EpsEps - Asociacin'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/select_-- Seleccione --Eps - Aliansalud EpsEps - Asociacin'), 
    '3')

WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/select_-- Seleccione --Afp - Caja De Auxilios Y De Prestaciones'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/select_-- Seleccione --Afp - Caja De Auxilios Y De Prestaciones'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/select_-- Seleccione --Afp - Caja De Auxilios Y De Prestaciones'), 
    '5')

WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/select_-- Seleccione --Clase I Riesgo Minimo (0522 )Clase II'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/select_-- Seleccione --Clase I Riesgo Minimo (0522 )Clase II'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/select_-- Seleccione --Clase I Riesgo Minimo (0522 )Clase II'), 
    '2')

WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/input_ARANGO CAMACHO CAMILA_formulario_fecha'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/input_ARANGO CAMACHO CAMILA_formulario_fecha'))

WebUI.setText(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/input_ARANGO CAMACHO CAMILA_formulario_fecha'), '10/02/2021')

WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/span_ARANGO CAMACHO CAMILA_ui-icon ui-icon-check ui-c'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/span_ARANGO CAMACHO CAMILA_ui-icon ui-icon-check ui-c'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Archivo Para Pagos'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Archivo Para Pagos'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Reversar Abono'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Reversar Abono'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Aceptar_2'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Aceptar_2'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Nmina'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Nmina'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Reversar Confirmacin'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Reversar Confirmacin'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Aceptar_3'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/3_Archivo_seguridad/Page_/a_Aceptar_3'))

WebUI.closeBrowser()

