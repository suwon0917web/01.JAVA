package ��ȯ��;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WhileDemo5 {

	public static void main(String[] args) {
//		������ set ���� ���� 1���� 10���� ����
		Set<Integer> sets = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10)); 
//		lists.get(0) // index 0�� �ش��ϴ� ���� ���
		
		// �ش� ���ҿ� ¦���� �����ϴ��� Ȯ�� ������ true, ������ false�� ���
		// retainAll ������ �Լ��� �̿��ؼ� 1~10������ ¦���� �����ؼ� set ������ ����� ���
		Set<Integer> odds = new HashSet<Integer>(Arrays.asList(2,4,6,8,10));
		sets.retainAll(odds);
		System.out.println(sets);
		List<Integer> convertLists = new ArrayList<Integer>(sets);
		// while�� �̿��ؼ� convertLists���� �ϳ��� ���

		//  ��ȯ�� while
		int i = 0; // ��ȯ���� �����ϴ� ��Ȱ
		while(i < convertLists.size()) {
			System.out.println(convertLists.get(i));
			i++;
		}
		
		
		
		
	}

}
