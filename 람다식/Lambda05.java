package ���ٽ�;

interface UseThis{ void use();}

public class Lambda05 {

	public void show() {
		System.out.println("������.. ~~~");
	}
	public void lambda() {
		UseThis ut;
//		ut = ()->System.out.println(this);
		ut = ()->this.show();
		ut.use();
	}
	
	public static void main(String[] args) {
		Lambda05 my = new Lambda05();
		my.lambda();
		
	}

}
