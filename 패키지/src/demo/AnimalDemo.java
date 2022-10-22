package demo;
class Animal {
	public Animal(String s) {
		System.out.println("동물 : " + s);
	}
}

class Mammal extends Animal {
	// Implicit super constructor Animal() is undefined. 
   //  Must explicitly invoke another constructor
	public Mammal() {
		super("");
		System.out.println("포유류 : 원숭이");
	}

	public Mammal(String s) {
		super(s);
		System.out.println("포유류 : " + s);
	}
}

public class AnimalDemo {

	public static void main(String[] args) {
		Mammal ape = new Mammal();
		Mammal lion = new Mammal("사자");


	}

}
