package appSikuli;
import java.awt.FileDialog;
import java.util.*;

import javax.swing.JOptionPane;

//import org.sikuli.basics.Debug;
import org.sikuli.script.*;
public class supesa {
	
	public supesa() {
		
	}
	
	public void ventas_supesa(String id,String contra) {
	   Date fecha= new Date();
	   Screen s = new Screen();
//	   buscar la ruta de las imagenes
	   ImagePath . setBundlePath ( "C:/Users/nilo.inciso/Desktop/artur/02 imagenes" ); 
//	   C:/Users/rolando.rivadeneira/Desktop/artur/02 imagenes
//	   ImagePath . setBundlePath ( "appSikuli/img" );     
	   try{		 	
//	   buscar la ubicacion del explorador 
		   App.open("\"C:/Users/nilo.inciso/AppData/Local/Google/Chrome/Application/chrome.exe\"");
		   s.paste("buscardor","https://b2b.intercorpretail.pe/");
		   s.type(Key.ENTER);
		   App.pause(3);
		   s.type(Key.TAB);
		   s.type("s");
		   s.type(Key.TAB);
		   s.type(id);
		   s.type(Key.TAB);
//		   s.wait(2)
		   s.type(contra);
		   s.type(Key.ENTER);
		   App.pause(10);
//		   s.wait(5);
		   s.wait("btn_comercial",30);
		   s.click("btn_comercial");
		   s.hover("desplegar_ventas");
		   s.click("click_ventas");
		   App.pause(6);
		   s.click("chekbox");
		   s.click("generar_informe");
		   App.pause(5);
		   s.click("share2");
		   App.pause(1);
		   s.click("descargar");
		   App.pause(6);
		   s.click("guardar1");
		   App.pause(3);
		   //ingrese ruta a guardar
		   
//		   s.click("ruta2");
		   s.paste("captura3","C:/Users/nilo.inciso/Desktop/artur/03 descarga/01 supesa");
		   s.type(Key.ENTER);
		   App.pause(2);
		   s.paste("nombre_archivo","Supesa-"+fecha.getYear() +fecha.getMonth() + fecha.getDay() + fecha.getHours() + fecha.getMinutes() + fecha.getSeconds());
		   s.type(Key.ENTER);
		   	
		   App.pause(4);
		   s.click("cerrar");
		   
		   //Detalle Inventario
		   s.click("abastecimiento");
		   s.hover("desplegar_inventario");
		   s.click("click_detalleInventario");
		   
		   App.pause(4);
		   s.click("chekbox");
		   s.click("generar_informe");
		   App.pause(5);
		   s.click("share");
		   App.pause(3);
//		   s.click("aceptar_advertencia");
		   s.type(Key.ENTER);
		   s.click("guardar1");
		   
		   App.pause(2);
		   //ingrese ruta a guardar
		   
//		   s.click("ruta2");
		   s.paste("captura3","C:/Users/nilo.inciso/Desktop/artur/03 descarga/01 supesa");
		   s.type(Key.ENTER);
		   App.pause(2);
		   s.paste("nombre_archivo","Supesa-Stock-"+fecha.getYear() +fecha.getMonth() + fecha.getDay() + fecha.getHours() + fecha.getMinutes() + fecha.getSeconds());
		   s.type(Key.ENTER);
		   	
		   s.wait("aceptar_descarga",120);
		   s.click("cerrar");
		  App.pause(2);
		  s.click("cerrar_sesion_supesa");
		  	   }
catch(FindFailed e){
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, e.getMessage());
//        JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        JOptionPane.showMessageDialog(null, "Error al cargar Supesa");
        
}
}
		
}
