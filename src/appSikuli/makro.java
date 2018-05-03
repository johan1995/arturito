package appSikuli;

import java.util.Date;

import javax.swing.JOptionPane;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

public class makro {
	public void ventas_makros (String id, String contra,String nombre) {
		   Date fecha= new Date();
		   
		   Screen s = new Screen();
//		   buscar la ruta de las imagenes
		   ImagePath . setBundlePath ( "C:\\Users\\nilo.inciso\\Desktop\\artur\\02 imagenes" ); 
//		   
//		   ImagePath . setBundlePath ( "appSikuli/img" );     
		   try{ 
//		   buscar la ubicacion del explorador 
			   App.open("\"C:/Users/nilo.inciso/AppData/Local/Google/Chrome/Application/chrome.exe\""); 
			   s.paste("buscardor","https://www.makrob2b.com/makro_pe/logon.aspx/");
			   s.type(Key.ENTER);
			   App.pause(3);
			   s.wait("boton_ingresar",15);
			   s.paste("usuario_makro",id);
			   App.pause(2);
			   s.paste("contraseña",contra);
			   s.type(Key.ENTER);
			   App.pause(5);
			   s.wait("seleccionar_makro",40);
			   s.click("seleccionar_makro");
			   s.type("i");
			   s.type(Key.ENTER);
			   s.click("seleccionar_tipo_makro");
			   s.type("s");
			   s.click(Key.ENTER);
			   App.pause(10);
			   s.click("filtrar_makro");
			   s.type(Key.DOWN);
			   s.type(Key.ENTER);
			   App.pause(4);
			   s.click("buscar_makro");
			   s.wait("descargar_makro",20);
			   s.click("descargar_makro");
			   App.pause(20);
			   s.paste("captura3","C:/Users/nilo.inciso/Desktop/artur/03 descarga/06 makro");
			   s.type(Key.ENTER);
			   App.pause(2);
			   s.paste("nombre_archivo3","Makro-"+nombre + fecha.getYear()+fecha.getMonth() + fecha.getDay() + fecha.getHours() + fecha.getMinutes() + fecha.getSeconds());
			   s.type(Key.ENTER);
			   App.pause(4);
			   
			   s.click("salir_makro");
			   		
		   }
	catch(FindFailed e){
	        e.printStackTrace();
	        JOptionPane.showInternalMessageDialog(null,"PROBLEMAS AL CARGAR LA PAGINA"); 
	}
	}

}
