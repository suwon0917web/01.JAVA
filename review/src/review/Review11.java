package review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * 함수형 인터페이스
 *
 */
interface Test{
	boolean isSuccess(int x);
}

class TestImpl implements Test{
	@Override
	public boolean isSuccess(int x) {		
		return x % 2 == 0;
	}	
}

public class Review11 {
	// 전달받은 집합성 데이터에중에 조건에 맞는 데이터만 추출한다
	public static void check(List<Integer> lists, Test t) {
		for (Integer data : lists) {
			if(t.isSuccess(data) )
				System.out.println(data);
		}
	}	
	
	public static void check2(List<Integer> lists, Predicate<Integer> t) {
		for (Integer data : lists) {
			if(t.test(data) )
				System.out.println(data);
		}
	}
	
	public static void main(String[] args) {		
		// immutable 객체  변경불가능 객체
		List<Integer> lists = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		lists.set(0, 100);
		System.out.println(lists);
		// 함수 적용
		TestImpl t = new TestImpl();
		check(lists,t); // 짝수만  클래스생성해서 전달 
		// 익명 클래스
		check(lists,new Test() {			
			@Override
			public boolean isSuccess(int x) {				
				return x % 2 !=0;
			}
		}); // 홀수만		
		// 람다  함수만 필요하므로  그래서 인터페이스만 있으면 됨
		check(lists,x-> x % 3 == 0 ); // 3의 배수
		
		check(lists,x-> x % 3 == 0 ); // 3의 배수
		
		check2(lists,x-> x>5);
		
		
	}

}
