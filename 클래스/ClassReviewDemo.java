package 클래스;

public class ClassReviewDemo {

	public static void main(String[] args) {
//		ClassReview.MAXCOUNT = 200;  상수이기때문에 값을 할당 받을수 없다
		ClassReview.abs(-115);
		
		ClassReview review = new ClassReview(); // 초기화 - 스테틱블럭, 블럭, 생성자
		review.setPrivateValue(0).setPublicValue(0);
		

	}

}
