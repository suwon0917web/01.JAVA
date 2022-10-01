package 순환문;

public class WhileDemo3 {

	public static void main(String[] args) {
//		1. 정수형 배열을 만들면서 값을 1~10까지 갖는 배열
//		2. 각 배열을 값을 조사해서 짝수만 출력  2로 나눴을대 값이 0이 되는 숫자 - 조건문
//		3. while과 조건문을 사용해서 처리
//		2 4 6 8 10
		int[] ary = {1,2,3,4,5,6,7,8,9,10};
		
		int i = 0;
		while (i < ary.length) {	
			
			if(ary[i] %2 == 0) {
				System.out.print(ary[i]+" ");
			}
			
			i++;
		}

	}

}
