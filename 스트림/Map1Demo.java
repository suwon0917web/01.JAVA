package ��Ʈ����;

import java.util.stream.Stream;

public class Map1Demo {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("a1","a2","b1","b2","c1");
		// ��� �����͸� �빮�ڷκ���
//		s1.map(x->x.toUpperCase()).forEach(Util::print);
//		s1.map(String::toUpperCase).forEach(Util::print);
		
//		String a = "a1";
//		System.out.println(a.substring(1));
//		a = "1";
//		System.out.println(Integer.valueOf(a) + 100);
		
		// s1�� �ִ� �����߿� ���ڸ� ���� �и��ؼ� ���߿� ¦���� ���
		s1.map(x->Integer.valueOf( x.substring(1) ) ).filter(x->x%2==0).forEach(Util::print);	
		
		

	}

}
