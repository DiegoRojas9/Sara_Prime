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

WebUI.callTestCase(findTestCase('1.0_Logueo/Logueo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/a_Nmina'))

if (WebUI.waitForElementClickable(findTestObject('3_Nómina/2_Archivo_pagos/Page_/a_Archivo Para Pagos'), 1)) {
    WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/a_Archivo Para Pagos'))
} else {
    WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/a_Archivo Para Pagos'))

    WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/a_Aceptar'))

    WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/a_Archivo Para Pagos'))
}

WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/a_Ajuste_formulario_archivoPagos'))

WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/span_AGUDELO ROJAS ANDREA_pencil'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/2_Archivo_pagos/Page_/select_-- Seleccione --Av VillasBanco De Occidente'), 
    17)

WebUI.selectOptionByIndex(findTestObject('3_Nómina/2_Archivo_pagos/Page_/select_Cuenta Ahorros Cuenta Corriente'), '1')

WebUI.setText(findTestObject('3_Nómina/2_Archivo_pagos/Page_/input_AGUDELO ROJAS ANDREA_formulario'), '100900800')

WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/span_AGUDELO ROJAS ANDREA_check'))

WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/a_Aceptar'))

WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/span_AGUDELO ROJAS ANGELA MARA_pencil'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/2_Archivo_pagos/Page_/select_-- Seleccione --Av VillasBanco  De  Occidente'), 
    11)

WebUI.selectOptionByIndex(findTestObject('3_Nómina/2_Archivo_pagos/Page_/select_Cuenta AhorrosCuenta Corriente'), '1')

WebUI.setText(findTestObject('3_Nómina/2_Archivo_pagos/Page_/input_AGUDELO ROJAS ANGELA MARA_numeroCuenta'), '200300400')

WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/span_AGUDELO ROJAS ANGELA MARA_check'))

String Result = WebUI.getText(findTestObject('3_Nómina/2_Archivo_pagos/Page_/label_Has modificado la cuenta del colaborador'))

WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/a_Aceptar'))

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('3_Nómina/2_Archivo_pagos/Page_/a_Filtro_us-icon-regresar us-accion-icono'),
	30)
/*--------------------------------------------------*/
WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))


if (Result == 'Has modificado la cuenta del colaborador, ten en cuenta que este cambio es permanente, por lo cual los próximos archivos de banco serán generados para este colaborador con esta cuenta.') {
    String Resultado = 'PRUEBA OK'

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

