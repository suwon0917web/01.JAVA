package 인터페이스;


// 익명클래스
public interface Human {
	
	void speekLanguage();

	// 실행 메소드
	public static void main(String[] args) {
		Human h  = new KoreanHumanImpl()  ;    
		h.speekLanguage();	
		
		h  = new Human() {			
			@Override
			public void speekLanguage() {
				System.out.println("영어");				
			}
		};
		
		h.speekLanguage();
		
	}
}
