package statement;

import java.util.Scanner;

public class Main04 {
	public static void main(String[] args) {
		// ������� �Է��� �޴� ��ü�� �ϳ� �����ؼ� ���
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		int number =  scanner.nextInt();
		
//		5�̻� 10�̸��϶� 	����	
		if(  number>=5 && number < 10  ) {
			System.out.println("�Է��Ͻ� ���ڴ� 5�̻� �̰� 10�̸� �Դϴ�.");
		}
		
		
//		10�̻��̰ų� �Ǵ� 5�̸��϶�  ����
		if(number >=10 || number < 5)
		System.out.println("�Է��Ͻ� ���ڴ� 10�̻� �Ǵ� 5�̸��� �� �Դϴ�.");
		

	}

}
