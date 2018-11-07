package generics;

public class Limite<T> {
	
	private T t;
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public <U extends Number> void revision(U u) {
		System.out.println("T es de tipo" + t.getClass().getName());
	}

	public static void main(String[] args) {
		Limite<Integer> lim = new Limite<>();
		lim.setT(34);
		System.out.println(lim.getT());
		lim.revision(35);
		
		Limite<Double> limD = new Limite<>();
		limD.setT(34d);
		System.out.println(limD.getT());
		limD.revision(35d);
		
		Limite<String> limString = new Limite<>();
		limString.setT("Hola");
		System.out.println(limString.getT());
		limString.revision("Otro String");
	}

	
	
	
	
	
	
	
	
	
	
}
