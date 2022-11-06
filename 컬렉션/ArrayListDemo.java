package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ArrayListDemo {

	public static void main(String[] args) {
		// 문자형 리스트
		List<String> list = List.of("aa","bb","cc");
		// indexOf  문자열이 몇번째 인덱스  인덱스/
		// contains 리스트중에 해당 문자열이 있는지 여부 true/false
		System.out.println(list.indexOf("bb"));  // 1
		System.out.println(list.indexOf("abb"));  // -1
		System.out.println(list.contains("a")); // false
		System.out.println(list.contains("aa")); // true
		
		// list는 변경불가능한 리스트 -- 변경가능한 상태로 바꿔..
		List<String> list2 =  new ArrayList<String>(list);
		list2.add("dd");
		list2.set(0, "aaa");
		list2.remove(1);
		// 출력 - 간단히 내용 확인을 위해  consumer와 같은 함수형 인터페이스를 지원하는 foreach
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
		
		// 함수형 인터페이스
		/**
		 Predicate - True/False  - 분류작업의 의미?
		   boolean test(T t)
		   
		 Consumer -  소비개념인데 프로그램에서는 전달받을게 없으니 대부분  출력관련 로직
		   void accept(T t)
		   
		 Supplier - 전달하는 데이터가 없고  단지 호출하면 원하는 타입의 데이터를 얻는다(타입은 사용한 객체의 타입)
		   T get()
		   
		 Function
		   R apply(T t)  - T를 전달하면 비지니스로직을 적용해서 R을 얻는다
		  
		 */

	}

}
