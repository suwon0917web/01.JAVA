package ��ȯ��;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhileDemo4 {

	public static void main(String[] args) {
//		������ ����Ʈ�� ���� ���� 1���� 10���� ����
		List<Integer> lists = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10)) ; 
//		lists.get(0) // index 0�� �ش��ϴ� ���� ���
		int i = 0; // ��ȯ���� �����ϴ� ��Ȱ
		while(i < lists.size()) {
			if(lists.get(i) %2 == 0) {
				System.out.print(lists.get(i) + " ");
			}
			i++;
		}
	}

}
