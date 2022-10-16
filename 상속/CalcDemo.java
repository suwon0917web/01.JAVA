package 상속;
// 다형성...
public class CalcDemo {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		Add add = new Add();
		add.calculate(num1, num2);
		
		Object result;
		
		result = (new Add()).calculate(num1, num2);
		System.out.println(result);
		
		result = (new Minus()).calculate(num1, num2);
		System.out.println(result);		
		
		result = (new Multi()).calculate(num1, num2);
		System.out.println(result);
		
		// 클래스간의 타입casting 문제..
		double n1 = num1;
		double n2 = num2;
		result = (new Divide()).calculate(n1, n2);
		System.out.println(result);
	}

}
