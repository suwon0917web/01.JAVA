package statement;

public class Main02 {

	public static void main(String[] args) {
//		10 이상  A
//		5이상 10 미만 B
//		0이상 5미만 C
		int v = 7;
		System.out.println(v >=5);
		System.out.println(v < 10);
		if(v>=5) {
			if(v < 10) {
				System.out.println("v는 5이상 10 이하입니다.");
				// v 5 6 7 8 9
			}		
			// v는 5이상이면 무조건 실행
			System.out.println("v는 5이상 입니다.");
		}
		
	  // 논리연산  && || 
	  // &  |  비트연산
	}

}
