package statement;

import java.util.Scanner;

public class Main06 {

	public static void main(String[] args) {
		// ������ ���ǹ�.... if ~ else �������� �Ǿ��ְ� �� ���̺� ���๮�� �ϳ��϶�
		// ������ ���׿����ڷ� ��ü
		// �������Է¹޾Ƽ� ¦ Ȧ�� ����ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int jumsu = sc.nextInt();
		
		String result = "";
//		if (jumsu % 2 ==0) {
//			result = "¦��";
//		}else {
//			result ="Ȧ��";
//		}
		result = (jumsu % 2 ==0)? "¦��" : "Ȧ��";
		
		System.out.println(result);
	}

}
