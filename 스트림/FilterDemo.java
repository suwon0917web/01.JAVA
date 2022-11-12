package 스트리밍;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {		
//		Stream<String> s1 = Stream.of("a1","a222","c1","c223","c33333");
//		Stream<String> s2 = s1.filter(x -> x.length() > 2);
//		Stream<String> s3 = s2.skip(1);
//		System.out.println("문자열스트림");
////		s3.forEach(Util::print);
//		s3.forEach(x->System.out.print(x + " "));
		
		System.out.println("문자열스트림");
		// 위의 표현을 연속된 스트림형식으로변환 한줄로..
		Stream.of("a1","a222","c1","c223","c33333").filter(x -> x.length() > 2)
			.skip(1).forEach(x->System.out.print(x + " "));
		
		System.out.println();
		
		IntStream i1 = IntStream.of(1, 2, 1, 3, 3, 2, 4);
		i1.filter(x-> x%2 != 0).distinct().forEach(x->System.out.print(x + " "));
		//  출력  짝수만 출력
		// 중복을제거  distinct()
		
		System.out.print("굈인구가 1억(100백만) 이상의 2개 나라 : ");  // populationdl 100보다 큰 데이터들
		List<Nation> nations = Nation.nations;
		
//		int count = 1;
//		for (Nation n : nations) {
//			if (n.getPopulation() >= 100 && count <= 2) {
//				count++;
//				System.out.print(n.getName()+" ");
//			}
//		}
		
		Stream<Nation> n1 = nations.stream();
//		n1.filter(x->x.getPopulation() >= 100).limit(2).forEach(x->System.out.print(x+" "));
		n1.filter(x->x.getPopulation() >= 100).limit(2).forEach(Util::print);
		// 스트림써도 되고.. 그냥 알고있는 문법
		
	}

}
