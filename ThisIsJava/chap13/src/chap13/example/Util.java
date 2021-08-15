package chap13.example;

public class Util {

	public static <T extends Pair<K, V>, K, V> V getValue(T pair, K key) {
		// TODO Auto-generated method stub
		if (pair.getKey() == key) {
			return pair.getValue();
		} else {
			return null;
		}
	}

}
