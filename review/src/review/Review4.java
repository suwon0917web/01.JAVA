package review;

import java.text.SimpleDateFormat;
import java.util.Date;

//�Լ�
class Temp{
	
}
public class Review4 {

	// �����Լ�
	public static void main(String[] args) {
		System.out.print(method1("�̱Կ�"));
		method2();
		method3("�̱Կ�");
		System.out.println(method4());
	}
	// 4���� ���̽�(����� ���)
	// 1 �Է°� ���
	public static String method1(String msg) {		
		return String.format("�Է��Ͻ� ���ڴ� %s �Դϴ�.�n",msg);
	}
	// 2. �Է°� ����� ���°��
	public static void method2() {
		System.out.println("�Է°� ����� ���� �Լ��� ȣ���߽��ϴ�.");
	}
	// 3. �Է¸� �ִ°��
	public static void method3(String msg) {
		System.out.printf("�Է��Ͻ� ���ڴ� %s �Դϴ�.�n",msg);
	}
	// 4 ��¸� �ִ°��
	public static String method4() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
		Date now = new Date();		
		return sdf.format(now);
	}

}
