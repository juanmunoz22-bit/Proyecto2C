package co.edu.unbosque.model.persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class LeerArchivos {

	FileReader fr = null;
	BufferedReader br = null;
	public void leerFecha(File fecha, ArrayList<String> lista) {
		try {
	        // Apertura del fichero y creacion de BufferedReader para poder
	        // hacer una lectura comoda (disponer del metodo readLine()).
	        fr = new FileReader (fecha);
	        br = new BufferedReader(fr);
	
	        // Lectura del fichero
	        String linea;
	        
	        while((linea=br.readLine())!=null) {
	       	 	lista.add(linea);
	           }
	        
	        
	     }
	     catch(Exception e){
	        e.printStackTrace();
	     }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	}
	
	public void leerDepartamento(File dep, ArrayList<String> lista) {
		
		try {
	        // Apertura del fichero y creacion de BufferedReader para poder
	        // hacer una lectura comoda (disponer del metodo readLine()).
	        fr = new FileReader (dep);
	        br = new BufferedReader(fr);
	
	        // Lectura del fichero
	        String linea;
	        
	        while((linea=br.readLine())!=null) {
	       	 	lista.add(linea);
	           }
	        
	        
	     }
	     catch(Exception e){
	        e.printStackTrace();
	     }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	}

}
