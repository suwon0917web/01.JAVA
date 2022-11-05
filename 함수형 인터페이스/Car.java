import java.util.Arrays;
import java.util.List;

public class Car {
	private String model;
	private boolean gasoline;
	private int age;
	private int mileage;
	// shift+alt+s  �ڵ������
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public boolean isGasoline() {
		return gasoline;
	}
	public void setGasoline(boolean gasoline) {
		this.gasoline = gasoline;
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
	// shift+alt+s  �ڵ������
	public Car(String model, boolean gasoline, int age, int mileage) {
		super();
		this.model = model;
		this.gasoline = gasoline;
		this.age = age;
		this.mileage = mileage;
	}
	// shift+alt+s  �ڵ������
	@Override
	public String toString() {
		return "Car [model=" + model + ", gasoline=" + gasoline + ", age=" + age + ", mileage=" + mileage + "]";
	}
	
	
	
	public static final List<Car> cars = Arrays.asList(
            new Car("�ҳ�Ÿ", true, 18, 210000),
            new Car("�ڶ���", false, 15, 200000),
            new Car("�׷���", true, 12, 150000),
            new Car("��Ÿ��", false, 10, 220000),
            new Car("�ƹ���", true, 10, 70000),
            new Car("����", true, 6, 100000),
            new Car("�׷���", true, 5, 80000),
            new Car("�ҳ�Ÿ", true, 2, 35000),
            new Car("���", false, 1, 10000),
            new Car("�ƹ���", true, 1, 7000)
            );
			
	
	
}
