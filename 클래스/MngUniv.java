package Ŭ����;

import java.util.Scanner;

public class MngUniv {
	String name,addr,id,major,rank;
	int score;
	void inputData() {
		Scanner sc = new Scanner(System.in);		
		System.out.print("�̸� : ");
		name = sc.next();
		System.out.print("���� : ");
		score = sc.nextInt();
		System.out.print("�ּ� : ");
		addr = sc.next();
		System.out.print("�й� : ");
		id = sc.next();
		System.out.print("���� : ");
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
		System.out.printf("%-6S %-6d %-6S %-6S %-6S %-6S�n",name,score,rank,addr,id,major);
	}
}
