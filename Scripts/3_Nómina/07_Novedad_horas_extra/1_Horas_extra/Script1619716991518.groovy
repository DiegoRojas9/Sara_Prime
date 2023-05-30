import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import ch.qos.logback.core.joran.conditional.ElseAction as ElseAction
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

String mensaje = ''

boolean table = false

def fila

WebUI.callTestCase(findTestCase('1.0_Logueo/Logueo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

WebUI.waitForElementClickable(findTestObject('1.1_General_Objects/a_Nmina'), GlobalVariable.G_timeout)

WebUI.click(findTestObject('1.1_General_Objects/a_Nmina'))

if (WebUI.waitForElementVisible(findTestObject('1.1_General_Objects/a_Reversar confirmacion'), 1)) {
    WebUI.click(findTestObject('1.1_General_Objects/a_Reversar confirmacion'))

    WebUI.click(findTestObject('1.1_General_Objects/a_Aceptar'))
}
verifiTablero(table)

if(verifiTablero(table)== true) {
table= true
	}
println(table)



if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 0'), 1) || 
	table== true
) {
    if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 0'), 1)) {
        
            verMas(fila)

            selectIcon(fila, mensaje) 
        } else {
        selectIcon(fila, mensaje)
    }
} else {
    WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_2'))
	
	
	if(verifiTablero(table)== true) {
		table == true
	}
	
	println(table)
	

    if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 0'), 1) || 
		table== true
    ) {
        if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 0'), 1)) {
            verMas(fila)

            selectIcon(fila, mensaje)
        } else {
            selectIcon(fila, mensaje)
        }
    } else {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_3'))
		
		verifiTablero(table)
		
		if(verifiTablero(table)== true) {
		table= true
			}
		println(table)


        if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 0'), 
            1) ||table==true) {
            if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 0'), 1)) {
                if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 0'), 
                    1)) {
                    verMas(fila)

                    selectIcon(fila, mensaje)
                } else {
                    selectIcon(fila, mensaje)
                }
            }
        } else {
            WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_4'))
			
			verifiTablero(table)
			if(verifiTablero(table)== true) {
				table= true
					}
				println(table)
				
			println(table)

            if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 0'), 
                1)|| table==true) {
                if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 0'), 
                    1)) {
                    verMas(fila)

                    selectIcon(fila, mensaje)
                } else {
                    selectIcon(fila, mensaje)
                }
            } else {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_5'))
				
				verifiTablero(table)
				
				if(verifiTablero(table)== true) {
				table= true
					}
				println(table)


                if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 0'), 
                    1) || table == true) {
                    if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 0'), 
                        1)) {
                        verMas(fila)

                        selectIcon(fila, mensaje)
                    } else {
                        selectIcon(fila, mensaje)
                    }
                } else {					
                    WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_1'))

                    selectIcon(fila, mensaje)
                }
            }
        }
    }
}

