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

WebUI.callTestCase(findTestCase('1.0_Logueo/Logueo'), [:], FailureHandling.STOP_ON_FAILURE)

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
            WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Ingresar TestSetID0'))

            WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Continuar1'))

            WebUI.setText(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/input_TestSetID_popupIngresarTestIDcodigoTest'), 
                'katalonABC')

            WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Ingresar ID'))

            if (WebUI.waitForElementVisible(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Continuar'), 
                1)) {
                WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Continuar'))
            }
        }
        
        if (WebUI.waitForElementClickable(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Habilitar para Transmitir'), 
            1)) {
            WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Habilitar para Transmitir'))

            WebUI.click(findTestObject('8_Nomina_Electrónica/8.1-Crear_Nomina_Electronica/a_Continuar'))
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

