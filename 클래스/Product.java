package Ŭ����;
/**
 * ��ǰ
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
