package ��ȯ��;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MinMax {

	public static void main(String[] args) {
		// �־��� �������� ���տ��� �ִ밪�� �ּҰ��� ã�ƺ���
		// ��.. ���̺귯���� ������� ����.
		Random rd = new Random();
//		System.out.println(rd.nextInt(100)); // 0 ~ 100 ������ ������ ���ڸ� �߻��ϴ� ��ɾ�
//		1. ���� 10���� �����ؼ� ������ �迭�� ���  �迭���� randomAry10
		int[] randomAry10 = new int[10];
		for (int i = 0; i < randomAry10.length; i++) {
			randomAry10[i] = rd.nextInt(100);
		}
		// �������� �Էµ� ���� ���
		System.out.print("���� �迭�� ��ҵ� : ");
		for (int i : randomAry10) {
			System.out.print(i+" ");
		}
		System.out.println();
//		2. �迭�߿� ¦���� ���
		System.out.print("¦���� ��� : ");
		for (int i : randomAry10) {
			if(i%2 == 0)
				System.out.print(i+" ");
		}
		System.out.println();
//		3. �� �迭�� ���� ������� ���ϴµ� �̶� �� ���� 100�� �ѱ�¼����� �ε��� ��ȣ(�迭�� ��ġ)
		int arysum = 0;
		for (int i = 0; i < randomAry10.length; i++) {
			arysum += randomAry10[i];
			if(arysum > 300) {
				System.out.println("��������� �� : "+arysum + " , �ε��� :" + i);
				break;
			}				
		}
//		4. �迭�� �ִ밪 �ּҰ�
		int min = randomAry10[0], max = randomAry10[0];
		for (int i : randomAry10) {
			if(i > max)
				max = i;
			if(i < min)
				min = i;
		}
		System.out.println("�ִ밪 : "+max +" , �ּҰ� : " + min);
	}

}
