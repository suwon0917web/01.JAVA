package ���ٽ�;

import java.util.Arrays;

interface Test{
	int show(int x);
}

public class Lambda01 {

	
	public static void main(String[] args) {
		String[] ary = {
				"����",
				"���� ��λ���",
				"������ �⵵��"
		};
		ary[0].length();
//		Arrays.sort(ary,(x,y) -> {return x.length() - y.length(); } ); 
		Arrays.sort(ary,(x,y) -> x.length() - y.length());
		
		Test t = (int x)-> -x;
		Test t2 = (int x) -> {return -x;};
		Test t3 = (x) -> -x;
		Test t4 = (x) -> {return -x;};
		Test t5 = x -> -x;
		Test t6 = x -> {return -x;};		
		
		System.out.println(t.show(10) );
		
	}

}
