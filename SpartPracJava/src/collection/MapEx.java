package collection;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
	
	//Map
	

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		// 컬랙션 map 은 key 와 value로 이루어져있음.
		map.put(1, "apple"); // 키는 1 이고 값은 apple이다 
		map.put(2, "berry"); // 키는 2 이고 값은 berry 로 이루어져있음
		map.put(3, "cherry"); // 키는 3 이고 값은 cherry로 이루어져있음
		
		System.out.println(map);
		//실행해보면 추가해준 키와 벨루 값들이 들어가져 있는걸 확인 할 수 있고, 
		
		System.out.println("1st in map: "+map.get(1));
		// index가 아니라 key를 받게되어있음. => 그래서 0 은없으니 null이 나오게됨
		// 키를 받아서 value 값을 나타내주는 함수.
		// 그리고 맵에서 값을 호출할 때는 인덱스 값이 아니라 , key 이름을 가지고 불러와야한다.
		// 그래서 1을 불렀을 때 key 값이 1인 애플을 불러오게됨
		
		map.remove(2);
		// 이건 key 이름이 2인 맵을 삭제하는 코드
		System.out.println(map);
		// 삭제하고 호출
		
		// 2라는 key가 있는지 확인
		System.out.println(map.containsKey(2));
		// cherry라는 문자열이 있는지 확인해서 boolean 타입으로 호출
		System.out.println(map.containsValue("cherry"));
		
		// map 함수
		map.clear();
		System.out.println(map);
		
	}

}
