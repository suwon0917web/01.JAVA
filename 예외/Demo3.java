package ����;

import java.util.Scanner;

class Person{
	int age;
	String name;
}

public class Demo3 {

	public static void main(String[] args) {
		int dividend = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ��Է��ϼ���:");
		String num1 = sc.next();
		try {
			int divisor = Integer.parseInt(num1);
			System.out.println(dividend / divisor);
			Person p = null;
			p.age = 25;			
		}
		catch(Exception e) {
			System.out.println("���� ó�� ����");			
		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("���Ұ� �������� �ʽ��ϴ�.");
//		} catch (NumberFormatException e) {
//			System.out.println("���ڰ� �ƴմϴ�.");
//		} catch (ArithmeticException e) {
//			System.out.println("0���� ���� �� �����ϴ�.");			
//		}		
		finally {
			System.out.println("�׻� ����˴ϴ�.");
		}
		System.out.println("����.");


	}

}
