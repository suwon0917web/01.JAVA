import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car> list =  Car.cars.subList(0, 3); // ����Ʈ
		Car[] cars = list.toArray(new Car[3]); // ����Ʈ�� �迭�� ��ȯ
		
		Comparator<Car> modelcomp = Comparator.comparing(Car::getModel);  // ���߽����� ����
		System.out.println(Arrays.toString(cars)); // �迭�� for������ ���ٷ� ���
	}

}
