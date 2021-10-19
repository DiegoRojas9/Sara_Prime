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

WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/a_ ver ms'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_ ver ms'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/a_AUXILIO DE MOVILIZACION_popupDetalleNovedades'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_AUXILIO DE MOVILIZACION_popupDetalleNovedades'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/a_Aceptar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_Aceptar'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/a_COMISIONES_popupDetalleNovedadesj'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_COMISIONES_popupDetalleNovedadesj'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/a_Aceptar_1'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_Aceptar_1'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/a_Cerrar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_Cerrar'))

WebUI.delay(3)

WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

WebUI.waitForElementClickable(findTestObject('1.1_General_Objects/a_Nmina'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('1.1_General_Objects/a_Nmina'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/a_2'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_2'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/a_Fecha 10022021_formulario_nominaj_ConceptosNomina'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_Fecha 10022021_formulario_nominaj_ConceptosNomina'))

WebUI.setText(findTestObject('3_Nómina/7_Novedad_horas_extra/input_COMISIONES_popup_agregarNovedadConceptotabla0valor'), 
    '100000')

WebUI.setText(findTestObject('3_Nómina/7_Novedad_horas_extra/input_AUXILIO DE MOVILIZACION_popup_valor'), '200000')

WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/input_AUXILIO DE MOVILIZACION_fechainicial_input'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/input_AUXILIO DE MOVILIZACION_fechainicial_input'))

WebUI.setText(findTestObject('3_Nómina/7_Novedad_horas_extra/input_AUXILIO DE MOVILIZACION_fechainicial_input'), '05/03/2021')

WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/input_Obligatorio_popup_fechafinal_input'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/input_Obligatorio_popup_fechafinal_input'))

WebUI.setText(findTestObject('3_Nómina/7_Novedad_horas_extra/input_Obligatorio_popup_fechafinal_input'), '10/04/2021')

WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/a_Aplicar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_Aplicar'))

WebUI.closeBrowser()

