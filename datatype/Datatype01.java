package datatype;

public class Datatype01 {

	public static void main(String[] args) {
//		 정수
//		정수를 저장할수 있는 공간이 필요 --> 만든다
//		변수를 만드는 방법
//		자료형 변수명;
		int age = 10; // 변수 선언과 동시에 초기화
		int age2 =  age; // 변수 선언과 동시에 초기화
		int age3;  //변수 선언
		
		age3 = 0; // 선언후 초기화		
		int age4 = age3;
		
		long lage = 0;	
		lage = age4; // auto casting		
		age4 = (int) lage; // manual casting -- > 코딩필요
		
		int in1=0;
		long lo1 = 0;
		short sh1 = 0;
		byte by1 = 0;
		char ch1 = 65; // 문자를 표현  ascii 코드
		
		System.out.println(in1);
		System.out.println(lo1);
		System.out.println(sh1);
		System.out.println(by1);
		System.out.println(ch1);
		
		// int long short byte --> 숫자표현
		//         byte< short< int< long
		//   
//		in1 = lo1;
//		sh1 = in1;
//		by1 = sh1;
	}

}
