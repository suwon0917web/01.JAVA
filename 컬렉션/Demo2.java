package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		String[] animals1 = { "사슴", "호랑이", "바다표범", "곰" };
		// 컬렉션 계열의 객체를 생성
		// add 메소드를 이용해서 하나씩 add 한다.
		// 순환문
		List<String> customAry = new ArrayList<String>();  // 객체생성
		// 순환문을돌면서 animals1에 있는 데이터를 리스트에 추가한다
		for (String str : animals1) {
			customAry.add(str);
		}
		
		// 크기가 고정된 리스트로 반환  배열을 리스트처럼 사용할수 있도록 편리함제공
		List<String> animals2 = Arrays.asList(animals1);		
		animals2.set(1, "앵무새");
//        animals2.add("늑대");

		
		for (String s : animals2)
			System.out.print(s + " ");
		System.out.println();

		animals2.sort((x, y) -> x.length() - y.length());
		// 리스트를 배열로  변경하는데.. 이때 크기를 원래 갯수보다 작게 주면 원래갯수만큼 변환된다.
		String[] animals3 = animals2.toArray(new String[0]); // 1 : 1변환하기 위해서
		
		for (int i = 0; i < animals3.length; i++)
			System.out.print(animals3[i] + " ");
		System.out.println();

		// ImmutableCollections --> 변경불가능 객체이며 리스트 형태
		List<String> car = List.of("그랜저", "소나타", "아반테", "제네시스");
//        car.set(1, "싼타페");
//		car.add("aaaa");		
		car.forEach(s -> System.out.print(s + " "));

//        List<Object> objects = List.of("a", null);
	}

}
