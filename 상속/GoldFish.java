package 상속;

public class GoldFish extends Animal {
	String fin;
	void swim() {}
	// alt+shift+s
	
	@Override
	void eat() 
	{
		System.out.println("작은 물고기를 먹는다");
	}
	
}
