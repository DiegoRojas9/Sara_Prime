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

WebUI.waitForElementClickable(findTestObject('3_Nómina/2_Archivo_pagos/Page_/a_Nmina'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/a_Nmina'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/2_Archivo_pagos/Page_/a_Archivo Para Pagos'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/a_Archivo Para Pagos'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/2_Archivo_pagos/Page_/a_PAGO EN CHEQUE - BOGOTA_us-icon-edit'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/a_PAGO EN CHEQUE - BOGOTA_us-icon-edit'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/2_Archivo_pagos/Page_/span_ARANGO CAMACHO CAMILA_ui-icon ui-icon-pencil'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/span_ARANGO CAMACHO CAMILA_ui-icon ui-icon-pencil'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/2_Archivo_pagos/Page_/select_-- Seleccione --Av VillasBanco De Occidente'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/select_-- Seleccione --Av VillasBanco De Occidente'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/2_Archivo_pagos/Page_/select_-- Seleccione --Av VillasBanco De Occidente'), 
    17)

WebUI.waitForElementClickable(findTestObject('3_Nómina/2_Archivo_pagos/Page_/select_Cuenta AhorrosCuenta Corriente'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/select_Cuenta AhorrosCuenta Corriente'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/2_Archivo_pagos/Page_/select_Cuenta AhorrosCuenta Corriente'), '1')

WebUI.waitForElementClickable(findTestObject('3_Nómina/2_Archivo_pagos/Page_/input_ARANGO CAMACHO CAMILA_numeroCuenta'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/input_ARANGO CAMACHO CAMILA_numeroCuenta'))

WebUI.setText(findTestObject('3_Nómina/2_Archivo_pagos/Page_/input_ARANGO CAMACHO CAMILA_numeroCuenta'), '100900800')

WebUI.waitForElementClickable(findTestObject('3_Nómina/2_Archivo_pagos/Page_/span_ARANGO CAMACHO CAMILA_ui-icon ui-icon-check ui-c'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/span_ARANGO CAMACHO CAMILA_ui-icon ui-icon-check ui-c'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/2_Archivo_pagos/Page_/a_Aceptar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/a_Aceptar'))

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('3_Nómina/2_Archivo_pagos/Page_/span_ARANGO OBREGON MARIAM_ui-icon ui-icon-pencil'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/span_ARANGO OBREGON MARIAM_ui-icon ui-icon-pencil'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/2_Archivo_pagos/Page_/select_-- Seleccione --Av VillasBanco  De  Occidente'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/select_-- Seleccione --Av VillasBanco  De  Occidente'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/2_Archivo_pagos/Page_/select_-- Seleccione --Av VillasBanco  De  Occidente'), 
    11)

WebUI.waitForElementClickable(findTestObject('3_Nómina/2_Archivo_pagos/Page_/select_Cuenta AhorrosCuenta Corriente_2'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/select_Cuenta AhorrosCuenta Corriente_2'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/2_Archivo_pagos/Page_/select_Cuenta AhorrosCuenta Corriente_2'), '1')

WebUI.waitForElementClickable(findTestObject('3_Nómina/2_Archivo_pagos/Page_/input_ARANGO OBREGON MARIAM_formulario_numeroCuenta'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/input_ARANGO OBREGON MARIAM_formulario_numeroCuenta'))

WebUI.setText(findTestObject('3_Nómina/2_Archivo_pagos/Page_/input_ARANGO OBREGON MARIAM_formulario_numeroCuenta'), '200300400')

WebUI.waitForElementClickable(findTestObject('3_Nómina/2_Archivo_pagos/Page_/span_ARANGO OBREGON MARIAM_ui-icon ui-icon-check ui-c'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/span_ARANGO OBREGON MARIAM_ui-icon ui-icon-check ui-c'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/2_Archivo_pagos/Page_/a_Aceptar_1'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/a_Aceptar_1'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/2_Archivo_pagos/Page_/a_Filtro_us-icon-regresar us-accion-icono'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/2_Archivo_pagos/Page_/a_Filtro_us-icon-regresar us-accion-icono'))

WebUI.closeBrowser()

