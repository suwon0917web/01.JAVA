package 상속;

public class AnimalDemo {

	public static void main(String[] args) {
		// Eagle 객체를 만들어서 객체로 접근가능한 맴버들이 뭐가 있는지 확인한다.
		// 자신과 부모들..... 부모들(Animal - Oject는 Animal의 부모)  즉 Eagle의 부모클래스는 
		Eagle e = new Eagle();
		e.eat(); // 썩은 고기를 먹는다
		GoldFish g = new GoldFish();
		g.eat(); // 작은물고기를 먹는다
		Tiger t = new Tiger();
		t.eat(); // 작은 동물을 먹는다

	}

}
