package 문자열배열열거타입;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// 로또번호 생성 1 ~ 45 숫자를 임의로 6개 생성하는 프로그램
		// 몇게임 할건지 입력을 받아서 자동 생성 (중복)
//		System.out.println( Math.random());	  // (0<=  x  < 1)*45   (0 <= x < 45) +1 : 1<=x<46
//		for (int i = 0; i < 6; i++) {
//			System.out.println( (int)(Math.random()*45)+1);			
//		}

		// 초기화
//		solution 1 : 1 ~ 45까지 저장할수 있는 배열을 만들고초기화
		int[] numbers = new int[45];		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}

		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("게임수를 입력하세요 : ");
		int gamenum = sc.nextInt();

		for (int i = 0; i < gamenum; i++) {
			// 프로세스
			// 배열의 데이터를 랜덤하게 섞기
			// 0번째 배열을 제외한 나머지 1 ~ 44 까지의 인덱스를 랜덤하게 선택하고 서로 교환 - 적당한 횟수
			for (int j = 0; j < 100; j++) {
				int idx = (int) (Math.random() * 43) + 1;
				int temp = numbers[0];
				numbers[0] = numbers[idx];
				numbers[idx] = temp;
			}

			// 출력
			// numbers의 배열에는 데이터가 섞여 있다.... 처음부터 6개 가져오면 된다.
			for (int j2 = 0; j2 < 6; j2++) {
				System.out.print(numbers[j2] + " ");
			}
			System.out.println(); // 게임사이 new line
		}

	}

}
