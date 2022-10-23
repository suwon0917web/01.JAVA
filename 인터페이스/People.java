package 인터페이스;

// 순수 추상 클래스 - 인터페이스
// 일반 변수를 가질수가 없다
// 상수만 가능
// 
public interface People {
//	public static final String name = "";
	
	void whoami();	
	String getName();
	default void show() {}; // java 8 override
	static void show2() {}; // java 8  override x
	private void show3() {}; // java 9 	
}
