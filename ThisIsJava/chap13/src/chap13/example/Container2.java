package chap13.example;

public class Container2<T1, T2> {
	private T1 key;
	private T2 value;
	
	public T1 getKey() {
		return key;
	}
	
	public T2 getValue() {
		return value;
	}
	
	public void set(T1 key, T2 value) {
		this.key = key;
		this.value = value;
	}
}
