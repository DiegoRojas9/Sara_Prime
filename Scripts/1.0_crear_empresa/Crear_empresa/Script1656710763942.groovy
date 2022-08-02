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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.openBrowser('https://yopmail.com/es/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('1.0_crear_empresa/b_generador de correo electrnicoCrear un correo electrnico desechable al azar'))

String correo = WebUI.getText(findTestObject('1.0_crear_empresa/div_faxutrameize-5298yopmail.comloginfaxutrameize-5298'))

WebUI.openBrowser('http://186.86.125.178:8093/saraprimeweb/registro/registro.jsf')

WebUI.maximizeWindow()

WebUI.click(findTestObject('1.0_crear_empresa/label_Pago Anual'))

WebUI.doubleClick(findTestObject('1.0_crear_empresa/td_CORPORATE'))

WebUI.click(findTestObject('1.0_crear_empresa/a_Siguiente'))

WebUI.selectOptionByIndex(findTestObject('1.0_crear_empresa/select_SeleccionarCedula CiudadaniaCedula ExtranjeriaNIT'), 
    1)

WebUI.setText(findTestObject('1.0_crear_empresa/input_Numero Documento_form_crear_cuentanumero_documento'), numAleatorio())

WebUI.setText(findTestObject('1.0_crear_empresa/input_D.V_form_crear_cuentadigito_verificacion'), '5')

WebUI.setText(findTestObject('1.0_crear_empresa/input_Nombre o Razon Social_form_crear_cuentanombre_razon_social'), 'katalon' + 
    numAleatorio())

WebUI.setText(findTestObject('1.0_crear_empresa/input_Direccin_form_crear_cuentadireccion'), 'kr123 # 123 c-3')

WebUI.setText(findTestObject('1.0_crear_empresa/input_Telfono Fijo_form_crear_cuentatelefono'), '5370229')

WebUI.setText(findTestObject('1.0_crear_empresa/input_Nombre_form_crear_cuentanombre'), 'PRUEBAS KATALON')

WebUI.setText(findTestObject('1.0_crear_empresa/input_Documento_form_crear_cuentadocumentoA'), numAleatorio())

WebUI.setText(findTestObject('1.0_crear_empresa/input_Correo_form_crear_cuentacorreo'), correo)

WebUI.setText(findTestObject('1.0_crear_empresa/input_Confirmar Correo_form_crear_cuentaconfirmar_correo'), correo)

WebUI.click(findTestObject('1.0_crear_empresa/span_Confirmar Correo_ui-chkbox-icon ui-icon ui-icon-blank ui-c'))

WebUI.click(findTestObject('1.0_crear_empresa/a_Crear Cuenta'))

WebUI.click(findTestObject('1.0_crear_empresa/a_Aceptar'))

WebUI.openBrowser('https://yopmail.com/es/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('1.0_crear_empresa/input__login'), correo)

WebUI.click(findTestObject('1.0_crear_empresa/i_'))

String respuesta = ''

if (WebUI.waitForElementVisible(findTestObject('1.0_crear_empresa/Element_1657033250512'), 1) && respuesta) {
    String respuesta1 = 'ok'

    respuesta = respuesta1
} else {
    String respuesta1 = 'fail'

    respuesta = respuesta1
}

while (respuesta == 'fail') {
    WebUI.click(findTestObject('1.0_crear_empresa/a_actualizar_bandejadeEntrada'))

    println(respuesta)

    if (WebUI.waitForElementVisible(findTestObject('1.0_crear_empresa/Element_1657033461508'), 1) && respuesta) {
        String respuesta1 = 'ok'

        respuesta = respuesta1
    } else {
        respuesta1 = 'fail'

        respuesta = respuesta1
    }
    
    println(respuesta)
}

WebUI.click(findTestObject('1.0_crear_empresa/Element_1657033250512'))

WebUI.click(findTestObject('1.0_crear_empresa/Element_1657033461508'))

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('1.0_crear_empresa/input_Clave_form_crear_cuentaclave'), 'saraadmin1')

WebUI.setText(findTestObject('1.0_crear_empresa/input_Confirmar Clave_form_crear_cuentaconfirmarClave'), 'saraadmin1')

WebUI.click(findTestObject('1.0_crear_empresa/a_Continuar'))

WebUI.click(findTestObject('1.0_crear_empresa/input_La compaa se adhiere a la aplicacin de la ley 1607_form_informacionEmpresaley1607'))

WebUI.click(findTestObject('1.0_crear_empresa/input_La compaa cuenta con el beneficio de aplicacin de la ley 590_form_informacionEmpresaley590'))

WebUI.click(findTestObject('1.0_crear_empresa/input_Trabaja Sbado_form_informacionEmpresasabHabil'))

WebUI.selectOptionByIndex(findTestObject('1.0_crear_empresa/select_-- Seleccione --Arl - Colmena Riesgos ProfesionalesArl - SuraArl'), 
    2)

WebUI.selectOptionByIndex(findTestObject('1.0_crear_empresa/select_ConsolidadoEspecialSucursalUnica'), 0)

WebUI.selectOptionByIndex(findTestObject('1.0_crear_empresa/select_-- Seleccione Caja --Ccf - Caja Colombiana De Subsidio Familiar ColsubsidioCcf'), 
    3)

WebUI.selectOptionByIndex(findTestObject('1.0_crear_empresa/select_-- Seleccione Ciudad --ABEJORRALABREGOABRIAQUIACACIASACANDI'), 
    '116', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.0_crear_empresa/a_mas'))


/*
// invalido hasta que se repare subir imagen
WebUI.click(findTestObject('1.0_crear_empresa/a_ mas imagen'))

String ruta = GlobalVariable.G_rutaarchivos + 'Anonymous.jpg'

println(ruta)

WebUI.delay(3)

WebUI.uploadFileWithDragAndDrop(findTestObject('1.0_crear_empresa/span_Cargar Archivo'), ruta)

WebUI.click(findTestObject('1.0_crear_empresa/a_Aceptar'))
*/



WebUI.click(findTestObject('1.0_crear_empresa/a_Siguiente'))

WebUI.selectOptionByIndex(findTestObject('1.0_crear_empresa/select_ Banco Dispersor'), 4)

WebUI.setText(findTestObject('1.0_crear_empresa/input_Nmero de Cuenta'), numAleatorio())

WebUI.selectOptionByIndex(findTestObject('1.0_crear_empresa/Select_Tipo de Cuenta'), 2)

WebUI.selectOptionByIndex(findTestObject('1.0_crear_empresa/Select_operador'), 1)

WebUI.selectOptionByIndex(findTestObject('1.0_crear_empresa/Select_Seleccionar Mtodo de envo delo comprobantes de pago'), 
    3)

WebUI.click(findTestObject('1.0_crear_empresa/a_Guardar'))

WebUI.click(findTestObject('1.0_crear_empresa/Span_ No pago nmina quincenal'))

WebUI.click(findTestObject('1.0_crear_empresa/Span_Si pago nmina mensual'))

WebUI.setText(findTestObject('1.0_crear_empresa/Input_Da de pago'), '30')

WebUI.click(findTestObject('1.0_crear_empresa/Span_Si Maneja Anticipo Mensual'))

WebUI.setText(findTestObject('1.0_crear_empresa/Input_da de pago anticipo'), '15')

WebUI.click(findTestObject('1.0_crear_empresa/Span_ Anterio dia habil'))

WebUI.click(findTestObject('1.0_crear_empresa/Span_SI pago anticipado de vacaciones'))

WebUI.click(findTestObject('1.0_crear_empresa/Span_Si la empresa reconoce el 33 2'))

WebUI.click(findTestObject('1.0_crear_empresa/Span_Si la empresa reconoce el 33 3'))

WebUI.selectOptionByIndex(findTestObject('1.0_crear_empresa/Select_primera nomina'), 1)

WebUI.click(findTestObject('1.0_crear_empresa/a_Guardar'))

if (WebUI.waitForElementVisible(findTestObject('1.0_crear_empresa/finalizacion'), 1)) {
    String Resultado = 'PRUEBA OK'

    WebUI.click(findTestObject('1.0_crear_empresa/a_Aceptar'))

    WebUI.closeBrowser()
}
else {WebUI.acceptAlert()}
def numAleatorio() {
    double random_double = (Math.random() * 9999) + 999

    random_double = Math.round(random_double * 1000)

    String identificacion = random_double.toString().replace('.0', '')
}

