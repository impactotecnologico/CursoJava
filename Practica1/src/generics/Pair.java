package generics;

public interface Pair<K, V> {
	
	void setKey(K k);
	
	K getKey();
	
	V getValue();

}
