package statement;

import java.util.Scanner;

public class Main07 {

	public static void main(String[] args) {
//		����ڷκ��� ������ ���� �� �Է¹޾Ƽ�
//		BMI = ������(KG) / (����(M)*����(M))
//		BMI ���� �Ʒ��� ������ �ش� ������ ���
//		18.5 ���ϸ� ��ü��
//		18.5 ~ 23�� ����
//		23 ~ 25�� ��ü��
//		25 ~ 30�� ��
//		30�̻��� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("������(kg) �� �Է��ϼ���");
		int weight =  sc.nextInt();
		System.out.print("����(cm) �� �Է��ϼ���");		
		double height =  sc.nextInt() / 100.0;
		double bmi = weight / (height*height);
		String bmiResult = "";
		if( bmi <= 18.5) {
			bmiResult = "��ü��";
		}else if(bmi <= 23) {
			bmiResult = "����";
		}else if(bmi <= 25) {
			bmiResult = "��ü��";
		}else if(bmi <= 30) {
			bmiResult = "��";
		}else {
			bmiResult = "����";
		}
		String result = String.format("������ : %d(kg), ���� : %d, bmi : %f ����� %s �Դϴ�."
				,weight, (int)(height*100), bmi, bmiResult );
		System.out.println(result);
		
		System.out.println("�⵵�� 4�ڸ��� �Է��ϼ���(�� 2022) : ");
		int year = sc.nextInt();
		if((year % 4 ==0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("����");
		}else {
			System.out.println("���");
		}
//     ���ϴ� �⵵�� 4�ڸ��� �޾Ƽ�.(������ 2022) 
//		���⿩�θ� �Ǵ��ϴ� ���α׷�
//		�׷������� ��Ȯ�� ���� ��Ģ�� ������ ����.
//		����1 ���� ��� ������ 4�� ������ �������� �ش� �������� �Ѵ�. ...
//		����2 ���� ��� ������ 4, 100���� ������ �������� �ش� ������� �Ѵ�. ...
//		����3 ���� ��� ������ 4, 100, 400���� ������ �������� �ش� �������� �д�
	}

}
