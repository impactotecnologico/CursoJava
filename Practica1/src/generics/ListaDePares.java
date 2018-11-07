package generics;

import java.util.ArrayList;
import java.util.List;

public class ListaDePares<K, V> implements Pair<K, V> {
	
	private K key;
	private V value;
	private List<K> kas = new ArrayList<>();

	/**
	 * @param key
	 * @param value
	 */
	public ListaDePares(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	@Override
	public void setKey(K k) {
		kas.add(key);
	}

	@Override
	public K getKey() {
		
		return key ;
	}

	@Override
	public V getValue() {
		return value;
	}

}
