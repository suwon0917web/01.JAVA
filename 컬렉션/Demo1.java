package collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Demo1 {
	public static void main(String[] args) {
		Collection<String> list = Arrays.asList("다람쥐", "개구리", "나비");
		
		int count = 0;
		for (String str : list) {
			if(count >= list.size()-1)
				System.out.println(str);
			else
				System.out.print(str+'-');
			count++;
		}
		
		// 반복자
		Iterator<String> its =  list.iterator();
		System.out.print(its.next());
		
		while (its.hasNext()) {
			String str = (String) its.next();	
			System.out.print("-" + str);
		}
		
		
		
	}
}
