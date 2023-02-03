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

WebUI.click(findTestObject('1.1_General_Objects/a_Colaboradores'))

WebUI.doubleClick(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/span_Pendiente Liquidacin'))

while (WebUI.waitForElementVisible(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/a_EN PROCESO DE LIQUIDACION_listadoEmpleadoPrime_formtablaEmpleados0j_idt140'), 
    1)) {
    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/a_EN PROCESO DE LIQUIDACION_listadoEmpleadoPrime_formtablaEmpleados0j_idt140'))

    if (WebUI.waitForElementVisible(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/span_Retirar Colaborador_ui-icon ui-icon-closethick'), 
        1)) {
        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/span_Retirar Colaborador_ui-icon ui-icon-closethick'))
    }
	if (WebUI.waitForElementVisible(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/a_Aceptar'),
		1)) {
    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/a_Aceptar'))
	}
    if (WebUI.waitForElementVisible(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/a_Activar Colaborador'), 
        1)) {
        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/a_Activar Colaborador'))

        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/a_Aceptar'))
		if (WebUI.waitForElementVisible(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/a_Aceptar'),
			1)) {
        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/a_Aceptar'))
		}

    }
	WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/a_Regresar'))
	
	WebUI.doubleClick(findTestObject('2_Colaboradores/2_Retiro_colaborador/2_Retiro_Colaborador/span_Pendiente Liquidacin'))
}

