package appSikuli;

import java.util.Date;

import javax.swing.JOptionPane;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

public class inkafarma {
	
	public inkafarma() {
		
	}
	
	public void ventas_inkafarma(String id,String contra) {
		   Date fecha= new Date();
		   
		   Screen s = new Screen();
//		   buscar la ruta de las imagenes
		   ImagePath . setBundlePath ( "C:/Users/nilo.inciso/Desktop/artur/02 imagenes" ); 
//		   
//		   ImagePath . setBundlePath ( "appSikuli/img" );     
		   try{ 
//		   buscar la ubicacion del explorador 
			   App.open("\"C:/Users/nilo.inciso/AppData/Local/Google/Chrome/Application/chrome.exe\"");
			   s.paste("buscardor","https://b2b.intercorpretail.pe/Inkafarma/BBRe-commerce/access/login.do");
			   s.type(Key.ENTER);
			   App.pause(3);
			   s.type(Key.TAB);
			   s.type("I");
			   s.type(Key.TAB);
			   s.type(id);
			   s.type(Key.TAB);
//			   s.wait(2)
			   s.type(contra);
			   s.type(Key.ENTER);
			   App.pause(10);
//			   s.wait(5);
			   s.wait("btn_comercial",160);
			   s.click("btn_comercial_inka");
			   s.click("btn_comercial_inka");
			   s.type(Key.DOWN);
			   s.type(Key.DOWN);
			   s.type(Key.ENTER);
//			   s.hover("desplegar_ventasInka");
//			   s.click("ventasInka");
			   App.pause(5);
//			   s.click("chekbox");
			   s.click("generar_informe_inka");
			   
			   App.pause(30);
			   s.click("share2");
			   App.pause(4);
			   s.click("descargar");
			   App.pause(4);
			   s.click("guardar1");
			   App.pause(4);
			   //ingrese ruta a guardar
//			   App.pause(2);
//			   s.click("generar_informe");
			   
//			   s.click("ruta2");
			   s.paste("captura3","C:/Users/nilo.inciso/Desktop/artur/03 descarga/04 inkafarma");
			   s.type(Key.ENTER);
			   App.pause(2);
			   s.paste("nombre_archivo","Inkafarma-Ventas "+fecha.getDate() + fecha.getDay() + fecha.getHours() + fecha.getMinutes() +fecha.getSeconds());
			   s.type(Key.ENTER);
//			   App.pause(10);
			   s.wait("aceptar_descarga",140);
			   System.out.println("cargo correctamente");
			   
			   s.click("cerrar_inka");
			   s.click("almacen_inka");
			   s.type(Key.DOWN);
			   s.type(Key.DOWN);
			   s.type(Key.ENTER);
			   App.pause(4);
			   s.click("chekbox");
			   s.click("generar_informe_inka");
			   App.pause(9);
			   s.click("share");
			   App.pause(2);
			   s.wait("advertencia_inka");
			   s.type(Key.ENTER);
//			   s.click("aceptar_advertencia");
			   s.wait("ventana_guardar_inka",130);
			   s.click("guardar1");
			   
			   App.pause(3);
			   //ingrese ruta a guardar
//			   s.click("ruta2");
			   s.paste("captura3","C:/Users/nilo.inciso/Desktop/artur/03 descarga/04 inkafarma");
			   s.type(Key.ENTER);
			   App.pause(3);
			   s.paste("nombre_archivo","Inkafarma-Inventario-"+fecha.getDate() + fecha.getDay() + fecha.getHours() + fecha.getMinutes()+fecha.getSeconds());
			   s.type(Key.ENTER);
			   App.pause(5);
			   s.wait("aceptar_descarga",140);
			   s.click("cerrar_inka");
			   App.pause(3);
			   s.click("cerrar_sesion_inka");
			   
		   }
	catch(FindFailed e){
	        e.printStackTrace();
	        JOptionPane.showMessageDialog(null, "Error al cargar Inkafarma");
	}
	}

	
	public void inventario_inkafarma() {
		   Date fecha= new Date();
		   
		   Screen s = new Screen();
//		   buscar la ruta de las imagenes
		   ImagePath . setBundlePath ( "C:\\Users\\ATICA-PC\\Documents\\scripts.sikuli" ); 
//		   
//		   ImagePath . setBundlePath ( "appSikuli/img" );     
		   try{ 
//		   buscar la ubicacion del explorador 
			   App.open("\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\""); 
			   s.paste("buscardor","https://b2b.intercorpretail.pe/Inkafarma/BBRe-commerce/access/login.do");
			   s.type(Key.ENTER);
			   s.type("seleccionar", "I");
			   s.type(Key.ENTER);
			   s.type("usuario","70490518")	;
//			   s.wait(2)
			   s.type(Key.TAB);
			   s.type("contraseña","Tresemme1");
			   s.type(Key.ENTER);
			   App.pause(10);
//			   s.wait(5);
			   s.click("btn_comercial_inka");
			   s.click("btn_comercial_inka");
			   s.hover("desplegar_ventasInka");
			   s.click("ventasInka");
			   App.pause(3);
//			   s.click("chekbox");
			   s.click("generar_informe");
			   App.pause(5);
			   s.click("share");
			   App.pause(2);
			   s.click("descargar");
			   App.pause(3);
			   s.click("guardar1");
			   App.pause(2);
			   //ingrese ruta a guardar
			   
//			   s.click("ruta2");
			   s.paste("captura3","D:/DICIEMBRE");
			   s.type(Key.ENTER);
			   App.pause(2);
			   s.paste("nombre_archivo","Inkafarma-"+fecha.getDate() + fecha.getDay() + fecha.getHours() + fecha.getMinutes());
			   s.type(Key.ENTER);
			   App.pause(3);
		   }
	catch(FindFailed e){
	        e.printStackTrace();
	}
	}

	
	
	
}
