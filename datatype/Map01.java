package datatype;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * 맵  key:value
 *
 */
public class Map01 {

	public static void main(String[] args) {
		// map  key:value
		// 국영수 의 점수관리
		// 1. 국어변수 영어변수 수학변수
		// 2. 배열  {국어,영어,수학}
		// 3. 리스트로 관리하면 과목이 늘어나도 상관없음
		// 4. 치명적인 단점... 국어점수가 몇번째에 저장된 점수인가?
		
		// 만들고  hashMap - Map		
		Map<String, Integer> map = new HashMap<>();
		// 추가하고
		map.put("국어", 98);
		map.put("영어", 95);
		map.put("수학", 100);
		System.out.println(map);
		
		// 읽고
		System.out.println("국어점수 = " + map.get("국어"));		
		// 수정하고
		map.put("국어", 100);
		System.out.println("국어점수 = " + map.get("국어"));
		// 삭제하고
		map.remove("국어"); // 국어를 키로하는 요소가 삭제됨
		System.out.println(map);
		
		//기본기능외 자주사용하는 기능들...
		System.out.println("map size = "+ map.size());
		// key값만 출력
		System.out.println("key값들만 출력 : " + map.keySet());
		// value값만 출력
		System.out.println("value 값들만 출력 : " + map.values());
		
		// 특정값이 들어 있는지 조사 key값만
		System.out.println("키값이 수학인 데이터가 있는지 " +  map.containsKey("수학"));
		System.out.println("value 값이 95 인 데이터가 있는지 " + map.containsValue(95));				
	}

}
