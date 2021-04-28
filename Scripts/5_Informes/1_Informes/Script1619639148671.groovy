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
import org.junit.After as After
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Page_/Informes1.1/PrimeFace/Page_/a_Informes'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Informes1.1/PrimeFace/Page_/a_Informes'))

WebUI.waitForElementClickable(findTestObject('Page_/Informes1.1/PrimeFace/Page_/a_Nmina'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Informes1.1/PrimeFace/Page_/a_Nmina'))

WebUI.waitForElementClickable(findTestObject('Page_/Informes1.1/PrimeFace/Page_/td_2 GT - Reporte Programacin'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Informes1.1/PrimeFace/Page_/td_2 GT - Reporte Programacin'))

WebUI.setText(findTestObject('Page_/Informes1.1/PrimeFace/Page_/input_CONTRATO_popupReportetablaParametroReporte0j_idt653'),
	'0')

WebUI.waitForElementClickable(findTestObject('Page_/Informes1.1/PrimeFace/Page_/input_Fecha Inicial_popupReportetablaParametroReporte1fecha_input'),
	GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Informes1.1/PrimeFace/Page_/input_Fecha Inicial_popupReportetablaParametroReporte1fecha_input'))

WebUI.setText(findTestObject('Page_/Informes1.1/PrimeFace/Page_/input_Fecha Inicial_popupReportetablaParametroReporte1fecha_input'),
	'03/12/2020')

WebUI.waitForElementClickable(findTestObject('Page_/Informes1.1/PrimeFace/Page_/label_Reportes Generales'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Informes1.1/PrimeFace/Page_/label_Reportes Generales'))

WebUI.setText(findTestObject('Page_/Informes1.1/PrimeFace/Page_/input_Fecha Final_popupReportetablaParametroReporte2fecha_input'),
	'10/12/2020')

WebUI.waitForElementClickable(findTestObject('Page_/Informes1.1/PrimeFace/Page_/label_Excel'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Informes1.1/PrimeFace/Page_/label_Excel'))

WebUI.waitForElementClickable(findTestObject('Page_/Informes1.1/PrimeFace/Page_/label_Descargar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Informes1.1/PrimeFace/Page_/label_Descargar'))

WebUI.waitForElementClickable(findTestObject('Page_/Informes1.1/PrimeFace/Page_/a_Generar xxx'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Informes1.1/PrimeFace/Page_/a_Generar xxx'))

WebUI.waitForElementClickable(findTestObject('Page_/Informes1.1/PrimeFace/Page_/a_Continuar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Informes1.1/PrimeFace/Page_/a_Continuar'))

WebUI.waitForElementClickable(findTestObject('Page_/Informes1.1/PrimeFace/Page_/a_Descargar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Informes1.1/PrimeFace/Page_/a_Descargar'))

if (WebUI.waitForElementClickable(findTestObject('Page_/Informes1.1/PrimeFace/Page_/a_Descargar_REPORTE'), GlobalVariable.G_timeout)) {
	WebUI.waitForElementClickable(findTestObject('Page_/Informes1.1/PrimeFace/Page_/span_Union Soluciones 2019_ui-icon ui-icon-closethick'),
		GlobalVariable.G_timeout)

	WebUI.click(findTestObject('Page_/Informes1.1/PrimeFace/Page_/span_Union Soluciones 2019_ui-icon ui-icon-closethick'))
}

WebUI.closeBrowser()

