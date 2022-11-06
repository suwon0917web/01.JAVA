import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo2 {

	public static void main(String[] args) {
		// �⺻������
		List<Car> carlist = Car.cars;
		Car[] cars = carlist.toArray(new Car[carlist.size()]); // ����Ʈ�� �迭�� ��ȯ
//		System.out.println(carlist);
		// ���η� ���
		for (Car car : carlist) {
			System.out.println(car);
//			System.out.println(car.toString());
		}
		
		// �Լ��� �������̽��� �̿��ؼ� ���� ����� ����
		Comparator<Car> modelComparator 
//			= (o1, o2) -> o1.getModel().compareTo(o2.getModel());
			= Comparator.comparing(Car::getModel);
		Comparator<Car> modelComparatorNullFirst =  Comparator.nullsFirst(modelComparator);
		
		// ����
		Arrays.sort(cars, modelComparatorNullFirst);		
		System.out.println(Arrays.toString(cars));
		
		// ������ ����
		carlist.set(0, new Car(null, false, 10, 200000));
		cars = carlist.toArray(new Car[carlist.size()]);
		Arrays.sort(cars, modelComparatorNullFirst);		// Ȯ���ʿ�
		System.out.println(Arrays.toString(cars));		
	}

}
