package 스트리밍;

import java.util.stream.Stream;

public class Map1Demo {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("a1","a2","b1","b2","c1");
		// 모든 데이터를 대문자로변경
//		s1.map(x->x.toUpperCase()).forEach(Util::print);
//		s1.map(String::toUpperCase).forEach(Util::print);
		
//		String a = "a1";
//		System.out.println(a.substring(1));
//		a = "1";
//		System.out.println(Integer.valueOf(a) + 100);
		
		// s1에 있는 문자중에 숫자만 따로 분리해서 그중에 짝수만 출력
		s1.map(x->Integer.valueOf( x.substring(1) ) ).filter(x->x%2==0).forEach(Util::print);	
		
		

	}

}
