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

WebUI.waitForElementClickable(findTestObject('Page_/Novedad_Vacaciones1.1/Page_/a_ ver ms'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Novedad_Vacaciones1.1/Page_/a_ ver ms'))

WebUI.waitForElementClickable(findTestObject('Page_/Novedad_Vacaciones1.1/Page_/a_LICENCIA DE LUTO_us-icon-deleted'), GlobalVariable.G_timeout)

if (WebUI.waitForElementClickable(findTestObject('Page_/Novedad_Vacaciones1.1/Page_/a_LICENCIA DE LUTO_us-icon-deleted'),
	GlobalVariable.G_timeout, FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('Page_/Novedad_Vacaciones1.1/Page_/a_LICENCIA DE LUTO_us-icon-deleted'))

	WebUI.waitForElementClickable(findTestObject('Page_/Novedad_Vacaciones1.1/Page_/a_Aceptar'), GlobalVariable.G_timeout)

	WebUI.click(findTestObject('Page_/Novedad_Vacaciones1.1/Page_/a_Aceptar'))
}

WebUI.waitForElementClickable(findTestObject('Page_/Novedad_Vacaciones1.1/Page_/a_Cerrar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Novedad_Vacaciones1.1/Page_/a_Cerrar'))

WebUI.waitForElementClickable(findTestObject('Page_/Novedad_Vacaciones1.1/Page_/a_(Valor 2000000)_formulario_nominaj_idt4866verAusentismos'),
	GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Novedad_Vacaciones1.1/Page_/a_(Valor 2000000)_formulario_nominaj_idt4866verAusentismos'))

WebUI.waitForElementClickable(findTestObject('Page_/Novedad_Vacaciones1.1/Page_/input_LICENCIA DE LUTO_popupNovedadAusentis_e42074'),
	GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Novedad_Vacaciones1.1/Page_/input_LICENCIA DE LUTO_popupNovedadAusentis_e42074'))

WebUI.setText(findTestObject('Object Repository/Page_/Novedad_Vacaciones1.1/Page_/input_LICENCIA DE LUTO_popupNovedadAusentis_e42074'),
	'03/02/2021')

WebUI.waitForElementClickable(findTestObject('Page_/Novedad_Vacaciones1.1/Page_/input_LICENCIA DE LUTO_popupNovedadAusentis_b1b3c8'),
	GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Novedad_Vacaciones1.1/Page_/input_LICENCIA DE LUTO_popupNovedadAusentis_b1b3c8'))

WebUI.setText(findTestObject('Object Repository/Page_/Novedad_Vacaciones1.1/Page_/input_LICENCIA DE LUTO_popupNovedadAusentis_b1b3c8'),
	'1')

WebUI.waitForElementClickable(findTestObject('Page_/Novedad_Vacaciones1.1/Page_/a_Aplicar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Object Repository/Page_/Novedad_Vacaciones1.1/Page_/a_Aplicar'))

WebUI.closeBrowser()