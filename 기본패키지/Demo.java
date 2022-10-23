package 기본패키지;

public class Demo {
	public static void main(String[] args) {
		// Demo, Keyboard 객체 2개씩
		
		Mouse m1 = new Mouse();
		Mouse m2 = new Mouse();
		Keyboard k1 = new Keyboard();
		Keyboard k2 = new Keyboard();
		
		m1.name = "로지텍";
		m1.manufactor = "대만";
		m2.name = "로지텍";
		m2.manufactor = "대만";
		
		
		k1.name = "마이크로소프트";				
		k2.name = "마이크로소프트";
		
		System.out.println(m1);
		System.out.println(m1.toString());
		
		System.out.println(m1.equals(m2));
		
		


		Class c = k1.getClass();
		System.out.println(c.getName());  // 기본패키지.Keyboard
		System.out.println(c.getSimpleName()); // Keyboard
		System.out.println(c.getTypeName()); // 기본패키지.Keyboard
		System.out.println(c.getPackage().getName()); // 기본패키지		
	}

}
