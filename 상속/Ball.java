package ���;

public class Ball extends Circle {
	private String color;

	public Ball() {
		// �θ�� �ڽ��� ������
//		super();
//		this("red");   �����ڴ� �׻� ���� ȣ��Ǿ�� ��
		
		this("��");
//		this.color = "��";
	}
	public Ball(String color) {
		// super�� �̿��� �θ� ������ ȣ��
		super();
		this.color = color;		
	}

	public void findColor() {		
		System.out.println(color + " ���̴�.");
	}

	public void findVolume() {
		System.out.println("���Ǵ� 4/3*(pi*������*������*������)�̴�.");		
	}
	
	// Ball�� Circle�� ��� �޼ҵ带 ȣ��
	public void allMethodCalls() {
		// �θ��� �޼ҵ��		
		super.findArea();	// �θ��� ��� ���ٰ����� ����� ������ ����  (private ����)		
		super.findRadius();
		super.hiddenMethod();
		
		//�ڱⲨ �޼ҵ��  this... ����Ŭ������ ��� ��� ����
		this.findColor();
		this.findVolume();
		
	}

}
