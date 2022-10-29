package 예외;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Demo {

	public static void main(String[] args) {
		int[] aray = {1,2,3};
		int idx = 3;
		if(idx >=0 && idx <3)
			System.out.println(aray[idx]);
		
		System.out.println("프로그램 실행중.....");
						
		String s = "Time is money";
		StringTokenizer st = new StringTokenizer(s);

		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken() + "+");
		}
		try {
			System.out.print(st.nextToken());  // 예외발생
			System.out.println("이 문장이 실행될까요?");
		} catch (NoSuchElementException e) {
			System.out.println("예외가 발생했습니다. 예외종류는 : ");
			e.printStackTrace();
		}	
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
