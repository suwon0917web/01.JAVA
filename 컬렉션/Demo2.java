package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		String[] animals1 = { "�罿", "ȣ����", "�ٴ�ǥ��", "��" };
		// �÷��� �迭�� ��ü�� ����
		// add �޼ҵ带 �̿��ؼ� �ϳ��� add �Ѵ�.
		// ��ȯ��
		List<String> customAry = new ArrayList<String>();  // ��ü����
		// ��ȯ�������鼭 animals1�� �ִ� �����͸� ����Ʈ�� �߰��Ѵ�
		for (String str : animals1) {
			customAry.add(str);
		}
		
		// ũ�Ⱑ ������ ����Ʈ�� ��ȯ  �迭�� ����Ʈó�� ����Ҽ� �ֵ��� ��������
		List<String> animals2 = Arrays.asList(animals1);		
		animals2.set(1, "�޹���");
//        animals2.add("����");

		
		for (String s : animals2)
			System.out.print(s + " ");
		System.out.println();

		animals2.sort((x, y) -> x.length() - y.length());
		// ����Ʈ�� �迭��  �����ϴµ�.. �̶� ũ�⸦ ���� �������� �۰� �ָ� ����������ŭ ��ȯ�ȴ�.
		String[] animals3 = animals2.toArray(new String[0]); // 1 : 1��ȯ�ϱ� ���ؼ�
		
		for (int i = 0; i < animals3.length; i++)
			System.out.print(animals3[i] + " ");
		System.out.println();

		// ImmutableCollections --> ����Ұ��� ��ü�̸� ����Ʈ ����
		List<String> car = List.of("�׷���", "�ҳ�Ÿ", "�ƹ���", "���׽ý�");
//        car.set(1, "��Ÿ��");
//		car.add("aaaa");		
		car.forEach(s -> System.out.print(s + " "));

//        List<Object> objects = List.of("a", null);
	}

}
