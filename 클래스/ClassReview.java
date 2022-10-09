package Ŭ����;
/**
 private - public(����������) private���� �����ϸ� ĸ��ȭ 
 overload - ������ �����ε�
 static - ����
 final - �Һ�(���̻� ������ ������� ����)
 contructor(������)
 methodChaning(���ϰ�ü������ �������� �޼ҵ带 ����)
 �ʱ�ȭ ��(static ��, �� static �� : {} )
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
	
	//����� ���� - �׻� �빮��
	public static final int MAXCOUNT =100;
	
	// ���밪  ����� ��� ������ ���
	public static int abs(int target) {
		return (target <0 )?  -target : target;
	}
	
	//������
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
