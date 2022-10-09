package 클래스;

public class Circle {
	// 접근제한자 private -> 은닉화 캡슐화 -> 외부에서 직접사용 불가
	private int radius; 
	private String color;
	// 생성자를 통한 맴버변수 초기화
	// 기본(Default)생성자
	public Circle() {
		this(1,"white");
	}
	// overloading - 과적
	public Circle(int radius, String color) {
		this.radius =  radius;
		this.color = color;
	}
//	public Circle(int radius) {
//		this.radius = radius;
//	}
//	public Circle(String color) {
//		this.color = color;
//	}
	// 필요한 기능 추가...
	
}
