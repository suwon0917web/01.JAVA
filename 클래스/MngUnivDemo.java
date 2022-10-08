package 클래스;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MngUnivDemo {

	public static void main(String[] args) {		
		List<MngUniv> lists = new ArrayList<MngUniv>();
		while(true) {		
			MngUniv mu = new MngUniv();
			mu.inputData();
			lists.add(mu);
			System.out.print("계속입력하시겠습니까? (Y/y) : ");
			Scanner sc = new Scanner(System.in);
			String answer =  sc.next();
			if (!answer.strip().toUpperCase().equals("Y"))
				break;
		}		
		System.out.printf("%-6s %-6s %-6s %-6s %-6s %-6s굈","이름","점수","학점","주소","학번","전공");
		for (MngUniv mngUniv : lists) {
			mngUniv.show();
		}
	}

}
