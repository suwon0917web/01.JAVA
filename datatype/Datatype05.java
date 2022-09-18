package datatype;
// 문자열의 내장함수(system 함수)  (built in 함수)
public class Datatype05 {

	public static void main(String[] args) {
		// 비교함수 equals
		// indexOf
		// subString  문자열을 자른다
		String str = "hello";
		int index =  str.indexOf('l');
		System.out.println(index);
		System.out.println( str.substring(index)) ;
		// 파일 확장자찾을때..
		str = "test.xlsx";
		// 해당 파일의 확장자를 찾아서 변수에 저장하고 출력
		index =  str.indexOf('.');
		System.out.println( "확장자는 : " + str.substring(index+1)) ;
		System.out.println(str.subSequence(index, index+1));
		// 문자열 중에 내가 찾고자하는 문자열이 있는지
		str = "javs is very funy langauge funy";
		// very 라는 문자열이 있는지 확인하고 싶다.
		boolean isContain =  str.contains("very1");
		System.out.println(isContain);
		
		// indexOf 함수와 반대의 기능 은
		// charAt 함수
		System.out.println(str.charAt(6));
		
		String returnStr =  str.replace("funy", "good");		
		System.out.println(str);
		System.out.println(returnStr);
		
		// replace 기능을 다 사용할수 있으면서 추가로 정규식표현도 가능
		returnStr =  str.replaceAll("funy", "good");		
		System.out.println(str);
		System.out.println(returnStr);
		// 변경을 하는 함수는.. 대상을직접변경하는 경우 또는 결과만 리턴하는 경우
		
		returnStr =  str.toUpperCase(); // 전부 대문자
		System.out.println(returnStr);
		returnStr =  str.toLowerCase(); // 전부 소문자
		// 검색... 대소문자 포함
		
		// 분리 split
		String[] res = str.split(" ");
		for (String s : res) {
			System.out.println(s);			
		}
		
	}

}







