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

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Nmina'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Nmina'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_BOLIVAR RESTREPO ANGELA MARA_'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_BOLIVAR RESTREPO ANGELA MARA_'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Informacin Contratacin'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Informacin Contratacin'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Cargo _consultarInformacionBasica_formj_idt452'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Cargo _consultarInformacionBasica_formj_idt452'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione Cargo --ANALISTA'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione Cargo --ANALISTA'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione Cargo --ANALISTA'), 
    2)

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione Unidad --DESARROLLO'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione Unidad --DESARROLLO'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione Unidad --DESARROLLO'), 
    2)

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Sueldo_popupEditarTipoPeriodosueldo'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Sueldo_popupEditarTipoPeriodosueldo'))

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Sueldo_popupEditarTipoPeriodosueldo'), 
    '5700000')

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Fecha Cambio_popupEditarTipoPeriodonacimiento_input'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Fecha Cambio_popupEditarTipoPeriodonacimiento_input'))

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Fecha Cambio_popupEditarTipoPeriodonacimiento_input'), 
    '10/02/2021')

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/label_Cargo'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/label_Cargo'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Actualizar'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Actualizar'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Centro de Costo _consultarInformacionBasica_formj_idt515'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Centro de Costo _consultarInformacionBasica_formj_idt515'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione Centro Costo --Gerencia'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione Centro Costo --Gerencia'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione Centro Costo --Gerencia'), 
    1)

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione Linea Costo --DesarrollardorGestin'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione Linea Costo --DesarrollardorGestin'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione Linea Costo --DesarrollardorGestin'), 
    2)

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Fecha Cambio_popupEditarTipoPeriodonacimiento_2'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Fecha Cambio_popupEditarTipoPeriodonacimiento_2'))

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Fecha Cambio_popupEditarTipoPeriodonacimiento_2'), 
    '10/02/2021')

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/label_Centro de Costo'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/label_Centro de Costo'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Actualizar_2'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Actualizar_2'))

//EPS
WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Eps _us-icon-edit'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Eps _us-icon-edit'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione --Eps - Aliansalud EpsEps'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione --Eps - Aliansalud EpsEps'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione --Eps - Aliansalud EpsEps'), 
    10)

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Fecha Cambio _consultarInformacionBasica_3'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Fecha Cambio _consultarInformacionBasica_3'))

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Fecha Cambio _consultarInformacionBasica_3'), 
    '10/02/2021')

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Eps _us-icon-yes'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Eps _us-icon-yes'))

WebUI.delay(3)

//F PENSIONES
WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Fondo de Pensiones _us-icon-edit'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Fondo de Pensiones _us-icon-edit'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione --Afp - Caja De Auxilios'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione --Afp - Caja De Auxilios'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione --Afp - Caja De Auxilios'), 
    8)

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Fecha Cambio _consultarInformacionBasica_4'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Fecha Cambio _consultarInformacionBasica_4'))

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Fecha Cambio _consultarInformacionBasica_4'), 
    '10/02/2021')

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Fondo de Pensiones _us-icon-yes'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Fondo de Pensiones _us-icon-yes'))

//F CESANTIAS
WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Fondo de Cesantas _us-icon-edit'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Fondo de Cesantas _us-icon-edit'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione --Fc - ColfondosFc - Fondo'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione --Fc - ColfondosFc - Fondo'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/select_-- Seleccione --Fc - ColfondosFc - Fondo'), 
    5)

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Fecha Cambio _consultarInformacionBasica_5'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Fecha Cambio _consultarInformacionBasica_5'))

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/input_Fecha Cambio _consultarInformacionBasica_5'), 
    '10/02/2021')

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Fondo de Cesantas _us-icon-yes'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/2_Información_contrato/Page_/a_Fondo de Cesantas _us-icon-yes'))

WebUI.closeBrowser()

