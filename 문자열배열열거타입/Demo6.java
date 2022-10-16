package 문자열배열열거타입;

import java.util.Scanner;

class DivideParam{
	public int num1,num2;
	public double result;
	public void caclDivide() {
		result =  num1 / (num2*1.0d);
	}
}

// 원소 하나를 갖는 배열을 만들면 더 간단해 진다.
public class Demo6 {
	public static void main(String[] args) {
		// 함수의 리턴결과를 2개이상 가지고 올때.. 
		// 사칙연산중에 나눗셈함수를 만든다.
		// 매개변수는 2개를 전달
		// 0으로 나누면 안되까.. 정상적으로 계산되면 True를 리턴  계산값을 취득 
		// 0으로 나누는 행위가 이루어지면 False를 리턴 - 값도 취득
		// 함수의 호출 결과로... 2가지 값을 획득
		DivideParam numbers = new DivideParam();
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하세요");
		numbers.num1 = sc.nextInt();
		System.out.println("값을 입력하세요");
		numbers.num2 = sc.nextInt();
		 
		
		if(!divide(numbers)) {
			System.out.println("잘못된 연산을 했습니다. 값을 확인해 주세요");
			return;
		}
		System.out.printf("연산의 결과는 : %.2f굈", numbers.result);
		
	}
	
	public static boolean divide(DivideParam numbers){
		if(numbers.num2 != 0)
		{
			numbers.caclDivide();
			return true;
		}
		else 			
			return false;
		
	}

}
