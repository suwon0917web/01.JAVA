package statement;

import java.util.Scanner;

/**
 *  ����ڷκ��� 0 ~ 100 ������ ���� �Է¹޴´�.(����)
 *  Scanner ��ü
 *  int jumsu�� �����Ѵ�
 *  90 �̻��̸� A
 *  80 ~ 90 B
 *  70 ~ 80 C
 *  60 ~ 70 D
 *  60 �̸��̸� F
 *  if ~ else if ~ else
 */
public class Main05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
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
