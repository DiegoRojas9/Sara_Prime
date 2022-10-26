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

WebUI.callTestCase(findTestCase('1.0_Logueo/Logueo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

WebUI.click(findTestObject('1.1_General_Objects/a_Nmina'))

if (WebUI.waitForElementVisible(findTestObject('3_Nómina/11_Seguridad_ajustes/a_Seguridad Social'), 1)) {
    WebUI.click(findTestObject('3_Nómina/11_Seguridad_ajustes/a_Seguridad Social'))
} else {
    WebUI.click(findTestObject('3_Nómina/11_Seguridad_ajustes/a_Aprobar Nmina'))

    WebUI.click(findTestObject('3_Nómina/11_Seguridad_ajustes/a_Aceptar'))

    WebUI.click(findTestObject('3_Nómina/11_Seguridad_ajustes/a_Seguridad Social'))
}

WebUI.click(findTestObject('3_Nómina/11_Seguridad_ajustes/a_Ajustes'))

filepath = WebUI.getAttribute(findTestObject('3_Nómina/11_Seguridad_ajustes/select_-- Seleccione --Eps - Aliansalud EpsEps'), 
    'value')

String EPS = filepath

WebUI.click(findTestObject('3_Nómina/11_Seguridad_ajustes/div_ARANGO CAMACHO CAMILA_formulario'))

if(EPS == 'S12       |1') {
WebUI.selectOptionByIndex(findTestObject('3_Nómina/11_Seguridad_ajustes/select_-- Seleccione --Eps - Aliansalud EpsEps'), 
    43)
}
else {
WebUI.selectOptionByIndex(findTestObject('3_Nómina/11_Seguridad_ajustes/select_-- Seleccione --Eps - Aliansalud EpsEps'), 
    44)
}

filepath =WebUI.getAttribute(findTestObject('3_Nómina/11_Seguridad_ajustes/select_-- Seleccione --Afp - Caja De Auxilios'),'value')
String AFP = filepath

if(AFP == 'P02       |1') {
WebUI.selectOptionByIndex(findTestObject('3_Nómina/11_Seguridad_ajustes/select_-- Seleccione --Afp - Caja De Auxilios'), 
    4)
}
else {
WebUI.selectOptionByIndex(findTestObject('3_Nómina/11_Seguridad_ajustes/select_-- Seleccione --Afp - Caja De Auxilios'),
	3)
}
WebUI.setText(findTestObject('3_Nómina/11_Seguridad_ajustes/input_ARANGO CAMACHO CAMILA_fecha_input'), '10/03/2021')

WebUI.click(findTestObject('3_Nómina/11_Seguridad_ajustes/span_ARANGO CAMACHO CAMILA_ui-icon ui-icon-check ui-c'))

if(WebUI.waitForElementVisible(findTestObject('3_Nómina/11_Seguridad_ajustes/div_ARANGO CAMACHO CAMILA_formulario'), 1)) {
	String Resultado = 'PRUEBA OK'
	WebUI.closeBrowser()
}
else {
WebUI.acceptAlert()
}


