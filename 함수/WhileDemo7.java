package ��ȯ��;

public class WhileDemo7 {

	public static void main(String[] args) {
//		������ ��� 2 ~ 9
		int i = 2;
		while(i < 10) {
			int column = 1, row = i;
			while (column < 10) {
				System.out.printf("%4d", row * column);
				column++;
			}			
			i++;
			System.out.println();
		}
		
		

	}

}
