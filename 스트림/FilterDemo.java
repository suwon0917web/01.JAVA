package ��Ʈ����;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {		
//		Stream<String> s1 = Stream.of("a1","a222","c1","c223","c33333");
//		Stream<String> s2 = s1.filter(x -> x.length() > 2);
//		Stream<String> s3 = s2.skip(1);
//		System.out.println("���ڿ���Ʈ��");
////		s3.forEach(Util::print);
//		s3.forEach(x->System.out.print(x + " "));
		
		System.out.println("���ڿ���Ʈ��");
		// ���� ǥ���� ���ӵ� ��Ʈ���������κ�ȯ ���ٷ�..
		Stream.of("a1","a222","c1","c223","c33333").filter(x -> x.length() > 2)
			.skip(1).forEach(x->System.out.print(x + " "));
		
		System.out.println();
		
		IntStream i1 = IntStream.of(1, 2, 1, 3, 3, 2, 4);
		i1.filter(x-> x%2 != 0).distinct().forEach(x->System.out.print(x + " "));
		//  ���  ¦���� ���
		// �ߺ�������  distinct()
		
		System.out.print("�n�α��� 1��(100�鸸) �̻��� 2�� ���� : ");  // populationdl 100���� ū �����͵�
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
		// ��Ʈ���ᵵ �ǰ�.. �׳� �˰��ִ� ����
		
	}

}
