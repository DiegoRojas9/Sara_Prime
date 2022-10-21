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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('https://yopmail.com/es/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('1.0_crear_empresa/b_generador de correo electrnicoCrear un correo electrnico desechable al azar'))

String correo = WebUI.getText(findTestObject('1.0_crear_empresa/div_faxutrameize-5298yopmail.comloginfaxutrameize-5298'))

WebUI.openBrowser(GlobalVariable.G_Inscripcion)

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
    String Resultado = 'PRUEBA1 OK'

    WebUI.click(findTestObject('1.0_crear_empresa/a_Aceptar'))

    CrearColaborador( //PENDIENTE  POR REPARAR SUBIR  FOTO
        ) /*
    WebUI.click(findTestObject('2_Colaboradores/Page_/a_Agregar foto'))

    String ruta = GlobalVariable.G_rutaarchivos + 'Anonymous.jpg'

    println(ruta)

    WebUI.uploadFileWithDragAndDrop(findTestObject('2_Colaboradores/Page_/a_Seleccionar Archivo'), ruta)

    WebUI.click(findTestObject('2_Colaboradores/Page_/a_Aceptar - Copy'))
	*/
} else {
    WebUI.acceptAlert()
}

def numAleatorio() {
    double random_double = (Math.random() * 9999) + 999

    random_double = Math.round(random_double * 1000)

    String identificacion = random_double.toString().replace('.0', '')
}

