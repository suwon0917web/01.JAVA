package ��ȯ��;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WhileDemo6 {

	public static void main(String[] args) {
//		1. map �����͸� ������ �����
//		2. while���� �̿��ؼ� key : value ���� ���
		Map<String, Integer> maps = new HashMap<String, Integer>();
		maps.put("001", 10);maps.put("002", 20);maps.put("003", 30);
//		System.out.println(maps.get("001"));
		
		// Ű���� ����Ʈ�� ����
		Set<String> keys =  maps.keySet();	
		
		List<String> lists = new ArrayList<String>(keys);
		
		int i = 0;
		while(i < lists.size()) {
			System.out.println(lists.get(i) +" : " + maps.get(lists.get(i)) );
			i++;
		}		
	}

}
