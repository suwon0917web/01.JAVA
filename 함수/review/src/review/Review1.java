package review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
	�迭
	collection
		List
		Map
		Set
	���ǹ�
		if
		switch
 */
public class Review1 {
	public static void main(String[] args) {
//		���Ұ� 5���� ������ ������ �迭�� ����� ������ ������ �ʱ�ȭ
		int[] ary = {1,2,3,4,5};
		int[] ary2 = new int[5];
		ary2[0] = 1;ary2[1] = 2;ary2[2] = 3;ary2[3] = 4;ary2[4] = 5;
//		������ �ε����� �迭�� ũ�� -1
		System.out.println("�������ε��� : " + (ary.length-1));
		
//		������ �����͸� �����Ҽ� �ִ� list,set �����ϰ� �����͸� �ѵΰ� ���� �Է�
//		�й��� �̸��� �ϳ��� ���ҷ� ���� map�� �����ϰ� ������ �����͸� �Է�
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		
//		key
		Set<Integer> set1 = new HashSet<Integer>(list1);
		set1.add(10);
		
//		key + value
		Map<String, String> hackbun = new HashMap<String, String>();		
		
		if(ary.length > 10) {
			System.out.println("�迭�� ũ��� 10���� Ů�ϴ�.");
		}else if(ary.length > 5) {  // �׿� ������ ���....
			// 10 9 8 7 6						
		}else {
			// 5 4 3 2 1 0 -1 ~~
		}
		
		if(ary.length > 10 && ary2.length > 5) {
			// �� ���� ��� ����
		}
		
		if(ary.length > 10 || ary2.length > 5) {
			// �� �߿� �ϳ��� ����
		}
//		if �ְ� �پ��� ���ǰ� ����(����.. ��Ÿ.... and or ������ ������)
		
		// case by case
		// �������� �ش� ���̽�... break�� ���������� ���� ����
		int value = 0;
		switch (value) {
		case 0:
			//
			break;
		case 1:
			//
			break;
		default:
			//
			break;
		}
		
		
		
		
		
		
		
		
		
		
	}

}
