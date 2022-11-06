package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ArrayListDemo {

	public static void main(String[] args) {
		// ������ ����Ʈ
		List<String> list = List.of("aa","bb","cc");
		// indexOf  ���ڿ��� ���° �ε���  �ε���/
		// contains ����Ʈ�߿� �ش� ���ڿ��� �ִ��� ���� true/false
		System.out.println(list.indexOf("bb"));  // 1
		System.out.println(list.indexOf("abb"));  // -1
		System.out.println(list.contains("a")); // false
		System.out.println(list.contains("aa")); // true
		
		// list�� ����Ұ����� ����Ʈ -- ���氡���� ���·� �ٲ�..
		List<String> list2 =  new ArrayList<String>(list);
		list2.add("dd");
		list2.set(0, "aaa");
		list2.remove(1);
		// ��� - ������ ���� Ȯ���� ����  consumer�� ���� �Լ��� �������̽��� �����ϴ� foreach
		list2.forEach(x->System.out.print(x + " "));
		System.out.println();
		
		List<String> list3 = new ArrayList<String>(list);
		System.out.println(list2.containsAll(list3));
		String a = "abc";		
		list3.forEach(x->System.out.print(x + " "));
		System.out.println();
		list3.removeIf(x->x.contains("b"));
		list3.forEach(x->System.out.print(x + " "));		
		System.out.println();
		System.out.println(list3.isEmpty());
		
		// �Լ��� �������̽�
		/**
		 Predicate - True/False  - �з��۾��� �ǹ�?
		   boolean test(T t)
		   
		 Consumer -  �Һ񰳳��ε� ���α׷������� ���޹����� ������ ��κ�  ��°��� ����
		   void accept(T t)
		   
		 Supplier - �����ϴ� �����Ͱ� ����  ���� ȣ���ϸ� ���ϴ� Ÿ���� �����͸� ��´�(Ÿ���� ����� ��ü�� Ÿ��)
		   T get()
		   
		 Function
		   R apply(T t)  - T�� �����ϸ� �����Ͻ������� �����ؼ� R�� ��´�
		  
		 */

	}

}
