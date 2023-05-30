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
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByXPath as ByXPath
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import java.io.File as File
import org.openqa.selenium.WebElement as webElement
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.callTestCase(findTestCase('1.0_Logueo/Logueo'), [:], FailureHandling.STOP_ON_FAILURE)

if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/a_Iniciar Asistente'), 2)) {
    WebUI.click(findTestObject('9_Tour_saraprime/a_Iniciar Asistente'))
} else {
    WebUI.click(findTestObject('9_Tour_saraprime/img_incognita'))

    if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/img_continuar tour'), 1)) {
        WebUI.click(findTestObject('9_Tour_saraprime/img_continuar tour'))
    } else if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/img_Asistente'), 1)) {
        WebUI.click(findTestObject('9_Tour_saraprime/img_Asistente'))
    } else {
        WebUI.acceptAlert()
    }
    
    if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/a_Iniciar Asistente'), 2)) {
        WebUI.click(findTestObject('9_Tour_saraprime/a_Iniciar Asistente'))
    }
    
    if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_LISTO YA TE REGISTRASTE'), 1)) {
        WebUI.click(findTestObject('9_Tour_saraprime/a_Siguiente0'))
    }
    
    if (((((((((WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_E_ui-icon ui-icon-closethick'), 1) || 
    WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_E_ui-icon ui-icon-closethick - 1'), 1)) || WebUI.waitForElementVisible(
        findTestObject('9_Tour_saraprime/span_E_ui-icon ui-icon-closethick - 2'), 1)) || WebUI.waitForElementVisible(findTestObject(
            '9_Tour_saraprime/span_E_ui-icon ui-icon-closethick - 3'), 1)) || WebUI.waitForElementVisible(findTestObject(
            '9_Tour_saraprime/span_E_ui-icon ui-icon-closethick - 4'), 1)) || WebUI.waitForElementVisible(findTestObject(
            '9_Tour_saraprime/span_E_ui-icon ui-icon-closethick - 5'), 1)) || WebUI.waitForElementVisible(findTestObject(
            '9_Tour_saraprime/span_E_ui-icon ui-icon-closethick - 6'), 1)) || WebUI.waitForElementVisible(findTestObject(
            '9_Tour_saraprime/span_E_ui-icon ui-icon-closethick - 7'), 1)) || WebUI.waitForElementVisible(findTestObject(
            '9_Tour_saraprime/span_E_ui-icon ui-icon-closethick - 8'), 1)) || WebUI.waitForElementVisible(findTestObject(
            '9_Tour_saraprime/span_E_ui-icon ui-icon-closethick - 9'), 1)) {
        String estado = 'ok'
    } else {
        WebUI.acceptAlert()
    }
}

WebUI.comment('AGREGAR UN EMPLEADO')

String paso0 = ''

if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_Paso - 1'), 1)) {
    paso0 = WebUI.getText(findTestObject('9_Tour_saraprime/span_Paso - 1'))
} else if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_Paso'), 1)) {
    paso0 = WebUI.getText(findTestObject('9_Tour_saraprime/span_Paso'))
} else if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_Paso - 2'), 1)) {
    paso0 = WebUI.getText(findTestObject('9_Tour_saraprime/span_Paso - 2'))
} else if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_Paso - 3'), 1)) {
    paso0 = WebUI.getText(findTestObject('9_Tour_saraprime/span_Paso - 3'))
} else if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_Paso - 4'), 1)) {
    paso0 = WebUI.getText(findTestObject('9_Tour_saraprime/span_Paso - 4'))
} else if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_Paso - 5'), 1)) {
    paso0 = WebUI.getText(findTestObject('9_Tour_saraprime/span_Paso - 5'))
} else if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_Paso - 6'), 1)) {
    paso0 = WebUI.getText(findTestObject('9_Tour_saraprime/span_Paso - 6'))
} else if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_Paso - 7'), 1)) {
    paso0 = WebUI.getText(findTestObject('9_Tour_saraprime/span_Paso - 7'))
} else if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_Paso - 8'), 1)) {
    paso0 = WebUI.getText(findTestObject('9_Tour_saraprime/span_Paso - 8'))
} else if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_Paso - 9'), 1)) {
    paso0 = WebUI.getText(findTestObject('9_Tour_saraprime/span_Paso - 9'))
} else {
    WebUI.acceptAlert()
}

