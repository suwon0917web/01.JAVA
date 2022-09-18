package datatype;

import java.util.ArrayList;

//Collection 계열의 List
public class List01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본변수... 타입 변수명 = 값
		// 기본외 변수-> 클래스로 이루어진 변수(X) 객체는  클래스명 객체명 = new연산자를
		// 예외
//		String str2 = "hello";
//		String str = new String("hello");
		
		int[] ary = new int[3];
		ary[0] = 10; ary[1] = 20; ary[2] = 30;
//		ary[3] = 40; ary[4] = 50; ary[5] = 60;
		ArrayList<Integer> array = new ArrayList<>();
//		 Creat - 데이터 추가
//		 Read	- 데이터 읽기
//		 Update - 데이터 수정
//		 Delete - 데이터 삭제
		 array.add(10);array.add(20);array.add(30);
		 array.add(40);array.add(50);array.add(60);
		 array.add(100);array.add(200);array.add(300);
		 array.add(400);array.add(500);array.add(600);
		 
		 System.out.println(array.get(0));
		 System.out.println(array.get(array.size()-1));
		 
		 System.out.println( array.contains(150) );
		 
		 
		 
		 
		 
	}

}
