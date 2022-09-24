package datatype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * 리스트 정렬
 * 배열은 정렬이 안됨
 *
 */
public class List03 {
	public static void main(String[] args) {
		// 다른타입으로 변경을 고려하지 않고 오로지 기본타입의 배열을 사용할거면
		// int[]
		// 기본타입을 wrapper 클래스타입의 배열로 사용하면 다양한 클래스들끼리의 기능을 사용
		
		Integer[] ary = {5,2,3,7,1}; // 정수형 배열 초기화		
		System.out.println(ary[0]);
		
		List<Integer> lists = Arrays.asList(ary); // ary배여을 리스트로 변환
		// 요소를 한꺼번에 출력
		System.out.println(lists);
		
		// 다양한정렬
		lists.sort(null); // 기본이 오름차순
		System.out.println(lists);
		lists.sort(Comparator.reverseOrder()); // 내림차순은 옵션을 적용
		System.out.println(lists);
		ary =  lists.toArray(new Integer[0]);
		System.out.println(ary[0]);
		
		// 특정값이 배열에 있는지 조사
		System.out.println(lists.contains(5));  // 10이없으므로 false를 리턴
		
		
		// 배열의 값을 바로 다 출력하고 싶다.
		String[] aryStr = {"aaa","bbb","ccc"};
		System.out.println(Arrays.asList(aryStr));
		
		// 배열의 있는 각각의 요소를 특정 문자를 기준으로 합쳐준다.  String.join 을 사용		
		System.out.println( String.join(",", aryStr));
		
		// 정리
		// 리스트는 모든 데이터타입을지원
		// 1.만들때 저장할 타입지정
		// 2. 정렬을지원
		// 3. contains를 이용해서 값이 존재유무
		// Arrays 를 이용해서 기본데이터타입 배열을 리스트로 변환이 가능
		// 오리지널 배열이 할수 없는(하기에 복잡한) 기능을 메소드(함수)하나로 지원
		// 정렬(sort), 전체데이터출력(리스트 객체자체를 출력)
		// 리스트는 다시 배열로 변경  toArray(new 변경할클래스[0])
		
	}
}
