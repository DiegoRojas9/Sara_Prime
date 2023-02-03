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

String Result = ''

WebUI.callTestCase(findTestCase('1.0_Logueo/Logueo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1.1_General_Objects/a_Menu General'))

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Colaboradores'))

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/span_Activos'))

WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_ACTIVO_listadoEmpleadoPrime_formtablaEmpleados0j_idt285'))

if (WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/input_Fecha ultimo da Laborado'), 
    1)) {
    WebUI.setText(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/input_Fecha ultimo da Laborado'), 
        '28/10/2021')

    WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/select_-- Seleccione --FALLECIMIENTOJUSTA'), 
        '4', FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aplicar Retiro'))

    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar'))

    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'))

    if (WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'), 
        1)) {
        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_No'))
    }
    
    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Continuar'))

    if (WebUI.waitForElementVisible(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'), 
        1)) {
        if (WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'))) {
        }
    }
    
    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Cancelar proceso'), 
        GlobalVariable.G_timeout)

    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Cancelar proceso'))

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'), 
        GlobalVariable.G_timeout)

    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'))

    Result = WebUI.getText(findTestObject('Result/p_Resultado'))

    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Regresar'))

    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/span_Activos'), 
        GlobalVariable.G_timeout)
} else {
    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_ACTIVO_listadoEmpleadoPrime_formtablaEmpleados1j_idt284'))

    if (WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/input_Fecha ultimo da Laborado'), 
        1)) {
        WebUI.setText(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/input_Fecha ultimo da Laborado'), 
            '28/10/2021')

        WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/select_-- Seleccione --FALLECIMIENTOJUSTA'), 
            '4', FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aplicar Retiro'))

        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar'))

        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'))

        if (WebUI.waitForElementVisible(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'), 
            1)) {
            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_No'))
        }
        
        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Continuar'))

        if (WebUI.waitForElementVisible(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_2'), 
            1)) {
            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_2'))
        }
        
        WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Cancelar proceso'), 
            GlobalVariable.G_timeout)

        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Cancelar proceso'))

        WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'), 
            GlobalVariable.G_timeout)

        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'))

        Result = WebUI.getText(findTestObject('Result/p_Resultado'))

        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Regresar'))

        WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/span_Activos'), 
            GlobalVariable.G_timeout)
    } else {
        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_ACTIVO_listadoEmpleadoPrime_formtablaEmpleados2j_idt285'))

        if (WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/input_Fecha ultimo da Laborado'), 
            1)) {
            WebUI.setText(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/input_Fecha ultimo da Laborado'), 
                '28/10/2021')

            WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/select_-- Seleccione --FALLECIMIENTOJUSTA'), 
                '4', FailureHandling.STOP_ON_FAILURE)

            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aplicar Retiro'))

            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar'))

            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'))

            if (WebUI.waitForElementVisible(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'), 
                1)) {
                WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_No'))
            }
            
            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Continuar'))

            WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Cancelar proceso'), 
                GlobalVariable.G_timeout)

            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Cancelar proceso'))

            WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'), 
                GlobalVariable.G_timeout)

            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'))

            Result = WebUI.getText(findTestObject('Result/p_Resultado'))

            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Regresar'))

            WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/span_Activos'), 
                GlobalVariable.G_timeout)
        } else {
            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_ACTIVO_listadoEmpleadoPrime_formtablaEmpleados3j_idt285'))

            if (WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/input_Fecha ultimo da Laborado'), 
                1)) {
                WebUI.setText(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/input_Fecha ultimo da Laborado'), 
                    '28/10/2021')

                WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/select_-- Seleccione --FALLECIMIENTOJUSTA'), 
                    '4', FailureHandling.STOP_ON_FAILURE)

                WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aplicar Retiro'))

                WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar'))

                WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'))

                if (WebUI.waitForElementVisible(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'), 
                    1)) {
                    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_No'))
                }
                
                WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Continuar'))

                WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Cancelar proceso'), 
                    GlobalVariable.G_timeout)

                WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Cancelar proceso'))

                WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'), 
                    GlobalVariable.G_timeout)

                WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'))

                Result = WebUI.getText(findTestObject('Result/p_Resultado'))

                WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Regresar'))

                WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/span_Activos'), 
                    GlobalVariable.G_timeout)
            } else {
                WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_ACTIVO_listadoEmpleadoPrime_formtablaEmpleados4j_idt285'))

                if (WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/input_Fecha ultimo da Laborado'), 
                    1)) {
                    WebUI.setText(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/input_Fecha ultimo da Laborado'), 
                        '28/10/2021')

                    WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/select_-- Seleccione --FALLECIMIENTOJUSTA'), 
                        '4', FailureHandling.STOP_ON_FAILURE)

                    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aplicar Retiro'))

                    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar'))

                    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'))

                    if (WebUI.waitForElementVisible(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'), 
                        1)) {
                        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_No'))
                    }
                    
                    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Continuar'))

                    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Cancelar proceso'), 
                        GlobalVariable.G_timeout)

                    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Cancelar proceso'))

                    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'), 
                        GlobalVariable.G_timeout)

                    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'))

                    Result = WebUI.getText(findTestObject('Result/p_Resultado'))

                    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Regresar'))

                    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/span_Activos'), 
                        GlobalVariable.G_timeout)
                } else {
                    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_ACTIVO_listadoEmpleadoPrime_formtablaEmpleados5j_idt285'))

                    if (WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/input_Fecha ultimo da Laborado'), 
                        1)) {
                        WebUI.setText(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/input_Fecha ultimo da Laborado'), 
                            '28/10/2021')

                        WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/select_-- Seleccione --FALLECIMIENTOJUSTA'), 
                            '4', FailureHandling.STOP_ON_FAILURE)

                        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aplicar Retiro'))

                        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar'))

                        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'))

                        if (WebUI.waitForElementVisible(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'), 
                            1)) {
                            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_No'))
                        }
                        
                        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Continuar'))

                        WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Cancelar proceso'), 
                            GlobalVariable.G_timeout)

                        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Cancelar proceso'))

                        WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'), 
                            GlobalVariable.G_timeout)

                        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'))

                        Result = WebUI.getText(findTestObject('Result/p_Resultado'))

                        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Regresar'))

                        WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/span_Activos'), 
                            GlobalVariable.G_timeout)
                    } else {
                        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_ACTIVO_listadoEmpleadoPrime_formtablaEmpleados6j_idt284'))

                        if (WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/input_Fecha ultimo da Laborado'), 
                            1)) {
                            WebUI.setText(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/input_Fecha ultimo da Laborado'), 
                                '28/10/2021')

                            WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/select_-- Seleccione --FALLECIMIENTOJUSTA'), 
                                '4', FailureHandling.STOP_ON_FAILURE)

                            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aplicar Retiro'))

                            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar'))

                            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'))

                            if (WebUI.waitForElementVisible(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'), 
                                1)) {
                                WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_No'))
                            }
                            
                            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Continuar'))

                            WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Cancelar proceso'), 
                                GlobalVariable.G_timeout)

                            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Cancelar proceso'))

                            WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'), 
                                GlobalVariable.G_timeout)

                            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'))

                            Result = WebUI.getText(findTestObject('Result/p_Resultado'))

                            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Regresar'))

                            WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/span_Activos'), 
                                GlobalVariable.G_timeout)
                        } else {
                            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_ACTIVO_listadoEmpleadoPrime_formtablaEmpleados7j_idt284'))

                            if (WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/input_Fecha ultimo da Laborado'), 
                                1)) {
                                WebUI.setText(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/input_Fecha ultimo da Laborado'), 
                                    '28/10/2021')

                                WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/select_-- Seleccione --FALLECIMIENTOJUSTA'), 
                                    '4', FailureHandling.STOP_ON_FAILURE)

                                WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aplicar Retiro'))

                                WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar'))

                                WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'))

                                if (WebUI.waitForElementVisible(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'), 
                                    1)) {
                                    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_No'))
                                }
                                
                                WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Continuar'))

                                WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Cancelar proceso'), 
                                    GlobalVariable.G_timeout)

                                WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Cancelar proceso'))

                                WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'), 
                                    GlobalVariable.G_timeout)

                                Result = WebUI.getText(findTestObject('Result/p_Resultado'))

                                WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'))

                                WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Regresar'))

                                WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/span_Activos'), 
                                    GlobalVariable.G_timeout)
                            } else {
                                WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_EN PROCESO DE LIQUIDACION_listadoEmpleadoPrime_formtablaEmpleados8j_idt285'))

                                if (WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/input_Fecha ultimo da Laborado'), 
                                    1)) {
                                    WebUI.setText(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/input_Fecha ultimo da Laborado'), 
                                        '28/10/2021')

                                    WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/select_-- Seleccione --FALLECIMIENTOJUSTA'), 
                                        '4', FailureHandling.STOP_ON_FAILURE)

                                    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aplicar Retiro'))

                                    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar'))

                                    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'))

                                    if (WebUI.waitForElementVisible(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'), 
                                        1)) {
                                        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_No'))
                                    }
                                    
                                    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Continuar'))

                                    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Cancelar proceso'), 
                                        GlobalVariable.G_timeout)

                                    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Cancelar proceso'))

                                    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'), 
                                        GlobalVariable.G_timeout)

                                    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'))

                                    Result = WebUI.getText(findTestObject('Result/p_Resultado'))

                                    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Regresar'))

                                    WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/span_Activos'), 
                                        GlobalVariable.G_timeout)
                                } else {
                                    WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_ACTIVO_listadoEmpleadoPrime_formtablaEmpleados10j_idt284'))

                                    if (WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/input_Fecha ultimo da Laborado'), 
                                        1)) {
                                        WebUI.setText(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/input_Fecha ultimo da Laborado'), 
                                            '28/10/2021')

                                        WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/select_-- Seleccione --FALLECIMIENTOJUSTA'), 
                                            '4', FailureHandling.STOP_ON_FAILURE)

                                        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aplicar Retiro'))

                                        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar'))

                                        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'))

                                        if (WebUI.waitForElementVisible(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'), 
                                            1)) {
                                            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_No'))
                                        }
                                        
                                        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Continuar'))

                                        WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Cancelar proceso'), 
                                            GlobalVariable.G_timeout)

                                        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Cancelar proceso'))

                                        WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'), 
                                            GlobalVariable.G_timeout)

                                        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'))

                                        Result = WebUI.getText(findTestObject('Result/p_Resultado'))

                                        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Regresar'))

                                        WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/span_Activos'), 
                                            GlobalVariable.G_timeout)
                                    } else {
                                        WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_ACTIVO_listadoEmpleadoPrime_formtablaEmpleados11j_idt285'))

                                        if (WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/input_Fecha ultimo da Laborado'), 
                                            1)) {
                                            WebUI.setText(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/input_Fecha ultimo da Laborado'), 
                                                '28/10/2021')

                                            WebUI.selectOptionByIndex(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/select_-- Seleccione --FALLECIMIENTOJUSTA'), 
                                                '4', FailureHandling.STOP_ON_FAILURE)

                                            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aplicar Retiro'))

                                            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar'))

                                            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'))

                                            if (WebUI.waitForElementVisible(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Si'), 
                                                1)) {
                                                WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_No'))
                                            }
                                            
                                            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Continuar'))

                                            WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Cancelar proceso'), 
                                                GlobalVariable.G_timeout)

                                            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Cancelar proceso'))

                                            WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'), 
                                                GlobalVariable.G_timeout)

                                            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Aceptar_1'))

                                            Result = WebUI.getText(findTestObject('Result/p_Resultado'))

                                            WebUI.click(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/a_Regresar'))

                                            WebUI.waitForElementClickable(findTestObject('2_Colaboradores/2_Retiro_colaborador/1_Retirar_y_cancelar/span_Activos'), 
                                                GlobalVariable.G_timeout)
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

if (Result == 'Reversado correctamente.') {
    String Resultado = 'PRUEBA  OK'

    WebUI.closeBrowser()
} else {
    WebUI.acceptAlert()
}

