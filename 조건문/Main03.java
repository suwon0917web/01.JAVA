package statement;

public class Main03 {

	public static void main(String[] args) {
		boolean btrue = true;
		boolean bfalse = false;
		// ������ && and���� x
		System.out.println(btrue && btrue); // T && T -> 				T  
		System.out.println(btrue && bfalse);// T && F -> 				F
		System.out.println(bfalse && btrue);// F && T -> 				F
		System.out.println(bfalse && bfalse); // F && F -> 				F
		
		// ������ || or���� +  0�� �������� 0�������� ��� �� ��
		System.out.println(btrue && btrue); // T || T -> T  1+1 = 2  	T  
		System.out.println(btrue && bfalse);// T || F -> F  1+0 = 1  	T
		System.out.println(bfalse && btrue);// F || T -> F  0+1 =1   	T
		System.out.println(bfalse && bfalse); // F || F -> F 0+0 = 0 	F
		

	}

}
