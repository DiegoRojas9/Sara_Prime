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

WebUI.click(findTestObject('3_Nómina/4_Comprobantes/2_Comprobante_individual/a_Nmina'))

WebUI.click(findTestObject('3_Nómina/4_Comprobantes/2_Comprobante_individual/a_Fecha 10052021_formulario_nomina'))

WebUI.click(findTestObject('3_Nómina/4_Comprobantes/Page_/a_Aceptar'))

WebUI.click(findTestObject('3_Nómina/4_Comprobantes/2_Comprobante_individual/a_Continuar'))

WebUI.click(findTestObject('3_Nómina/4_Comprobantes/2_Comprobante_individual/a_Descargar'))

WebUI.click(findTestObject('3_Nómina/4_Comprobantes/2_Comprobante_individual/a_Cancelar'))

WebUI.delay(2)

WebUI.closeBrowser()

