package �Լ�;

import java.util.Scanner;

/**
 * 1. �ڵ��� ��Ȱ�� - �ݺ���� 2. ������ ���� - �������� ����
 */
public class MethodDemo1 {
//	1. ����ڷκ��� �������� 2���� �Է¹޾Ƽ� ���ϴ� ���α׷��� �ۼ�
	public static void main(String[] args) {
		// �����ڷκ��� ���� �Է¹޴� �Լ�		
		int num1 = inputNumber(), num2 = inputNumber();
		if(num1 ==-1 || num2 == -1)
			return;
		// �ΰ��� ������ �޾Ƽ� ó���ϴ� �Լ�
		fourCalc(num1, num2);

	}

//	2 .�ڵ��� �������� ���δ�.
	public static int inputNumber() {
		System.out.println("0~100������ ���� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int num =  sc.nextInt();
		if(num <0 || num >100) {
			System.out.println("�߸� �Է��߽��ϴ�. ���� ������ Ȯ���ϼ���");
			return -1;
		}
		return num;
			
	}

	public static void fourCalc(int num1, int num2) {
		calcOperation(num1, num2, "+");
		calcOperation(num1, num2, "-");
		calcOperation(num1, num2, "*");
		calcOperation(num1, num2, "/");
	}

//	1. �ڵ��� ��Ȱ�� - �ݺ����	
	public static void calcOperation(int i1, int i2, String op) {
		int num3 = 0;
		switch (op) {
		case "+":
			num3 = i1 + i2;
			System.out.println("�� ������ ���� : " + num3);
			break;
		case "-":
			num3 = i1 - i2;
			System.out.println("�� ������ ���� : " + num3);
			break;
		case "*":
			num3 = i1 * i2;
			System.out.println("�� ������ ���� : " + num3);
			break;
		case "/":
			double temp = (double) i1 / i2;
			System.out.printf("�� ������ �������� %.2f", temp);
			break;
		default:
			System.out.println("��Ģ���길 �����մϴ�. ");
			break;
		}
	}

}
