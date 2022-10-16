package review;

public class Review6 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		double[] result = {0.0};	
		if(divide(num1, num2, result)) {
			System.out.println(result[0]);
		}else {
			System.out.println("잘못된 계산결과.. 값을 확인하세요");
		}
	}
	
	public static boolean divide(int num1, int num2, double[] numbers) {
		if (num2 != 0) {
			numbers[0] = num1 / (num2*1.0);
			return true;
		}else
			return false;
	}

}