if (paso0 == 'PASO 1') {
    WebUI.click(findTestObject('9_Tour_saraprime/span_E_ui-icon ui-icon-closethick'))
} else {
    while (paso0 != 'PASO 1') {
        WebUI.click(findTestObject('9_Tour_saraprime/a_Anterior'))

        if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_Paso'), 1)) {
            paso0 = WebUI.getText(findTestObject('9_Tour_saraprime/span_Paso'))
        } else if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_Paso - 1'), 1)) {
            paso0 = WebUI.getText(findTestObject('9_Tour_saraprime/span_Paso - 1'))
        } else if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_Paso - 2'), 1)) {
            paso0 = WebUI.getText(findTestObject('9_Tour_saraprime/span_Paso - 2'))
        } else if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_Paso - 3'), 1)) {
            paso0 = WebUI.getText(findTestObject('9_Tour_saraprime/span_Paso - 3'))
        } else if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_Paso - 4'), 1)) {
            paso0 = WebUI.getText(findTestObject('9_Tour_saraprime/span_Paso - 4'))
        } else if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_Paso - 5'), 1)) {
            paso0 = WebUI.getText(findTestObject('9_Tour_saraprime/span_Paso - 5'))
        } else if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_Paso - 6'), 1)) {
            paso0 = WebUI.getText(findTestObject('9_Tour_saraprime/span_Paso - 6'))
        } else if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_Paso - 7'), 1)) {
            paso0 = WebUI.getText(findTestObject('9_Tour_saraprime/span_Paso - 7'))
        } else if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_Paso - 8'), 1)) {
            paso0 = WebUI.getText(findTestObject('9_Tour_saraprime/span_Paso - 8'))
        } else if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_Paso - 9'), 1)) {
            paso0 = WebUI.getText(findTestObject('9_Tour_saraprime/span_Paso - 9'))
        } else {
            WebUI.acceptAlert()
        }
    }
    
    if (paso0 == 'PASO 1') {
        WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_E_ui-icon ui-icon-closethick'), 0)
    } else {
        WebUI.acceptAlert()
    }
}

String id = ID()

nuevoEmpleado(id)

WebUI.click(findTestObject('9_Tour_saraprime/img_incognita'))

WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/img_continuar tour - Copy'), 0)

WebUI.doubleClick(findTestObject('9_Tour_saraprime/img_continuar tour - Copy'))

if(WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/a_Siguiente0'), 0))
{
WebUI.click(findTestObject('9_Tour_saraprime/a_Siguiente0'))
}else {
	WebUI.doubleClick(findTestObject('9_Tour_saraprime/img_continuar tour - Copy'))
	
	WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/a_Siguiente0'), 0)
	
	WebUI.click(findTestObject('9_Tour_saraprime/a_Siguiente0'))
}
if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_E_ui-icon ui-icon-closethick'), 1)) {
    WebUI.click(findTestObject('9_Tour_saraprime/span_E_ui-icon ui-icon-closethick'))
} else if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_E_ui-icon ui-icon-closethick - 1'), 1)) {
    WebUI.click(findTestObject('9_Tour_saraprime/span_E_ui-icon ui-icon-closethick - 1'))
} else {
    WebUI.click(findTestObject('9_Tour_saraprime/span_E_ui-icon ui-icon-closethick - 2'))
}

WebUI.click(findTestObject('9_Tour_saraprime/a_Aprobar Nmina'))

WebUI.click(findTestObject('9_Tour_saraprime/a_Aceptar'))

WebUI.click(findTestObject('9_Tour_saraprime/img_incognita'))

if (WebUI.waitForElementClickable(findTestObject('9_Tour_saraprime/img_continuar tour - Copy'), 1)) {
    WebUI.click(findTestObject('9_Tour_saraprime/img_continuar tour - Copy'), FailureHandling.STOP_ON_FAILURE)
} else if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/img_continuar tour - Copy'), 1)) {
    WebUI.click(findTestObject('9_Tour_saraprime/img_continuar tour - Copy'), FailureHandling.STOP_ON_FAILURE)
} else if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/img_continuar tour'), 1)) {
    WebUI.click(findTestObject('9_Tour_saraprime/img_continuar tour'), FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('9_Tour_saraprime/a_Siguiente0'))

WebUI.click(findTestObject('9_Tour_saraprime/span_E_ui-icon ui-icon-closethick - 3'))

WebUI.click(findTestObject('9_Tour_saraprime/a_Abonar Periodo'))

