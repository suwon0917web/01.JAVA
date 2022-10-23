package 인터페이스;

public interface Controllerable {
	void turnOn();
	void turnOff();	
	default void rePaire() {}; // 동일한 동작을 한다고 가정
	default void factoryReset() {}; // 동일한 동작을 한다고 가정
}
