import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo2 {

	public static void main(String[] args) {
		// 기본데이터
		List<Car> carlist = Car.cars;
		Car[] cars = carlist.toArray(new Car[carlist.size()]); // 리스트를 배열로 변환
//		System.out.println(carlist);
		// 세로로 출력
		for (Car car : carlist) {
			System.out.println(car);
//			System.out.println(car.toString());
		}
		
		// 함수형 인터페이스를 이용해서 정렬 방법을 결정
		Comparator<Car> modelComparator 
//			= (o1, o2) -> o1.getModel().compareTo(o2.getModel());
			= Comparator.comparing(Car::getModel);
		Comparator<Car> modelComparatorNullFirst =  Comparator.nullsFirst(modelComparator);
		
		// 정렬
		Arrays.sort(cars, modelComparatorNullFirst);		
		System.out.println(Arrays.toString(cars));
		
		// 데이터 셋팅
		carlist.set(0, new Car(null, false, 10, 200000));
		cars = carlist.toArray(new Car[carlist.size()]);
		Arrays.sort(cars, modelComparatorNullFirst);		// 확인필요
		System.out.println(Arrays.toString(cars));		
	}

}
