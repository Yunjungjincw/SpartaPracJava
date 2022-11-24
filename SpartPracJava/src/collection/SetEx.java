package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		Set<Integer> integerSet = new HashSet<>();
		// Set 은 인터페이스 // HashSet은 클래스
		// 컬렉션 프레임워크를 쓰기 위해서는 객체를 담을 수 있는 타입이어야 한다. => 참조형 타입
		integerSet.add(1);
		integerSet.add(1);
		integerSet.add(3);
		integerSet.add(2);
		integerSet.add(9);
		integerSet.add(8);
		System.out.println(integerSet);
		
		Set<String>stringSet = new HashSet<>();
		stringSet.add("LA");
		stringSet.add("New York");
		stringSet.add("LasVegas");
		stringSet.add("San Francisco");
		stringSet.add("Seoul");
		System.out.println(stringSet);
		
		stringSet.remove("Seoul");
		System.out.println(stringSet);
		
		
		List<String>target = new ArrayList<>();
		target.add("New York");
		target.add("LasVegas");
		stringSet.removeAll(target);
		System.out.println(stringSet);
		
		
		System.out.println("LA 포함되어있나요?: "+stringSet.contains("LA"));
		System.out.println("LA 포함되어있나요?: "+stringSet.contains("Seoul"));
		
		
		System.out.println(stringSet.size());
		stringSet.clear();
		System.out.println(stringSet);
		

	}

}
