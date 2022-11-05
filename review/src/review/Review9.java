package review;

import java.util.Arrays;
import java.util.Comparator;

public class Review9 {

	public static void main(String[] args) {
		String[] strings = {
				"동해물과","백두산이","마르고","닿도록"
		};
		// 정렬의 기본은 오름차순  first - second
//		Arrays.sort(strings);  // 문자열의 길이의 차이로 크고 작음을 판단해서 정렬
		
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
