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

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Colaboradores'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Colaboradores'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/span_Activos'), 
    0)

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/span_Activos'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_ACTIVO_us-icon-remover'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_ACTIVO_us-icon-remover'))

WebUI.setText(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/input_Fecha ultimo da Laborado'), 
    '28/05/2021')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/select_-- Seleccione --FALLECIMIENTOJUSTA'), 
    GlobalVariable.G_timeout, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/select_-- Seleccione --FALLECIMIENTOJUSTA'))

WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/select_-- Seleccione --FALLECIMIENTOJUSTA'), 
    '4', FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aplicar Retiro'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aplicar Retiro'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'))

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'))

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Continuar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Continuar'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Cancelar proceso'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Cancelar proceso'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Regresar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Regresar'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/span_Activos'), 
    GlobalVariable.G_timeout)

WebUI.closeBrowser()

