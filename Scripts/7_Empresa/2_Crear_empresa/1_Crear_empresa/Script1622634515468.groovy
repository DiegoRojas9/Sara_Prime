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

WebUI.navigateToUrl(GlobalVariable.G_Inscripcion)

WebUI.click(findTestObject('7_Empresa/2_Crear_empresa/td_CORPORATE'))

WebUI.click(findTestObject('7_Empresa/2_Crear_empresa/a_Siguiente'))

WebUI.selectOptionByIndex(findTestObject('7_Empresa/2_Crear_empresa/select_SeleccionarCedula Ciudadania'), '3')

WebUI.setText(findTestObject('7_Empresa/2_Crear_empresa/input_Numero Documento_empresa' /*'900800150'*/ ), numAleatorio())

WebUI.setText(findTestObject('7_Empresa/2_Crear_empresa/input_D.V_verificacion'), '1')

WebUI.setText(findTestObject('7_Empresa/2_Crear_empresa/input_Nombre o Razon Social'), 'Soluciones moviles S.A.S.')

WebUI.setText(findTestObject('7_Empresa/2_Crear_empresa/input_Direccin_form_crear_cuentadireccion'), 'CALLE 52 41 13')

WebUI.setText(findTestObject('7_Empresa/2_Crear_empresa/input_Telfono Fijo_form_crear_cuentatelefono'), '5486215')

WebUI.setText(findTestObject('7_Empresa/2_Crear_empresa/input_Nombre_form_crear_cuentanombre'), 'EMILIA VARGAS MARTINEZ')

WebUI.setText(findTestObject('7_Empresa/2_Crear_empresa/input_Documento_form_crear_cuentadocumentoA'), '1098626095')

String correo = ('autotestus' + numAleatorio()) + '@gmail.com'

WebUI.setText(findTestObject('7_Empresa/2_Crear_empresa/input_Correo_form_crear_cuentacorreo'), correo)

WebUI.setText(findTestObject('7_Empresa/2_Crear_empresa/input_Confirmar Correo_form_crear'), correo)

WebUI.click(findTestObject('7_Empresa/2_Crear_empresa/span_Confirmar Correo_ui-chkbox'))

WebUI.click(findTestObject('7_Empresa/2_Crear_empresa/a_Crear Cuenta'))

String Result = WebUI.getText(findTestObject('7_Empresa/2_Crear_empresa/a_result'))

WebUI.click(findTestObject('7_Empresa/2_Crear_empresa/a_Aceptar'))

if (Result == 'Hemos enviado un correo a aut***************************.com con las instruciones para seguir con el proceso de registro.') {
    String Resultado = 'PRUEBA OK'

    WebUI.closeBrowser()
} else if (Result == 'Hemos enviado un correo a aut****************************.com con las instruciones para seguir con el proceso de registro.') {
    String Resultado = 'PRUEBA OK'

    WebUI.closeBrowser()
} else if (Result == 'Hemos enviado un correo a aut**************************.com con las instruciones para seguir con el proceso de registro.') {
    String Resultado = 'PRUEBA OK'

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

def numAleatorio() {
    double random_double = (Math.random() * 9999) + 999

    random_double = Math.round(random_double * 1000)

    String identificacion = random_double.toString().replace('.0', '')
}

