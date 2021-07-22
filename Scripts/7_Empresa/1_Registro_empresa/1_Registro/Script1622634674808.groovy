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

WebUI.waitForElementClickable(findTestObject('7_Empresa/1_Registro_empresa/a_'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/a_'))

WebUI.waitForElementClickable(findTestObject('7_Empresa/1_Registro_empresa/span_Nova Test Sa'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/span_Nova Test Sa'))

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('7_Empresa/1_Registro_empresa/a_Crear nueva empresa'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/a_Crear nueva empresa'))

WebUI.waitForElementClickable(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --Cedula Ciudadania'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --Cedula Ciudadania'))

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

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --ConsolidadoEspecialSucursalUnica'))

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --ConsolidadoEspecialSucursalUnica'), 
    '4')

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Cdigo Actividad Econmica _form'))

WebUI.delay(4)

WebUI.waitForElementClickable(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Cdigo Actividad Econmica _form'), 
    GlobalVariable.G_timeout)

WebUI.setText(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Cdigo Actividad Econmica _form'), identificacion)

WebUI.waitForElementClickable(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/label_NO'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/label_NO'))

WebUI.waitForElementClickable(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/label_NO_1'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/label_NO_1'))

WebUI.waitForElementClickable(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione Caja --Ccf - Caja De Subsidio Familiar'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione Caja --Ccf - Caja De Subsidio Familiar'))

WebUI.waitForElementClickable(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/a_Ciudad_form_crearNuevaEmpresaInfocamposEntidadj_idt336'), 
    GlobalVariable.G_timeout)

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione Caja --Ccf - Caja De Subsidio Familiar'), 
    '1')

WebUI.waitForElementClickable(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione Ciudad --ABEJORRAL'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione Ciudad --ABEJORRAL'))

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione Ciudad --ABEJORRAL'), 
    '102')

WebUI.waitForElementClickable(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/a_Ciudad_form_crearNuevaEmpresaInfocamposEntidadj_idt336'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/a_Ciudad_form_crearNuevaEmpresaInfocamposEntidadj_idt336'))

WebUI.waitForElementClickable(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --No RelacionadaPago'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --No RelacionadaPago'))

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --No RelacionadaPago'), 
    '3')

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Nmero de Cuenta _form_crearNueva'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Nmero de Cuenta _form_crearNueva'), 
    GlobalVariable.G_timeout)

WebUI.setText(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Nmero de Cuenta _form_crearNueva'), '90' + 
    identificacion)

WebUI.waitForElementClickable(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --APORTES EN LINEA'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --APORTES EN LINEA'))

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --APORTES EN LINEA'), 
    '2')

WebUI.waitForElementClickable(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --AhorrosCorriente'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --AhorrosCorriente'))

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --AhorrosCorriente'), 
    '2')

WebUI.waitForElementClickable(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --Enviar correo a solicitud'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --Enviar correo a solicitud'))

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --Enviar correo a solicitud'), 
    '1')

WebUI.waitForElementClickable(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/a_Continuar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/a_Continuar'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/label_SI'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/label_SI'))

WebUI.setText(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/input_Da Pago Primera Quincena_form_crearNu_afe6e6'), 
    '14')

WebUI.setText(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/input_Da Pago Segunda Quincena_form_crearNu_476b2b'), 
    '30')

WebUI.waitForElementClickable(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/label_NO'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/label_NO'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/label_No aplica'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/label_No aplica'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/label_SI'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/label_SI'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/label_SI'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/label_SI'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/label_SI'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/label_SI'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/label_NO'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/label_NO'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/select_-- Seleccione --Ene 2021Feb 2021Mar _1fa232'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/select_-- Seleccione --Ene 2021Feb 2021Mar _1fa232'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/select_-- Seleccione --Ene 2021Feb 2021Mar _1fa232'), 
    '4')

WebUI.waitForElementClickable(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/a_Guardar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/a_Guardar'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/label_No Relacionada'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/label_No Relacionada'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/a_Continuar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/a_Continuar'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Crear_Nueva_Empresa/Page_/label_Tipo Documento'), GlobalVariable.G_timeout)

WebUI.closeBrowser()

