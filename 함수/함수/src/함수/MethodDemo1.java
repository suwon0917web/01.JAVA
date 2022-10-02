package 함수;

import java.util.Scanner;

/**
 * 1. 코드의 재활용 - 반복사용 2. 가독성 증가 - 로직들의 집합
 */
public class MethodDemo1 {
//	1. 사용자로부터 양의정수 2개를 입력받아서 곱하는 프로그램을 작성
	public static void main(String[] args) {
		// 사용로자로부터 값을 입력받는 함수		
		int num1 = inputNumber(), num2 = inputNumber();
		if(num1 ==-1 || num2 == -1)
			return;
		// 두개의 변수를 받아서 처리하는 함수
		fourCalc(num1, num2);

	}

//	2 .코드의 가독성을 높인다.
	public static int inputNumber() {
		System.out.println("0~100사이의 값을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num =  sc.nextInt();
		if(num <0 || num >100) {
			System.out.println("잘못 입력했습니다. 값의 범위를 확인하세요");
			return -1;
		}
		return num;
			
	}

	public static void fourCalc(int num1, int num2) {
		calcOperation(num1, num2, "+");
		calcOperation(num1, num2, "-");
		calcOperation(num1, num2, "*");
		calcOperation(num1, num2, "/");
	}

//	1. 코드의 재활용 - 반복사용	
	public static void calcOperation(int i1, int i2, String op) {
		int num3 = 0;
		switch (op) {
		case "+":
			num3 = i1 + i2;
			System.out.println("두 변수의 합은 : " + num3);
			break;
		case "-":
			num3 = i1 - i2;
			System.out.println("두 변수의 차는 : " + num3);
			break;
		case "*":
			num3 = i1 * i2;
			System.out.println("두 변수의 곱은 : " + num3);
			break;
		case "/":
			double temp = (double) i1 / i2;
			System.out.printf("두 변수의 나눗셈은 %.2f", temp);
			break;
		default:
			System.out.println("사칙연산만 가능합니다. ");
			break;
		}
	}

}
