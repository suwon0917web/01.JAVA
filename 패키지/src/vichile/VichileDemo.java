package vichile;

public class VichileDemo {

	public static void main(String[] args) {
		Vichile[] v = new Vichile[2];
		v[0] = new Car();
		v[1] = new SportsCar();
		
		for (Vichile vi : v) {
			vi.whoami();
		}
		

	}

}
