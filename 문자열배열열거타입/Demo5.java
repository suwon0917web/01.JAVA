package ���ڿ��迭����Ÿ��;

enum GENDER {
	MALE, FEMALE;	
//	private String s;
//	GENDER() {
//		s="�⺻��";
//	}
//	
//	GENDER(String string) {
//		s = string;
//	}
//	public String toString() {
//		return s;
//	}
}

public class Demo5 {

	public static void main(String[] args) {
		GENDER genderType = GENDER.MALE;
		System.out.println(genderType);
		System.out.println(GENDER.MALE);

		switch (genderType) {
		case MALE:
			break;
		case FEMALE:
			break;
		default:
			break;
		}

	}

}
