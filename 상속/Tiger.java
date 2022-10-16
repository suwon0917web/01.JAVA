package 상속;

public class Tiger extends Animal {
	String leg;
	void run() {}
	
	@Override
	void eat() {
		System.out.println("작은 동물을 먹는다");
	}
	
}
