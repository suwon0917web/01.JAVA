package ���ڿ��迭����Ÿ��;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// �ζǹ�ȣ ���� 1 ~ 45 ���ڸ� ���Ƿ� 6�� �����ϴ� ���α׷�
		// ����� �Ұ��� �Է��� �޾Ƽ� �ڵ� ���� (�ߺ�)
//		System.out.println( Math.random());	  // (0<=  x  < 1)*45   (0 <= x < 45) +1 : 1<=x<46
//		for (int i = 0; i < 6; i++) {
//			System.out.println( (int)(Math.random()*45)+1);			
//		}

		// �ʱ�ȭ
//		solution 1 : 1 ~ 45���� �����Ҽ� �ִ� �迭�� ������ʱ�ȭ
		int[] numbers = new int[45];		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}

		// �Է�
		Scanner sc = new Scanner(System.in);
		System.out.print("���Ӽ��� �Է��ϼ��� : ");
		int gamenum = sc.nextInt();

		for (int i = 0; i < gamenum; i++) {
			// ���μ���
			// �迭�� �����͸� �����ϰ� ����
			// 0��° �迭�� ������ ������ 1 ~ 44 ������ �ε����� �����ϰ� �����ϰ� ���� ��ȯ - ������ Ƚ��
			for (int j = 0; j < 100; j++) {
				int idx = (int) (Math.random() * 43) + 1;
				int temp = numbers[0];
				numbers[0] = numbers[idx];
				numbers[idx] = temp;
			}

			// ���
			// numbers�� �迭���� �����Ͱ� ���� �ִ�.... ó������ 6�� �������� �ȴ�.
			for (int j2 = 0; j2 < 6; j2++) {
				System.out.print(numbers[j2] + " ");
			}
			System.out.println(); // ���ӻ��� new line
		}

	}

}
