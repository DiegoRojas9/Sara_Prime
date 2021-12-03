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

WebUI.waitForElementClickable(findTestObject('1.1_General_Objects/a_Nmina'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('1.1_General_Objects/a_Nmina'))

if (WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/a_ ver ms'), GlobalVariable.G_timeout)) {
    WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/a_ ver ms'))

    WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/a_LICENCIA DE LUTO_popupDetalle_eliminar'), 
        GlobalVariable.G_timeout)

    if (WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/a_LICENCIA DE LUTO_popupDetalle_eliminar'), 
        GlobalVariable.G_timeout, FailureHandling.OPTIONAL)) {
        WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/a_LICENCIA DE LUTO_popupDetalle_eliminar'))

        WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/a_Aceptar'), GlobalVariable.G_timeout)

        WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/a_Aceptar'))
    }
    
    WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/a_Cerrar'), GlobalVariable.G_timeout)

    WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/a_Cerrar'))
}

WebUI.scrollToElement(findTestObject('3_Nómina/8_Novedad_vacaciones/a_Fecha 10022021_formulario_nominaj'), 0)

WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/a_Fecha 10022021_formulario_nominaj'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/a_Fecha 10022021_formulario_nominaj'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/input_LICENCIA DE LUTO_fechainicial_input'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/input_LICENCIA DE LUTO_fechainicial_input'))

WebUI.setText(findTestObject('3_Nómina/8_Novedad_vacaciones/input_LICENCIA DE LUTO_fechainicial_input'), '03/02/2021')

WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/input_LICENCIA DE LUTO_Novedad_dias'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/input_LICENCIA DE LUTO_Novedad_dias'))

WebUI.setText(findTestObject('3_Nómina/8_Novedad_vacaciones/input_LICENCIA DE LUTO_Novedad_dias'), '1')

WebUI.waitForElementClickable(findTestObject('3_Nómina/8_Novedad_vacaciones/a_Aplicar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/8_Novedad_vacaciones/a_Aplicar'))

WebUI.closeBrowser()

