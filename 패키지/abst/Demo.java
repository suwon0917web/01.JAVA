package abst;

class Normal{
	void whoami() {
		System.out.println("i'm  Normal");
	}
}

abstract class AbstractClass{
	abstract void whoami() ;  // �߻� �޼���
	// �Ϲݸ޼ҵ�
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
				System.out.println("���� �͸� Ŭ�����̰� ������ �����̸� ����� �������.");				
			}
		}).whoami();		
		
	}

}