WebUI.click(findTestObject('9_Tour_saraprime/a_Aceptar'))

WebUI.click(findTestObject('9_Tour_saraprime/img_incognita'))

WebUI.click(findTestObject('9_Tour_saraprime/img_continuar tour - Copy - Copy'))

WebUI.click(findTestObject('9_Tour_saraprime/a_Siguiente0'))

WebUI.click(findTestObject('9_Tour_saraprime/a_Siguiente0'))

WebUI.click(findTestObject('9_Tour_saraprime/a_Siguiente0'))

WebUI.click(findTestObject('9_Tour_saraprime/a_Siguiente0'))

WebUI.click(findTestObject('9_Tour_saraprime/a_Siguiente0'))

WebUI.click(findTestObject('9_Tour_saraprime/span_E_ui-icon ui-icon-closethick - 8'))

WebUI.comment('Reversar nomina y abono')

WebUI.click(findTestObject('9_Tour_saraprime/a_Administrador_masivo_cerrar_menu'))

WebUI.click(findTestObject('9_Tour_saraprime/a_Proceso de Nmina'))

WebUI.click(findTestObject('9_Tour_saraprime/a_Archivo Para Pagos'))

WebUI.click(findTestObject('9_Tour_saraprime/a_Reversar Abono'))

WebUI.click(findTestObject('9_Tour_saraprime/a_Aceptar0'))

WebUI.click(findTestObject('9_Tour_saraprime/a_Nmina'))

WebUI.click(findTestObject('9_Tour_saraprime/a_Reversar Confirmacin'))

WebUI.click(findTestObject('9_Tour_saraprime/a_Aceptar0'))

WebUI.comment('Nomina Electronica')

WebUI.click(findTestObject('9_Tour_saraprime/img_incognita'))

WebUI.click(findTestObject('9_Tour_saraprime/img_continuar tour - Copy - Copy'))

WebUI.click(findTestObject('9_Tour_saraprime/span_E_ui-icon ui-icon-closethick - 8'))

WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Nómina Electrónica'))

