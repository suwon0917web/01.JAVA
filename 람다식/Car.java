package ���ٽ�;

public class Car {
	private String model;			// �𵨸�
	private boolean isGasoline;		// ��������(���ָ��� �ƴϸ� ������ ����)
	private int age;				// ���
	private int mileage;			// ����Ÿ�
	// ������ ������
	public Car(String model, boolean isGasoline, int age, int mileage) {
		super();
		this.model = model;
		this.isGasoline = isGasoline;
		this.age = age;
		this.mileage = mileage;
	}
	// ĸ��ȭ�� ������ �����Ҽ� �ִ� getter / setter
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public boolean isGasoline() {
		return isGasoline;
	}
	public void setGasoline(boolean isGasoline) {
		this.isGasoline = isGasoline;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	// ��ü ��ü�� ��������� �ɹ��������� ������ִ� toString�� override
	@Override
	public String toString() {
		return "Car [model=" + model + ", isGasoline=" + isGasoline + ", age=" + age + ", mileage=" + mileage + "]";
	}	
}
