package ����;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Demo {

	public static void main(String[] args) {
		int[] aray = {1,2,3};
		int idx = 3;
		if(idx >=0 && idx <3)
			System.out.println(aray[idx]);
		
		System.out.println("���α׷� ������.....");
						
		String s = "Time is money";
		StringTokenizer st = new StringTokenizer(s);

		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken() + "+");
		}
		try {
			System.out.print(st.nextToken());  // ���ܹ߻�
			System.out.println("�� ������ ����ɱ��?");
		} catch (NoSuchElementException e) {
			System.out.println("���ܰ� �߻��߽��ϴ�. ���������� : ");
			e.printStackTrace();
		}	
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���α׷� ����");
	}
}
