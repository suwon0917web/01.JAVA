package review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
	배열
	collection
		List
		Map
		Set
	조건문
		if
		switch
 */
public class Review1 {
	public static void main(String[] args) {
//		원소가 5개인 임의의 정수형 배열을 만들고 적당한 값으로 초기화
		int[] ary = {1,2,3,4,5};
		int[] ary2 = new int[5];
		ary2[0] = 1;ary2[1] = 2;ary2[2] = 3;ary2[3] = 4;ary2[4] = 5;
//		마지막 인덱스는 배열의 크기 -1
		System.out.println("마지막인덱스 : " + (ary.length-1));
		
//		정수형 데이터를 저장할수 있는 list,set 정의하고 데이터를 한두개 정도 입력
//		학번과 이름을 하나의 원소로 갖는 map을 정의하고 적당한 데이터를 입력
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		
//		key
		Set<Integer> set1 = new HashSet<Integer>(list1);
		set1.add(10);
		
//		key + value
		Map<String, String> hackbun = new HashMap<String, String>();		
		
		if(ary.length > 10) {
			System.out.println("배열의 크기는 10보다 큽니다.");
		}else if(ary.length > 5) {  // 그외 나머지 모두....
			// 10 9 8 7 6						
		}else {
			// 5 4 3 2 1 0 -1 ~~
		}
		
		if(ary.length > 10 && ary2.length > 5) {
			// 두 조건 모두 만족
		}
		
		if(ary.length > 10 || ary2.length > 5) {
			// 둘 중에 하나만 만족
		}
//		if 주고 다양한 조건과 결합(범위.. 기타.... and or 조건을 적절히)
		
		// case by case
		// 시작점이 해당 케이스... break를 만날때까지 전부 실행
		int value = 0;
		switch (value) {
		case 0:
			//
			break;
		case 1:
			//
			break;
		default:
			//
			break;
		}
		
		
		
		
		
		
		
		
		
		
	}

}
