package 다른페키지;

import 상속.Ball;

// 같은프로젝트의 다른패키지 테스트
// 패키지가  다르면.. public만 것만 사용가능
// 사용불능
//    	private
//		protected
//		생략

//패키지가  같으면
//	private 제외하고는 전부 다 사용 가능

public class Demo1 {

	public static void main(String[] args) {
		Ball b = new Ball("검정");
//		b.findRadius();  속성이 protected		
	}

}
