package �������̽�;

// ���� �߻� Ŭ���� - �������̽�
// �Ϲ� ������ �������� ����
// ����� ����
// 
public interface People {
//	public static final String name = "";
	
	void whoami();	
	String getName();
	default void show() {}; // java 8 override
	static void show2() {}; // java 8  override x
	private void show3() {}; // java 9 	
}