def selectIcon(def fila, def mensaje) {
    if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina'), 
        1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina'))

        fila = 'Fila-1'
    } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 1'), 
        1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 1'))

        fila = 'Fila-2'
    } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 2'), 
        1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 2'))

        fila = 'Fila-3'
    } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 3'), 
        1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 3'))

        fila = 'Fila-4'
    } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 4'), 
        1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 4'))

        fila = 'Fila-5'
    } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 5'), 
        1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 5'))

        fila = 'Fila-6'
    } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 6'), 
        1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 6'))

        fila = 'Fila-7'
    } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 7'), 
        1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 7'))

        fila = 'Fila-8'
    } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 8'), 
        1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 8'))

        fila = 'Fila-9'
    } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 9'), 
        1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 9'))

        fila = 'Fila-10'
    } else {
        mensaje = 'no se encontro el icono de horas extra en pagina 1'

        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_2'))

        if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina'), 
            1)) {
            WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina'))

            fila = 'Fila-1'
        } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 1'), 
            1)) {
            WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 1'))

            fila = 'Fila-2'
        } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 2'), 
            1)) {
            WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 2'))

            fila = 'Fila-3'
        } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 3'), 
            1)) {
            WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 3'))

            fila = 'Fila-4'
        } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 4'), 
            1)) {
            WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 4'))

            fila = 'Fila-5'
        } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 5'), 
            1)) {
            WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 5'))

            fila = 'Fila-6'
        } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 6'), 
            1)) {
            WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 6'))

            fila = 'Fila-7'
        } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 7'), 
            1)) {
            WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 7'))

            fila = 'Fila-8'
        } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 8'), 
            1)) {
            WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 8'))

            fila = 'Fila-9'
        } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 9'), 
            1)) {
            WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 9'))

            fila = 'Fila-10'
        } else {
            WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_3'))

            if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina'))

                fila = 'Fila-1'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 1'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 1'))

                fila = 'Fila-2'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 2'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 2'))

                fila = 'Fila-3'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 3'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 3'))

                fila = 'Fila-4'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 4'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 4'))

                fila = 'Fila-5'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 5'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 5'))

                fila = 'Fila-6'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 6'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 6'))

                fila = 'Fila-7'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 7'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 7'))

                fila = 'Fila-8'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 8'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 8'))

                fila = 'Fila-9'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 9'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 9'))

                fila = 'Fila-10'
            } else {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_4'))

                if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina'), 
                    1)) {
                    WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina'))

                    fila = 'Fila-1'
                } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 1'), 
                    1)) {
                    WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 1'))

                    fila = 'Fila-2'
                } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 2'), 
                    1)) {
                    WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 2'))

                    fila = 'Fila-3'
                } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 3'), 
                    1)) {
                    WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 3'))

                    fila = 'Fila-4'
                } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 4'), 
                    1)) {
                    WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 4'))

                    fila = 'Fila-5'
                } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 5'), 
                    1)) {
                    WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 5'))

                    fila = 'Fila-6'
                } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 6'), 
                    1)) {
                    WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 6'))

                    fila = 'Fila-7'
                } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 7'), 
                    1)) {
                    WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 7'))

                    fila = 'Fila-8'
                } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 8'), 
                    1)) {
                    WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 8'))

                    fila = 'Fila-9'
                } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 9'), 
                    1)) {
                    WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 9'))

                    fila = 'Fila-10'
                } else {
                    WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_5'))

                    if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina'), 
                        1)) {
                        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina'))

                        fila = 'Fila-1'
                    } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 1'), 
                        1)) {
                        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 1'))

                        fila = 'Fila-2'
                    } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 2'), 
                        1)) {
                        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 2'))

                        fila = 'Fila-3'
                    } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 3'), 
                        1)) {
                        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 3'))

                        fila = 'Fila-4'
                    } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 4'), 
                        1)) {
                        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 4'))

                        fila = 'Fila-5'
                    } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 5'), 
                        1)) {
                        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 5'))

                        fila = 'Fila-6'
                    } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 6'), 
                        1)) {
                        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 6'))

                        fila = 'Fila-7'
                    } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 7'), 
                        1)) {
                        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 7'))

                        fila = 'Fila-8'
                    } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 8'), 
                        1)) {
                        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 8'))

                        fila = 'Fila-9'
                    } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 9'), 
                        1)) {
                        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 9'))

                        fila = 'Fila-10'
                    } else {
                        WebUI.acceptAlert()
                    }
                }
            }
        }
    }
    
    if ((((((((((fila == 'Fila-1') || (fila == 'Fila-2')) || (fila == 'Fila-3')) || (fila == 'Fila-4')) || (fila == 'Fila-5')) || 
    (fila == 'Fila-6')) || (fila == 'Fila-7')) || (fila == 'Fila-8')) || (fila == 'Fila-9')) || ((fila == 'Fila-10') && 
    println(fila))) {
        WebUI.setText(findTestObject('3_Nómina/7_Novedad_horas_extra/input_COMISIONES_popup_agregarNovedadConceptotabla0valor'), 
            '100000')

        WebUI.setText(findTestObject('3_Nómina/7_Novedad_horas_extra/input_AUXILIO DE MOVILIZACION_popup_valor'), '200000')

        WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/input_AUXILIO DE MOVILIZACION_fechainicial_input'), 
            GlobalVariable.G_timeout)

        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/input_AUXILIO DE MOVILIZACION_fechainicial_input'))

        WebUI.setText(findTestObject('3_Nómina/7_Novedad_horas_extra/input_AUXILIO DE MOVILIZACION_fechainicial_input'), 
            '05/03/2021')

        WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/input_Obligatorio_popup_fechafinal_input'), 
            GlobalVariable.G_timeout)

        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/input_Obligatorio_popup_fechafinal_input'))

        WebUI.setText(findTestObject('3_Nómina/7_Novedad_horas_extra/input_Obligatorio_popup_fechafinal_input'), '10/04/2021')

        WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/a_Aplicar'), GlobalVariable.G_timeout)

        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_Aplicar'))

        String Result = ''

        if (WebUI.waitForElementVisible(findTestObject('Result/p_Resultado'), 0)) {
            Result = WebUI.getText(findTestObject('Result/p_Resultado'))
        }
        
        if (Result == 'Registro guardado') {
            String Resultado = 'PRUEBA OK'

            if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/a_Aceptar'), 1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_Aceptar'))
            }
            
            WebUI.closeBrowser()
        } else {
            WebUI.acceptAlert()
        }
    }
    
    return fila
}

