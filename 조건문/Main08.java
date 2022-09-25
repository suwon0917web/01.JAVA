package statement;

import java.util.Scanner;

public class Main08 {

	public static void main(String[] args) {
		// 예제 Main07에서 3항연산자를 사용할수 있는 부분이 있으면 수정
		
		// BMI = 몸무게(KG) / (신장(M)*신장(M))
//		사용자로부터 몸무게을 입력받는다.
//		bmi 지수가 정상범위에 들어가려면 신장은 얼마부터 얼마사이에 있어야 하는지를 출력
//		bmi*(h*h) = w / (h*h)*(h*h)
//		bmi 18.5, 23
		Scanner sc = new Scanner(System.in);
		System.out.print("몸무게를 입력하세요(kg) : ");
		int w = sc.nextInt();
		double hFrom = Math.sqrt( w / 18.5);
		double hTo = Math.sqrt( w / 23);
		System.out.println(hFrom);
		System.out.println(hTo);
		
				
	}

}
