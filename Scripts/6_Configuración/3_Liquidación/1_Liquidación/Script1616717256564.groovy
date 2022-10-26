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

WebUI.comment('pendiente ventana de confirmacion no funciona')

WebUI.callTestCase(findTestCase('1.0_Logueo/Logueo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

WebUI.click(findTestObject('1.1_General_Objects/a_Configuracin'))

WebUI.click(findTestObject('6_Configuración/3_Liquidación/Page_/a_Liquidacin'))

filepath = WebUI.getAttribute(findTestObject('6_Configuración/3_Liquidación/Page_/input_Da De Pago _form_informacionLiquidaciondiames'), 
    'value')

if (filepath == '30') {
    WebUI.setText(findTestObject('6_Configuración/3_Liquidación/Page_/input_Da De Pago _form_informacionLiquidaciondiames'), 
        '29')
} else {
    WebUI.setText(findTestObject('6_Configuración/3_Liquidación/Page_/input_Da De Pago _form_informacionLiquidaciondiames'), 
        '30')
}

WebUI.click(findTestObject('6_Configuración/3_Liquidación/Page_/label_NO'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/3_Liquidación/Page_/label_SI'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/3_Liquidación/Page_/label_SI'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/3_Liquidación/Page_/a_Aceptar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/3_Liquidación/Page_/a_Aceptar'))

WebUI.setText(findTestObject('6_Configuración/3_Liquidación/Page_/input_Porcentaje_form_informacionLiquidacionporcentaje'), 
    '20')

WebUI.setText(findTestObject('6_Configuración/3_Liquidación/Page_/input_Da De Pago_form_informacionLiquidaciondiaanticipo'), 
    '15')

WebUI.click(findTestObject('6_Configuración/3_Liquidación/Page_/Element_Pago Anticipado de vacaciones'))

WebUI.click(findTestObject('6_Configuración/3_Liquidación/Page_/a_NO_sabado_habil'))

WebUI.doubleClick(findTestObject('6_Configuración/3_Liquidación/Page_/a_Guardar'))

WebUI.click(findTestObject('6_Configuración/3_Liquidación/Page_/a_NO_manejo anticipo mensual'))

WebUI.doubleClick(findTestObject('6_Configuración/3_Liquidación/Page_/a_Guardar'))

WebUI.waitForElementVisible(findTestObject('Result/p_Resultado'), 0)

WebUI.getText(findTestObject('Result/p_Resultado'))

WebUI.closeBrowser()

