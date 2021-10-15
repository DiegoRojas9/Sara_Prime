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

WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

WebUI.click(findTestObject('1.1_General_Objects/a_Nmina'))

WebUI.click(findTestObject('3_Nómina/11_Seguridad_ajustes/a_Seguridad Social'))

WebUI.click(findTestObject('3_Nómina/11_Seguridad_ajustes/a_Ajustes'))

WebUI.click(findTestObject('3_Nómina/11_Seguridad_ajustes/div_ARANGO CAMACHO CAMILA_formulario'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/11_Seguridad_ajustes/select_-- Seleccione --Eps - Aliansalud EpsEps'), 
    44)

WebUI.selectOptionByIndex(findTestObject('3_Nómina/11_Seguridad_ajustes/select_-- Seleccione --Afp - Caja De Auxilios'), 
    3)

WebUI.setText(findTestObject('3_Nómina/11_Seguridad_ajustes/input_ARANGO CAMACHO CAMILA_fecha_input'), '10/03/2021')

WebUI.click(findTestObject('3_Nómina/11_Seguridad_ajustes/span_ARANGO CAMACHO CAMILA_ui-icon ui-icon-check ui-c'))

WebUI.closeBrowser()

