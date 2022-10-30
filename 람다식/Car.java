package 람다식;

public class Car {
	private String model;			// 모델명
	private boolean isGasoline;		// 연료유무(가솔린이 아니면 디젤로 가정)
	private int age;				// 년식
	private int mileage;			// 주행거리
	// 적절한 생성자
	public Car(String model, boolean isGasoline, int age, int mileage) {
		super();
		this.model = model;
		this.isGasoline = isGasoline;
		this.age = age;
		this.mileage = mileage;
	}
	// 캡슐화된 변수에 접근할수 있는 getter / setter
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
	// 객체 자체를 출력했을때 맴버변수들을 출력해주는 toString을 override
	@Override
	public String toString() {
		return "Car [model=" + model + ", isGasoline=" + isGasoline + ", age=" + age + ", mileage=" + mileage + "]";
	}	
}
