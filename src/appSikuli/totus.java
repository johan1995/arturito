package appSikuli;

import java.util.Date;

import javax.swing.JOptionPane;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

public class totus {
	public void totussss(String id, String contra) {
		   Date fecha= new Date();
		   
		   Screen s = new Screen();
//		   buscar la ruta de las imagenes
		   ImagePath . setBundlePath ( "C:\\Users\\nilo.inciso\\Desktop\\artur\\02 imagenes"); 
//		   
//		   ImagePath . setBundlePath ( "appSikuli/img" );     
		   try{ 
//		   buscar la ubicacion del explorador 
			   App.open("\"C:/Users/nilo.inciso/AppData/Local/Google/Chrome/Application/chrome.exe\"");
			   s.paste("buscardor","https://b2b.tottus.com/");
			   s.type(Key.ENTER);
			   App.pause(3);
			   s.click("seleccionar_totus_peru");
			   s.type(Key.ENTER);
			   App.pause(1);
			   s.type(Key.TAB);
			   s.type("20100003946");
//			   s.wait(2)
			   s.type(Key.TAB);
			   s.type(id);
			   s.type(Key.TAB);
			   s.paste("clave_totus",contra);
			   s.click("ingresar_totus");
			   App.pause(5);
//			   s.wait(5);
			   s.hover("btn_ventas_totus");
			  // s.hover("ventas_totus");
			   s.click("ventas_totus");
			   App.pause(4);
			   s.click("descarga_totus");
			   s.type(Key.TAB);
			   s.type(Key.ENTER);
			   App.pause(13);
			   s.paste("captura3","C:/Users/nilo.inciso/Desktop/artur/03 descarga/05 totus");
			   s.type(Key.ENTER);
			   App.pause(2);
			   s.paste("nombre_archivo2","Tottus-"+fecha.getYear() +fecha.getMonth() + fecha.getDay() + fecha.getHours() + fecha.getMinutes() + fecha.getSeconds());
			   s.type(Key.ENTER);
			   App.pause(3);
			   
			   		
		   }
	catch(FindFailed e){
	        e.printStackTrace();
	        JOptionPane.showMessageDialog(null, "Error al cargar Inkafarma");
	}
	}

}
