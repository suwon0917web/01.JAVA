package 인터페이스;

// Extends  확장.. 기존의 A를 가지고 새로운 B를 만든다
// 상속... 클래스간의

// 클래스중에는  맴버함수중에 불완전하게 생성 - 내용이 없다..  void show();
// 추상메소드.... abstract void show();
// 클래스가 추상메소드를 한개 이상 가지고 있으면  추상클래스
// public abstract calss ....
// extends를 사용해서 추상 클래스들끼리 상속

// 인터페이스 : 순수추상클래스 : 모든 매소드가 전부 추상메소드로 이루어진 클래스
// class 키워드 대신에 interface 키워드를 사용
// 인터페이스를 상속받는 클래스는 모든 매소드를 구현해야한다... extends 키워드는 부적합(의미상)
// 구현하다... Implements  
// 클래스가 인터페이스를 상속받으면 키워드는 Implements를 사용

// 클래스는 실행가능해야 한다.->객체생성이 가능해야하고->객체를 통해 완전한 기능을 수행
// 클래스 extends 클래스
// 클래스 extends 추상클래스-> 추상메소드를 반드시 구현
// 인터페이스 extends 인터페이스

// 클래스  implements 인터페이스

// 인터페이스는 다중 상속을 허용
// 클래스 extends 클래스 implements 인터페이스1,인터페이스2.....


public class ExtentsImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
