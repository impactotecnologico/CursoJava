/**
 * 
 */
package es.indra.practica1;

/**
 * @author josejarizav
 *
 */
public class Variables2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(Variables.estatico);
		
		Variables v = new Variables();
		Variables v1 = new Variables();
		
		v.id = 50;
		v1.id = 80;
		
		v1.estatico = 300;
		
		System.out.println(Math.min(400, 400));		
		
		System.out.println(Variables.estatico);
		
		System.out.println(v.id);
		System.out.println(v1.id);
		
		System.out.println(v.estatico);

	}

}
