package review;

public class Review3 {
	public static void main(String[] args) {
		int[] ary = {10,20,30,40,50};
		System.out.println(ary[0]);
		
		// �迭��ҿ� ���� ���� ���� i�� �迭�� �ε��� ��ȣ
		// int i�� �迭 �ε���
		for (int i = 0; i < ary.length; i++) {
			
		}
		
		// �迭��Ҹ� for���� �˾Ƽ� �����ͼ� ���� i�� ���� ������  ���⼭ �ε��� ������ ����
		// int i�� �迭����� ��
		for (int i : ary) {
			i = 100;
		}
		
	}

}