WebUI.setText(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/input_año'), '2021')

WebUI.sendKeys(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/input_año'), Keys.chord(Keys.ENTER))

habilitar()

comprobacion()

nomina()

if (WebUI.waitForElementVisible(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/p_Termin'), 0)) {
    String result = WebUI.getText(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/p_Termin'))

    if (result == 'Terminó') {
        String Resultado = 'prueba ok'
    } else {
        WebUI.acceptAlert()
    }
}

WebUI.click(findTestObject('9_Tour_saraprime/img_incognita'))

WebUI.click(findTestObject('9_Tour_saraprime/img_continuar tour - Copy - Copy'))

WebUI.click(findTestObject('9_Tour_saraprime/a_Siguiente0'))

if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/a_Finalizar Tour'), 1)) {
    WebUI.click(findTestObject('9_Tour_saraprime/a_Finalizar Tour'))

    String RESULTADO = 'Prueba ok'

    WebUI.closeBrowser( //-----------------------------------------------
        )
}

def nuevoEmpleado(def id) {
    String RutaA = System.getProperty('os.name')

    String rta = ''

    if (RutaA == 'Windows 10') {
        def rutaW = RunConfiguration.getProjectDir() + '/1_Recursos/'

        rutaW = rutaW.replace('/', '\\')

        println('Esta es la ruta:' + rutaW)

        rta = rutaW
    } else if (RutaA == 'Linux') {
        def rutaW = RunConfiguration.getProjectDir() + '/1_Recursos/'

        println('Esta es la ruta:' + rutaW)

        rta = rutaW
    } else {
        rta = 'Error'

        WebUI.acceptAlert()
    }
    
    if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_E_ui-icon ui-icon-closethick - 1'), 1)) {
        WebUI.click(findTestObject('9_Tour_saraprime/span_Paso - 1'))
    } else if (WebUI.waitForElementVisible(findTestObject('9_Tour_saraprime/span_E_ui-icon ui-icon-closethick'), 1)) {
        WebUI.click(findTestObject('9_Tour_saraprime/span_E_ui-icon ui-icon-closethick'))
    }
    
    WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

    WebUI.waitForElementPresent(findTestObject('2_Colaboradores/Page_/a_Colaboradores'), GlobalVariable.G_timeout)

    WebUI.click(findTestObject('2_Colaboradores/Page_/a_Colaboradores'))

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/a_Agregar'), GlobalVariable.G_timeout)

    WebUI.click(findTestObject('2_Colaboradores/Page_/a_Agregar'))

    WebUI.click(findTestObject('2_Colaboradores/Page_/a_Comprobar'))

    WebUI.click(findTestObject('2_Colaboradores/Page_/a_Agregar foto'))

    String ruta = rta + 'Anonymous.jpg'

    println(ruta)

    WebUI.uploadFileWithDragAndDrop(findTestObject('2_Colaboradores/Page_/a_Seleccionar Archivo'), ruta)

    WebUI.click(findTestObject('2_Colaboradores/Page_/a_Aceptar - Copy'))

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Documento  _detalleEmpleadoPrime'), id)

    WebUI.click(findTestObject('2_Colaboradores/Page_/input_Nombres  _detalleEmpleadoPrime'), FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Nombres  _detalleEmpleadoPrime'), 'Mariana' + id)

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Primer Apellido  _detalleEmpleadoPrime'), 'Urrego')

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Segundo Apellido _detalleEmpleadoPrime'), 'Camacho')

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Fecha Nacimiento  _detalleEmpleadoPrime'), '16/10/1995')

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Pas Nacimiento  _detalleEmpleadoPrime'), 'COL')

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/li_COLOMBIA'), GlobalVariable.G_timeout)

    WebElement element = WebUiCommonHelper.findWebElement(findTestObject('2_Colaboradores/Page_/li_COLOMBIA'), 30)

    WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

    WebUI.click(findTestObject('2_Colaboradores/Page_/label_Email'))

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Email  _detalleEmpleadoPrime_formemail'), id + 'Mariana.urrego@gmail.com')

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
        WebUI.sendKeys(findTestObject('2_Colaboradores/Page_/input_Fecha de Ingreso  _detalleEmpleadoPrime'), Keys.chord(
                Keys.ESCAPE))

        WebUI.click(findTestObject('Object Repository/2_Colaboradores/Page_/a_Unidad  _btn-miniadicionar'))

        WebUI.setText(findTestObject('Object Repository/2_Colaboradores/Page_/input_Descripcin_form_popupCrearUnidaddescripcionUnidad'), 
            'Desarrollo')

        WebUI.click(findTestObject('Object Repository/2_Colaboradores/Page_/a_Guardar_Unidad'))
    } 
    
    WebUI.click(findTestObject('2_Colaboradores/Page_/a_Asignar Jefe _detalleEmpleadoPrime_formj_idt378'))

    WebUI.click(findTestObject('2_Colaboradores/Page_/td_PARRA GUZMAN ANGELA MARA'))

    WebUI.setText(findTestObject('Object Repository/2_Colaboradores/Page_/input_Sueldo  _detalleEmpleadoPrime_formsueldo'), 
        '5400000')

    WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/Page_/select_-- Seleccione Tipo Contrato --APRENDIZ'), '5')

    WebUI.setText(findTestObject('2_Colaboradores/Page_/input_Fecha de Ingreso  _detalleEmpleadoPrime'), '01/05/2021')

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
        '10/05/2021')


    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Nombre _popupRegistroBeneficiariosUpc_formnombre'), 
        GlobalVariable.G_timeout)

    WebUI.setText(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Nombre _popupRegistroBeneficiariosUpc_formnombre'), 
        'Hector Alirio')

    WebUI.click(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Fecha Final _popupRegistroBeneficiariosUpc'))

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Fecha Final _popupRegistroBeneficiariosUpc'), 
        GlobalVariable.G_timeout)

    WebUI.setText(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Fecha Final _popupRegistroBeneficiariosUpc'), 
        '27/06/2021')


    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Nombre _popupRegistroBeneficiariosUpc_formnombre'), 
        GlobalVariable.G_timeout)

    WebUI.click(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Apellidos _popupRegistroBeneficiariosUpc_formapellidos'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Apellidos _popupRegistroBeneficiariosUpc_formapellidos'), 
        'Urrego Camacho')

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/a_Agregar'), GlobalVariable.G_timeout)
	
	WebUI.setText(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/input_Nombre _popupRegistroBeneficiariosUpc_formnombre'),
		'Hector Alirio')

    WebUI.click(findTestObject('2_Colaboradores/Beneficiario_UPC/Page_/a_Agregar'))

    WebUI.click(findTestObject('2_Colaboradores/Page_/span_Medio de Pago_ui-icon ui-icon-closethick'))

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

    WebUI.scrollToElement(findTestObject('2_Colaboradores/Page_/a_Cuenta_btn-miniadicionar'), 0)

    WebUI.doubleClick(findTestObject('2_Colaboradores/Page_/a_Cuenta_btn-miniadicionar'))

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

    WebUI.scrollToElement(findTestObject('2_Colaboradores/Page_/a_Fecha Vigencia_btn-miniadicionar'), GlobalVariable.G_timeout)

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/a_Fecha Vigencia_btn-miniadicionar'), GlobalVariable.G_timeout)

    WebUI.click(findTestObject('2_Colaboradores/Page_/a_Fecha Vigencia_btn-miniadicionar'))

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/a_Finalizar registro'), GlobalVariable.G_timeout)

    WebUI.click(findTestObject('2_Colaboradores/Page_/a_Finalizar registro'))

    if (WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/label_Proxima Nmina'), GlobalVariable.G_timeout)) {
        WebUI.click(findTestObject('2_Colaboradores/Page_/label_Proxima Nmina'))
    }
    
    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/Page_/a_Aceptar'), GlobalVariable.G_TimeShort)

    WebUI.click(findTestObject('2_Colaboradores/Page_/a_Aceptar'))

    if (WebUI.waitForElementVisible(findTestObject('2_Colaboradores/Page_/a_Comprobar'), 3)) {
        String Resultado = 'PRUEBA OK'

        WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

        WebUI.waitForElementPresent(findTestObject('2_Colaboradores/Page_/a_Colaboradores'), GlobalVariable.G_timeout)

        WebUI.click(findTestObject('2_Colaboradores/Page_/a_Colaboradores'))
    } else {
        WebUI.acceptAlert()
    }
}

