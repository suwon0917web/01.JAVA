package review;

import java.util.Scanner;

/**
 * 
 * 상속 - refactoring
 *   override(overwrite) - 재정의 - 함수의 내용을 빼고는 전부 같아야 함
 *   overload - 함수의 중복 - 매개변수의 형태가 다르다(갯수, 타입) - 리턴타입은 상관없다
 */

class Shape{
	Object getArea() {return null;}
}

class Circle extends Shape{
	static final double PI = 3.14;  // 상수
	int radius;
	@Override
	Object getArea() {
		return PI*radius*radius;
	}
}
class Ractangel extends Shape{
	int width,height;

	@Override
	Object getArea() {
		return width*height;
	}
}
class TryAngle extends Shape{
	int width,height;
	@Override
	Object getArea() {
		return width*height/2.0;
	}	
}



public class Review7 {
	
	public static void main(String[] args) {
		Scanner sc;
		Review1 r;
	}
	

}
