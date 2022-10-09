package Ŭ����;

/**
 static ������ �����ڿ� static Ű���尡 ���� �޼ҵ忡�� �ʱ�ȭ ����
 �Ǵ�  ������ �ʱ�ȭ
 */

public class StaticTest {
	private static int publicMoney = 100000;  // ����
	private int myMoney;			 // ���ο뵷
	static final int memberLimit = 100;   // ������ ���
	// static final ����� ǥ���Ҷ� �Ź� �޸𸮿� ������ �ʿ䰡 ������ static �ٿ��� ����Ѵ�.
	
	// Ŭ������ ������ �ִ� �����߿� non-staitc�� ����ϰ��ֳ���?
	public static void sayHello(String name) {
		System.out.printf("%s �� �ݰ���.. ������", name);
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
