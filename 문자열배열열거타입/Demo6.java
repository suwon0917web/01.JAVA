package ���ڿ��迭����Ÿ��;

import java.util.Scanner;

class DivideParam{
	public int num1,num2;
	public double result;
	public void caclDivide() {
		result =  num1 / (num2*1.0d);
	}
}

// ���� �ϳ��� ���� �迭�� ����� �� ������ ����.
public class Demo6 {
	public static void main(String[] args) {
		// �Լ��� ���ϰ���� 2���̻� ������ �ö�.. 
		// ��Ģ�����߿� �������Լ��� �����.
		// �Ű������� 2���� ����
		// 0���� ������ �ȵǱ�.. ���������� ���Ǹ� True�� ����  ��갪�� ��� 
		// 0���� ������ ������ �̷������ False�� ���� - ���� ���
		// �Լ��� ȣ�� �����... 2���� ���� ȹ��
		DivideParam numbers = new DivideParam();
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		numbers.num1 = sc.nextInt();
		System.out.println("���� �Է��ϼ���");
		numbers.num2 = sc.nextInt();
		 
		
		if(!divide(numbers)) {
			System.out.println("�߸��� ������ �߽��ϴ�. ���� Ȯ���� �ּ���");
			return;
		}
		System.out.printf("������ ����� : %.2f�n", numbers.result);
		
	}
	
	public static boolean divide(DivideParam numbers){
		if(numbers.num2 != 0)
		{
			numbers.caclDivide();
			return true;
		}
		else 			
			return false;
		
	}

}
