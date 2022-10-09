package 클래스;
/**
 * 제품
 */
public class Product {
	private static int factoryNumber = 0;
	private int serailNumber = 0;
	public Product() {
		factoryNumber++;
		serailNumber = factoryNumber;
	}
	public int getSerailNumber() {
		return serailNumber;
	}
	
}
