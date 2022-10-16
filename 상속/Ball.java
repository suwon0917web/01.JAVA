package 상속;

public class Ball extends Circle {
	private String color;

	public Ball() {
		// 부모와 자신의 생성자
//		super();
//		this("red");   생성자는 항상 먼저 호출되어야 함
		
		this("블랙");
//		this.color = "블랙";
	}
	public Ball(String color) {
		// super를 이용한 부모 생성자 호출
		super();
		this.color = color;		
	}

	public void findColor() {		
		System.out.println(color + " 공이다.");
	}

	public void findVolume() {
		System.out.println("부피는 4/3*(pi*반지름*반지름*반지름)이다.");		
	}
	
	// Ball과 Circle의 모든 메소드를 호출
	public void allMethodCalls() {
		// 부모의 메소드들		
		super.findArea();	// 부모의 모든 접근가능한 멤버에 접근이 가능  (private 제외)		
		super.findRadius();
		super.hiddenMethod();
		
		//자기꺼 메소드들  this... 현재클래스의 모든 멤버 접근
		this.findColor();
		this.findVolume();
		
	}

}
