package �������̽�;

public interface Controllerable {
	void turnOn();
	void turnOff();	
	default void rePaire() {}; // ������ ������ �Ѵٰ� ����
	default void factoryReset() {}; // ������ ������ �Ѵٰ� ����
}
