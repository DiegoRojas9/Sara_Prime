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

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Nmina'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Nmina'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_PARRA GUZMAN ANGELA MARA'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_PARRA GUZMAN ANGELA MARA'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Informacin Contratacin'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Informacin Contratacin'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Cargo _consultarInformacionBasica_formj_idt452'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Cargo _consultarInformacionBasica_formj_idt452'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione Cargo --ANALISTA'), 
    2)

WebUI.selectOptionByIndex(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione Unidad --DESARROLLO'), 
    2)

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Sueldo_popupEditarTipoPeriodosueldo'), 
    '5700000')

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Fecha Cambio_popupEditarTipoPeriodonacimiento_input'), 
    GlobalVariable.G_timeout)

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Fecha Cambio_popupEditarTipoPeriodonacimiento_input'), 
    '10/05/2021')

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/label_Cargo'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Actualizar'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Actualizar'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Centro de Costo _consultarInformacionBasica_formj_idt515'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Centro de Costo _consultarInformacionBasica_formj_idt515'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione Centro Costo --Gerencia'), 
    1)

WebUI.selectOptionByIndex(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione Linea Costo --DesarrollardorGestin'), 
    2)

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Fecha Cambio_popupEditarTipoPeriodonacimiento_2'), 
    '10/05/2021')

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/label_Centro de Costo'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Actualizar_2'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Actualizar_2'))

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Eps _us-icon-edit'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione --Eps - Aliansalud EpsEps'), 
    10)

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Fecha Cambio _consultarInformacionBasica_3'), 
    '10/05/2021')

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Eps _us-icon-yes'))

WebUI.delay(3)

//F PENSIONES
WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Fondo de Pensiones _us-icon-edit'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Fondo de Pensiones _us-icon-edit'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione --Afp - Caja De Auxilios'), 
    8)

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Fecha Cambio _consultarInformacionBasica_4'), 
    '10/05/2021')

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Fondo de Pensiones _us-icon-yes'))

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Fondo de Cesantas _us-icon-edit'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione --Fc - ColfondosFc - Fondo'), 
    5)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Fecha Cambio _consultarInformacionBasica_5'))

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Fecha Cambio _consultarInformacionBasica_5'), 
    '10/05/2021')

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Fondo de Cesantas _us-icon-yes'))

WebUI.closeBrowser()

