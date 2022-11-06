package collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Demo1 {
	public static void main(String[] args) {
		Collection<String> list = Arrays.asList("�ٶ���", "������", "����");
		
		int count = 0;
		for (String str : list) {
			if(count >= list.size()-1)
				System.out.println(str);
			else
				System.out.print(str+'-');
			count++;
		}
		
		// �ݺ���
		Iterator<String> its =  list.iterator();
		System.out.print(its.next());
		
		while (its.hasNext()) {
			String str = (String) its.next();	
			System.out.print("-" + str);
		}
		
		
		
	}
}
