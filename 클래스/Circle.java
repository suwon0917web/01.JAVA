package Ŭ����;

public class Circle {
	// ���������� private -> ����ȭ ĸ��ȭ -> �ܺο��� ������� �Ұ�
	private int radius; 
	private String color;
	// �����ڸ� ���� �ɹ����� �ʱ�ȭ
	// �⺻(Default)������
	public Circle() {
		this(1,"white");
	}
	// overloading - ����
	public Circle(int radius, String color) {
		this.radius =  radius;
		this.color = color;
	}
//	public Circle(int radius) {
//		this.radius = radius;
//	}
//	public Circle(String color) {
//		this.color = color;
//	}
	// �ʿ��� ��� �߰�...
	
}
