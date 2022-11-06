import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car> list =  Car.cars.subList(0, 3); // ����Ʈ
		// collection -> �迭��
		Car[] cars = list.toArray(new Car[3]); // ����Ʈ�� �迭�� ��ȯ
		
		
		Comparator<Car> modelcomp = Comparator.comparing(Car::getModel);  // ���߽����� ����
		System.out.println(Arrays.toString(cars)); // �迭�� for������ ���ٷ� ���
		
//		Arrays.sort(cars, (a,b)-> a.getModel().compareTo(b.getModel()));
		Arrays.sort(cars, modelcomp);
		System.out.println(Arrays.toString(cars)); // �迭�� for������ ���ٷ� ���
		
		Arrays.sort(cars, modelcomp.reversed());
		System.out.println(Arrays.toString(cars)); // �迭�� for������ ���ٷ� ���
		
		modelcomp = Comparator.comparing(Car::getMileage);
		Arrays.sort(cars,modelcomp);
		System.out.println(Arrays.toString(cars)); // �迭�� for������ ���ٷ� ���
		
		// ���ϸ��� ���������� ���� 
		// ������������ ���� - reverse
		Arrays.sort(cars,modelcomp.reversed());
		// ������������ ����
		modelcomp = Comparator.comparing(Car::getMileage, (a,b)->b-a);
		Arrays.sort(cars,modelcomp);
		Arrays.sort(cars,(a,b)->b.getMileage() - a.getMileage());
		System.out.println(Arrays.toString(cars)); // �迭�� for������ ���ٷ� ���
		
	}

}