def verMas(def fila) {
    if (WebUI.waitForElementVisible(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms'), 1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms'))

        fila = 'fila1'
    } else if (WebUI.waitForElementVisible(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 1'), 1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 1'))

        fila = 'fila2'
    } else if (WebUI.waitForElementVisible(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 2'), 1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 2'))

        fila = 'fila3'
    } else if (WebUI.waitForElementVisible(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 3'), 1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 3'))

        fila = 'fila4'
    } else if (WebUI.waitForElementVisible(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 4'), 1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 4'))

        fila = 'fila5'
    } else if (WebUI.waitForElementVisible(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 5'), 1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 5'))

        fila = 'fila6'
    } else if (WebUI.waitForElementVisible(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 6'), 1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 6'))

        fila = 'fila7'
    } else if (WebUI.waitForElementVisible(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 7'), 1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 7'))

        fila = 'fila8'
    } else if (WebUI.waitForElementVisible(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 8'), 1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 8'))

        fila = 'fila9'
    } else if (WebUI.waitForElementVisible(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 9'), 1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 9'))

        fila = 'fila10'
    } else if (WebUI.waitForElementVisible(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 10'), 1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 10'))

        fila = 'fila11'
    } else if (WebUI.waitForElementVisible(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 11'), 1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 11'))

        fila = 'fila12'
    } else if (WebUI.waitForElementVisible(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 12'), 1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 12'))

        fila = 'fila13'
    } else if (WebUI.waitForElementVisible(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 13'), 1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 13'))

        fila = 'fila14'
    } else if (WebUI.waitForElementVisible(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 14'), 1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 14'))

        fila = 'fila15'
    } else if (WebUI.waitForElementVisible(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 15'), 1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 15'))

        fila = 'fila16'
    } else if (WebUI.waitForElementVisible(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 16'), 1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 16'))

        fila = 'fila17'
    } else if (WebUI.waitForElementVisible(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 17'), 1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 17'))

        fila = 'fila18'
    } else if (WebUI.waitForElementVisible(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 18'), 1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 18'))

        fila = 'fila19'
    } else if (WebUI.waitForElementVisible(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 19'), 1)) {
        WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 19'))

        fila = 'fila20'
    }
    
    if ((((((((((((((((((((fila == 'fila1') || (fila == 'fila2')) || (fila == 'fila3')) || (fila == 'fila4')) || (fila == 
    'fila5')) || (fila == 'fila6')) || (fila == 'fila7')) || (fila == 'fila8')) || (fila == 'fila9')) || (fila == 'fila10')) || 
    (fila == 'fila11')) || (fila == 'fila12')) || (fila == 'fila13')) || (fila == 'fila14')) || (fila == 'fila15')) || (fila == 
    'fila16')) || (fila == 'fila17')) || (fila == 'fila18')) || (fila == 'fila19')) || (fila == 'fila20')) {
        while (fila != '') {
            if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/a_AUXILIO DE MOVILIZACION_popupDetalleNovedades'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_AUXILIO DE MOVILIZACION_popupDetalleNovedades'))

                WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/a_Aceptar'), GlobalVariable.G_timeout)

                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_Aceptar'))
            }
            
            if (WebUI.waitForElementClickable(findTestObject('1.1_General_Objects/a_AUXILIO DE MOVILIZACION_popupDetalleNovedadesj_idt17530j_idt1765'), 
                1)) {
                WebUI.click(findTestObject('1.1_General_Objects/a_AUXILIO DE MOVILIZACION_popupDetalleNovedadesj_idt17530j_idt1765'))

                WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/a_Aceptar'), GlobalVariable.G_timeout)

                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_Aceptar'))

                WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/a_Cerrar'), GlobalVariable.G_timeout)

                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_Cerrar'))
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/a_Cerrar'), 1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/a_Cerrar'))
            }
            
            if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms'), 1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms'))

                fila = 'fila1'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 1'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 1'))

                fila = 'fila2'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 2'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 2'))

                fila = 'fila3'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 3'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 3'))

                fila = 'fila4'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 4'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 4'))

                fila = 'fila5'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 5'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 5'))

                fila = 'fila6'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 6'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 6'))

                fila = 'fila7'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 7'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 7'))

                fila = 'fila8'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 8'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 8'))

                fila = 'fila9'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 9'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 9'))

                fila = 'fila10'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 10'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 10'))

                fila = 'fila11'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 11'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 11'))

                fila = 'fila12'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 12'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 12'))

                fila = 'fila13'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 13'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 13'))

                fila = 'fila14'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 14'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 14'))

                fila = 'fila15'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 15'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 15'))

                fila = 'fila16'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 16'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 16'))

                fila = 'fila17'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 17'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 17'))

                fila = 'fila18'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 18'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 18'))

                fila = 'fila19'
            } else if (WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 19'), 
                1)) {
                WebUI.click(findTestObject('3_Nómina/7_Novedad_horas_extra/ver_mas/a_ ver ms - 19'))

                fila = 'fila20'
            } else {
                break
            }
        }
    }
}

def verifiTablero(def table) {
	if(
    WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina'), 
        1)||

    WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 1'), 
        1)||

    WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 2'), 
        1)||

    WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 3'), 
        1)||

    WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 4'), 
        1)||

    WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 5'), 
        1)||

    WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 6'), 
        1)||

    WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 7'), 
        1)||

    WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 8'), 
        1)||

    WebUI.waitForElementClickable(findTestObject('3_Nómina/7_Novedad_horas_extra/icons/a_Fecha 10022021_formulario_nominaj_ConceptosNomina - 9'), 
        1)) {return table=true}
		println(table)
}

