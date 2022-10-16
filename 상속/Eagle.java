package 상속;

public class Eagle extends Animal	 {
	String wing;
	void fly() {}
	
	
	// override - overwrite
	void eat() 
	{
		System.out.println("썩은 고기를 먹는다");
	}
}
