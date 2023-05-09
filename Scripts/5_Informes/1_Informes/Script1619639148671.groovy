import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL as GLOBAL
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.junit.After as After
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.testng.Assert as Assert
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.io.File as File

String RutaA = WebUI.callTestCase(findTestCase('5_Informes/1_detector_carpeta_downloads'), [:], FailureHandling.STOP_ON_FAILURE)

String rutaA = RutaA

String Archivo = 'Reporte_Maestro_Empleados.xls'

String Archivo1 = 'Reporte_de_historico_de_salario.xls'

System.out.println(rutaA)

WebUI.callTestCase(findTestCase('1.0_Logueo/Logueo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

WebUI.click(findTestObject('1.1_General_Objects/a_Informes'))

WebUI.waitForElementClickable(findTestObject('6_Configuración/5_Informes/a_Ir'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('6_Configuración/5_Informes/a_Ir'))

WebUI.setText(findTestObject('6_Configuración/5_Informes/input_filtroEmpleado'), 'Maestro')

WebUI.sendKeys(findTestObject('6_Configuración/5_Informes/input_filtroEmpleado'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('6_Configuración/5_Informes/td_2 GT - Reporte Programacin'))

WebUI.selectOptionByIndex(findTestObject('6_Configuración/5_Informes/select_Estado Laboral'), 2)

WebUI.click(findTestObject('6_Configuración/5_Informes/radiob_Descargar'))

WebUI.click(findTestObject('6_Configuración/5_Informes/a_Generar'))

if (WebUI.waitForElementVisible(findTestObject('6_Configuración/5_Informes/a_Continuar'), 4)) {
    WebUI.click(findTestObject('6_Configuración/5_Informes/a_Continuar'))
}

WebUI.click(findTestObject('6_Configuración/5_Informes/a_Descargar'))

WebUI.click(findTestObject('6_Configuración/5_Informes/a_Cerrar'))

WebUI.waitForElementNotVisible(findTestObject('6_Configuración/5_Informes/a_Cerrar'), 2)

WebUI.click(findTestObject('6_Configuración/5_Informes/a_ ir Gestion'))

WebUI.click(findTestObject('6_Configuración/5_Informes/a_Numero De Empleados'))

WebUI.setText(findTestObject('6_Configuración/5_Informes/input_Fecha Inicial'), '03/07/2017')

WebUI.setText(findTestObject('6_Configuración/5_Informes/input_Fecha Final'), '10/07/2017')

WebUI.click(findTestObject('6_Configuración/5_Informes/a_Generar'))

WebUI.click(findTestObject('6_Configuración/5_Informes/a_formato'))

WebUI.click(findTestObject('6_Configuración/5_Informes/a_Cerrar'))

WebUI.waitForElementNotVisible(findTestObject('6_Configuración/5_Informes/a_Cerrar'), 2)

WebUI.click(findTestObject('6_Configuración/5_Informes/a_ir Especiales'))

WebUI.click(findTestObject('6_Configuración/5_Informes/a_Cambio De Sueldo Para Validacion De La Base De Sueldo De Cesantias'))

WebUI.setText(findTestObject('6_Configuración/5_Informes/input_Fecha inicial Especiales'), '03/07/2017')

WebUI.sendKeys(findTestObject('6_Configuración/5_Informes/input_Fecha inicial Especiales'), Keys.chord(Keys.ESCAPE))

WebUI.click(findTestObject('6_Configuración/5_Informes/radiob_Descargar'))

WebUI.click(findTestObject('6_Configuración/5_Informes/radiob_Descargar - Copy'))

WebUI.click(findTestObject('6_Configuración/5_Informes/a_Generar'))

WebUI.click(findTestObject('6_Configuración/5_Informes/a_Continuar'))

WebUI.click(findTestObject('6_Configuración/5_Informes/a_Descargar'))

// remove this line if you want to keep the file
if (WebUI.waitForElementClickable(findTestObject('6_Configuración/5_Informes/a_Descargar'), GlobalVariable.G_timeout)) {
    WebUI.waitForElementClickable(findTestObject('6_Configuración/5_Informes/span_Informes_ui-icon ui-icon-closethick'), 
        GlobalVariable.G_timeout)

    WebUI.click(findTestObject('6_Configuración/5_Informes/span_Informes_ui-icon ui-icon-closethick'))
}

Assert.assertTrue(archivoDescargado(rutaA, Archivo, Archivo1))

boolean archivoDescargado(String RutaA, String Archivo, String Archivo1) {
    File dir = new File(RutaA)

    File[] dirContentenidos = dir.listFiles()

    String result0 = '0'

    for (int i = 0; i < dirContentenidos.length; i++) {
        if ((dirContentenidos[i]).getName().equals(Archivo)) {
            (dirContentenidos[i]).delete()
        }
    }
    
    for (int i = 0; i < dirContentenidos.length; i++) {
        if ((dirContentenidos[i]).getName().equals(Archivo1)) {
            (dirContentenidos[i]).delete()

            String ResultF = 'PRUEBA OK'

            WebUI.closeBrowser()

            return true
        }
    }
    
    return false
    
    WebUI.acceptAlert()
}

