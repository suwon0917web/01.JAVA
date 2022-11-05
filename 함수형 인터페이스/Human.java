
public interface Human {
	void speak();	
	
	// 상속받은 클래스가 eat 매소드를 사용하려면 반드시 구현해야 하게끔 만듦
	default void eat() throws Exception {
		throw new Exception("not Implemented yet....");
	}
}
