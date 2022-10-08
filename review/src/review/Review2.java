package review;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * 배열과 반복문(순환문) 이용해서 간단한 문제
 */
public class Review2 {
	public static void main(String[] args) {
		Random rd = new Random();
		rd.nextInt(10);
//		1. 정수형 배열의 요소를 임의의  숫자로 30개 채워주세요(0~9)
		int[] ary = new int[30];
		for (int i = 0; i < ary.length; i++) {
			ary[i] = rd.nextInt(10);
		}
		System.out.println(Arrays.toString(ary));		
//		2. 1 2 3 1 2 3 5 4  이런식으로 나올텐데...각 숫자가 몇번 반복되었는지 count
//		hint : 배열의 인덱스를 이용한 계산 -> 카운트를 하는 새로운 배열이 필요
		int[] newary = new int[10]; // 0으로 자동 초기화
//		for (int data : ary) {
		for (int i = 0; i < ary.length; i++) {
			newary[ ary[i] ]++;
		}
		for (int i = 0; i < newary.length; i++) {
			String str =  String.format("%d : %d,  ", i, newary[i]);
			System.out.print(str);
		}
		// homework : 26 ~29 실행하면 마지막에 , 문자가 나오는데. 안나오게
		// homework : 한번도 안나온 숫자는 ???		
//		System.out.println(Arrays.toString(newary));		
		
//		3. 100이하의 자연수중에서 (0 ~ 99) 랜덤하게 번호를 선택(컴퓨터)
//		사람이 맞추는 게임. 규칙  예측한 값이 실제보다 작으면 작다.. 크면 크다 라고 말해준다. 
//		맞출때가지 게임을 지속하고 맞추면 몇번만에 맞췄는지.... -- while(true).. break
//		생각할문제는: 어떻게하면 가장적은횟수로 찾을까?
		
		int com = rd.nextInt(100);
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while(true) {
			System.out.print("굈값을 입력하세요(0~99) : ");
			int human =  sc.nextInt();			
			if(human > com)
				System.out.println("크다(입력한값이)");
			else if(human < com)
				System.out.println("작다(입력한값이)");
			else {
				System.out.println("정답");
				break;
			}
			count++;
		}				
		System.out.println("횟수 : "+  count);		 
	}

}
