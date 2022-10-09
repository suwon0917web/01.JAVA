package 클래스;
/**
 private - public(접근제한자) private으로 설정하면 캡슐화 
 overload - 생성자 오버로드
 static - 공유
 final - 불변(더이상 변경을 허용하지 않음)
 contructor(생성자)
 methodChaning(동일객체에대해 연속적인 메소드를 적용)
 초기화 블럭(static 블럭, 비 static 블럭 : {} )
 */
public class ClassReview {
	private static int sharedNumber;
	public int publicValue;
	private int privateValue;

	static {
		for(int i = 0; i<10 ; i++)
			sharedNumber++;
	}
	
	{
		publicValue++;
	}
	
	//상수형 변수 - 항상 대문자
	public static final int MAXCOUNT =100;
	
	// 절대값  양수면 양수 음수면 양수
	public static int abs(int target) {
		return (target <0 )?  -target : target;
	}
	
	//생성자
	public ClassReview() {}
	public ClassReview(int privateValue,int publicValue) {
		this.privateValue = privateValue;
		this.publicValue = publicValue;
	}
	public ClassReview(int publicValue) {
		this.publicValue = publicValue;
	}
	
	// getter and setter...
	public int getPrivateValue() {
		return privateValue;
	}
	public ClassReview setPrivateValue(int privateValue) {
		this.privateValue = privateValue;
		return this;
	}
	public int getPublicValue() {
		return publicValue;
	}
	public ClassReview setPublicValue(int publicValue) {
		this.publicValue = publicValue;
		return this;
	}
	 
	
}
