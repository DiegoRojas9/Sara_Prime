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

WebUI.click(findTestObject('1.1_General_Objects/a_Calendario'))

WebUI.click(findTestObject('4_Calendario/Page_/a_Nueva actividad'))

WebUI.setText(findTestObject('4_Calendario/Page_/input_Hora Inicial_form_popupCalendarioBeanhoraInicial'), '12')

WebUI.setText(findTestObject('4_Calendario/Page_/input_Hora Inicial_form_popupCalendarioBeanminutoInicial'), '30')

WebUI.setText(findTestObject('4_Calendario/Page_/input_hora Final_form_popupCalendarioBeanhoraFinal'), '15')

WebUI.setText(findTestObject('4_Calendario/Page_/input_hora Final_form_popupCalendarioBeanminutoFinal'), '30')

WebUI.setText(findTestObject('4_Calendario/Page_/textarea_Descripcin_form_popupCalendarioBeandescipcionEvento'), 'Capacitación SST y Copass')

WebUI.setText(findTestObject('4_Calendario/Page_/input_Responsable_form_popupCalendarioBeanresponsableEvento'), 'Andrea Cubillos Serna')

WebUI.setText(findTestObject('4_Calendario/Page_/input_Notificar_form_popupCalendarioBeanalerta'), '20')

WebUI.selectOptionByValue(findTestObject('4_Calendario/Page_/select_DiaSemanaMes'), '30', true)

WebUI.click(findTestObject('4_Calendario/Page_/a_Guardar'))

WebUI.click(findTestObject('4_Calendario/Page_/a_Andrea Cubillos Serna_calendarioPrimej_idt2600j_idt265'))

WebUI.setText(findTestObject('4_Calendario/Page_/input_Responsable_form_popupCalendarioBean_1'), 'Manuel Restrepo Calvache')

WebUI.setText(findTestObject('4_Calendario/Page_/input_Notificar_form_popupCalendarioBeanalerta_1'), '25')

WebUI.selectOptionByValue(findTestObject('4_Calendario/Page_/select_DiaSemanaMes_1'), '30', true)

WebUI.waitForElementClickable(findTestObject('4_Calendario/Page_/a_Editar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('4_Calendario/Page_/a_Editar'))

String Result = WebUI.getText(findTestObject('Result/p_Resultado'))
if(Result == 'La actividad ha sido actualizada')
{
	String  Resultadio = 'PRUEBA OK'
	WebUI.closeBrowser()
}
else {
	WebUI.acceptAlert()
}

