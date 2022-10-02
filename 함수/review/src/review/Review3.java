package review;

public class Review3 {
	public static void main(String[] args) {
		int[] ary = {10,20,30,40,50};
		System.out.println(ary[0]);
		
		// 배열요소에 직접 접근 변수 i는 배열의 인덱스 번호
		// int i는 배열 인덱스
		for (int i = 0; i < ary.length; i++) {
			
		}
		
		// 배열요소를 for문이 알아서 가져와서 변수 i에 값을 전달함  여기서 인덱스 개념이 없음
		// int i는 배열요소의 값
		for (int i : ary) {
			i = 100;
		}
		
	}

}
