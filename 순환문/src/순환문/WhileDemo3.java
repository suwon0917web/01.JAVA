package ��ȯ��;

public class WhileDemo3 {

	public static void main(String[] args) {
//		1. ������ �迭�� ����鼭 ���� 1~10���� ���� �迭
//		2. �� �迭�� ���� �����ؼ� ¦���� ���  2�� �������� ���� 0�� �Ǵ� ���� - ���ǹ�
//		3. while�� ���ǹ��� ����ؼ� ó��
//		2 4 6 8 10
		int[] ary = {1,2,3,4,5,6,7,8,9,10};
		
		int i = 0;
		while (i < ary.length) {	
			
			if(ary[i] %2 == 0) {
				System.out.print(ary[i]+" ");
			}
			
			i++;
		}

	}

}
