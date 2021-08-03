package chap13.section04;

import chap13.section02.GenericBox;

public class Util {
	public static <T> GenericBox<T> boxing(T t) {
		GenericBox<T> box = new GenericBox<T>();
		box.set(t);
		return box;
	}
}
