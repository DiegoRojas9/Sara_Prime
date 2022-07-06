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

WebUI.click(findTestObject('3_Nómina/9_Abono_y_reversa/a_Aprobar Nmina'))

WebUI.click(findTestObject('3_Nómina/9_Abono_y_reversa/a_Aceptar_'))

WebUI.click(findTestObject('3_Nómina/9_Abono_y_reversa/a_Abonar Periodo'))

WebUI.click(findTestObject('3_Nómina/9_Abono_y_reversa/a_Aceptar_1'))

WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

WebUI.click(findTestObject('1.1_General_Objects/a_Nmina'))

WebUI.click(findTestObject('3_Nómina/9_Abono_y_reversa/a_Archivo Para Pagos'))

WebUI.click(findTestObject('3_Nómina/9_Abono_y_reversa/a_Reversar Abono'))

WebUI.click(findTestObject('3_Nómina/9_Abono_y_reversa/a_Aceptar_2'))

WebUI.click(findTestObject('3_Nómina/9_Abono_y_reversa/a_Nmina_1'))

WebUI.click(findTestObject('3_Nómina/9_Abono_y_reversa/a_Reversar Confirmacin'))

WebUI.click(findTestObject('3_Nómina/9_Abono_y_reversa/a_Aceptar_3'))

String Result = WebUI.getText(findTestObject('Result/p_Resultado'))
if(Result == 'Registro Actualizado') {
	String Resultado = 'PRUEBA OK'
	WebUI.closeBrowser()
}
else {
WebUI.acceptAlert()
}


