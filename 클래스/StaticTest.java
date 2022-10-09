package 클래스;

/**
 static 변수는 생성자와 static 키워드가 붙은 메소드에서 초기화 가능
 또는  생성시 초기화
 */

public class StaticTest {
	private static int publicMoney = 100000;  // 공금
	private int myMoney;			 // 개인용돈
	static final int memberLimit = 100;   // 문자형 상수
	// static final 상수를 표현할때 매번 메모리에 생성할 필요가 없으니 static 붙여서 사용한다.
	
	// 클래스가 가지고 있는 변수중에 non-staitc를 사용하고있나요?
	public static void sayHello(String name) {
		System.out.printf("%s 야 반갑다.. ㅎㅎㅎ", name);
	}
	
	public static int getPublicMoney() {		
		return publicMoney;
	}
	public static void setPublicMoney(int publicMoney) {		
		StaticTest.publicMoney = publicMoney;
	}	
	public int getMyMoney() {
		for(int i = 0; i <memberLimit ; i++) {}
		return myMoney;
	}
	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}
	
}
