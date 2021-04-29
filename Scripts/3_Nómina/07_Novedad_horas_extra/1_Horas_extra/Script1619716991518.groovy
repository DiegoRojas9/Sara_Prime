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

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Carpeta_General_PrimeFace/Page_/a_Nmina'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Carpeta_General_PrimeFace/Page_/a_Nmina'))

WebUI.waitForElementClickable(findTestObject('Page_/Novedad_HoraExtra1.1/Page_/a_(Valor 2000000)_formulario_nominaj_idt4866verConceptosNomina'),
	GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Novedad_HoraExtra1.1/Page_/a_(Valor 2000000)_formulario_nominaj_idt4866verConceptosNomina'))

WebUI.setText(findTestObject('Page_/Novedad_HoraExtra1.1/PrimeFace/Page_/input_COMISIONES_popup_agregarNovedadConceptotabla0valor'),
	'100000')

WebUI.setText(findTestObject('Page_/Novedad_HoraExtra1.1/PrimeFace/Page_/input_Auxilio Movilizacin_popup_agregarNovedadConceptotabla1valor'),
	'200000')

WebUI.waitForElementClickable(findTestObject('Page_/Novedad_HoraExtra1.1/PrimeFace/Page_/a_Aplicar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Novedad_HoraExtra1.1/PrimeFace/Page_/a_Aplicar'))

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Carpeta_General_PrimeFace/Page_/a_Nmina'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Carpeta_General_PrimeFace/Page_/a_Nmina'))

WebUI.waitForElementClickable(findTestObject('Page_/Novedad_HoraExtra1.1/PrimeFace/Page_/td_PARRA GUZMAN ALEXANDRA'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Novedad_HoraExtra1.1/PrimeFace/Page_/td_PARRA GUZMAN ALEXANDRA'))

WebUI.waitForElementClickable(findTestObject('Carpeta_General_PrimeFace/Page_/a_Nmina'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Carpeta_General_PrimeFace/Page_/a_Nmina'))

WebUI.waitForElementClickable(findTestObject('Page_/Novedad_HoraExtra1.1/Page_/a_ ver ms'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Novedad_HoraExtra1.1/Page_/a_ ver ms'))

WebUI.waitForElementClickable(findTestObject('Page_/Novedad_HoraExtra1.1/PrimeFace/Page_/a_Auxilio Movilizacin_us-icon-deleted'),
	GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Novedad_HoraExtra1.1/PrimeFace/Page_/a_Auxilio Movilizacin_us-icon-deleted'))

WebUI.waitForElementClickable(findTestObject('Page_/Novedad_HoraExtra1.1/PrimeFace/Page_/a_Aceptar_Aux'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Novedad_HoraExtra1.1/PrimeFace/Page_/a_Aceptar_Aux'))

WebUI.waitForElementClickable(findTestObject('Page_/Novedad_HoraExtra1.1/PrimeFace/Page_/a_COMISIONES_us-icon-deleted'),
	GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Novedad_HoraExtra1.1/PrimeFace/Page_/a_COMISIONES_us-icon-deleted'))

WebUI.waitForElementClickable(findTestObject('Page_/Novedad_HoraExtra1.1/PrimeFace/Page_/a_Aceptar_Comi'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Novedad_HoraExtra1.1/PrimeFace/Page_/a_Aceptar_Comi'))

WebUI.waitForElementClickable(findTestObject('Page_/Novedad_HoraExtra1.1/PrimeFace/Page_/a_Cerrar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Novedad_HoraExtra1.1/PrimeFace/Page_/a_Cerrar'))

WebUI.closeBrowser()

