package ����;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] ary = {1,2};
			System.out.println(ary[2]); // ArrayIndexOutOfBoundsException
			System.out.println(10 / 0);   // ArithmeticException
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("ArithmeticException | ArrayIndexOutOfBoundsException" );
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}finally {
			System.out.println("finally������ ���ܿ� ������� ����ȴ�");
		}
		
		System.out.println("������ ����");
	}

}
