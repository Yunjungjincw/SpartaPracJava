package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// 실무에서는 배열 잘 안씀 (사이즈 고정) => ArrayList 씀
		List<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(5);
		integerList.add(4);
		integerList.add(11);
		integerList.add(10);
		System.out.println(integerList);
		
		Collections.sort(integerList);
		System.out.println(integerList);
		System.out.println(integerList.size());
		
		integerList.remove(4); //index
		System.out.println(integerList);
		
//		for(int i=0; i<integerList.size(); i++) {
//			System.out.println(integerList.get(i));
//		}
		for(int current: integerList) {
			System.out.println(current);
		}
	}

}
