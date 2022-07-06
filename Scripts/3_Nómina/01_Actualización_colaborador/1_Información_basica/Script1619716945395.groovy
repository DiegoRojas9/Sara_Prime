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

double random_double = (Math.random() * 9999) + 999

random_double = Math.round(random_double * 1000)

String identificacion = random_double.toString().replace('.0', '')

WebUI.callTestCase(findTestCase('1_Logueo/Logueo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_Nmina'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_Nmina'))

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/input_Filtro_formulario_nominaj_idt495'), 
    '9525222')

WebUI.sendKeys(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/input_Filtro_formulario_nominaj_idt495'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_AGUDELO ARANGO ANDREA_formulario_nominaj_idt5030verCambioEmpleado'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_AGUDELO ARANGO ANDREA_formulario_nominaj_idt5030verCambioEmpleado'))

WebUI.waitForElementClickable(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_Nombres_consultarInformacionBasica_formj_idt311'), 
    GlobalVariable.G_timeout)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_Nombres_consultarInformacionBasica_formj_idt311'))

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/input_Nombres_consultarInformacionBasica_formnombresD'), 
    'ANGELA MARÍA')

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_Nombres_consultarInformacionBasica_formj_idt313'))

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_Aceptar'))

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_Email _consultarInformacionBasica_formj_idt377'))

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/input_Email _consultarInformacionBasica_formemailD'), 
    identificacion + 'angela.mariana@hotmail.com')

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_Email _consultarInformacionBasica_formj_idt379'))

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_Aceptar_1'))

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_Telfono Fijo_consultarInformacionBasica_formj_idt392'))

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/input_Telfono Celular_consultarInformacionBasica_'), 
    '3009998877')

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/input_Telfono Fijo_consultarInformacionBasica_'), 
    '2223344')

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_Telfono Fijo_consultarInformacionBasica_formj_idt394'))

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_Aceptar_2'))

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_Direccin_consultarInformacionBasica_formj_idt402'))

WebUI.setText(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/input_Direccin_consultarInformacionBasica_formdireccionD'), 
    'Av Cll 158 # 57-11 SUR')

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_Direccin_consultarInformacionBasica_formj_idt404'))

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_Aceptar_3'))

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_Estado Civil _consultarInformacionBasica_formj_idt412'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/select_-- Seleccione Estado Civil --CASADO'), 
    '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_Estado Civil _consultarInformacionBasica_formj_idt414'))

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_Aceptar_4'))

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_Grupo sanguneo _consultarInformacionBasica_formj_idt422'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/select_AA-ABAB-BB-OO-'), 
    1)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_Grupo sanguneo _consultarInformacionBasica_formj_idt424'))

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_Aceptar_5'))

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_Nivel acadmico _consultarInformacionBasica_formj_idt432'))

WebUI.selectOptionByIndex(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/select_-- Seleccione Nivel Academico --Bachiller'), 
    '4', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_Nivel acadmico _consultarInformacionBasica_formj_idt434'))

WebUI.click(findTestObject('3_Nómina/1_Actualización_colaborador/1_Información_basica/Page_/a_Aceptar_6'))

String Result = WebUI.getText(findTestObject('Result/p_Resultado'))

if (Result == 'Registro Actualizado') {
    String Resultado = 'PRUEBA  OK'

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

