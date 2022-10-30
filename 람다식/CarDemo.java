package 람다식;

import java.util.ArrayList;
import java.util.List;

/**
디젤 자동차만 모두 찾아보자.
10년보다 오래된 자동차만 모두 찾아보자.
10년보다 오래된 디젤 자동차만 모두 찾아보자.
디젤 자동차를 출력하되 모델과 연식만 나타나도록 출력하자.
10년보다 오래된 자동차를 출력하되 모델, 연식, 주행거리만 나타나도록 출력하자.
 */
public class CarDemo {

	public static List<Car> findCars(List<Car> cars, CarPredicate cp) {
		List<Car> result = new ArrayList<Car>();
		for (Car car : cars)   // 주어진 리스트를 순환하는 문장 
		{
			if(cp.test(car))	// 리스트에 들어 있는 car 객체를 전달 받아서 조건(정해져 있지않음)에 맞으면 true
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
		// 다양한 자동차를 생산 - 데이터 생성
		// 다형성을 이용
		List<Car> carLists = new ArrayList<Car>();   // collection 을 통해 데이터 관리
		carLists.add(new Car("소나타", true, 5, 220));
		carLists.add(new Car("소나타", false, 1, 3000));
		carLists.add(new Car("아반떼", true, 12, 15248));
		carLists.add(new Car("아반떼", false, 8, 2154));
		carLists.add(new Car("그랜저", true, 3, 2525));
		carLists.add(new Car("그랜저", false, 13, 3254));
		carLists.add(new Car("제네시스", true, 8, 415544));
		carLists.add(new Car("푸조", true, 12, 15451));
		carLists.add(new Car("링컨", true, 15, 1541210));
		//////////////////////////////////////////////////////////////
		
		// 람다식 적용		
		// 가솔린만 찾기
//		CarPredicate cp;
//		cp = x->x.isGasoline();
//		List<Car> findCars = findCars(carLists, cp);
		List<Car> findGasolineCars = findCars(carLists, x->x.isGasoline() );
		
		// 디젤(가솔린이 아닌경우)
		List<Car> findDigelCars = findCars(carLists, x-> !x.isGasoline() );
		
		// 연식(age)이 10년 이상
		List<Car> find10OverCars = findCars(carLists, x-> x.getAge()>=10 );
		
		//10년보다 오래된 디젤 자동차만 모두 찾아보자.
		List<Car> find10OverDigelCars = findCars(carLists, x-> x.getAge()>=10 && !x.isGasoline() );
		
		//디젤 자동차를 출력하되 모델과 연식만 나타나도록 출력하자.
		printCars(findDigelCars, x->System.out.println(x.getModel() + " " + x.getAge()));
		
		//10년보다 오래된 자동차를 출력하되 모델, 연식, 주행거리만 나타나도록 출력하자.
		printCars(find10OverCars, 
				x->System.out.println(x.getModel() + " " + x.getAge()+" "+x.getMileage() ));
	}

}
