package Ŭ����;

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
			System.out.print("����Է��Ͻðڽ��ϱ�? (Y/y) : ");
			Scanner sc = new Scanner(System.in);
			String answer =  sc.next();
			if (!answer.strip().toUpperCase().equals("Y"))
				break;
		}		
		System.out.printf("%-6s %-6s %-6s %-6s %-6s %-6s�n","�̸�","����","����","�ּ�","�й�","����");
		for (MngUniv mngUniv : lists) {
			mngUniv.show();
		}
	}

}
