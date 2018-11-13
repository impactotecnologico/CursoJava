package hilos;

public class Implementando implements Runnable {

	@Override
	public void run() {
		System.out.println("Dentro de run de runnable");
	}
	
	public static void main(String[] args) {
		Implementando i = new Implementando();
		i.run();
	}

}
