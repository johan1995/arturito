package appSikuli;


import java.io.IOException;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class ExtraerInfo {
	
	 	public static final String url = "http://www.intradevco.com.pe/";
	    public static final int maxPages = 20;
		
		
	   /* public static void main (String args[]) {
	    	int indice =1;
	    	//Crear libro de trabajo en blanco
	        Workbook workbook = new HSSFWorkbook();
	        //Crea hoja nueva
	        Sheet sheet = workbook.createSheet("Hoja de datos");
	        //Por cada línea se crea un arreglo de objetos (Object[])
	        Map<String, Object[]> datos = new TreeMap<String, Object[]>();			
	        datos.put(""+indice, new Object[]{1, "María", "Remen"});
	        			
	        		
	                // Obtengo el HTML de la web en un objeto Document2
	                Document document = getHtmlDocument("http://www.intradevco.com.pe/productos/");
					
	                // Busco todas las historias de meneame sue estan dentro de: 
	                Elements entradas = document.select("div[class=g-cnt-items] a[href]");
					
	                // Paseo cada una de las entradas
	                for (Element elem : entradas) {
                	System.out.println(elem.text());
	           
	                	
	                	Document nuevo2 =getHtmlDocument(elem.attr("href"));
	                	Elements entradas2 = nuevo2.select("div[class=g-cnt-items] a[href]");
	                		for(Element elm2 : entradas2) {
	                			System.out.println("-- "+elm2.text());
	                			
	                			
	                		   	Document nuevo3 =getHtmlDocument(elm2.attr("href"));
	    	                	Elements entradas3 = nuevo3.select("div[class=g-cnt-items] a[href]");
	    	                		for(Element elm3 : entradas3) {
	    	                			System.out.println("---- "+elm3.text());
	    	                		
	    	                			
	    	                			
	    	                			Document nuevo4 =getHtmlDocument(elm3.attr("href"));
	    	    	                	Elements entradas4 = nuevo4.select("div[class=g-cnt-items] a[href]");
	    	    	                		
	    	    	                		if (entradas4.isEmpty()) {
	    	    	                			
	    	    	                				Document nuevo5 =getHtmlDocument(elm3.attr("href"));
	    	    	                				Elements entradas5 = nuevo5.select("div[class=filing] a[href]");
	    	    	    	                		for(Element elm5 : entradas5) {
    	    	    	                			System.out.println("-------------------- "+elm5.text());
	    	    	    	                			
	    	    	    	                			datos.put(""+indice, new Object[]{elem.text(), elm2.text(), elm3.text(),"",elm5.text()});
	    	    	    	                			indice=indice+1;
	    	    	    	                		
	    	    	    	                		}
	    	    	                		
	    	    	                		}else {
	    	    	                	
			    	    	                		for(Element elm4 : entradas4) {
			    	    	                			System.out.println("--------- "+elm4.text());
			    	    	                		
			    	    	                			
			    	    	                			Document nuevo5 =getHtmlDocument(elm4.attr("href"));
			    	    	    	                	Elements entradas5 = nuevo5.select("div[class=filing] a[href]");
			    	    	    	                		for(Element elm5 : entradas5) {
		    	    	    	                			System.out.println("-------------------- "+elm5.text());
			    	    	    	                			datos.put(""+indice, new Object[]{elem.text(), elm2.text(), elm3.text(),elm4.text(),elm5.text()});	
			    	    	    	                			indice=indice+1;
			    	    	    	                		}
			    	    	                		
			    	    	                		}
	    	    	                		
	    	    	                		
	    	                					  }
	    	    	                		
	    	    	                		
	    	                				
	    	                		}
			
	                			
	                		}
	                    	//System.out.println(elem.text());		
	                }
	                System.out.println(document.title() );
	                
	                Set<String> hola = datos.keySet();
	                int numeroRenglon = 0;
	                for (String key : hola) {
	                    Row row = sheet.createRow(numeroRenglon++);
	                    Object[] arregloObjetos = datos.get(key);
	                    int numeroCelda = 0;
	                    for (Object obj : arregloObjetos) {
	                        Cell cell = row.createCell(numeroCelda++);
	                        if (obj instanceof String) {
	                            cell.setCellValue((String) obj);
	                        } else if (obj instanceof Integer) {
	                            cell.setCellValue((Integer) obj);
	                        }
	                    }
	                }
	                try {
	                    //Se genera el documento
	                    FileOutputStream out = new FileOutputStream(new File("D:/eclipse/ejemplo3.xls"));
	                    workbook.write(out);
	                    out.close();
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	    
	    
	    }
		
	    
	    
	    */
	    
	    
	    
	    
	    
	    
	    /**
	     * Con esta método compruebo el Status code de la respuesta que recibo al hacer la petición
	     * EJM:
	     * 		200 OK			300 Multiple Choices
	     * 		301 Moved Permanently	305 Use Proxy
	     * 		400 Bad Request		403 Forbidden
	     * 		404 Not Found		500 Internal Server Error
	     * 		502 Bad Gateway		503 Service Unavailable
	     * @param url
	     * @return Status Code
	     */
	    public static int getStatusConnectionCode(String url) {
			
	        Response response = null;
			
	        try {
	            response = Jsoup.connect(url).ignoreHttpErrors(true).execute();
	        } catch (IOException ex) {
	            System.out.println("Excepción al obtener el Status Code: " + ex.getMessage());
	        }
	        return response.statusCode();
	    }
		
		
	    /**
	     * Con este método devuelvo un objeto de la clase Document con el contenido del
	     * HTML de la web que me permitirá parsearlo con los métodos de la librelia JSoup
	     * @param url
	     * @return Documento con el HTML
	     */
	    public static Document getHtmlDocument(String url) {

	        Document doc = null;

	        try {
	            doc = Jsoup.connect(url).get();
	        } catch (IOException ex) {
	            System.out.println("Excepción al obtener el HTML de la página" + ex.getMessage());
	        }
	         
	        return doc;

	    }
    }
	
	
	





