package appSikuli;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.JOptionPane;

import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.sikuli.script.Screen;

public class BtoB {
	public static void main(String[] args) throws IOException {
		JOptionPane.showMessageDialog(null, "Bienvenido Arturito");
		String nombreArchivo = "claves2.xls";//guardar en excel 2003-97
//		String rutaArchivo = "C:/Users/rolando.rivadeneira/Unilever/CD Excellence - Peru - 00 Arturito/01 Usuarios/" + nombreArchivo;
//		String rutaArchivo = "C:/Users/ATICA-PC/Desktop/" + nombreArchivo;
		String rutaArchivo = "C:/Users/nilo.inciso/Desktop/artur/" + nombreArchivo;
		String hoja = "Hoja1";
		ArrayList<String> accesos = new ArrayList<>();
				
		try (FileInputStream file = new FileInputStream(new File(rutaArchivo))) {
			// leer archivo excel
			
			HSSFWorkbook worbook = new HSSFWorkbook(file);
			//obtener la hoja que se va leer
			
			HSSFSheet sheet = worbook.getSheetAt(0);			
			//obtener todas las filas de la hoja excel
			Iterator<Row> rowIterator = sheet.iterator();
			
			Row row;
			
			// se recorre cada fila hasta el final
			while (rowIterator.hasNext()) {
				row = rowIterator.next();
				//se obtiene las celdas por fila
				Iterator<Cell> cellIterator = row.cellIterator();
				Cell cell;
				//se recorre cada celda
				while (cellIterator.hasNext()) {
					// se obtiene la celda en específico y se la imprime
					cell = cellIterator.next();
					//if(cell.getColumnIndex()>=0 && row.getRowNum()>=0) {
						
//						System.out.println(cell.getStringCellValue());
//						System.out.println(cell.getNumericCellValue());
						if(cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
							String str=NumberToTextConverter.toText(cell.getNumericCellValue());
							accesos.add(str);	
						}else {
							accesos.add(cell.getStringCellValue());
						}
						
						System.out.println();
						
					//}
				}	
			}
			
			JOptionPane.showMessageDialog(null, "Claves cargas correctamente");
		} catch (Exception e) {
			e.getMessage();
			JOptionPane.showMessageDialog(null, e.getMessage());
			JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
			JOptionPane.showMessageDialog(null, "Cell Invalida");
//			System.out.println("celda invalidad");
		}
		
		//0=usuario cenco
		//1=contra cenco
		//2=usuario supesa
		//3=contra supesa
		//4=usuario inka
		//5=contra inka
		//6=usuario totus
		//7=contra totus
//		System.out.println(accesos.get(26));
//		System.out.println(accesos.get(27));
		
		
		   cencosup c=new cencosup();
		   supesa su=new supesa();
		   inkafarma i= new inkafarma();
		   totus t =new totus();
		   makro m= new makro();
		   c.ventas_cencosud(accesos.get(4),accesos.get(5));
		   i.ventas_inkafarma(accesos.get(10),accesos.get(11));
		   su.ventas_supesa(accesos.get(7),accesos.get(8));
		   t.totussss(accesos.get(13),accesos.get(14));
		   m.ventas_makros(accesos.get(16),accesos.get(17),"MARGARINA");
		   m.ventas_makros(accesos.get(19),accesos.get(20),"TES");
		   m.ventas_makros(accesos.get(22),accesos.get(23),"CIF");
		   m.ventas_makros(accesos.get(25),accesos.get(26),"PC");
		   
		  
		   
		      
	}
}
