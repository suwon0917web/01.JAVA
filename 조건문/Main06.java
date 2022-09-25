package statement;

import java.util.Scanner;

public class Main06 {

	public static void main(String[] args) {
		// 간단한 조건문.... if ~ else 문장으로 되어있고 각 케이별 실행문이 하나일때
		// 간단히 삼항연산자로 대체
		// 정수를입력받아서 짝 홀을 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int jumsu = sc.nextInt();
		
		String result = "";
//		if (jumsu % 2 ==0) {
//			result = "짝수";
//		}else {
//			result ="홀수";
//		}
		result = (jumsu % 2 ==0)? "짝수" : "홀수";
		
		System.out.println(result);
	}

}
