package dataType;

public class PrimitiveType {
	public static void main(String[] args) {
		short s = 1;
		System.out.println(s);
		
		int a = 3;
		System.out.println(a);
		//int 를 가장 많이 사용함
		
		long b = 4;
		System.out.println(b);
		//int 그 이상의 값을 담을 때만 사용
		
		float f = 5.5F;
		System.out.println(f);
		// 뒤에 대문자 F 를 붙여줘야함.
		//F 는 값이 아님.
		
		double d = 5.5;
		System.out.println(d);
		
		
		System.out.println("Short MAX: "+Short.MAX_VALUE);
		System.out.println("Short_MIN: "+Short.MIN_VALUE);
		System.out.println("Int MAX: "+Integer.MAX_VALUE);
		System.out.println("Int MIN: "+Integer.MIN_VALUE);
		System.out.println("Long: "+Long.MAX_VALUE);
		System.out.println("Double: "+Double.MAX_VALUE);
		System.out.println("Float: "+Float.MAX_VALUE);
		
		
		char c = 'A';
		System.out.println(c);
		
		boolean fact = true;
		fact = false;
		System.out.println();
		
		byte data = 'd';
		System.out.println(data);
		// 모든 데이터는 byte로 되어있다. 
		// 십진법 - 아스키코드
		// 우리가 입력한 문자를 컴퓨터가 받아들이는 언어 ?
	}
}
