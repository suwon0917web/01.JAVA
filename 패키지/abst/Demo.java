package abst;

class Normal{
	void whoami() {
		System.out.println("i'm  Normal");
	}
}

abstract class AbstractClass{
	abstract void whoami() ;  // 추상 메서드
	// 일반메소드
	void completeMethod() {
		System.out.println("completeMethod");
	}
}

class ImpleAbs extends AbstractClass{
	@Override
	void whoami() {
		System.out.println("I'm ImpleAbs");		
	}	
}

class ImpleAbs2 extends AbstractClass{

	@Override
	void whoami() {
		System.out.println("hello ~~~");		
	}
	
}

public class Demo {

	public static void main(String[] args) {
		Normal n = new Normal();
		n.whoami();	 
		
		AbstractClass im = new ImpleAbs();
		im.whoami();  // I'm ImpleAbs
		
		im = new ImpleAbs2();
		im.whoami(); // hello~~~~		
		
		(new AbstractClass() {			
			@Override
			void whoami() {
				System.out.println("나는 익명 클래스이고 완전한 형태이며 사용후 사라진다.");				
			}
		}).whoami();		
		
	}

}
