package appSikuli;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class pedido {
	Date fecha;
	String pedido;
	String cliente;
	ArrayList<productos> lista = new ArrayList<>();
	int respuesta;
	//Scanner salida= new Scanner();
	
	public void ingresar_pedido(productos e) {
		lista.add(e);
	}
	
	public void eliminar_pedido(productos e) {
		if (lista.isEmpty()==true) {
			System.out.println("No existen productos en la lista ");
		}else {
			lista.remove(e);
		}		
	}
	public void modificar_categoria(productos e) {
		
		for (int i=0;i <lista.size(); i++) {
			if (lista.get(i).codigoEAN.equals(e.codigoEAN)) {
				lista.get(i).categoria=e.categoria;
			}
		}
	}
	
	public void modificar_marca(productos e) {
		
		for (int i=0;i <lista.size(); i++) {
			if (lista.get(i).codigoEAN.equals(e.codigoEAN)) {
				lista.get(i).marca=e.marca;
			}
		}
	}
	
	public void eliminar(productos e) {
		
		for (int i=0;i <lista.size(); i++) {
			if (lista.get(i).codigoEAN.equals(e.codigoEAN)) {
				lista.get(i).estado=false;
			}
		}
	}
	public void habilitar_producto(productos e) {
		
		for (int i=0;i <lista.size(); i++) {
			if (lista.get(i).codigoEAN.equals(e.codigoEAN)) {
				if (lista.get(i).estado=true) {
					System.out.println("Este codigo ya esta habilitado");
				}else {
					lista.get(i).estado=true;
				}
			}
		}
	}
	public void ingresar_reglas() {
		
	}
	public void obtener_resultado(String tipo_convenio,String objeto, float cumplimiento,float reglas ) {
		if (tipo_convenio.equals("vendedores")){
			//if cumplimiento>reglas.regular
		}else 
			if(tipo_convenio.equals("ejecutivos")) {
				
			}else
				if(tipo_convenio.equals("clientes")) {
					
				}
	}
	
	
	
	
	
	
	
	
}
