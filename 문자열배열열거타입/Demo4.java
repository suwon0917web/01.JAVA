package ���ڿ��迭����Ÿ��;

// outer class

public class Demo4 {	
	// innner class --> �� ������� ����
	class Circle{
		public int radius;  // ��ü�� �ɹ��μ� ������ �ʱ�ȭ�� ����Ʈ�� ���ش�.(�޼ҵ�����ε���...)		
	}

	public static void zero(Circle c) {
		c.radius = 0;
	}
	public static void zero(int radius) {
		radius = 0;
	}
	
	public static void main(String[] args) {
		// ��ü  ���� (���۷��� �Ӽ�)		
		Circle c = (new Demo4()).new Circle();		
		c.radius = 100;
		
		// �Ϲݺ���
		int radius = 100;
		
		// overload
		zero(c); // �����ͺ����� �߻� -- ��������
		zero(radius); // �ƹ��ϵ� ������ ����
		// �Լ��� ȣ���Ѵ��� �Ű����� ���·� �Ѱ��� ���� �����ʹ� ���� ��� �Ǿ�����?
		

	}

}



