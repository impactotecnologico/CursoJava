package flujos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteDemo {
	
	public static List<Persona> generaPersonas() {
		List<Persona> personas = new ArrayList<>();
		
		personas.add(new Persona("Pedro","Perez","33333C",100));
		
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				personas.add(new Persona("Jose","Ariza","33333C",i));
			} else {
				personas.add(new Persona("Julian","Ariza","44444",i));
			}
			
		}
		
		return personas;
		
	}

	public static void main(String[] args) {
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter("/Users/josejarizav/repositorios/CursoJava/file1.txt"));
			
			List<Persona> personas = generaPersonas();
			
			for (Persona persona : personas) {
				
				StringBuilder sb = new StringBuilder();
				sb.append(persona.getId());
				sb.append(";");
				sb.append(persona.getNombre());
				sb.append(";");
				sb.append(persona.getApellido());
				sb.append(";");
				sb.append(persona.getDni());
				sb.append(";");
				
				
				writer.write(sb.toString());
				writer.newLine();
			}			
		    writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	    

	}

}
