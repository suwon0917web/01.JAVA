package �������̽�;


// �͸�Ŭ����
public interface Human {
	
	void speekLanguage();

	// ���� �޼ҵ�
	public static void main(String[] args) {
		Human h  = new KoreanHumanImpl()  ;    
		h.speekLanguage();	
		
		h  = new Human() {			
			@Override
			public void speekLanguage() {
				System.out.println("����");				
			}
		};
		
		h.speekLanguage();
		
	}
}
