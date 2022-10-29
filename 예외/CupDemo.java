package 예외;

class Bear{
	
}

public class CupDemo {

	public static void main(String[] args) {
		Cup<String> c = new Cup<String>();
		c.setBeverage("맥주셋팅");
		System.out.println(c.getBeverage());
		
		Cup<Integer> c2 = new Cup<Integer>();
		Cup<Bear> c3 = new Cup<Bear>();	

	}

}
