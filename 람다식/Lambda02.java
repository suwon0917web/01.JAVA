package ���ٽ�;

// �߻�Ŭ������ �������̽����� �����ϴ� �߻�޼ҵ带
// �Լ��� �μ��� �����ؾ� �Ҷ�
// �ش� ����� �����ϴ� Ŭ������ ���� �� Ŭ������ ��ü�� �����ϴ°��� �ƴ϶�  : ���⵵���, ������ �϶�
// ���ٸ� �̿��ؼ� �����ϰ� �����ϴ� ����

interface People{
	void speak();  // ������ �ٶ� �ش� �� ��� ex Korean �̸� �ѱ���
}


public class Lambda02 {

	public static void main(String[] args) {
		// �ѱ����
		People korean = ()-> System.out.println("�ѱ���");
		korean.speak();
		People American = ()->{System.out.println("����");};
		American.speak();
	}

}
