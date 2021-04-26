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

WebUI.callTestCase(findTestCase('1_Logueo/Logueo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('6_Configuración/3_Liquidación/Page_/a_Configuracin'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/3_Liquidación/Page_/a_Configuracin'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/3_Liquidación/Page_/a_Liquidacin'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/3_Liquidación/Page_/a_Liquidacin'))

WebUI.setText(findTestObject('6_Configuración/3_Liquidación/Page_/input_Da De Pago _form_informacionLiquidaciondiames'), 
    '30')

WebUI.waitForElementClickable(findTestObject('6_Configuración/3_Liquidación/Page_/label_NO'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/3_Liquidación/Page_/label_NO'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('6_Configuración/3_Liquidación/Page_/label_SI'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/3_Liquidación/Page_/label_SI'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('6_Configuración/3_Liquidación/Page_/a_Aceptar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/3_Liquidación/Page_/a_Aceptar'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/3_Liquidación/Page_/input_Porcentaje_form_informacionLiquidacionporcentaje'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/3_Liquidación/Page_/input_Porcentaje_form_informacionLiquidacionporcentaje'))

WebUI.setText(findTestObject('6_Configuración/3_Liquidación/Page_/input_Porcentaje_form_informacionLiquidacionporcentaje'), 
    '20')

WebUI.waitForElementClickable(findTestObject('6_Configuración/3_Liquidación/Page_/input_Da De Pago_form_informacionLiquidaciondiaanticipo'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/3_Liquidación/Page_/input_Da De Pago_form_informacionLiquidaciondiaanticipo'))

WebUI.setText(findTestObject('6_Configuración/3_Liquidación/Page_/input_Da De Pago_form_informacionLiquidaciondiaanticipo'), 
    '15')

WebUI.waitForElementClickable(findTestObject('6_Configuración/3_Liquidación/Page_/a_Guardar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/3_Liquidación/Page_/a_Guardar'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/3_Liquidación/Page_/a_Liquidacin'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/3_Liquidación/Page_/a_Liquidacin'))

WebUI.closeBrowser()

