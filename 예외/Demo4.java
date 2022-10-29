package 예외;

class Reso implements AutoCloseable{
	void show() {
		System.out.println("AutoCloseable를 상속받은 객체 입니다");
	}
	
	@Override
	public void close() throws Exception {	
		System.out.println("자원해제 하는  코드를 여기에 넣어서 자동으로 호출되어서 실행하게 만듦");
	}
	
}
public class Demo4 {

	public static void main(String[] args) {
//		Reso r = new Reso();		
//		final Reso r2 = new Reso();
		Reso r2 = new Reso();
//		try width resource  자동 리소스 해제기능-- 기능은 개발자가 제공 - 형태는 close() 함수 - 이함수는 AutoCloseable을  상속받아 구현
		try(Reso r = new Reso(); r2) {
			
			System.out.println(10 / 0);
			r.show();
			r2.show();
		} catch (Exception e) {
			System.out.println("예외발생");
		}
		
		System.out.println("프로그램 종료");
	}

}
