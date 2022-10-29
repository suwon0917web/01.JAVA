package 예외;

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
			System.out.println("finally문장은 예외에 상관없이 실행된다");
		}
		
		System.out.println("마지막 문장");
	}

}
