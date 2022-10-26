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

/*---------------------------------------------*/
Date today = new Date()

String todaysDate = today.format('dd/MM/yyyy')

String projectName = 'Regression Project ' + todaysDate

WebUI.callTestCase(findTestCase('1.0_Logueo/Logueo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

/*--------------------------------------------------------------------*/
String DiayMes = today.format('dd/MM')

Number Año = ((today.format('yyyy')) as Integer)

Number AñoS = Año + 1

String Fecha = (DiayMes + '/') + AñoS

/*--------------------------------------------------------------------*/
WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/Page_/a_Nmina'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/Page_/a_Nmina'))

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/input_Filtro_formulario_nominaj_idt495'), 
    '9525222')

WebUI.sendKeys(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/input_Filtro_formulario_nominaj_idt495'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/a_AGUDELO ARANGO ANDREA_formulario_nominaj_idt5030verCambioEmpleado'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/a_AGUDELO ARANGO ANDREA_formulario_nominaj_idt5030verCambioEmpleado'))

while (WebUI.waitForElementVisible(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/label_10052021_2'), 
    1)) {
    WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/a_Fecha fin vigencia_consultarInformacionBasica_formtablaEntidadesAPV1j_idt669_2'))

    WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/span_Si'))
}

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/Page_/a_Informacin Tributaria'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/Page_/a_Informacin Tributaria'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/Page_/a_Mtodo de retencin_consultarInformacion'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/Page_/a_Mtodo de retencin_consultarInformacion'))

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/Page_/label_2'))

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/Page_/input_Porcentaje Retencin _popupEditarInformacionTributaria'), 
    '50')

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/Page_/label_Si'))

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/Page_/input_Deducible por Medicina Prepagada  Seguro de Salud'), 
    '67000')

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/Page_/input_Intereses Crdito Vivienda  _popupEditarInformacion'), 
    '100000')

//Fecha con variable
WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/Page_/input_Fecha Cambio_popupEditarInformacionTributaria'), 
    todaysDate)

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/Page_/a_Actualizar'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/Page_/a_Actualizar'))

if (WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/a_Cuenta_consultarInformacionBasica_Delete'), 
    GlobalVariable.G_timeout)) {
    WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/a_Cuenta_consultarInformacionBasica_Delete'))

    WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/span_Si_1'), 
        GlobalVariable.G_timeout)

    WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/span_Si_1'))

    WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/a_Vigencia_consultarInformacionBasica_Delete'), 
        GlobalVariable.G_timeout)

    WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/a_Vigencia_consultarInformacionBasica_Delete'))

    WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/span_Si_2'), 
        GlobalVariable.G_timeout)

    WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/span_Si_2'))
}

WebUI.selectOptionByIndex(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/select_-- Seleccione --Afc - Av VillasAfc - Banco'), 
    '6')

//Fecha con variable
WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/input_Fecha Afiliacin_consultarInformacionBasica'), 
    todaysDate)

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/input_Fecha fin vigencia_consultarInformacionBasica_AFCvalor'), 
    '67000')

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/input_Fecha fin vigencia_consultarInformacionBasica_AFC'), 
    todaysDate)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/a_Fecha fin vigencia_btn-miniadicionar'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/select_-- Seleccione --Afc - Av VillasAfc - Banco'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/select_-- Seleccione --Afc - Av VillasAfc - Banco'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/select_-- Seleccione --Afc - Av VillasAfc - Banco'), 
    '4')

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/span_Valor_ui-chkbox-icon ui-icon ui-c ui-icon-check'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/span_Valor_ui-chkbox-icon ui-icon ui-c ui-icon-check'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/input_Fecha Afiliacin_consultarInformacionBasica'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/input_Fecha Afiliacin_consultarInformacionBasica'))

//Fecha con variable
WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/input_Fecha Afiliacin_consultarInformacionBasica'), 
    todaysDate)

WebUI.sendKeys(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/input_Fecha Afiliacin_consultarInformacionBasica'), 
    Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/input_Cuenta_consultarInformacionBasica_EntidadesAFCcuenta'))

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/input_Cuenta_consultarInformacionBasica_formtablaEntidadesAFC'), 
    '1112223334')

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/input_Fecha fin vigencia_consultarInformacionBasica_AFCvalor'), 
    '67000')

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/1_AFC/Page_/a_Fecha fin vigencia_btn-miniadicionar'))

if (WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/2_APV/Page_/a_Cuenta_consultarInformacionBasicaAPV'), 
    GlobalVariable.G_timeout)) {
    WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/2_APV/Page_/a_Cuenta_consultarInformacionBasicaAPV'))

    WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/2_APV/Page_/span_Si_3'), 
        GlobalVariable.G_timeout)

    WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/2_APV/Page_/span_Si_3'))
}

if (WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/2_APV/Page_/a_Vigencia_consultarInformacionBasicaAPV'), 
    GlobalVariable.G_timeout)) {
    WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/2_APV/Page_/a_Vigencia_consultarInformacionBasicaAPV'))

    WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/2_APV/Page_/span_Si_4'), 
        GlobalVariable.G_timeout)

    WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/2_APV/Page_/span_Si_4'))
}

WebUI.selectOptionByIndex(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/2_APV/Page_/select_-- Seleccione --Apv - Caja De Auxilios Y De Prestaciones'), 
    '2')

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/2_APV/Page_/div_Valor_ui-chkbox-box ui-widget ui-corner-all'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/2_APV/Page_/input_Fecha Afiliacin_consultarInformacionBasica_APV_input'))

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/2_APV/Page_/div_Valor_ui-chkbox-box ui-widget ui-corner-all'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/2_APV/Page_/input_Fecha Afiliacin_consultarInformacionBasica_APV_input'), 
    GlobalVariable.G_timeout)

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/2_APV/Page_/input_Fecha Afiliacin_consultarInformacionBasica_APV_input'), 
    todaysDate)

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/2_APV/Page_/input_Cuenta_consultarInformacionBasica_cuentaAPV'), 
    GlobalVariable.G_timeout)

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/2_APV/Page_/input_Cuenta_consultarInformacionBasica_cuentaAPV'), 
    '1112223334')

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/2_APV/Page_/input_Fecha fin vigencia_consultarInformacionBasica_ValorAPV'), 
    '67000')

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/2_APV/Page_/a_Fecha fin vigencia_consultarInformacion'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/2_APV/Page_/select_-- Seleccione --Apv - Caja De Auxilios Y De Prestaciones'), 
    '3')

//Fecha con variable
WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/2_APV/Page_/input_Fecha Afiliacin_consultarInformacionBasica_APV_input'), 
    todaysDate)

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/2_APV/Page_/input_Fecha fin vigencia_consultarInformacionBasica_ValorAPV'), 
    '67000')

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/2_APV/Page_/input_Fecha fin vigencia_consultarInformacionBasica_APV'), 
    Fecha)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/2_APV/Page_/a_Fecha fin vigencia_consultarInformacion'))

if (WebUI.waitForElementVisible(findTestObject('3_Nómina/1_Actualización_colaborador/4_Información_tributario/label_10052021_2'), 
    1)) {
    String Resultado = 'PRUEBA OK'

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

