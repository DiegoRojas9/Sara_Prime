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

WebUI.waitForElementClickable(findTestObject('3_Nómina/10_Provisiones/a_Nmina'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/10_Provisiones/a_Nmina'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/10_Provisiones/a_Provisiones'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/10_Provisiones/a_Provisiones'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/10_Provisiones/a_Histrico Provisiones'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/10_Provisiones/a_Histrico Provisiones'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/10_Provisiones/select_Seleccione20212020'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/10_Provisiones/select_Seleccione20212020'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/10_Provisiones/select_Seleccione20212020'), 1)

WebUI.waitForElementClickable(findTestObject('3_Nómina/10_Provisiones/select_SeleccioneEneroFebreroMarzo'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/10_Provisiones/select_SeleccioneEneroFebreroMarzo'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/10_Provisiones/select_SeleccioneEneroFebreroMarzo'), 2)

WebUI.waitForElementClickable(findTestObject('3_Nómina/10_Provisiones/a_Descripcin_imagenMiniBuscar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/10_Provisiones/a_Descripcin_imagenMiniBuscar'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/10_Provisiones/td_CAUSACION DE CESANTIAS'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/10_Provisiones/td_CAUSACION DE CESANTIAS'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/10_Provisiones/td_BALLESTEROS RIOS ANGELA MARA'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/10_Provisiones/td_BALLESTEROS RIOS ANGELA MARA'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/10_Provisiones/td_CAUSACION DE INTERESCESANTIA'), GlobalVariable.G_timeout, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('3_Nómina/10_Provisiones/td_CAUSACION DE INTERESCESANTIA'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/10_Provisiones/td_BALLESTEROS RIOS ANGELA MARA'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/10_Provisiones/td_BALLESTEROS RIOS ANGELA MARA'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/10_Provisiones/td_CAUSACION DE PRIMA LEGAL'), GlobalVariable.G_timeout, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('3_Nómina/10_Provisiones/td_CAUSACION DE PRIMA LEGAL'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/10_Provisiones/td_BALLESTEROS RIOS ANGELA MARA'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/10_Provisiones/td_BALLESTEROS RIOS ANGELA MARA'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/10_Provisiones/td_CAUSACION DE VACACIONES'), GlobalVariable.G_timeout, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('3_Nómina/10_Provisiones/td_CAUSACION DE VACACIONES'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/10_Provisiones/td_BALLESTEROS RIOS ANGELA MARA'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/10_Provisiones/td_BALLESTEROS RIOS ANGELA MARA'))

WebUI.closeBrowser()

