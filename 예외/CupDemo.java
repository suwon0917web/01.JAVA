package ����;

class Bear{
	
}

public class CupDemo {

	public static void main(String[] args) {
		Cup<String> c = new Cup<String>();
		c.setBeverage("���ּ���");
		System.out.println(c.getBeverage());
		
		Cup<Integer> c2 = new Cup<Integer>();
		Cup<Bear> c3 = new Cup<Bear>();	

	}

}
