package statement;

public class Main02 {

	public static void main(String[] args) {
//		10 �̻�  A
//		5�̻� 10 �̸� B
//		0�̻� 5�̸� C
		int v = 7;
		System.out.println(v >=5);
		System.out.println(v < 10);
		if(v>=5) {
			if(v < 10) {
				System.out.println("v�� 5�̻� 10 �����Դϴ�.");
				// v 5 6 7 8 9
			}		
			// v�� 5�̻��̸� ������ ����
			System.out.println("v�� 5�̻� �Դϴ�.");
		}
		
	  // ������  && || 
	  // &  |  ��Ʈ����
	}

}
