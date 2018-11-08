package pruebaHilos;

public class Sincronizacion {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
		MiHilo mh1 = MiHilo.creaEInicia("#1", a);
		MiHilo mh2 = MiHilo.creaEInicia("#2", a);
		
		try {			
			mh1.hilo.join();
			mh2.hilo.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}
