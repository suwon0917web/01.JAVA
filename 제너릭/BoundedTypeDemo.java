package Á¦³Ê¸¯;
class Cup2<T extends Beverage> {
    private T beverage;
    public T getBeverage() {  return beverage;    }
    public void setBeverage(T beverage) { this.beverage = beverage; }
}
class Beverage{}
class Beer extends Beverage{}
class Boricha extends Beverage{}

public class BoundedTypeDemo {
	public static void main(String[] args) {
		Cup2<Beer> c1 = new Cup2<>();
		Cup2<Boricha> c2 = new Cup2<>();
//        Cup<String> c3 = new Cup<>();
	}
}
