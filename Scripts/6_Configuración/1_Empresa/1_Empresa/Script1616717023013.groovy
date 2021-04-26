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

WebUI.waitForElementClickable(findTestObject('6_Configuración/1_Empresa/Page_/a_Configuracin'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/1_Empresa/Page_/a_Configuracin'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/1_Empresa/Page_/a_'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/1_Empresa/Page_/a_'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/1_Empresa/Page_/input_Seleccionar Archivo_j_idt888subir'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/1_Empresa/Page_/input_Seleccionar Archivo_j_idt888subir'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/1_Empresa/Page_/a_Union Soluciones 2019_ui-dialog-titlebar-close'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/1_Empresa/Page_/a_Union Soluciones 2019_ui-dialog-titlebar-close'))

//WebUI.waitForElementClickable(findTestObject('Page_/Configuración_Empresa1.1/PrimeFace/Page_/select_-- Seleccione --ARL -'),  GlobalVariable.G_timeout)
//WebUI.click(findTestObject('Page_/Configuración_Empresa1.1/PrimeFace/Page_/select_-- Seleccione --ARL -'))
int max = WebUI.getNumberOfTotalOption(findTestObject('6_Configuración/1_Empresa/Page_/select_-- Seleccione --Arl - Colmena Riesgos ProfesionalesArl'))

double random_double = (Math.random() * max) + 1

random_double = Math.round(random_double)

int indice = Integer.parseInt(random_double.toString().replace('.0', ''))

System.out.println(indice)

if (indice > max) {
    indice = 1
}

WebUI.selectOptionByIndex(findTestObject('6_Configuración/1_Empresa/Page_/select_-- Seleccione --Arl - Colmena Riesgos ProfesionalesArl'), 
    indice.toString())

try {
    WebUI.waitForElementClickable(findTestObject('6_Configuración/1_Empresa/Page_/input_Fecha Afiliacin_form_informacionEmpresafechaAfiliacion_input'), 
        GlobalVariable.G_timeout, FailureHandling.CONTINUE_ON_FAILURE)
}
catch (Exception e) {
    random_double = ((Math.random() * max) + 1)

    random_double = Math.round(random_double)

    indice = Integer.parseInt(random_double.toString().replace('.0', ''))

    if (indice > max) {
        indice = 1
    }
    
    WebUI.selectOptionByIndex(findTestObject('6_Configuración/1_Empresa/Page_/select_-- Seleccione --Arl - Colmena Riesgos ProfesionalesArl'), 
        indice.toString())
} 

//WebUI.waitForElementClickable(findTestObject('Page_/Configuración_Empresa1.1/PrimeFace/Page_/label_Informacin Empresa'), GlobalVariable.G_timeout)
//WebUI.click(findTestObject('Page_/Configuración_Empresa1.1/PrimeFace/Page_/label_Informacin Empresa'))
//WebUI.delay(2)
//WebUI.waitForElementClickable(findTestObject('Page_/Configuración_Empresa1.1/PrimeFace/Page_/input_Fecha Afiliacin_form_informacionEmpresafechaAfiliacion_input'), GlobalVariable.G_timeout)
WebUI.click(findTestObject('6_Configuración/1_Empresa/Page_/input_Fecha Afiliacin_form_informacionEmpresafechaAfiliacion_input'))

WebUI.setText(findTestObject('6_Configuración/1_Empresa/Page_/input_Fecha Afiliacin_form_informacionEmpresafechaAfiliacion_input'), 
    '30/12/2020')

//WebUI.selectOptionByIndex(findTestObject('Page_/Configuración_Empresa1.1/PrimeFace/Page_/select_-- Seleccione --NO RELACIONADAPAGO'), 
//    7)
WebUI.waitForElementClickable(findTestObject('6_Configuración/1_Empresa/Page_/a_Guardar'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/1_Empresa/Page_/a_Guardar'))

WebUI.closeBrowser()

