package statement;

import java.util.Scanner;

/**
 * if switch �����Ӱ� �г�� ������ �Է¹޾Ƽ� 4�г��� 70���̻��̸� �հ� 5�г��� 80�� �̻��̸� �հ� 6�г��� 90�� �̻��̸�
 * �հ� �׸���.. ���� ������ ��� �Է��̸� �߸��Է��߽��ϴ�. ���
 * 
 *
 */
public class Main11 {

	public static void main(String[] args) {
		System.out.println("�г�� ������ �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		int jumsu = sc.nextInt();
		if (!(grade >= 4 && grade <= 6 && jumsu >= 0 && jumsu <= 100)) {
			System.out.println("�߸� �Է��߽��ϴ�.");
			
		} else {
			switch (grade) {
			case 4:
				System.out.println((jumsu >= 70) ? "�հ�" : "���հ�");
				break;
			case 5:
				System.out.println((jumsu >= 80) ? "�հ�" : "���հ�");
				break;
			case 6:
				System.out.println((jumsu >= 90) ? "�հ�" : "���հ�");
				break;
			default:

				break;
			}
		}
	}

}
