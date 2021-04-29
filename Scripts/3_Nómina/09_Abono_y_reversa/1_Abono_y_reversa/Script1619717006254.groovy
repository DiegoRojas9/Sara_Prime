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

WebUI.waitForElementClickable(findTestObject('Page_/Pago_Reversa_Nomina1.1/PrimeFace/Page_/a_Nmina_NV'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Pago_Reversa_Nomina1.1/PrimeFace/Page_/a_Nmina_NV'))

WebUI.waitForElementClickable(findTestObject('Page_/Pago_Reversa_Nomina1.1/PrimeFace/Page_/a_Aprobar Nmina'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Pago_Reversa_Nomina1.1/PrimeFace/Page_/a_Aprobar Nmina'))

WebUI.waitForElementClickable(findTestObject('Page_/Pago_Reversa_Nomina1.1/PrimeFace/Page_/a_AceptarAprobar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Pago_Reversa_Nomina1.1/PrimeFace/Page_/a_AceptarAprobar'))

WebUI.waitForElementClickable(findTestObject('Page_/Pago_Reversa_Nomina1.1/PrimeFace/Page_/a_Abonar Periodo'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Pago_Reversa_Nomina1.1/PrimeFace/Page_/a_Abonar Periodo'))

WebUI.waitForElementClickable(findTestObject('Page_/Pago_Reversa_Nomina1.1/PrimeFace/Page_/a_AceptarAbono'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Pago_Reversa_Nomina1.1/PrimeFace/Page_/a_AceptarAbono'))

WebUI.waitForElementClickable(findTestObject('Page_/Pago_Reversa_Nomina1.1/PrimeFace/Page_/a_Nmina_1'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Pago_Reversa_Nomina1.1/PrimeFace/Page_/a_Nmina_1'))

WebUI.waitForElementClickable(findTestObject('Page_/Pago_Reversa_Nomina1.1/PrimeFace/Page_/a_Archivo Para Pagos'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Pago_Reversa_Nomina1.1/PrimeFace/Page_/a_Archivo Para Pagos'))

WebUI.waitForElementClickable(findTestObject('Page_/Pago_Reversa_Nomina1.1/PrimeFace/Page_/a_Reversar Abono'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Pago_Reversa_Nomina1.1/PrimeFace/Page_/a_Reversar Abono'))

WebUI.waitForElementClickable(findTestObject('Page_/Pago_Reversa_Nomina1.1/PrimeFace/Page_/a_AceptarReAbon'), GlobalVariable.G_TimeShort)

WebUI.click(findTestObject('Page_/Pago_Reversa_Nomina1.1/PrimeFace/Page_/a_AceptarReAbon'))

WebUI.waitForElementClickable(findTestObject('Page_/Pago_Reversa_Nomina1.1/PrimeFace/Page_/a_Nmina_1'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Pago_Reversa_Nomina1.1/PrimeFace/Page_/a_Nmina_1'))

WebUI.waitForElementClickable(findTestObject('Page_/Pago_Reversa_Nomina1.1/PrimeFace/Page_/a_Reversar Confirmacin'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Pago_Reversa_Nomina1.1/PrimeFace/Page_/a_Reversar Confirmacin'))

WebUI.waitForElementClickable(findTestObject('Page_/Pago_Reversa_Nomina1.1/PrimeFace/Page_/a_AceptarReApro'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('Page_/Pago_Reversa_Nomina1.1/PrimeFace/Page_/a_AceptarReApro'))

WebUI.closeBrowser()