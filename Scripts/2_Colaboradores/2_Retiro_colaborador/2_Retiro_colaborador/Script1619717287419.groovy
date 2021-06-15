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

double random_double = (Math.random() * 9999) + 999

random_double = Math.round(random_double * 1000)

String identificacion = random_double.toString().replace('.0', '')

WebUI.callTestCase(findTestCase('1_Logueo/Logueo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('2_Colaboradores/Page_/a_Colaboradores'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/a_Colaboradores'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/a_Agregar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/a_Agregar'))

WebUI.click(findTestObject('2_Colaboradores/Page_/input_Documento  _detalleEmpleadoPrime'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Documento  _detalleEmpleadoPrime'), identificacion)

WebUI.click(findTestObject('2_Colaboradores/Page_/input_Nombres  _detalleEmpleadoPrime'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/input_Nombres  _detalleEmpleadoPrime'), GlobalVariable.G_timeout)

WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Nombres  _detalleEmpleadoPrime'), 'Andrea')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/input_Primer Apellido  _detalleEmpleadoPrime'), GlobalVariable.G_timeout)

WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Primer Apellido  _detalleEmpleadoPrime'), 'Agudelo')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/input_Segundo Apellido _detalleEmpleadoPrime'), GlobalVariable.G_timeout)

WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Segundo Apellido _detalleEmpleadoPrime'), 'Rojas')

WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Fecha Nacimiento  _detalleEmpleadoPrime'), '16/10/1983')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/input_Pas Nacimiento  _detalleEmpleadoPrime'), GlobalVariable.G_timeout)

WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Pas Nacimiento  _detalleEmpleadoPrime'), 'COL')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/li_COLOMBIA'), GlobalVariable.G_timeout)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('2_Colaboradores/Page_/li_COLOMBIA'), 30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

WebUI.click(findTestObject('2_Colaboradores/Page_/label_Email'))

WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Email  _detalleEmpleadoPrime_formemail'), identificacion + 'Mariana.urrego@gmail.com')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/input_Ciudad de Residencia _formciudadResidencia_input'),
	GlobalVariable.G_timeout)

WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Ciudad de Residencia _formciudadResidencia_input'), 'Bogot')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/li_BOGOT - CUNDINAMARCA'), GlobalVariable.G_timeout)

WebElement element1 = WebUiCommonHelper.findWebElement(findTestObject('2_Colaboradores/Page_/li_BOGOT - CUNDINAMARCA'),
	30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element1))

WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Direccin  _detalleEmpleadoPrime_formdireccion'), 'Cll 179H # 85-56')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Estado Civil --CASADODIVORCIADONO'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Estado Civil --CASADODIVORCIADONO'))

WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Estado Civil --CASADODIVORCIADONO'), 
    '5')

WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Telfono Celular _detalleEmpleadoPrime'), '3890004455')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/label_FEMENINO'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/label_FEMENINO'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Grupo Sanguineo --AA-ABAB-BB-OO-'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Grupo Sanguineo --AA-ABAB-BB-OO-'))

WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Grupo Sanguineo --AA-ABAB-BB-OO-'), 
    '7')

WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Telfono Fijo _detalleEmpleadoPrime_formtelefono'), '2980000')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Nivel Academico --Bachiller'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Nivel Academico --Bachiller'))

WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Nivel Academico --Bachiller'), '4 ')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Tipo Documento --CEDULA'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Tipo Documento --CEDULA'))

WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Tipo Documento --CEDULA'), '2')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/a_Continuar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/a_Continuar'))

