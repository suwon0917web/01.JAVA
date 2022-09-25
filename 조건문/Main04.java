package statement;

import java.util.Scanner;

public class Main04 {
	public static void main(String[] args) {
		// 사용자의 입력을 받는 객체를 하나 생성해서 사용
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int number =  scanner.nextInt();
		
//		5이상 10미만일때 	조건	
		if(  number>=5 && number < 10  ) {
			System.out.println("입력하신 숫자는 5이상 이고 10미만 입니다.");
		}
		
		
//		10이상이거나 또는 5미만일때  조건
		if(number >=10 || number < 5)
		System.out.println("입력하신 숫자는 10이상 또는 5미만의 수 입니다.");
		

	}

}
