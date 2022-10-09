package Å¬·¡½º;

public class StaticTestDemo {
	public static void main(String[] args) {
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		StaticTest st3 = new StaticTest();
		st1.setPublicMoney(5000);
		System.out.println(st1.getPublicMoney());
		System.out.println(st2.getPublicMoney());
		
		st1.setMyMoney(1000);
		System.out.println(st1.getMyMoney());
		System.out.println(st2.getMyMoney());
		
	}
}
