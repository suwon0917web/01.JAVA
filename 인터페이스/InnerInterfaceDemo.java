package 인터페이스;

class Icon{
	interface Touchable{
		void touch();
	}
}

class Icon2{
	class Icon3{
		void touch3() {System.out.println();};
	}
}

public class InnerInterfaceDemo implements Icon.Touchable{	
	public static void main(String[] args) {
		Icon2.Icon3 a = (new Icon2()).new Icon3();
		a.touch3();
		
		
//		InnerInterfaceDemo my = new InnerInterfaceDemo();
//		my.touch();
		
		Icon.Touchable t = new InnerInterfaceDemo();
		t.touch();
		
	}

	@Override
	public void touch() {
		System.out.println("아이콘 더치");
		
	}
}
