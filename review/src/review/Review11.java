package review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * �Լ��� �������̽�
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
	// ���޹��� ���ռ� �����Ϳ��߿� ���ǿ� �´� �����͸� �����Ѵ�
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
		// immutable ��ü  ����Ұ��� ��ü
		List<Integer> lists = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		lists.set(0, 100);
		System.out.println(lists);
		// �Լ� ����
		TestImpl t = new TestImpl();
		check(lists,t); // ¦����  Ŭ���������ؼ� ���� 
		// �͸� Ŭ����
		check(lists,new Test() {			
			@Override
			public boolean isSuccess(int x) {				
				return x % 2 !=0;
			}
		}); // Ȧ����		
		// ����  �Լ��� �ʿ��ϹǷ�  �׷��� �������̽��� ������ ��
		check(lists,x-> x % 3 == 0 ); // 3�� ���
		
		check(lists,x-> x % 3 == 0 ); // 3�� ���
		
		check2(lists,x-> x>5);
		
		
	}

}
