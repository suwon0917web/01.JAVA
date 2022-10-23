package 인터페이스;

public class AnimalDemo {
	public static void main(String[] args) {
			Animal a = new Dog();
			a.cry();
			Animal.move();
			
			a = new Cat();
			a.cry();
			Animal.move();
			
			a = new Bird();
			a.cry();
			Animal.move();
	
	}
}
