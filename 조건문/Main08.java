package statement;

import java.util.Scanner;

public class Main08 {

	public static void main(String[] args) {
		// ���� Main07���� 3�׿����ڸ� ����Ҽ� �ִ� �κ��� ������ ����
		
		// BMI = ������(KG) / (����(M)*����(M))
//		����ڷκ��� �������� �Է¹޴´�.
//		bmi ������ ��������� ������ ������ �󸶺��� �󸶻��̿� �־�� �ϴ����� ���
//		bmi*(h*h) = w / (h*h)*(h*h)
//		bmi 18.5, 23
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Ը� �Է��ϼ���(kg) : ");
		int w = sc.nextInt();
		double hFrom = Math.sqrt( w / 18.5);
		double hTo = Math.sqrt( w / 23);
		System.out.println(hFrom);
		System.out.println(hTo);
		
				
	}

}
