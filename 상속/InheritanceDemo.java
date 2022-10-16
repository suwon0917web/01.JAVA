package 상속;

public class InheritanceDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Ball c2 = new Ball("빨간색");

		System.out.println("원 :");
		c1.findRadius();		// Circle
		c1.findArea();			// Circle

		System.out.println("굈공 :");		
		c2.findRadius();		// Circle
		c2.findColor();			// Ball
		c2.findArea();			// Circle
		c2.findVolume();		// Ball
	}

}
