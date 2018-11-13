package generics;

public class OrderedPair<K, V> implements Pair<K, V> {
	
	private K key;
	private V value;

	/**
	 * @param key
	 * @param value
	 */
	public OrderedPair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public V getValue() {
		return value;
	}

	@Override
	public void setKey(K k) {
		System.out.println("Metodo no implementado");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
