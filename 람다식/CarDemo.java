package ���ٽ�;

import java.util.ArrayList;
import java.util.List;

/**
���� �ڵ����� ��� ã�ƺ���.
10�⺸�� ������ �ڵ����� ��� ã�ƺ���.
10�⺸�� ������ ���� �ڵ����� ��� ã�ƺ���.
���� �ڵ����� ����ϵ� �𵨰� ���ĸ� ��Ÿ������ �������.
10�⺸�� ������ �ڵ����� ����ϵ� ��, ����, ����Ÿ��� ��Ÿ������ �������.
 */
public class CarDemo {

	public static List<Car> findCars(List<Car> cars, CarPredicate cp) {
		List<Car> result = new ArrayList<Car>();
		for (Car car : cars)   // �־��� ����Ʈ�� ��ȯ�ϴ� ���� 
		{
			if(cp.test(car))	// ����Ʈ�� ��� �ִ� car ��ü�� ���� �޾Ƽ� ����(������ ��������)�� ������ true
				result.add(car);
		}		
		return cars;		
	}
	
	public static void printCars(List<Car> cars,CarConsumer cc) {
		for (Car car : cars) {
			cc.apply(car);
		}
	}
	
	public static void main(String[] args) {
		// �پ��� �ڵ����� ���� - ������ ����
		// �������� �̿�
		List<Car> carLists = new ArrayList<Car>();   // collection �� ���� ������ ����
		carLists.add(new Car("�ҳ�Ÿ", true, 5, 220));
		carLists.add(new Car("�ҳ�Ÿ", false, 1, 3000));
		carLists.add(new Car("�ƹݶ�", true, 12, 15248));
		carLists.add(new Car("�ƹݶ�", false, 8, 2154));
		carLists.add(new Car("�׷���", true, 3, 2525));
		carLists.add(new Car("�׷���", false, 13, 3254));
		carLists.add(new Car("���׽ý�", true, 8, 415544));
		carLists.add(new Car("Ǫ��", true, 12, 15451));
		carLists.add(new Car("����", true, 15, 1541210));
		//////////////////////////////////////////////////////////////
		
		// ���ٽ� ����		
		// ���ָ��� ã��
//		CarPredicate cp;
//		cp = x->x.isGasoline();
//		List<Car> findCars = findCars(carLists, cp);
		List<Car> findGasolineCars = findCars(carLists, x->x.isGasoline() );
		
		// ����(���ָ��� �ƴѰ��)
		List<Car> findDigelCars = findCars(carLists, x-> !x.isGasoline() );
		
		// ����(age)�� 10�� �̻�
		List<Car> find10OverCars = findCars(carLists, x-> x.getAge()>=10 );
		
		//10�⺸�� ������ ���� �ڵ����� ��� ã�ƺ���.
		List<Car> find10OverDigelCars = findCars(carLists, x-> x.getAge()>=10 && !x.isGasoline() );
		
		//���� �ڵ����� ����ϵ� �𵨰� ���ĸ� ��Ÿ������ �������.
		printCars(findDigelCars, x->System.out.println(x.getModel() + " " + x.getAge()));
		
		//10�⺸�� ������ �ڵ����� ����ϵ� ��, ����, ����Ÿ��� ��Ÿ������ �������.
		printCars(find10OverCars, 
				x->System.out.println(x.getModel() + " " + x.getAge()+" "+x.getMileage() ));
	}

}
