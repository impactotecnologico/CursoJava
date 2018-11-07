/**
 * 
 */
package es.indra.aerolineas.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author josejarizav
 *
 */
public class ReadFile {
	
	public List<String> retornarVuelos() {
		
		List<String> vuelos = new ArrayList<>();
		
		Path path = Paths.get("/Users/josejarizav/repositorios/CursoJava/vuelos.txt");
		try {
			vuelos = Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finalizada lectura de archivos");
		}	
		
		return vuelos;
	}
	
	public List<String> retornarVuelosPropagandoError() throws IOException {
		
		List<String> vuelos = new ArrayList<>();
		
		Path path = Paths.get("/Users/josejarizav/repositorios/CursoJava/vuelos.txt");
		vuelos = Files.readAllLines(path);
		
		
		return vuelos;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		ReadFile r = new ReadFile();
		r.retornarVuelos();
	}

}
