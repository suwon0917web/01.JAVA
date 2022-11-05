package review;

import java.util.Arrays;
import java.util.Comparator;

public class Review9 {

	public static void main(String[] args) {
		String[] strings = {
				"���ع���","��λ���","������","�굵��"
		};
		// ������ �⺻�� ��������  first - second
//		Arrays.sort(strings);  // ���ڿ��� ������ ���̷� ũ�� ������ �Ǵ��ؼ� ����
		
//		Arrays.sort(strings, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {				
//				return o2.compareTo(o1);
//			}
//		});
		
		Arrays.sort(strings, (o1, o2)-> {return o2.compareTo(o1);} );
		Arrays.sort(strings, (o1, o2)-> o2.compareTo(o1) );
		
		for (String str : strings) {
			System.out.println(str);
		}
		
	}

}
