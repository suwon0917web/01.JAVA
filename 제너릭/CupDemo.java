package ���ʸ�;

class Bear{
	
}

public class CupDemo {

	public static void main(String[] args) {
		Cup3<String> c = new Cup3<String>();
		c.setBeverage("���ּ���");
		System.out.println(c.getBeverage());
		
		Cup3<Integer> c2 = new Cup3<Integer>();
		Cup3<Bear> c3 = new Cup3<Bear>();	

	}

}
