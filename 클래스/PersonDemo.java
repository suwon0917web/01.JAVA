package 클래스;

public class PersonDemo {

	public static void main(String[] args) {		
		// 다양한 매개변수를 가지는 생성자를 대처할수 있음
		// 클래스 설계를 변경하지 않고 setter를 이용한 다양한 초기화가 가능
		Person p = new Person();
		p.setAge(100);
		
		Person p2 = new Person();
		p2.setAge(50).setName("홍길동");
		
		Person p3 = new Person();
		p3.setAge(50).setAddr("경기도");
		
		Person p4 = new Person();
		p4.setAddr("경기도").setName("길동홍");
		
		
	}

}
