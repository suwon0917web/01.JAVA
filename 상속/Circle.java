package 상속;

public class Circle {
	//  상속이 될까? 안된다.
	private void secret() {
		System.out.println("비밀이다.");
	}

	// 상속이 될까? 된다.- 그럼 public으로 하지 왜 protected를 만들고 썼을까?
	// protected 상속을 허용하는 private 이다-- 언제... 다른페키지에서
	// 동일패키지에서는 private을 제외하고는 전부 자유롭게 사용 가능
	protected void findRadius() {
		System.out.println("반지름이 10.0센티이다.");
	}

	// 상속뿐만아니라. 다양하게 제약없이 사용된다.
	public void findArea() {
		System.out.println("넓이는 (pi*반지름*반지름)이다.");
	}
	
	void hiddenMethod() {}

}
