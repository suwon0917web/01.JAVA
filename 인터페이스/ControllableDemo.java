package �������̽�;

public class ControllableDemo {
	public static void main(String[] args) {
		// TV ��ü ����
//		TV tv = new TV();
//		tv.turnOff();
//		tv.turnOn();
//		
//		Computer com = new Computer();
//		com.turnOff();
//		com.turnOn();
		
		// �������̽��� �̿��� ������
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
