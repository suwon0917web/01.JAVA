package ��ȯ��;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ForDemo1 {

	public static void main(String[] args) {
		// ��ȯ�� Ƚ���� ������ �ְų� �˰� ������.
		// ������ �迭
		int[] ary = {1,2,3,4,5,6,7,8,9,10};
		
//		for (int i = 0; i < ary.length; i++) {
//			System.out.println(ary[i]);
//		}
		// ������ for --- ���� for  improve for stat......  ���� for
		// for each ....
		
//		for (int i : ary) {
//			System.out.println(i);
//		}		
		
//		Set<Integer> sets = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
//		for (Integer i : sets) {
//			System.out.println(i);
//		}
		Map<String, Integer> maps = new HashMap<String, Integer>();
		maps.put("001", 10);maps.put("002", 20);maps.put("003", 30);
		for (String i : maps.keySet()) {
			System.out.println(i+ " : " + maps.get(i));
		}
	}

}
