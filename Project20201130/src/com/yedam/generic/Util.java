package com.yedam.generic;

public class Util {
	public static <T, M> boolean compare(Pair<T, M> p1, Pair<T, M> p2) {
		// <T,M>제네릭타입을사용하고, boolean불린리턴
		boolean k = p1.getKind().equals(p2.getKind());
		boolean m = p1.getModel().equals(p2.getModel());

		return k && m;
	}

	/* public Box<T> boxing(T t){ 이렇게만 선언하면 Box<T>의 T값이 뭔지 모름 */
	public static <T> Box<T> boxing(T t) { // 앞에 <T>를 또 붙여줘야 제네릭 타입인 줄 알 수 o
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
