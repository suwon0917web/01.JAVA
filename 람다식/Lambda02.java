package 람다식;

// 추상클래스나 인터페이스에서 제공하는 추상메소드를
// 함수의 인수로 제공해야 할때
// 해당 기능을 구현하는 클래스를 만들어서 그 클래스의 객체를 제공하는것이 아니라  : 복잡도상승, 가독성 하락
// 람다를 이용해서 간결하게 구현하는 목적

interface People{
	void speak();  // 국적에 다라서 해당 언어를 출력 ex Korean 이면 한국어
}


public class Lambda02 {

	public static void main(String[] args) {
		// 한국사람
		People korean = ()-> System.out.println("한국어");
		korean.speak();
		People American = ()->{System.out.println("영어");};
		American.speak();
	}

}
