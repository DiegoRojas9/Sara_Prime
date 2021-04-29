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
import org.openqa.selenium.WebElement as WebEleme

double random_double = (Math.random() * 9999) + 999

random_double = Math.round(random_double * 1000)

String identificacion = random_double.toString().replace('.0', '')

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/a_Colaboradores'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/a_Colaboradores'))

WebUI.waitForElementClickable(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/a_Agregar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/a_Agregar'))

WebUI.setText(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/input_Nombres  _detalleEmpleadoPrime_formnombres'),
	'Andrea')

WebUI.setText(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/input_Primer Apellido  _detalleEmpleadoPrime_formprimerApellido'),
	'Amdrade')

WebUI.setText(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/input_Segundo Apellido _detalleEmpleadoPrime_formsegundoApellido'),
	'Valenci')

WebUI.selectOptionByValue(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/select_-- Seleccione Tipo Documento --CEDULA CIUDADANIACEDULA EXTRANJERIANITPASAPORTEPERMISO ESPECIALREGISTRO CIVILTARJETA DE IDENTIDADVISA'),
	'C       ', false)

WebUI.click(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/input_Documento  _detalleEmpleadoPrime_formdocumento'))

WebUI.setText(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/input_Documento  _detalleEmpleadoPrime_formdocumento'),
	'49678543')

WebUI.setText(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/input_Fecha Nacimiento  _detalleEmpleadoPrime_formnacimiento_input'),
	'16/10/1983')

WebUI.waitForElementClickable(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/input_Pas Nacimiento  _detalleEmpleadoPrime_formpaisNacimiento_input'),
	GlobalVariable.G_timeout)

WebUI.setText(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/input_Pas Nacimiento  _detalleEmpleadoPrime_formpaisNacimiento_input'),
	'COL')

WebUI.waitForElementClickable(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/li_COLOMBIA'), GlobalVariable.G_timeout)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/li_COLOMBIA'),
	30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

//WebUI.selectOptionByIndex(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/li_COLOMBIA'), 0)
WebUI.click(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/label_Email'))

WebUI.setText(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/input_Email  _detalleEmpleadoPrime_formemail'),
	identificacion + '@gmail.com')

WebUI.setText(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/input_Direccin  _detalleEmpleadoPrime_formdireccion'),
	'Cll 163J# 58-65')

WebUI.selectOptionByValue(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/select_-- Seleccione Estado Civil --CASADODIVORCIADONO RELACIONADOSOLTEROUNION LIBREVIUDO'),
	'U', false)

WebUI.setText(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/input_Telfono Celular _detalleEmpleadoPrime_formtelefonoContacto'),
	'3009998877')

WebUI.waitForElementClickable(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/label_FEMENINO'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/label_FEMENINO'))

WebUI.selectOptionByValue(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/select_-- Seleccione Grupo Sanguineo --AA-ABAB-BB-OO-'),
	'A- ', false)

WebUI.setText(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/input_Telfono Fijo _detalleEmpleadoPrime_formtelefono'),
	'6662345')

WebUI.selectOptionByValue(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/select_-- Seleccione Nivel Academico --BachillerDoctoradoEspecializadoProfesionalSIN EDUCACIONTecnicoTecnologo'),
	'4 ', false)

WebUI.waitForElementClickable(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/a_Continuar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/a_Continuar'))

try {
	WebUI.selectOptionByIndex(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/select_-- Seleccione Cargo --ANALISTA BDBACK'),
		2)

	WebUI.selectOptionByIndex(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/select_-- Seleccione Cargo --ANALISTA BDBACK'),
		1)
}
catch (Exception e) {
	WebUI.click(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/a_Cargo  _btn-miniadicionar'))

	WebUI.setText(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/input_Descripcin_form_popupCrearCargodescripcionCargo'),
		'Consultor QA')

	WebUI.click(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/a_Guardar_cargo'))
}

try {
	WebUI.selectOptionByIndex(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/select_-- Seleccione Unidad --DESARROLLODESARROLLO BDDESARROLLO WEBGESTIN HUMANAJEFE DE PRODUCCINNO RELACIONADA'),
		2)

	WebUI.selectOptionByIndex(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/select_-- Seleccione Unidad --DESARROLLODESARROLLO BDDESARROLLO WEBGESTIN HUMANAJEFE DE PRODUCCINNO RELACIONADA'),
		1)
}
catch (Exception e) {
	WebUI.click(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/a_Unidad  _btn-miniadicionar'))

	WebUI.setText(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/input_Descripcin_form_popupCrearUnidaddescripcionUnidad'),
		'Desarrollo')

	WebUI.click(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/a_Guardar_unidad'))
}

WebUI.setText(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/input_Sueldo  _detalleEmpleadoPrime_formsueldo'),
	'5400000')

WebUI.selectOptionByValue(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/select_-- Seleccione Tipo Contrato --APRENDIZ'),
	'1', false)

WebUI.setText(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/input_Fecha de Ingreso  _detalleEmpleadoPrime_formfechaIngreso_input'),
	'25/12/2020')

try {
	WebUI.selectOptionByIndex(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/select_-- Seleccione Centro Costo --GerenciaRecursos'),
		1)

	WebUI.selectOptionByIndex(findTestObject('Retiro_colaborador/Retiro_Colaborador/Page_/select_-- Seleccione Centro Costo --GerenciaRecursos'),
		1)
}
catch (Exception e) {
	WebUI.click(findTestObject('Page_/Create_colaborador/Popups_Unid_Car_Costeo/Page_/a_Centro Costo  _detalleEmpleadoPrime_NuevoCentro'))

	WebUI.setText(findTestObject('Page_/Create_colaborador/Popups_Unid_Car_Costeo/Page_/input_Cdigo_form_popupCrearCentroCostocodigo'),
		'CCS')

	WebUI.setText(findTestObject('Page_/Create_colaborador/Popups_Unid_Car_Costeo/Page_/input_Descripcin_form_popupCrearCentroCostodescripcion'),
		'Servicios')

	WebUI.click(findTestObject('Page_/Create_colaborador/Popups_Unid_Car_Costeo/Page_/a_Guardar_CentrCos'))
}

try {
	WebUI.selectOptionByIndex(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/select_-- Seleccione Linea Costo --NV'),
		1)

	WebUI.selectOptionByIndex(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/select_-- Seleccione Linea Costo --NV'),
		1)
}
catch (Exception e) {
	WebUI.click(findTestObject('Page_/Create_colaborador/Popups_Unid_Car_Costeo/Page_/a_Lnea de Costo  _detalleEmpleadoPrime_NuevaLinea'))

	WebUI.setText(findTestObject('Page_/Create_colaborador/Popups_Unid_Car_Costeo/Page_/input_Cdigo_form_popupCrearLineaCostocodigo'),
		'QA')

	WebUI.setText(findTestObject('Page_/Create_colaborador/Popups_Unid_Car_Costeo/Page_/input_Descripcin_form_popupCrearLineaCostodescripcion'),
		'Desarrollardor')

	WebUI.click(findTestObject('Page_/Create_colaborador/Popups_Unid_Car_Costeo/Page_/a_Guardar_LineaCos'))
}

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/Create_colaborador/Page_/select_-- Seleccione --EPS - ALIANSALUD EPS_b32e5d'),
	'S02       |1', false)

WebUI.waitForElementClickable(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/a_Agregar Beneficiarios UPC'),
	GlobalVariable.G_timeout)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/Create_colaborador/Page_/select_-- Seleccione --AFP - Caja de Auxili_5d2977'),
	'P03       |1', false)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/Create_colaborador/Page_/select_-- Seleccione Nivel Riesgo --Clase I_b8a6ce'),
	'1', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/Create_colaborador/Page_/select_-- Seleccione --FC - COLFONDOSFC - F_afe929'),
	'T07       |1', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/Create_colaborador/Page_/select_-- Seleccione Medio de Pago --Cheque_b73422'),
	'T', false)

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/select_-- Seleccione --AV VILLASBanco  de  Occidente SABanco Agrario'),
	GlobalVariable.G_timeout)

WebUI.selectOptionByIndex(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/select_-- Seleccione --AV VILLASBanco  de  Occidente SABanco Agrario'),
	'1')

WebUI.setText(findTestObject('Object Repository/Page_/Create_colaborador/Page_/input_Nmero de Cuenta  _detalleEmpleadoPrim_638fd6'),
	'665432999')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/Create_colaborador/Page_/select_-- Seleccione Tipo de Cuenta --Cuent_e4daf2'),
	'2', false)

WebUI.click(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/a_Agregar Beneficiarios UPC'))

WebUI.waitForElementClickable(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/a_Nuevo_UPC'),
	GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/a_Nuevo_UPC'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_CEDULA CIUDADANIACEDULA EXTRANJERIAN_96f861'),
	'C       ', true)

WebUI.setText(findTestObject('Page_/input_Valor a Aportar _popupRegistroBenefic_99d1c7'), '86000')

WebUI.click(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/input_Identificacin _popupRegistroBeneficiariosUpc_1'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/input_Identificacin _popupRegistroBeneficiariosUpc_1'),
	GlobalVariable.G_timeout)

WebUI.setText(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/input_Identificacin _popupRegistroBeneficiariosUpc_1'),
	'1022987456')

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/input_Fecha Aplicacin _popupRegistroBeneficiariosUpc'),
	GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/input_Fecha Aplicacin _popupRegistroBeneficiariosUpc'))

WebUI.setText(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/input_Fecha Aplicacin _popupRegistroBeneficiariosUpc'),
	'10/01/2021')

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/input_Nombre _Upc'),
	GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/input_Nombre _Upc'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/input_Nombre _Upc'), 'Hector Alirio')

