package 클래스;

import java.util.Scanner;

public class MngUniv {
	String name,addr,id,major,rank;
	int score;
	void inputData() {
		Scanner sc = new Scanner(System.in);		
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("점수 : ");
		score = sc.nextInt();
		System.out.print("주소 : ");
		addr = sc.next();
		System.out.print("학번 : ");
		id = sc.next();
		System.out.print("전공 : ");
		major = sc.next();		
	}
	void calcRank() 
	{
		if(score >= 90)
			rank ="A";
		else if(score >= 80)
			rank ="B";
		else if(score >= 70)
			rank ="C";
		else if(score >= 70)
			rank ="D";
		else
			rank ="F";			
	}
	void show() {
		calcRank();
		System.out.printf("%-6S %-6d %-6S %-6S %-6S %-6S굈",name,score,rank,addr,id,major);
	}
}
