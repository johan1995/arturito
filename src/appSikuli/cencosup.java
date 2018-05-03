package appSikuli;

import java.util.Date;

import javax.swing.JOptionPane;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

public class cencosup {
	
	public cencosup() {	
	}
	
	public void ventas_cencosud(String id, String contra) {
		   Date fecha= new Date();
		   Screen s = new Screen();
//		   buscar la ruta de las imagenes
		   ImagePath . setBundlePath ( "C:\\Users\\nilo.inciso\\Desktop\\artur\\02 imagenes" ); 
//		   C:/Users/rolando.rivadeneira/Desktop/artur/02 imagenes
//		   ImagePath . setBundlePath ( "C:\\Users\\ATICA-PC\\Documents\\scripts.sikuli" ); 
//		   ImagePath . setBundlePath ( "appSikuli/img");     
		   try{ 
//		   buscar la ubicacion del explorador 
			   App.open("\"C:/Users/nilo.inciso/AppData/Local/Google/Chrome/Application/chrome.exe\""); 
			  
			   s.paste("buscardor","https://www.cenconlineb2b.com/");
			   s.type(Key.ENTER);
			   App.pause(3);
			   s.type("pais", "p");
			   s.type(Key.ENTER);
			   s.type("unidad","s")	;
			   s.type(Key.ENTER);
//			   s.wait(2)
			   s.type("usuario_cenco",id)	;
			   s.type(Key.TAB);
			   s.type(contra);
			   s.type(Key.ENTER);
			   App.pause(12);
			  
			   s.wait("btn_comercial_cenco",40);
			   s.click("btn_comercial_cenco");
			   s.hover("desplegar_prueba");
			   s.hover("desplegar_ventas_cenco");
			   s.click("click_ventas_cenco");
			   App.pause(7);
			   
			   s.click("generar_informe_cenco",30);
			   App.pause(40);
			   
			   
			   s.click("share3");
			   App.pause(8);

			   s.click("descargar_cenco");
			   App.pause(10);
			   s.wait("ventana_guardar_cenco",20);
			   s.click("guardar_cenco");
			   App.pause(3);
			   
			   //ingrese ruta a guardar
			   
//			   s.click("ruta2");
			   s.paste("captura3","C:/Users/nilo.inciso/Desktop/artur/03 descarga/02 cencosud");
			  
			   
			   s.type(Key.ENTER);
			   App.pause(2);
			   s.paste("nombre_archivo","Cencosud"
			   		+ "-"+fecha.getYear() +fecha.getMonth() + fecha.getDay() + fecha.getHours() + fecha.getMinutes() +fecha.getSeconds());
			   s.type(Key.ENTER);
//			   App.pause(12);
			   s.wait("aceptar_descarga_cenco",120);
			   s.click("cerrar_cenco");
			   App.pause(3);
			   		   
//			   Descargar inventario de Cencosud
			   
			   s.click("abastecimiento_cenco");	
			   s.type(Key.DOWN);
			   s.type(Key.ENTER);
			   App.pause(5);
			   s.click("generar_informe_cenco");
			   App.pause(15);
			   s.click("descargar_cencosud");
			   s.wait("ventana_advertencia_cenco",30);
			   s.type(Key.ENTER);
			   s.wait("ventana_guardar_cenco",30);
			   s.click("guardar_cenco");
//ingrese ruta a guardar		   
//			   s.click("ruta2");
			   s.paste("captura3","C:/Users/nilo.inciso/Desktop/artur/03 descarga/02 cencosud");
			   s.type(Key.ENTER);
			   App.pause(2);
			   s.paste("nombre_archivo","Cencosud-Inventario"
					   + "-"+fecha.getYear() +fecha.getMonth() + fecha.getDay() + fecha.getHours() + fecha.getMinutes() +fecha.getSeconds());
			   s.type(Key.ENTER);
			
			   s.wait("aceptar_descarga_cenco",120);
			   s.click("cerrar_cenco");
			   App.pause(3);
			   s.click("cerrar_sesion_cenco");
		   }
	catch(FindFailed e){
	        e.printStackTrace();
	        JOptionPane.showMessageDialog(null, e.getMessage());
	        JOptionPane.showMessageDialog(null, "Error al cargar Cencosud");
	}
	}
	

}
