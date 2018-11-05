/**
 * 
 */
package es.indra.practica1;

/**
 * @author josejarizav
 *
 */
public class Variables {
	
	int id = 10;
	static int estatico = 100;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(estatico);

	}
	
	/**
	 * <p>Método para imprimr una variable local</p>
	 * 
	 */
	void imprimirId(){
		System.out.println(id);
	}

}
