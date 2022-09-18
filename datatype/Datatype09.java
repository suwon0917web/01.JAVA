package datatype;
// 배열
public class Datatype09 {

	public static void main(String[] args) {		
//		동일한 타입이면서 동일한 형태나 속성을 가지는 값들을 모아 놓은것
//		국 영 수 과목의 점수를 저장하기 위해서는 적어도 3개의 변수가 필요
//		그런데 그게 한사람의 점수면? 사람과 점수를 일대일로 매칭하고 싶음
//		2명의 국영수 점수
		int kor1=100,eng1=100,math1=100;
		int kor2=100,eng2=100,math2=100;
		
//		터이터타입 변수명
//		배열 동일한 데이터타입만 관리가 가능
//		정수형배열
		int[] ary = {10,20,30};  // 생성과 동시에 초기화하는경우 자동으로 초기화한 개수가 배열의 크기가됨
		ary[0] = 100;
//		모든 데이터타입은 배열이 가능
//		모든 배열은 크기가 정해져 있다. 고정된 길이
//		그래서 배열은 만들때 크기를 정한다		
		int[] ary2 = new int[3];
		System.out.println(ary2[0]);
//		배열사용시 주의점.... 우물가에가서 숭늉을 찾지마라.
//		System.out.println(ary2[10]);  exception 발생.. 예외 
		
		

		int student1[] = {100,100,100};
		int[] student2 = {100,100,100};
		
		
		
		
		
		
		

	}

}
