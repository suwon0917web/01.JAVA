package ��ȯ��;

import java.util.Scanner;

public class BreakDemo1 {
	
	public static void main(String[] args) {
//		1. ����ڷκ��� ������ ���� �Է¹޴´�.
//		2. �Է¹��� ������ ��� ���� ������.
//		3. �� ���� 100�� ������ �����Ѵ�.
		int total = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("���������� ���� �Է��ϼ���");
			int number =  sc.nextInt();
			total += number;
			if(total > 100)
				break;
		}
		System.out.println("total = " + total);
			

	}

}
