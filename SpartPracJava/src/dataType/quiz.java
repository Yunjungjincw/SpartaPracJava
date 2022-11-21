package dataType;

import java.util.Arrays;

public class quiz {

	public static void main(String[] args) {
		char s = 's';
		System.out.println(s);
		
		int num = 10;
		System.out.println(s+"\n"+num);
		
//		int[] intArray = new int[3];
		int[] intArray = new int[] {10,20,30};
		
//		intArray[0] = 10;
//		intArray[1] = 20;
//		intArray[2] = 30;
		System.out.println(Arrays.toString(intArray));
		System.out.println(intArray[intArray.length-1]);
	}
}
