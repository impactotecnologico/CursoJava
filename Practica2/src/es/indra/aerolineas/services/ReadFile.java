/**
 * 
 */
package es.indra.aerolineas.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author josejarizav
 *
 */
public class ReadFile {
	
	public List<String> retornarVuelos() {
		Path path = Paths.get("/Users/josejarizav/repositorios/CursoJava/vuelos.txt");
		
		try {
			return Files.readAllLines(path);			
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		return null;
	}
	
	public static void main(String[] args) {
		ReadFile r = new ReadFile();
		r.retornarVuelos();
	}

}