def ID() {
    double random_double = (Math.random() * 9999) + 999

    random_double = Math.round(random_double * 1000)

    String identificacion = random_double.toString().replace('.0', '')
}

def habilitar() {
    if (WebUI.waitForElementVisible(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Habilitacin Nmina Electrnica'), 
        1)) {
        WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Habilitacin Nmina Electrnica'))

        if (WebUI.waitForElementClickable(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Ingresar ID0'), 
            1)) {
            WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Ingresar ID0'))

            WebUI.setText(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/input_ID_popupIngresarIDcodigoLinea'), 
                'Katalon123')

            WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Ingresar ID1'))
        }
        
        if (WebUI.waitForElementClickable(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Ingresar TestSetID0'), 
            1)) {
            if (WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Ingresar TestSetID0'))) {
                if (WebUI.waitForElementVisible(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Continuar1'), 
                    1)) {
                    WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Continuar1'))
                }
                
                WebUI.setText(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/input_TestSetID_popupIngresarTestIDcodigoTest'), 
                    'katalonABC')

                WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Ingresar ID'))

                if (WebUI.waitForElementVisible(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Continuar'), 
                    1)) {
                    WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Continuar'))
                }
            }
        }
        
        if (WebUI.waitForElementClickable(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Habilitar para Transmitir'), 
            1)) {
            WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Habilitar para Transmitir'))

            WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Continuar'))
        } else {
            WebUI.delay(300)

            WebUI.refresh()

            WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

            WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Nómina Electrónica'))

            WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Habilitacin Nmina Electrnica'))

            if (WebUI.waitForElementClickable(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Habilitar para Transmitir'), 
                1)) {
                WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Habilitar para Transmitir'))

                WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Continuar'))
            }
        }
        
        WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

        WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Nómina Electrónica'))

        WebUI.setText(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/input_año'), '2021')
    }
}

def nomina() {
    WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Nuevo'))

    WebUI.selectOptionByIndex(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/select_-- seleccione --Nmina IndividualNmina Individual de Ajuste'), 
        1)

    WebUI.setText(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/input_Ao_popup_nominaelectronicaanno'), 
        '2021')

    WebUI.selectOptionByIndex(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/select_-- seleccione --EneroFebreroMarzoAbrilMayoJunioJulioAgostoSeptiembreOctubreNoviembreDiciembre'), 
        8)

    WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Guardar'))

    WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Generar'))

    WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/span_Si'))
}

def comprobacion() {
    if (WebUI.waitForElementVisible(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/td_2021-08-01'), 1)) {
        WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/td_2021-08-01'))

        WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Reversar'))

        WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/span_Si_reversar'))
    }
}

