package statement;
/**
 * 조건문...
 * if ~else 
 * if ~else if ~ else
 * 
 * switch ~ case
 */
public class Main09 {
	enum Status{
		low,middle,hight
	}
	
	public static void main(String[] args) {
		// 문자,문자열,정수,ENUM 열거형 상수
		Status a = Status.low;
		switch (a) {
		case low:
			System.out.println("low");
			break;
		case middle:
			System.out.println("middle");
			break;
		case hight:
			System.out.println("hight");
			break;
		default:
			System.out.println("other");
			break;
		}

	}

}
