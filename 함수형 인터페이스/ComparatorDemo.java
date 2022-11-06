import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car> list =  Car.cars.subList(0, 3); // 리스트
		// collection -> 배열로
		Car[] cars = list.toArray(new Car[3]); // 리스트를 배열로 변환
		
		
		Comparator<Car> modelcomp = Comparator.comparing(Car::getModel);  // 모델중심으로 정렬
		System.out.println(Arrays.toString(cars)); // 배열을 for문없이 한줄로 출력
		
//		Arrays.sort(cars, (a,b)-> a.getModel().compareTo(b.getModel()));
		Arrays.sort(cars, modelcomp);
		System.out.println(Arrays.toString(cars)); // 배열을 for문없이 한줄로 출력
		
		Arrays.sort(cars, modelcomp.reversed());
		System.out.println(Arrays.toString(cars)); // 배열을 for문없이 한줄로 출력
		
		modelcomp = Comparator.comparing(Car::getMileage);
		Arrays.sort(cars,modelcomp);
		System.out.println(Arrays.toString(cars)); // 배열을 for문없이 한줄로 출력
		
		// 마일리지 내림차순을 정렬 
		// 오름차순으로 정렬 - reverse
		Arrays.sort(cars,modelcomp.reversed());
		// 내림차순으로 정렬
		modelcomp = Comparator.comparing(Car::getMileage, (a,b)->b-a);
		Arrays.sort(cars,modelcomp);
		Arrays.sort(cars,(a,b)->b.getMileage() - a.getMileage());
		System.out.println(Arrays.toString(cars)); // 배열을 for문없이 한줄로 출력
		
	}

}
