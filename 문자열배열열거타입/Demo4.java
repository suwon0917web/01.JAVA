package 문자열배열열거타입;

// outer class

public class Demo4 {	
	// innner class --> 잘 사용하지 않음
	class Circle{
		public int radius;  // 객체의 맴버로서 변수는 초기화를 디폴트로 해준다.(메소드안으로들어가면...)		
	}

	public static void zero(Circle c) {
		c.radius = 0;
	}
	public static void zero(int radius) {
		radius = 0;
	}
	
	public static void main(String[] args) {
		// 객체  생성 (레퍼런스 속성)		
		Circle c = (new Demo4()).new Circle();		
		c.radius = 100;
		
		// 일반변수
		int radius = 100;
		
		// overload
		zero(c); // 데이터변경이 발생 -- 참조변수
		zero(radius); // 아무일도 생기지 않음
		// 함수를 호출한다음 매개변수 형태로 넘겨준 원본 데이터는 그후 어떻게 되었을까?
		

	}

}



