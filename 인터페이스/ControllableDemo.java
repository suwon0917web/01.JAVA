package 인터페이스;

public class ControllableDemo {
	public static void main(String[] args) {
		// TV 객체 생성
//		TV tv = new TV();
//		tv.turnOff();
//		tv.turnOn();
//		
//		Computer com = new Computer();
//		com.turnOff();
//		com.turnOn();
		
		// 인터페이스를 이용한 다형성
		Controllerable cont1 =  new TV();
		Controllerable cont2 = new Computer();
		cont1.turnOff();
		cont2.turnOff();
		
		((RemoteControllable)cont1).remoteTurnOff();
		
		cont1.factoryReset();
		cont2.factoryReset();
		
		cont1.rePaire();
		cont2.rePaire();
		
		
		
		

	}

}
