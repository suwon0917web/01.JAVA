package datatype;
// 문자열의 내장함수 - 문자열 포멧팅
public class Datatype06 {

	public static void main(String[] args) {
		// 포멧팅 : 패턴을 가진 문자열
		// yyyy-mm-dd  ##,###,###
		// 오늘 사과의 값은 1000원입니다.
		// 오늘 사과의 값은 2000원입니다.
		// 오늘 사과의 값은 500원입니다.
		double applePrice = 5.25, bananaPrice = 0.50;
		String result = String.format("Today's apple price %.2f, banana %f best fruit is %s"
				, applePrice,bananaPrice,"fineApple");
		System.out.println(result);
		
	}

}