WebUI.click(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/input_Fecha Final _popupRegistroBeneficiariosUpc_formfechaFinal_input'))

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/input_Fecha Final _popupRegistroBeneficiariosUpc_formfechaFinal_input'),
	GlobalVariable.G_timeout)

WebUI.setText(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/input_Fecha Final _popupRegistroBeneficiariosUpc_formfechaFinal_input'),
	'27/01/2021')

WebUI.waitForElementClickable(findTestObject('Page_/input_Nombre _popupRegistroBeneficiariosUpc_18c476'), GlobalVariable.G_timeout)

WebUI.setText(findTestObject('Object Repository/Page_/input_apellidos _popupRegistroBeneficiarios_b8bf9f'), 'Urrego Camacho')

WebUI.waitForElementClickable(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/a_AgregarUPC'),
	GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/a_AgregarUPC'))

WebUI.waitForElementClickable(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/a_Union Soluciones 2019_ui-dialog-titlebare-hover'),
	GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/a_Union Soluciones 2019_ui-dialog-titlebare-hover'))

WebUI.waitForElementClickable(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/a_Continuar'),
	GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/a_Continuar'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_/Create_colaborador/Page_/label_No'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Object Repository/Page_/Create_colaborador/Page_/label_No'))

WebUI.setText(findTestObject('Object Repository/Page_/Create_colaborador/Page_/input_Deducible por Medicina Prepagada  Seg_acee3e'),
	'54000')

WebUI.setText(findTestObject('Object Repository/Page_/Create_colaborador/Page_/input_Intereses Crdito Vivienda  _detalleEm_b20a09'),
	'450000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/Create_colaborador/Page_/select_-- Seleccione --AFC - AV VILLASAFC -_a3be41'),
	'F05       |1', false)

WebUI.waitForElementClickable(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/span_Valor_ui-chkbox-icon ui-NV'),
	GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/span_Valor_ui-chkbox-icon ui-NV'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_/Create_colaborador/Page_/input_Cuenta_detalleEmpleadoPrime_formtabla_f40460'),
	GlobalVariable.G_TimeShort)

WebUI.setText(findTestObject('Object Repository/Page_/Create_colaborador/Page_/input_Cuenta_detalleEmpleadoPrime_formtabla_f40460'),
	'665432999')

WebUI.setText(findTestObject('Object Repository/Page_/Create_colaborador/Page_/input_Cuenta_detalleEmpleadoPrime_formtabla_17e926'),
	'68000')

WebUI.waitForElementClickable(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/a_Fecha Vigencia_btn-miniadicionar_AFC'),
	GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/a_Fecha Vigencia_btn-miniadicionar_AFC'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/Create_colaborador/Page_/select_-- Seleccione --APV - Caja de Auxili_8192ae'),
	'V10       |1', false)

