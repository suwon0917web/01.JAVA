package ����;

class Reso implements AutoCloseable{
	void show() {
		System.out.println("AutoCloseable�� ��ӹ��� ��ü �Դϴ�");
	}
	
	@Override
	public void close() throws Exception {	
		System.out.println("�ڿ����� �ϴ�  �ڵ带 ���⿡ �־ �ڵ����� ȣ��Ǿ �����ϰ� ����");
	}
	
}
public class Demo4 {

	public static void main(String[] args) {
//		Reso r = new Reso();		
//		final Reso r2 = new Reso();
		Reso r2 = new Reso();
//		try width resource  �ڵ� ���ҽ� �������-- ����� �����ڰ� ���� - ���´� close() �Լ� - ���Լ��� AutoCloseable��  ��ӹ޾� ����
		try(Reso r = new Reso(); r2) {
			
			System.out.println(10 / 0);
			r.show();
			r2.show();
		} catch (Exception e) {
			System.out.println("���ܹ߻�");
		}
		
		System.out.println("���α׷� ����");
	}

}
