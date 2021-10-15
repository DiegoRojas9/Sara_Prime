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

double random_double = (Math.random() * 9999) + 999

random_double = Math.round(random_double * 1000)

String identificacion = random_double.toString().replace('.0', '')

WebUI.openBrowser(GlobalVariable.G_LoginPrime)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('7_Empresa/1_Registro_empresa/input_Olvide Mi Clave_loginusuario'), 'primetest.us21@gmail.com')

WebUI.setEncryptedText(findTestObject('7_Empresa/1_Registro_empresa/input_Olvide Mi Clave_loginpassword'), 'zOr8riGd9LSlxntqbv4klA==')

WebUI.waitForElementClickable(findTestObject('7_Empresa/1_Registro_empresa/a_Ingresar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/a_Ingresar'))

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/span_Nova Test Sa'))

WebUI.delay(3)

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/a_ cerrar ayuda'))

WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

WebUI.waitForElementClickable(findTestObject('1.1_General_Objects/a_Crear Nueva Empresa'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('1.1_General_Objects/a_Crear Nueva Empresa'))

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --Cedula Ciudadania'), 
    '3')

WebUI.setText(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Numero Documento_form_'), identificacion)

WebUI.setText(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_DV_form_crearNuevaEmpresaInfodigito_'), 
    '1')

WebUI.setText(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Nombre o Razon Social _form'), 'Desarrollo prime' + 
    identificacion)

WebUI.setText(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Direccin _form_crearNuevaEmpresaInfodireccion'), 
    'Cra 78 # 76H - 54 SUR')

WebUI.waitForElementClickable(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --Arl - Colmena Riesgos Profesional'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --Arl - Colmena Riesgos Profesional'))

WebUI.setText(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Telfono Fijo _form_crearNuevaEmpresaInfotelefono'), 
    '9809000')

WebUI.waitForElementClickable(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --ConsolidadoEspecialSucursalUnica'), 
    GlobalVariable.G_timeout)

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --Arl - Colmena Riesgos Profesional'), 
    '2')

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --ConsolidadoEspecialSucursalUnica'), 
    '4')

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Cdigo Actividad Econmica _form'))

WebUI.waitForElementClickable(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Cdigo Actividad Econmica _form'), 
    GlobalVariable.G_timeout)

WebUI.setText(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Cdigo Actividad Econmica _form'), identificacion)

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/label_NO'))

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/label_NO_1'))

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione Caja --Ccf - Caja De Subsidio Familiar'))

WebUI.waitForElementClickable(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/a_Ciudad_form_crearNuevaEmpresaInfocamposEntidadj_idt336'), 
    GlobalVariable.G_timeout)

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione Caja --Ccf - Caja De Subsidio Familiar'), 
    '1')

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione Ciudad --ABEJORRAL'), 
    '102')

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/a_Ciudad_form_crearNuevaEmpresaInfocamposEntidadj_idt336'))

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --No RelacionadaPago'), 
    '3')

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Nmero de Cuenta _form_crearNueva'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Nmero de Cuenta _form_crearNueva'), 
    GlobalVariable.G_timeout)

WebUI.setText(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Nmero de Cuenta _form_crearNueva'), '90' + 
    identificacion)

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --APORTES EN LINEA'), 
    '2')

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --AhorrosCorriente'), 
    '2')

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --Enviar correo a solicitud'), 
    '1')

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/a_Continuar'))

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/label_SI_1'))

WebUI.setText(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Da Pago Primera Quincena'), '14')

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Da Pago Segunda Quincena'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Da Pago Segunda Quincena'), '30')

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/label_NO_3'))

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/label_Anterior da hbil'))

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/label_SI_2'))

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/label_NO_4'))

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/label_SI_3'))

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --May 2021Jun'), 
    '4')

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/a_Guardar'))

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/label_No Relacionada'))

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/a_Continuar_1'))

WebUI.waitForElementClickable(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/label_Tipo Documento'), GlobalVariable.G_timeout)

WebUI.closeBrowser()

