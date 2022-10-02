package 순환문;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WhileDemo5 {

	public static void main(String[] args) {
//		정수형 set 만들어서 값을 1부터 10까지 저장
		Set<Integer> sets = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10)); 
//		lists.get(0) // index 0에 해당하는 값이 출력
		
		// 해당 원소에 짝수가 존재하는지 확인 있으면 true, 없으면 false를 출력
		// retainAll 교집합 함수를 이용해서 1~10사이의 짝수만 추출해서 set 집합을 만들고 출력
		Set<Integer> odds = new HashSet<Integer>(Arrays.asList(2,4,6,8,10));
		sets.retainAll(odds);
		System.out.println(sets);
		List<Integer> convertLists = new ArrayList<Integer>(sets);
		// while을 이용해서 convertLists값을 하나씩 출력

		//  순환문 while
		int i = 0; // 순환문을 제어하는 역활
		while(i < convertLists.size()) {
			System.out.println(convertLists.get(i));
			i++;
		}
		
		
		
		
	}

}
