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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://190.85.173.173:8093/saraprimeweb/registro/registro.jsf')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/Crear_empresa/Page_/select_SeleccionarCedula CiudadaniaCedula E_687d20'),
	'CE', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/Crear_empresa/Page_/select_SeleccionarCedula CiudadaniaCedula E_687d20'),
	'NI', true)

WebUI.setText(findTestObject('Object Repository/Page_/Crear_empresa/Page_/input_Numero Documento_form_crear_cuentanum_076543'),
	'900800150')

WebUI.setText(findTestObject('Object Repository/Page_/Crear_empresa/Page_/input_DV_form_crear_cuentadigito_verificacion'),
	'1')

WebUI.setText(findTestObject('Object Repository/Page_/Crear_empresa/Page_/input_Nombre o Razon Social _form_crear_cue_f5c662'),
	'')

WebUI.click(findTestObject('Object Repository/Page_/Crear_empresa/Page_/div_Informacin EmpresaTipo Documento Selecc_9c6fd9'))

WebUI.setText(findTestObject('Object Repository/Page_/Crear_empresa/Page_/input_Nombre o Razon Social _form_crear_cue_f5c662'),
	'INSUMOS MEDICOS COMFAMA')

WebUI.setText(findTestObject('Object Repository/Page_/Crear_empresa/Page_/input_Direccin _form_crear_cuentadireccion'),
	'CALLE 52 41 13')

WebUI.setText(findTestObject('Object Repository/Page_/Crear_empresa/Page_/input_Telfono Fijo _form_crear_cuentatelefono'),
	'5486215')

WebUI.setText(findTestObject('Object Repository/Page_/Crear_empresa/Page_/input_Nombre _form_crear_cuentanombre'), 'EMILIA VARGAS MARTINEZ')

WebUI.setText(findTestObject('Object Repository/Page_/Crear_empresa/Page_/input_Documento_form_crear_cuentadocumentoA'),
	'1098626095')

WebUI.setText(findTestObject('Object Repository/Page_/Crear_empresa/Page_/input_Correo _form_crear_cuentacorreo'), 'autotestus1994@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_/Crear_empresa/Page_/input_Confirmar Correo _form_crear_cuentaco_117d3d'),
	'autotestus1994@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_/Crear_empresa/Page_/input_Confirmar Correo _form_crear_cuentack_f8e92d'))

WebUI.click(findTestObject('Object Repository/Page_/Crear_empresa/Page_/a_Crear Cuenta'))

WebUI.click(findTestObject('Object Repository/Page_/Crear_empresa/Page_/span_Aceptar'))

WebUI.closeBrowser()