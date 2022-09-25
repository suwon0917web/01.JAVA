package statement;

import java.util.Scanner;

/**
 *  사용자로부터 0 ~ 100 사이의 값을 입력받는다.(점수)
 *  Scanner 객체
 *  int jumsu에 저장한다
 *  90 이상이면 A
 *  80 ~ 90 B
 *  70 ~ 80 C
 *  60 ~ 70 D
 *  60 미만이면 F
 *  if ~ else if ~ else
 */
public class Main05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력하세요 : ");
		int jumsu =  sc.nextInt();
		if (jumsu >=90){
			System.out.println("A");
		}
		else if(jumsu >= 80) {
			System.out.println("B");
		}
		else if(jumsu >= 70) {
			System.out.println("C");
		}
		else if(jumsu >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}

}
