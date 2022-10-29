package 예외;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력:");
		String number = sc.next();
		
		int num = 0;
		try {
			num = convertStringToInt(number);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(num*2);

	}
	
	static int convertStringToInt(String number) throws Exception {
		int num = Integer.parseInt(number);
		return num;
	}
		

}
