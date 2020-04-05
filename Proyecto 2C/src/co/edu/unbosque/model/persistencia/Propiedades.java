package co.edu.unbosque.model.persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;

import co.edu.unbosque.model.Puesto;


public class Propiedades {	
	
	ArrayList<String> puestos;
	int cont=0;
	
	
	public void leer() {
	
	FileInputStream input;
    String result = null; {
    	
    try {
        input = new FileInputStream(new File("./src/co/edu/unbosque/data/Puestos_de_votacion.csv"));
        CharsetDecoder decoder = Charset.forName("UTF-8").newDecoder();
        decoder.onMalformedInput(CodingErrorAction.IGNORE);
        InputStreamReader reader = new InputStreamReader(input, decoder);
        BufferedReader bufferedReader = new BufferedReader( reader );
        StringBuilder sb = new StringBuilder();
        String line = bufferedReader.readLine();
        
        while( line != null ) {
            puestos= new ArrayList<String>();
            
            puestos.add(line);
        }
        System.out.println(line);
        bufferedReader.close();
        result = sb.toString();
        
    } catch (FileNotFoundException e) {
        e.printStackTrace();
        
    } catch( IOException b ) {
        b.printStackTrace();
    }
   // System.out.println(result);
    
}
	}
	public static void main (String args[]) {
		
		Propiedades lc = new Propiedades();
		lc.leer();
}
    

}
