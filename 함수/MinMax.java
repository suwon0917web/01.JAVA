package 순환문;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MinMax {

	public static void main(String[] args) {
		// 주어진 데이터의 집합에서 최대값과 최소값을 찾아보자
		// 단.. 라이브러리를 사용하지 말것.
		Random rd = new Random();
//		System.out.println(rd.nextInt(100)); // 0 ~ 100 사이의 임의의 숫자를 발생하는 명령어
//		1. 난수 10개를 생성해서 정수형 배열에 담고  배열명은 randomAry10
		int[] randomAry10 = new int[10];
		for (int i = 0; i < randomAry10.length; i++) {
			randomAry10[i] = rd.nextInt(100);
		}
		// 랜덤으로 입력된 값을 출력
		System.out.print("현재 배열의 요소들 : ");
		for (int i : randomAry10) {
			System.out.print(i+" ");
		}
		System.out.println();
//		2. 배열중에 짝수만 출력
		System.out.print("짝수만 출력 : ");
		for (int i : randomAry10) {
			if(i%2 == 0)
				System.out.print(i+" ");
		}
		System.out.println();
//		3. 각 배열의 값을 순서대로 더하는데 이때 그 합이 100을 넘기는순간의 인덱스 번호(배열의 위치)
		int arysum = 0;
		for (int i = 0; i < randomAry10.length; i++) {
			arysum += randomAry10[i];
			if(arysum > 300) {
				System.out.println("현재까지의 합 : "+arysum + " , 인덱스 :" + i);
				break;
			}				
		}
//		4. 배열의 최대값 최소값
		int min = randomAry10[0], max = randomAry10[0];
		for (int i : randomAry10) {
			if(i > max)
				max = i;
			if(i < min)
				min = i;
		}
		System.out.println("최대값 : "+max +" , 최소값 : " + min);
	}

}
