package generics;

public class MainPair {

	public static void main(String[] args) {
		
	
		Pair<Integer, String> par1 = new OrderedPair<Integer, String>(10, "Primer Par");
		
		Pair<Float, String> par2 = new ListaDePares<Float, String>(10f, "Segundo Par");
		
		System.out.println(par1.getValue());
		
		System.out.println(par2.getValue());
		
		System.out.println(par1.getKey().getClass().getName());
		
		System.out.println(par2.getKey().getClass().getName());
		
		
		
		

	}

}
