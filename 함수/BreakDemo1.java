package 순환문;

import java.util.Scanner;

public class BreakDemo1 {
	
	public static void main(String[] args) {
//		1. 사용자로부터 정수형 값을 입력받는다.
//		2. 입력받은 값들을 계속 더해 나간다.
//		3. 그 합이 100을 넘으면 종료한다.
		int total = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("정수형태의 값을 입력하세요");
			int number =  sc.nextInt();
			total += number;
			if(total > 100)
				break;
		}
		System.out.println("total = " + total);
			

	}

}
