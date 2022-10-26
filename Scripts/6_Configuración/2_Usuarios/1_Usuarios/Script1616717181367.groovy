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

WebUI.click(findTestObject('1.1_General_Objects/a_Configuracin'))

WebUI.click(findTestObject('6_Configuración/2_Usuario/Page_/a_Usuarios'))

WebUI.selectOptionByIndex(findTestObject('6_Configuración/2_Usuario/Page_/select_-- Seleccione --ActivoInactivo'), '1')

WebUI.waitForElementClickable(findTestObject('6_Configuración/2_Usuario/Page_/span_Activo_ui-icon ui-icon-pencil'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/2_Usuario/Page_/span_Activo_ui-icon ui-icon-pencil'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/2_Usuario/Page_/select_-- Seleccione --AdministradorAdministrador 2'), 
    0)

WebUI.selectOptionByIndex(findTestObject('6_Configuración/2_Usuario/Page_/select_-- Seleccione --AdministradorAdministrador 2'), 
    '1')

WebUI.waitForElementClickable(findTestObject('6_Configuración/2_Usuario/Page_/a_EMPLEADO_MASIVO_consultausuariosusuarios0j_idt454'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/2_Usuario/Page_/a_EMPLEADO_MASIVO_consultausuariosusuarios0j_idt454'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/2_Usuario/Page_/span_Activo_ui-icon ui-icon-pencil'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/2_Usuario/Page_/span_Activo_ui-icon ui-icon-pencil'))

WebUI.click(findTestObject('6_Configuración/2_Usuario/Page_/a_Administrador_consultausuariosusuarios0selectRoles0j_idt449'))

