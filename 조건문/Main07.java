package statement;

import java.util.Scanner;

public class Main07 {

	public static void main(String[] args) {
//		사용자로부터 몸무게 신장 을 입력받아서
//		BMI = 몸무게(KG) / (신장(M)*신장(M))
//		BMI 값이 아래와 같으면 해당 내용을 출력
//		18.5 이하면 저체중
//		18.5 ~ 23은 정상
//		23 ~ 25는 과체중
//		25 ~ 30은 비만
//		30이상은 고도비만
		Scanner sc = new Scanner(System.in);
		System.out.print("몸무게(kg) 을 입력하세요");
		int weight =  sc.nextInt();
		System.out.print("신장(cm) 을 입력하세요");		
		double height =  sc.nextInt() / 100.0;
		double bmi = weight / (height*height);
		String bmiResult = "";
		if( bmi <= 18.5) {
			bmiResult = "저체중";
		}else if(bmi <= 23) {
			bmiResult = "정상";
		}else if(bmi <= 25) {
			bmiResult = "과체중";
		}else if(bmi <= 30) {
			bmiResult = "비만";
		}else {
			bmiResult = "고도비만";
		}
		String result = String.format("몸무게 : %d(kg), 신장 : %d, bmi : %f 결과는 %s 입니다."
				,weight, (int)(height*100), bmi, bmiResult );
		System.out.println(result);
		
		System.out.println("년도를 4자리로 입력하세요(예 2022) : ");
		int year = sc.nextInt();
		if((year % 4 ==0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
//     원하는 년도는 4자리로 받아서.(예를들어서 2022) 
//		윤년여부를 판단하는 프로그램
//		그레고리력의 정확한 윤년 규칙은 다음과 같다.
//		조건1 서력 기원 연수가 4로 나누어 떨어지는 해는 윤년으로 한다. ...
//		조건2 서력 기원 연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다. ...
//		조건3 서력 기원 연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다
	}

}
