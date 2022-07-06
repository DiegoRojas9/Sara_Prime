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
import java.text.SimpleDateFormat as SimpleDateFormat
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

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

WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

WebUI.waitForElementClickable(findTestObject('1.1_General_Objects/a_Crear Nueva Empresa'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('1.1_General_Objects/a_Crear Nueva Empresa'))

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --Cedula CiudadaniaCedula ExtranjeriaNIT'), 
    3)

WebUI.setText(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Nombre o Razon Social_form_crearNuevaEmpresaInfonombre_razon_social'), 
    'Pruebas automaticas' + identificacion)

WebUI.setText(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Telfono Fijo_form_crearNuevaEmpresaInfotelefono'), 
    '9809000')

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --ConsolidadoEspecialSucursalUnica'), 
    4)

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/label_SI_ley 1607'))

WebUI.setText(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Fecha Inicio_form_crearNuevaEmpresaInfofechaVigencia2_input'), 
    fecha())

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/label_SI_ley 590'))

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/label_NO_trabaja sabado'))

WebUI.setText(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Numero Documento_form_crearNuevaEmpresaInfonumero_documento'), 
    identificacion)

WebUI.setText(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_D.V_form_crearNuevaEmpresaInfodigito_verificacion'), 
    '1')

WebUI.setText(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Direccin_form_crearNuevaEmpresaInfodireccion'), 
    'Cra 78 # 76H - 54 SUR')

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --Arl - Colmena Riesgos ProfesionalesArl - SuraArl -'), 
    2)

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione Caja --Ccf - Caja Colombiana De Subsidio Familiar ColsubsidioCcf - Caja De Compensacin Familiar CafamCcf'), 
    3)

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione Ciudad --ABEJORRALABREGOACACIASACANDIACEVEDOACHIAGRADOAGUA DE DIOS'))

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione Ciudad --ABEJORRALABREGOACACIASACANDIACEVEDOACHIAGRADOAGUA DE DIOS'), 
    '102', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/a_No se encontraron registros_form_crearNuevaEmpresaInfocamposEntidadj_idt199'))

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --No RelacionadaPago En ChequeBanco De BogotaBanco De Las Microfinanzas -'), 
    '3')

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --SIMPLE SAAPORTES EN LINEAASOPAGOS SAENLACE OPERATIVOSOIMI PLANILLA'), 
    '2')

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --Enviar correo a solicitud del administradorEnviar correo al confirmar archivo de pagoNo enviar comprobantes'), 
    '1')

WebUI.setText(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Nmero de Cuenta_form_crearNuevaEmpresaInfonumerocuenta'), 
    identificacion)

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --AhorrosCorriente'), 
    2)

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/a_Continuar'))

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/label_NO_quincenal'))

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/label_SI_Mensual'))

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/label_Anterior da habil'))

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/label_NO_anticipo vacaciones'))

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/label_SI_33 incapacidad'))

WebUI.setText(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Da De Pago_form_crearNuevaEmpresaLiqdiames'), 
    '29')

WebUI.sendKeys(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/input_Da De Pago_form_crearNuevaEmpresaLiqdiames'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByIndex(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/select_-- Seleccione --'), 1)

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/td_NO_incaopacidad desde 3 dia'))

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/a_Guardar0'))

String Result = WebUI.getText(findTestObject('Result/p_Resultado'))

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/label_No Relacionada'))

WebUI.click(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/a_Continuar'))

String Result2 = WebUI.getText(findTestObject('7_Empresa/1_Registro_empresa/1_Nueva_empresa/a_confirmacion'))

if (Result == 'La empresa ha sido creada satisfactoriamente.' && Result2 == 'Registro Finalizado.') {
    String Resultado = 'PRUEBA OK'

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

def fecha() {
    Date today = new Date()

    String FechaA = today.format('dd/MM/yyyy')
}

