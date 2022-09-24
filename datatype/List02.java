package datatype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Collection 계열의 List
public class List02 {

	public static void main(String[] args) {
		// 리스트는 배열의 확장판
		// 저장한 순서를 보장
		// 생성
		// - ArrayList  : 클래스 형 자료는 new 클래스명() 를 이용해서 변수(객체)생성
		List<String> listNames = new ArrayList<>();  // 다형성 - 다양한 형태로 존재 강추		
		ArrayList<String> listNames2 = new ArrayList<>();		
		int age = (int) 25L;
		
		// 변수 vs 객체
		String name = "홍길동";
		String name2 = new String("홍길동");
		
		// 값을 추가  add
		listNames.add("홍길동");
		listNames.add("수원");		
		
		// 읽기 는 인덱스
		listNames.get(0);
		listNames.get(1);
//		listNames.get(2);
		// 수정  해당인덱스, 수정할 값
		listNames.set(0, "서울");		
		
		// 크기를 알아야 인덱스를 넘어가지 않는다.
		// 마지막 인덱스는 전체크기 -1 (왜냐면 인덱스는 0부터 시작하기때문에)
		int lastIndex = listNames.size() -1;  	
		
		// 삭제할때는 인덱스 또는 값으로 삭제
		listNames.remove(0); // 삭제 결과를 리턴 boolean   true리턴
		listNames.remove("홍길동"); // 위에서 인덱스 방식으로 이미삭제가 되어서 false를 리턴
		
		System.out.println(listNames);
		// 이클립스에서 한글이 깨지면.. Run->Run Configuration -> common탭 
//		->encording을 other를 선택하고 cp949를 입력
		
		String[] arys =  listNames.toArray(new String[0]);
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1); intList.add(2);intList.add(3);		
		Integer[] intary =  intList.toArray(new Integer[0]);
		
		// 리스트와 배열의 응용
		// 1. 배열을 만든다... 
		Integer[] aryInt = new Integer[5];
		aryInt[0] = 1;
		aryInt[1] = 5;
		aryInt[2] = 2;
		aryInt[3] = 3;
		aryInt[4] = 4;
		//2. 배열을 리스트로 변경  - 리스트형태로 사용가능하지만 내부에서 배열크기만큼 고정됨
		List<Integer> newAryInt =  Arrays.asList(aryInt);
		//newAryInt.add(6);newAryInt.add(7);newAryInt.add(8);  에러발생
		//3. 배열로 변경
		aryInt = newAryInt.toArray(new Integer[0]); // 리스트를 배열로변경
		System.out.println(newAryInt);
		
		// 리스트는 처음부터 리스트로 만들어야 크기에 제한이 없다
		// 배열을 이용해서 리스트를 생성하면 배열처럼 크기 제한이 있다	
		
		// 정렬이 가능하다
		
	}

}




























