package ���;

public class Circle {
	//  ����� �ɱ�? �ȵȴ�.
	private void secret() {
		System.out.println("����̴�.");
	}

	// ����� �ɱ�? �ȴ�.- �׷� public���� ���� �� protected�� ����� ������?
	// protected ����� ����ϴ� private �̴�-- ����... �ٸ���Ű������
	// ������Ű�������� private�� �����ϰ�� ���� �����Ӱ� ��� ����
	protected void findRadius() {
		System.out.println("�������� 10.0��Ƽ�̴�.");
	}

	// ��ӻӸ��ƴ϶�. �پ��ϰ� ������� ���ȴ�.
	public void findArea() {
		System.out.println("���̴� (pi*������*������)�̴�.");
	}
	
	void hiddenMethod() {}

}