WebUI.waitForElementClickable(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/span_Valor_ui-chkbox-icon ui-UPC_NV'),
	GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/span_Valor_ui-chkbox-icon ui-UPC_NV'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_/Create_colaborador/Page_/input_Cuenta_detalleEmpleadoPrime_formtabla_9a6b6b'),
	GlobalVariable.G_TimeShort)

WebUI.setText(findTestObject('Object Repository/Page_/Create_colaborador/Page_/input_Cuenta_detalleEmpleadoPrime_formtabla_9a6b6b'),
	'665432999')

WebUI.waitForElementClickable(findTestObject('Page_/Create_colaborador/Page_/input_Cuenta_detalleEmpleadoPrime_formtabla_3dba96'),
	GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Create_colaborador/Page_/input_Cuenta_detalleEmpleadoPrime_formtabla_3dba96'))

WebUI.setText(findTestObject('Object Repository/Page_/Create_colaborador/Page_/input_Cuenta_detalleEmpleadoPrime_formtabla_3dba96'),
	'56000')

WebUI.waitForElementClickable(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/a_Fecha Vigencia_btn-miniadicionar_APV'),
	GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/a_Fecha Vigencia_btn-miniadicionar_APV'))

WebUI.waitForElementClickable(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/a_Finalizar registro_NV'),
	GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/a_Finalizar registro_NV'))

if (WebUI.waitForElementClickable(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/label_Proxima Nmina'),
	GlobalVariable.G_timeout)) {
	WebUI.click(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/label_Proxima Nmina'))
}

WebUI.waitForElementClickable(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/a_Aceptar_NV'),
	GlobalVariable.G_TimeShort)

WebUI.click(findTestObject('Page_/Create_colaborador/Page_/Page_/Page_/PrimeFace/Page_/a_Aceptar_NV'))

WebUI.closeBrowser()