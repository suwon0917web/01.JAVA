package review;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * �迭�� �ݺ���(��ȯ��) �̿��ؼ� ������ ����
 */
public class Review2 {
	public static void main(String[] args) {
		Random rd = new Random();
		rd.nextInt(10);
//		1. ������ �迭�� ��Ҹ� ������  ���ڷ� 30�� ä���ּ���(0~9)
		int[] ary = new int[30];
		for (int i = 0; i < ary.length; i++) {
			ary[i] = rd.nextInt(10);
		}
		System.out.println(Arrays.toString(ary));		
//		2. 1 2 3 1 2 3 5 4  �̷������� �����ٵ�...�� ���ڰ� ��� �ݺ��Ǿ����� count
//		hint : �迭�� �ε����� �̿��� ��� -> ī��Ʈ�� �ϴ� ���ο� �迭�� �ʿ�
		int[] newary = new int[10]; // 0���� �ڵ� �ʱ�ȭ
//		for (int data : ary) {
		for (int i = 0; i < ary.length; i++) {
			newary[ ary[i] ]++;
		}
		for (int i = 0; i < newary.length; i++) {
			String str =  String.format("%d : %d,  ", i, newary[i]);
			System.out.print(str);
		}
		// homework : 26 ~29 �����ϸ� �������� , ���ڰ� �����µ�. �ȳ�����
		// homework : �ѹ��� �ȳ��� ���ڴ� ???		
//		System.out.println(Arrays.toString(newary));		
		
//		3. 100������ �ڿ����߿��� (0 ~ 99) �����ϰ� ��ȣ�� ����(��ǻ��)
//		����� ���ߴ� ����. ��Ģ  ������ ���� �������� ������ �۴�.. ũ�� ũ�� ��� �����ش�. 
//		���⶧���� ������ �����ϰ� ���߸� ������� �������.... -- while(true).. break
//		�����ҹ�����: ����ϸ� ��������Ƚ���� ã����?
		
		int com = rd.nextInt(100);
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while(true) {
			System.out.print("�n���� �Է��ϼ���(0~99) : ");
			int human =  sc.nextInt();			
			if(human > com)
				System.out.println("ũ��(�Է��Ѱ���)");
			else if(human < com)
				System.out.println("�۴�(�Է��Ѱ���)");
			else {
				System.out.println("����");
				break;
			}
			count++;
		}				
		System.out.println("Ƚ�� : "+  count);		 
	}

}
