package Å¬·¡½º;

public class Person {
	private int age;
	private String name;
	private String Addr;
	
	public String getAddr() {
		return Addr;
	}
	public Person setAddr(String addr) {
		Addr = addr;
		return this;
	}
	public int getAge() {
		return age;
	}
	public Person setAge(int age) {
		this.age = age;
		return this;
	}
	public String getName() {
		return name;
	}
	public Person setName(String name) {
		this.name = name;
		return this;
	}
	
}
