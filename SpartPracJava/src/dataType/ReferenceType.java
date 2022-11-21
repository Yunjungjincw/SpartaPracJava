package dataType;
import java.util.Arrays;

// 기본자료형이 아닌 모든 것
public class ReferenceType {
	public static void main(String[]args) {
		//write your code here
		
		String sparta = "Hello sparta";
		System.out.println(sparta);
		
		int[] intArray = new int[] {1,2,3,4,5};
		System.out.println(Arrays.toString(intArray));
		// int를 여러개 담은 것을 int 배열이라고 하고 참조자료형이라고 한다.
		// int 배열을 만들면서 1,2,3,4,5 로 초기화를 한 것이다.
		
		System.out.println("---------------------------------");
		int[] intEmptyArray = new int[5];
		intEmptyArray[0] = 1;
		intEmptyArray[1] = 2;
		intEmptyArray[2] = 3;
		intEmptyArray[3] = 4;
		intEmptyArray[4] = 5;
		System.out.println(Arrays.toString(intEmptyArray));
		//Arrays.toString 로 감싸서 출력해야 보기 좋게 출력된다.
		
		int[] intArray2 = new int[]{1,2,3,4,5};
		System.out.println(Arrays.toString(intArray2));
		
		String[] stringEmptyArray = new String[5];
		stringEmptyArray[0] = "a";
		stringEmptyArray[1] = "a";
		stringEmptyArray[2] = "a";
		stringEmptyArray[3] = "a";
		stringEmptyArray[4] = "a";
		System.out.println(Arrays.toString(stringEmptyArray));
		
		String[] season = {"봄","여름","가을","겨울"};
		System.out.println(Arrays.toString(season));
		
		System.out.println(season[season.length-1]);
		// 배열의 마지막 값.
		
	}
	
}
