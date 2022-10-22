package demo;
class Animal {
	public Animal(String s) {
		System.out.println("���� : " + s);
	}
}

class Mammal extends Animal {
	// Implicit super constructor Animal() is undefined. 
   //  Must explicitly invoke another constructor
	public Mammal() {
		super("");
		System.out.println("������ : ������");
	}

	public Mammal(String s) {
		super(s);
		System.out.println("������ : " + s);
	}
}

public class AnimalDemo {

	public static void main(String[] args) {
		Mammal ape = new Mammal();
		Mammal lion = new Mammal("����");


	}

}
