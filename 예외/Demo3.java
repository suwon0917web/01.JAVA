package 예외;

import java.util.Scanner;

class Person{
	int age;
	String name;
}

public class Demo3 {

	public static void main(String[] args) {
		int dividend = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를입력하세요:");
		String num1 = sc.next();
		try {
			int divisor = Integer.parseInt(num1);
			System.out.println(dividend / divisor);
			Person p = null;
			p.age = 25;			
		}
		catch(Exception e) {
			System.out.println("공통 처리 로직");			
		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("원소가 존재하지 않습니다.");
//		} catch (NumberFormatException e) {
//			System.out.println("숫자가 아닙니다.");
//		} catch (ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다.");			
//		}		
		finally {
			System.out.println("항상 실행됩니다.");
		}
		System.out.println("종료.");


	}

}