try {
    WebUI.selectOptionByIndex(findTestObject('Object Repository/2_Colaboradores/Page_/select_-- Seleccione Cargo --ANALISTA'), 
        2)

    WebUI.selectOptionByIndex(findTestObject('Object Repository/2_Colaboradores/Page_/select_-- Seleccione Cargo --ANALISTA'), 
        1)
}
catch (Exception e) {
    WebUI.click(findTestObject('Object Repository/2_Colaboradores/Page_/a_Cargo  _btn-miniadicionar'))

    WebUI.setText(findTestObject('Object Repository/2_Colaboradores/Page_/input_Descripcin_form_popupCrearCargodescripcionCargo'), 
        'Consultor QA')

    WebUI.click(findTestObject('Object Repository/2_Colaboradores/Page_/a_Guardar'))
} 

try {
    WebUI.selectOptionByIndex(findTestObject('Object Repository/2_Colaboradores/Page_/select_-- Seleccione Unidad --DESARROLLO'), 
        2)

    WebUI.selectOptionByIndex(findTestObject('Object Repository/2_Colaboradores/Page_/select_-- Seleccione Unidad --DESARROLLO'), 
        1)
}
catch (Exception e) {
    WebUI.click(findTestObject('Object Repository/2_Colaboradores/Page_/a_Unidad  _btn-miniadicionar'))

	WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/a_Asignar Jefe _detalleEmpleadoPrime_formj_idt378'),
		GlobalVariable.G_timeout)
	
	WebUI.click(findTestObject('2_Colaboradores/Page_/a_Asignar Jefe _detalleEmpleadoPrime_formj_idt378'))
	
	WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/td_PARRA GUZMAN ANGELA MARA'), GlobalVariable.G_timeout)
	
	WebUI.click(findTestObject('2_Colaboradores/Page_/td_PARRA GUZMAN ANGELA MARA'))
	
    WebUI.setText(findTestObject('Object Repository/2_Colaboradores/Page_/input_Descripcin_form_popupCrearUnidaddescripcionUnidad'), 
        'Desarrollo')

    WebUI.click(findTestObject('Object Repository/2_Colaboradores/Page_/a_Guardar_Unidad'))
} 

WebUI.setText(findTestObject('Object Repository/2_Colaboradores/Page_/input_Sueldo  _detalleEmpleadoPrime_formsueldo'), 
    '5400000')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Tipo Contrato --APRENDIZ'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Tipo Contrato --APRENDIZ'))

WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Tipo Contrato --APRENDIZ'), '5')

WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Fecha de Ingreso  _detalleEmpleadoPrime'), '01/03/2021')

try {
    WebUI.selectOptionByIndex(findTestObject('Object Repository/2_Colaboradores/Page_/select_-- Seleccione Centro Costo --Gerencia'), 
        1)

    WebUI.selectOptionByIndex(findTestObject('Object Repository/2_Colaboradores/Page_/select_-- Seleccione Centro Costo --Gerencia'), 
        1)
}
catch (Exception e) {
    WebUI.click(findTestObject('Object Repository/2_Colaboradores/Page_/a_Centro Costo  _btn-miniadicionar'))

    WebUI.setText(findTestObject('Object Repository/2_Colaboradores/Page_/input_Cdigo_form_popupCrearCentroCostocodigo'), 
        'CCS')

    WebUI.setText(findTestObject('Object Repository/2_Colaboradores/Page_/input_Descripcin_form_popupCrearCentroCostodescripcion'), 
        'Servicios')

    WebUI.click(findTestObject('Object Repository/2_Colaboradores/Page_/a_Guardar_Ccosto'))
} 

try {
    WebUI.selectOptionByIndex(findTestObject('Object Repository/2_Colaboradores/Page_/select_-- Seleccione Linea Costo --DesarrollardorGestin y calidadMarketingProduccinVentas'), 
        1)

    WebUI.selectOptionByIndex(findTestObject('Object Repository/2_Colaboradores/Page_/select_-- Seleccione Linea Costo --DesarrollardorGestin y calidadMarketingProduccinVentas'), 
        1)
}
catch (Exception e) {
    WebUI.click(findTestObject('Object Repository/2_Colaboradores/Page_/a_Lnea de Costo  _btn-miniadicionar'))

    WebUI.setText(findTestObject('Object Repository/2_Colaboradores/Page_/input_Cdigo_form_popupCrearLineaCostocodigo'), 
        'QA')

    WebUI.setText(findTestObject('Object Repository/2_Colaboradores/Page_/input_Descripcin_form_popupCrearLineaCostodescripcion'), 
        'Desarrollardor')

    WebUI.click(findTestObject('Object Repository/2_Colaboradores/Page_/a_Guardar_Lcosto'))

    WebUI.acceptAlert()
} 

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/select_-- Seleccione --EPS - ALIANSALUD EPSEPS'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/select_-- Seleccione --EPS - ALIANSALUD EPSEPS'))

WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione --EPS - ALIANSALUD EPSEPS'), '21')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/a_Agregar Beneficiarios UPC'), GlobalVariable.G_timeout)

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/select_-- Seleccione --AFP - Caja de Auxilios'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/select_-- Seleccione --AFP - Caja de Auxilios'))

WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione --AFP - Caja de Auxilios'), '2')

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Nivel Riesgo --Clase I Riesgo Minimo'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Nivel Riesgo --Clase I Riesgo Minimo'))

WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Nivel Riesgo --Clase I Riesgo Minimo'), 
    '1')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/select_-- Seleccione --FC - COLFONDOSFC - FONDO'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/select_-- Seleccione --FC - COLFONDOSFC - FONDO'))

WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione --FC - COLFONDOSFC - FONDO'), '1')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Medio de Pago --ChequeTransferencia'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Medio de Pago --ChequeTransferencia'))

WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Medio de Pago --ChequeTransferencia'), 
    '2', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/select_-- Seleccione --AV VILLASBanco  de  Occidente'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/select_-- Seleccione --AV VILLASBanco  de  Occidente'))

WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione --AV VILLASBanco  de  Occidente'), 
    '9')

WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Nmero de Cuenta  _detalleEmpleadoPrime_formreferencia'), '665432999')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Tipo de Cuenta --Cuenta Ahorros'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Tipo de Cuenta --Cuenta Ahorros'))

WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Tipo de Cuenta --Cuenta Ahorros'), 
    '1')

/*
WebUI.click(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/a_Agregar Beneficiarios UPC'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/a_Nuevo'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/a_Nuevo'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/select_CEDULA CIUDADANIACEDULA'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/select_CEDULA CIUDADANIACEDULA'))

WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/select_CEDULA CIUDADANIACEDULA'), '2', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Valor a Aportar _popupRegistroBeneficiariosUpc'), 
    '86000')

WebUI.click(findTestObject('null'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('null'), 
    GlobalVariable.G_timeout)

WebUI.setText(findTestObject('null'), 
    '1022987456')

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Fecha Aplicacin _popupRegistroBeneficiariosUpc'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Fecha Aplicacin _popupRegistroBeneficiariosUpc'))

WebUI.setText(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Fecha Aplicacin _popupRegistroBeneficiariosUpc'), 
    '10/01/2021')

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Nombre _popupRegistroBeneficiariosUpc_formnombre'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Nombre _popupRegistroBeneficiariosUpc_formnombre'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Nombre _popupRegistroBeneficiariosUpc_formnombre'), 
    'Hector Alirio')

WebUI.click(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Fecha Final _popupRegistroBeneficiariosUpc'))

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Fecha Final _popupRegistroBeneficiariosUpc'), 
    GlobalVariable.G_timeout)

WebUI.setText(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Fecha Final _popupRegistroBeneficiariosUpc'), 
    '27/01/2021')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Nombre _popupRegistroBeneficiariosUpc_formnombre'), 
    GlobalVariable.G_timeout)

WebUI.setText(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Apellidos _popupRegistroBeneficiariosUpc_formapellidos'), 
    'Urrego Camacho')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/a_Agregar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/a_Agregar'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/a_Union Soluciones 2019_ui-dialog-titlebar-icon ui-dialog'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/a_Union Soluciones 2019_ui-dialog-titlebar-icon ui-dialog'))
*/
WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/a_Continuar2'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/a_Continuar2'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/label_No'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/label_No'))

WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Deducible por Medicina Prepagada'), '54000')

WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Intereses Crdito Vivienda  _detalleEmpleadoPrime'), '450000')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/select_-- Seleccione --AFC - AV VILLASAFC-BANCO'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/select_-- Seleccione --AFC - AV VILLASAFC-BANCO'))

WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione --AFC - AV VILLASAFC-BANCO'), '8')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/span_Valor_ui-chkbox-icon ui-icon ui-c ui-icon-check'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/span_Valor_ui-chkbox-icon ui-icon ui-c ui-icon-check'))

WebUI.waitForElementPresent(findTestObject('2_Colaboradores/Page_/input_Cuenta_detalleEmpleadoPrime_formtablaEntidadesAFCcuentaAFC'), 
    GlobalVariable.G_TimeShort)

WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Cuenta_detalleEmpleadoPrime_formtablaEntidadesAFCcuentaAFC'), 
    '665432999')

WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Cuenta_detalleEmpleadoPrime_formtablaEntidadesAFCvalorAFC'), '68000')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/a_Cuenta_btn-miniadicionar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/a_Cuenta_btn-miniadicionar'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/select_-- Seleccione --APV - Caja de Auxilios'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/select_-- Seleccione --APV - Caja de Auxilios'))

WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione --APV - Caja de Auxilios'), '2')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/span_Valor_ui-chkbox-icon ui-icon ui-icon-blank ui-APV'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/span_Valor_ui-chkbox-icon ui-icon ui-icon-blank ui-APV'))

WebUI.waitForElementPresent(findTestObject('2_Colaboradores/Page_/input_Cuenta_detalleEmpleadoPrime_formtablaEntidadesAPV'), 
    GlobalVariable.G_TimeShort)

WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Cuenta_detalleEmpleadoPrime_formtablaEntidadesAPV'), '665432999')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/input_Cuenta_detalleEmpleadoPrime_formtablaEntidadesAPVvalorAPV'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/input_Cuenta_detalleEmpleadoPrime_formtablaEntidadesAPVvalorAPV'))

WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Cuenta_detalleEmpleadoPrime_formtablaEntidadesAPVvalorAPV'), '56000')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/a_Fecha Vigencia_btn-miniadicionar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/a_Fecha Vigencia_btn-miniadicionar'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/a_Finalizar registro'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/a_Finalizar registro'))

if (WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/label_Proxima Nmina'), GlobalVariable.G_timeout)) {
    WebUI.click(findTestObject('2_Colaboradores/Page_/label_Proxima Nmina'))
}

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/a_Aceptar'), GlobalVariable.G_TimeShort)

WebUI.click(findTestObject('2_Colaboradores/Page_/a_Aceptar'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('2_Colaboradores/Page_/a_Colaboradores'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/a_Colaboradores'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/a_ACTIVO_us-icon-remover'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/a_ACTIVO_us-icon-remover'))

WebUI.setText(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/input_Fecha ultimo da Laborado'), 
    '30/03/2021')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/select_-- Seleccione --FALLECIMIENTO'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/select_-- Seleccione --FALLECIMIENTO'))

WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/select_-- Seleccione --FALLECIMIENTO'), 
    '4')

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/a_Aplicar Retiro'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/a_Aplicar Retiro'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/a_Aceptar_'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/a_Aceptar_'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/a_Si'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/a_Si'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/a_Continuar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/a_Continuar'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/a_Aplicar liquidacin contrato'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/a_Aplicar liquidacin contrato'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/select_DirectoEntidad de Pago'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/select_DirectoEntidad de Pago'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/a_Actualizar'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/a_Actualizar'))

WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/a_Colaboradores'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('2_Colaboradores/Page_/a_Colaboradores'))

WebUI.closeBrowser()

