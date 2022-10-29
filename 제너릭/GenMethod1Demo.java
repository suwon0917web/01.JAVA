package Á¦³Ê¸¯;

class Utils {
	static <T> void showArray(T[] a) {
		for(T t : a)
			System.out.print(t+" ");
		System.out.println();
	}
	static <T> T getLast(T[] a) {
		return a[a.length-1];
	}
}

class NonStatic<T> {
	void showArray(T[] a) {
		for(T t : a)
			System.out.print(t+" ");
		System.out.println();
	}
	T getLast(T[] a) {
		return a[a.length-1];
	}
}

public class GenMethod1Demo {
	public static void main(String[] args) {
		Integer[] a = {1,2,3,4,5};
		String[] str = {"aaa","bbb"};
		Utils.showArray(a);
		Utils.showArray(str);
		NonStatic<Integer> na = new NonStatic<Integer>();
		na.showArray(a);
		NonStatic<String> sa = new NonStatic<String>();
		sa.showArray(str);
	}
}
