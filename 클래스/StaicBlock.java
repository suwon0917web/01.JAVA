package 클래스;

public class StaicBlock {
	public static int number = 0;
	//블럭 초기화
	{
		System.out.println("non static block " + ++number);
	}

	// 블럭 초기화
	static {
		System.out.println("static block " + ++number);
	}
	
	// 생성자
	public StaicBlock() {
		System.out.println("생성자 "  + ++number);
	}
	
}
