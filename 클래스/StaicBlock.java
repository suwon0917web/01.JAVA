package Ŭ����;

public class StaicBlock {
	public static int number = 0;
	//�� �ʱ�ȭ
	{
		System.out.println("non static block " + ++number);
	}

	// �� �ʱ�ȭ
	static {
		System.out.println("static block " + ++number);
	}
	
	// ������
	public StaicBlock() {
		System.out.println("������ "  + ++number);
	}
	
}