def CrearColaborador() {
    WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

    WebUI.click(findTestObject('2_Colaboradores/Page_/a_Proceso de Nomina'))

    String filepath0 = WebUI.getAttribute(findTestObject('2_Colaboradores/Page_/span_Fecha Inicial'), 'value')

    String filepath1 = WebUI.getAttribute(findTestObject('2_Colaboradores/Page_/span_Fecha Final'), 'value')

    WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

    WebUI.waitForElementPresent(findTestObject('2_Colaboradores/Page_/a_Colaboradores'), GlobalVariable.G_timeout)

    WebUI.click(findTestObject('2_Colaboradores/Page_/a_Colaboradores'))

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/a_Agregar'), GlobalVariable.G_timeout)

    WebUI.click(findTestObject('2_Colaboradores/Page_/a_Agregar'))

    WebUI.click(findTestObject('2_Colaboradores/Page_/a_Comprobar'))

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Documento  _detalleEmpleadoPrime'), ID())

    WebUI.click(findTestObject('2_Colaboradores/Page_/input_Nombres  _detalleEmpleadoPrime'), FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Nombres  _detalleEmpleadoPrime'), 'Mariana' + ID())

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Primer Apellido  _detalleEmpleadoPrime'), 'Urrego')

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Segundo Apellido _detalleEmpleadoPrime'), 'Camacho')

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Fecha Nacimiento  _detalleEmpleadoPrime'), '16/10/1995')

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Pas Nacimiento  _detalleEmpleadoPrime'), 'COL')

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/li_COLOMBIA'), GlobalVariable.G_timeout)

    WebElement element = WebUiCommonHelper.findWebElement(findTestObject('2_Colaboradores/Page_/li_COLOMBIA'), 30)

    WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

    WebUI.click(findTestObject('2_Colaboradores/Page_/label_Email'))

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Email  _detalleEmpleadoPrime_formemail'), ID() + 'Mariana.urrego@gmail.com')

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Ciudad de Residencia _formciudadResidencia_input'), 'Bogot')

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/li_BOGOT - CUNDINAMARCA'), GlobalVariable.G_timeout)

    WebElement element1 = WebUiCommonHelper.findWebElement(findTestObject('2_Colaboradores/Page_/li_BOGOT - CUNDINAMARCA'), 
        30)

    WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element1))

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Direccin  _detalleEmpleadoPrime_formdireccion'), 'Cll 179H # 85-56')

    WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Estado Civil --CASADODIVORCIADONO'), 
        '5')

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Telfono Celular _detalleEmpleadoPrime'), '3890004455')

    WebUI.click(findTestObject('2_Colaboradores/Page_/label_FEMENINO'))

    WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Grupo Sanguineo --AA-ABAB-BB-OO-'), 
        '7')

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Telfono Fijo _detalleEmpleadoPrime_formtelefono'), '2980000')

    WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Nivel Academico --Bachiller'), 
        '4 ')

    WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Tipo Documento --CEDULA'), '2')

    WebUI.click(findTestObject('2_Colaboradores/Page_/a_Continuar'))

    try {
        WebUI.selectOptionByIndex(findTestObject('Object Repository/2_Colaboradores/Page_/select_-- Seleccione Cargo --ANALISTA'), 
            0)

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
            1)

        WebUI.selectOptionByIndex(findTestObject('Object Repository/2_Colaboradores/Page_/select_-- Seleccione Unidad --DESARROLLO'), 
            1)
    }
    catch (Exception e) {
        WebUI.click(findTestObject('Object Repository/2_Colaboradores/Page_/a_Unidad  _btn-miniadicionar'))

        WebUI.setText(findTestObject('Object Repository/2_Colaboradores/Page_/input_Descripcin_form_popupCrearUnidaddescripcionUnidad'), 
            'Desarrollo')

        WebUI.click(findTestObject('Object Repository/2_Colaboradores/Page_/a_Guardar_Unidad'))
    } 
    
    WebUI.setText(findTestObject('Object Repository/2_Colaboradores/Page_/input_Sueldo  _detalleEmpleadoPrime_formsueldo'), 
        '5400000')

    WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Tipo Contrato --APRENDIZ'), '5')

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Fecha de Ingreso  _detalleEmpleadoPrime'), filepath0)

    try {
        WebUI.selectOptionByIndex(findTestObject('Object Repository/2_Colaboradores/Page_/select_-- Seleccione Centro Costo --Gerencia'), 
            0)

        WebUI.selectOptionByIndex(findTestObject('Object Repository/2_Colaboradores/Page_/select_-- Seleccione Centro Costo --Gerencia'), 
            0)
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
            0)

        WebUI.selectOptionByIndex(findTestObject('Object Repository/2_Colaboradores/Page_/select_-- Seleccione Linea Costo --DesarrollardorGestin y calidadMarketingProduccinVentas'), 
            1)
    }
    catch (Exception e) {
        WebUI.sendKeys(findTestObject('2_Colaboradores/Page_/input_Fecha de Ingreso  _detalleEmpleadoPrime'), Keys.chord(
                Keys.ESCAPE))

        WebUI.click(findTestObject('Object Repository/2_Colaboradores/Page_/a_Lnea de Costo  _btn-miniadicionar'))

        WebUI.setText(findTestObject('Object Repository/2_Colaboradores/Page_/input_Cdigo_form_popupCrearLineaCostocodigo'), 
            'QA')

        WebUI.setText(findTestObject('Object Repository/2_Colaboradores/Page_/input_Descripcin_form_popupCrearLineaCostodescripcion'), 
            'Desarrollardor')

        WebUI.click(findTestObject('Object Repository/2_Colaboradores/Page_/a_Guardar_Lcosto'))

        WebUI.acceptAlert()
    } 
    
    WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione --EPS - ALIANSALUD EPSEPS'), '21')

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/a_Agregar Beneficiarios UPC'), 
        GlobalVariable.G_timeout)

    WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione --AFP - Caja de Auxilios'), '2')

    WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Nivel Riesgo --Clase I Riesgo Minimo'), 
        '1')

    WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione --FC - COLFONDOSFC - FONDO'), '1')

    WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Medio de Pago --ChequeTransferencia'), 
        '2', FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione --AV VILLASBanco  de  Occidente'), 
        '9')

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Nmero de Cuenta  _detalleEmpleadoPrime_formreferencia'), '665432999')

    WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Tipo de Cuenta --Cuenta Ahorros'), 
        '1')

    WebUI.click(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/a_Agregar Beneficiarios UPC'))

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/a_Nuevo'), GlobalVariable.G_timeout)

    WebUI.click(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/a_Nuevo'))

    WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/select_CEDULA CIUDADANIACEDULA'), '2', 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Valor a Aportar _popupRegistroBeneficiariosUpc'), 
        '86000')

    WebUI.click(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Identificacin _popupRegistroBeneficiariosUpc'))

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Identificacin _popupRegistroBeneficiariosUpc'), 
        GlobalVariable.G_timeout)

    WebUI.setText(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Identificacin _popupRegistroBeneficiariosUpc'), 
        '1022987456')

    WebUI.setText(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Fecha Aplicacin _popupRegistroBeneficiariosUpc'), 
        filepath0)

    WebUI.sendKeys(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Fecha Aplicacin _popupRegistroBeneficiariosUpc'), 
        Keys.chord(Keys.ESCAPE))

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Nombre _popupRegistroBeneficiariosUpc_formnombre'), 
        GlobalVariable.G_timeout)

    WebUI.setText(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Nombre _popupRegistroBeneficiariosUpc_formnombre'), 
        'Hector Alirio')

    WebUI.click(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Fecha Final _popupRegistroBeneficiariosUpc'))

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Fecha Final _popupRegistroBeneficiariosUpc'), 
        GlobalVariable.G_timeout)

    WebUI.setText(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Fecha Final _popupRegistroBeneficiariosUpc'), 
        filepath1)

    WebUI.sendKeys(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Fecha Final _popupRegistroBeneficiariosUpc'), 
        Keys.chord(Keys.ESCAPE))

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Nombre _popupRegistroBeneficiariosUpc_formnombre'), 
        GlobalVariable.G_timeout)

    WebUI.click(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Apellidos _popupRegistroBeneficiariosUpc_formapellidos'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Apellidos _popupRegistroBeneficiariosUpc_formapellidos'), 
        'Urrego Camacho')

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/a_Agregar'), GlobalVariable.G_timeout)

    WebUI.click(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/a_Agregar'))

    WebUI.click(findTestObject('2_Colaboradores/Page_/span_Medio de Pago_ui-icon ui-icon-closethick'))

    WebUI.click(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/a_mas Centro de costos'))

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_codigo'), '1990')

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Descripcion'), 'PRUEBAS KATALON')

    WebUI.click(findTestObject('2_Colaboradores/Page_/a_Guardar'))

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/a_Continuar2'), GlobalVariable.G_timeout)

    WebUI.click(findTestObject('2_Colaboradores/Page_/a_Continuar2'))

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/label_No'), GlobalVariable.G_timeout)

    WebUI.click(findTestObject('2_Colaboradores/Page_/label_No'))

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Deducible por Medicina Prepagada'), '54000')

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Intereses Crdito Vivienda  _detalleEmpleadoPrime'), '450000')

    WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione --AFC - AV VILLASAFC-BANCO'), '8')

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/span_Valor_ui-chkbox-icon ui-icon ui-c ui-icon-check'), 
        GlobalVariable.G_timeout)

    WebUI.click(findTestObject('2_Colaboradores/Page_/span_Valor_ui-chkbox-icon ui-icon ui-c ui-icon-check'))

    WebUI.waitForElementPresent(findTestObject('2_Colaboradores/Page_/input_Cuenta_detalleEmpleadoPrime_formtablaEntidadesAFCcuentaAFC'), 
        GlobalVariable.G_TimeShort)

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Cuenta_detalleEmpleadoPrime_formtablaEntidadesAFCcuentaAFC'), 
        '665432999')

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Cuenta_detalleEmpleadoPrime_formtablaEntidadesAFCvalorAFC'), 
        '68000')

    WebUI.click(findTestObject('2_Colaboradores/Page_/a_Cuenta_btn-miniadicionar'))

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

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Cuenta_detalleEmpleadoPrime_formtablaEntidadesAPVvalorAPV'), 
        '56000')

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/a_Fecha Vigencia_btn-miniadicionar'), GlobalVariable.G_timeout)

    WebUI.click(findTestObject('2_Colaboradores/Page_/a_Fecha Vigencia_btn-miniadicionar'))

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/a_Finalizar registro'), GlobalVariable.G_timeout)

    WebUI.click(findTestObject('2_Colaboradores/Page_/a_Finalizar registro'))

    if (WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/label_Proxima Nmina'), GlobalVariable.G_timeout)) {
        WebUI.click(findTestObject('2_Colaboradores/Page_/label_Proxima Nmina'))
    }
    
    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/a_Aceptar'), GlobalVariable.G_TimeShort)

    WebUI.click(findTestObject('2_Colaboradores/Page_/a_Aceptar'))

    println('Correo')

    if (WebUI.waitForElementVisible(findTestObject('2_Colaboradores/Page_/a_Comprobar'), 3)) {
        String Resultado = 'PRUEBA OK'

        WebUI.acceptAlert()

        WebUI.closeBrowser()
    } else {
        WebUI.acceptAlert()
    }
}

def ID() {
    double random_double = (Math.random() * 9999) + 999

    random_double = Math.round(random_double * 1000)

    String identificacion = random_double.toString().replace('.0', '')
}

