package ���;

public class InheritanceDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Ball c2 = new Ball("������");

		System.out.println("�� :");
		c1.findRadius();		// Circle
		c1.findArea();			// Circle

		System.out.println("�n�� :");		
		c2.findRadius();		// Circle
		c2.findColor();			// Ball
		c2.findArea();			// Circle
		c2.findVolume();		// Ball
	}

}
