package review;

import java.text.SimpleDateFormat;
import java.util.Date;

//함수
class Temp{
	
}
public class Review4 {

	// 시작함수
	public static void main(String[] args) {
		System.out.print(method1("이규영"));
		method2();
		method3("이규영");
		System.out.println(method4());
	}
	// 4가지 케이스(만드는 방법)
	// 1 입력과 출력
	public static String method1(String msg) {		
		return String.format("입력하신 문자는 %s 입니다.굈",msg);
	}
	// 2. 입력과 출력이 없는경우
	public static void method2() {
		System.out.println("입력과 출력이 없는 함수를 호출했습니다.");
	}
	// 3. 입력만 있는경우
	public static void method3(String msg) {
		System.out.printf("입력하신 문자는 %s 입니다.굈",msg);
	}
	// 4 출력만 있는경우
	public static String method4() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
		Date now = new Date();		
		return sdf.format(now);
	}

}
