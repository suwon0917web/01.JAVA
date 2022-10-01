package 순환문;

public class WhileDemo1 {

	public static void main(String[] args) {
//		반복문 , 순환문  -> 조건을 만족하지 않으면 탈출
		
		int[] ary = {1,2,3,4,5};
		
		// 배열의 각 요소를 출력하는 문장
		int i = 0;
		while (i < ary.length) {
			System.out.println(i);
			i++;
		}
	}

}
