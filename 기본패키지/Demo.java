package �⺻��Ű��;

public class Demo {
	public static void main(String[] args) {
		// Demo, Keyboard ��ü 2����
		
		Mouse m1 = new Mouse();
		Mouse m2 = new Mouse();
		Keyboard k1 = new Keyboard();
		Keyboard k2 = new Keyboard();
		
		m1.name = "������";
		m1.manufactor = "�븸";
		m2.name = "������";
		m2.manufactor = "�븸";
		
		
		k1.name = "����ũ�μ���Ʈ";				
		k2.name = "����ũ�μ���Ʈ";
		
		System.out.println(m1);
		System.out.println(m1.toString());
		
		System.out.println(m1.equals(m2));
		
		


		Class c = k1.getClass();
		System.out.println(c.getName());  // �⺻��Ű��.Keyboard
		System.out.println(c.getSimpleName()); // Keyboard
		System.out.println(c.getTypeName()); // �⺻��Ű��.Keyboard
		System.out.println(c.getPackage().getName()); // �⺻��Ű��		
	}

}
