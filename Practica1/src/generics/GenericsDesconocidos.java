package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDesconocidos {

	public static void main(String[] args) {
		
		List<Integer> listado = new ArrayList<>();
		
		listado.add(23);
		listado.add(45);
		
		List<Number> listadoDesconocido = new ArrayList<>();
		
		listadoDesconocido.add(new Integer(34));
		listadoDesconocido.add(34.45d);
		
		
		

	}

}
