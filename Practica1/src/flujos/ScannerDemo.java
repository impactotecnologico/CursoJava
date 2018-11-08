package flujos;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca su nombre: ");
		
		String nombre = scanner.nextLine();
		
		System.out.print("Introduzca su edad: ");
		
		int edad = scanner.nextInt();
		
		System.out.print("Introduzca su saldo disponible: ");
		
		double disponible = scanner.nextDouble();
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Disponible: " + disponible );
		
		

	}

}
