package objectOrientedProgramming.pkg;


class Child extends AccessModifier{
	void callParentsProtected() {
		System.out.println("call my parent's protected method");
		super.messageProtected();
		// 부모클래스를 가르키는 키워드임.
	}
}


public class Main {

	public static void main(String[] args) {
		AccessModifier test = new AccessModifier();
		test.messageOutside();
		test.messageProtected();
//		test.messageInside();
//	
	

	}

}
