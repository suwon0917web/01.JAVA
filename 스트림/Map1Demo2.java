package ��Ʈ����;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Map1Demo2 {

	public static void main(String[] args) {
		List<String> list1 = List.of("�ȳ��ϼ���","�ڹ�","�ݰ� ����","�ڹٽ�ũ��Ʈ");
		Stream<String> s1 = list1.stream();
		Stream<String> s2 = s1.flatMap(x->Arrays.stream(x.split(" ")));
//		Stream<Object> s2 = s1.map(x->x.split(" ") );
		s2.forEach(Util::print);
		
		System.out.println();
		String a = "�ݰ� ����";
		System.out.println(a.split(" "));
	}

}
