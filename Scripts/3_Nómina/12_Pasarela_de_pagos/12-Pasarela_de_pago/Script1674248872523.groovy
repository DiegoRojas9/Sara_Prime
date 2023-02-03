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

WebUI.openBrowser('https://docs.epayco.com/docs/medios-de-pruebas-1')

WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Aceptar_Epayco'))

String p = WebUI.getText(findTestObject('3_Nómina/12_Pasarela_de_pago/p'))

String numTarjeta = p.substring(25, 41)

fechaTarjeta = println(numTarjeta)

String Mes = p.substring(60, 62)

println(Mes)

String Año = p.substring(63, 67)

println(Año)

String Cvc = p.substring(73, 76)

println(Cvc)

WebUI.callTestCase(findTestCase('1.0_Logueo/Logueo2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Proceso de Nmina'))

if (WebUI.waitForElementVisible(findTestObject('3_Nómina/12_Pasarela_de_pago/a_No volver a mostrar'), 1)) {
    WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_No volver a mostrar'))

    WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_cerrar'))
}

if (WebUI.waitForElementVisible(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Siguiente Periodo'), 1)) {
    WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Siguiente Periodo'))

    WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Aceptar0'))

    if (WebUI.waitForElementVisible(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Archivo Para Pagos'), 1)) {
        WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Archivo Para Pagos'))

        WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Abonar Periodo'))

        WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Aceptar0'))

        WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Nmina'))

        WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/input_NOMINA  DICIEMBRE 2022_formulario_nominacbSiguientePeriodo'))

        WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Aceptar1'))
    }
}

WebUI.doubleClick(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Aprobar Nmina'))

WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Aceptar0'))

if (WebUI.waitForElementVisible(findTestObject('3_Nómina/12_Pasarela_de_pago/a_5 Colaboradores'), 1)) {
    WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_5 Colaboradores'))
}

if (WebUI.waitForElementVisible(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Archivo Para Pagos'), 1)) {
    WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Archivo Para Pagos'))

    WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Abonar Periodo'))

    WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Aceptar0'))

    WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Nmina'))

    WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/input_NOMINA  DICIEMBRE 2022_formulario_nominacbSiguientePeriodo'))

    WebUI.doubleClick(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Aceptar1'))

    WebUI.doubleClick(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Aprobar Nmina'))
}

if (WebUI.waitForElementVisible(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Proceso de Nmina'), 1)) {
    WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Proceso de Nmina'))
}

WebUI.waitForElementVisible(findTestObject('3_Nómina/12_Pasarela_de_pago/img_ePayco'), 1)

WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/img_ePayco'))

WebUI.waitForElementVisible(findTestObject('3_Nómina/12_Pasarela_de_pago/ifram_onePage'), 0)

WebUI.waitForElementVisible(findTestObject('3_Nómina/12_Pasarela_de_pago/input_correo'), 0)

WebUI.setText(findTestObject('3_Nómina/12_Pasarela_de_pago/input_correo'), 'autotestus1994@gmail.com')

WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Continuar1'))

WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/span_Tarjeta de Credito y debito'))

WebUI.setText(findTestObject('3_Nómina/12_Pasarela_de_pago/input_Nombre'), 'sara unionsoluciones')

WebUI.setText(findTestObject('3_Nómina/12_Pasarela_de_pago/input_Numero de la tarjeta'), numTarjeta)

WebUI.setText(findTestObject('3_Nómina/12_Pasarela_de_pago/input_Mes'), Mes)

WebUI.setText(findTestObject('3_Nómina/12_Pasarela_de_pago/input_Año'), Año)

WebUI.setText(findTestObject('3_Nómina/12_Pasarela_de_pago/input_CVC'), Cvc)

WebUI.selectOptionByIndex(findTestObject('3_Nómina/12_Pasarela_de_pago/select_Cuotas'), 1)

WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Continuar1 - Copy'))

WebUI.setText(findTestObject('3_Nómina/12_Pasarela_de_pago/input_Documento'), '1019052083')

WebUI.setText(findTestObject('3_Nómina/12_Pasarela_de_pago/input_Número de Móvil'), '3193481229')

WebUI.setText(findTestObject('3_Nómina/12_Pasarela_de_pago/input_Dirección'), 'calle 106')

WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Pagar'))

WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Continuar2'))

if (WebUI.waitForElementVisible(findTestObject('3_Nómina/12_Pasarela_de_pago/a_ACEPTADO'), 1)) {
    String Resultado = WebUI.getText(findTestObject('3_Nómina/12_Pasarela_de_pago/a_ACEPTADO'))
}

WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Finalizar'))

if (WebUI.waitForElementVisible(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Regresar'), 1)) {
    WebUI.waitForElementVisible(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Regresar'), 0)

    WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Regresar'))

    WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Abonar Periodo'))

    WebUI.click(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Aceptar0'))

    if (WebUI.waitForElementVisible(findTestObject('3_Nómina/12_Pasarela_de_pago/a_Archivo Para Pagos'), 1)) {
        WebUI.closeBrowser()
    }
} else {
    WebUI.acceptAlert()
}

