package review;

import java.util.Scanner;

/**
 * 
 * ��� - refactoring
 *   override(overwrite) - ������ - �Լ��� ������ ����� ���� ���ƾ� ��
 *   overload - �Լ��� �ߺ� - �Ű������� ���°� �ٸ���(����, Ÿ��) - ����Ÿ���� �������
 */

class Shape{
	Object getArea() {return null;}
}

class Circle extends Shape{
	static final double PI = 3.14;  // ���
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
