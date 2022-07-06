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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.sun.org.apache.bcel.internal.generic.RETURN

import groovy.json.internal.ReaderCharacterSource
import internal.GlobalVariable
import net.sf.jasperreports.engine.ReturnValue

import org.junit.After as After
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.testng.Assert as Assert
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.io.File
import java.nio.file.DirectoryStream.Filter

String ruta1 = "../"
String ruta2 = "../../"
String ruta3 = "../../../"
String ruta4 = "../../../../"
String fichero=new File(ruta1);
String fichero1=new File(ruta2);
String fichero2=new File(ruta3);
String fichero3=new File(ruta4);
String Carpeta = "Downloads"
String RutaA  = ""
String ResultF = ""
String Archivo = '2_GT_-_Reporte_Programación.xls'

def prueba ( ruta1,fichero,Carpeta,RutaA) {
	
	File dir = new File(fichero)
	File[] dirContents=dir.listFiles()
	System.out.println(dirContents)
	for(int i= 0;i< dirContents.length;i++) {
		if (dirContents[i].getName().equals(Carpeta)) {
			
			if (dirContents[i].isDirectory()) {
				System.out.println(fichero +"Downloads")
				String Resultado = (fichero + "\\Downloads")
				System.out.println('Es una carpeta ', Resultado)
				RutaA =Resultado
				return RutaA
			}
			 return true
		}
	}
	return false
	
}
def prueba1 ( ruta2,fichero1,Carpeta, RutaA) {
	
	File dir = new File(fichero1)
	File[] dirContents=dir.listFiles()
	System.out.println(dirContents)
	for(int i= 0;i< dirContents.length;i++) {
		if (dirContents[i].getName().equals(Carpeta)) {
			
			if (dirContents[i].isDirectory()) {
				System.out.println(fichero1 +"Downloads")
				String Resultado = (fichero1 + "\\Downloads")
				System.out.println('Es una carpeta ', Resultado)
				RutaA = Resultado
				return RutaA
			}
			
		}
	}
	return false
	
}
def prueba2 ( ruta3,fichero2,Carpeta,RutaA) {
	
	File dir = new File(fichero2)
	File[] dirContents=dir.listFiles()
	System.out.println(dirContents)
	for(int i= 0;i< dirContents.length;i++) {
		if (dirContents[i].getName().equals(Carpeta)) {
			
			if (dirContents[i].isDirectory()) {
				System.out.println(fichero2 +"Downloads")
				String Resultado = (fichero2 + "\\Downloads")
				System.out.println('Es una carpeta ', Resultado)
				RutaA = Resultado
				return RutaA
			}
			
		}
	}
	return false
	
}
def prueba3 ( ruta4,fichero3,Carpeta, RutaA) {
	
	File dir = new File(fichero3)
	File[] dirContents=dir.listFiles()
	System.out.println(dirContents)
	for(int i= 0;i< dirContents.length;i++) {
		if (dirContents[i].getName().equals(Carpeta)) {
			
			if (dirContents[i].isDirectory()) {
				System.out.println(fichero3 +"Downloads")
				String Resultado = (fichero3 + "\\Downloads")
				System.out.println('Es una carpeta '+ Resultado)
				RutaA = Resultado
				return RutaA
				}
			
			return true
		}
	}
	return false
	
}
String r = prueba(ruta1, fichero, Carpeta,RutaA)
String r1 = prueba1(ruta2, fichero1, Carpeta,RutaA)
String r2 = prueba2(ruta2, fichero1, Carpeta,RutaA)
String r3 = prueba3(ruta3, fichero2, Carpeta,RutaA)
System.out.println(r)
System.out.println(r1)
System.out.println(r2)
System.out.println(r3)

if ( r == '\\Downloads') {
	String ok = 'OK'
	System.out.println(r)
	RutaA = r
	return RutaA
	
}
else if(r1 == '..\\Downloads') {
	String ok = 'OK'
	System.out.println(r1)
	RutaA = r1
	return RutaA
	
}
else if (r2 == '..\\..\\Downloads') {
	String ok = 'OK'
	System.out.println(r2)
	RutaA = r2
	return RutaA
	
	
}
else if (r3 == '..\\..\\..\\Downloads') {
	String ok = 'OK'
	System.out.println(r3)
	RutaA = r3
	return RutaA
	
}


