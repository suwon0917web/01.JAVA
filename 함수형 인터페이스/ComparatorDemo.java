import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car> list =  Car.cars.subList(0, 3); // 리스트
		Car[] cars = list.toArray(new Car[3]); // 리스트를 배열로 변환
		
		Comparator<Car> modelcomp = Comparator.comparing(Car::getModel);  // 모델중심으로 정렬
		System.out.println(Arrays.toString(cars)); // 배열을 for문없이 한줄로 출력
	}

}
