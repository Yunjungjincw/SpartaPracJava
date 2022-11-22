package objectOrientedProgramming;

import objectOrientedProgramming.pkg.AccessModifier;
 
class Child extends AccessModifier{
	void callParentsProtected() {
		System.out.println("call my parent's protected method");
		super.messageProtected();
		// 부모클래스를 가르키는 키워드임.
	}
}


public class MainEx {

	public static void main(String[] args) {
		AccessModifier test = new AccessModifier();
		test.messageOutside();
//		test.messageProtected();
//		test.messageInside();\
//		test.messagePackagePrivate();
		
		Child child = new Child();
		child.callParentsProtected();
	
		

	}

}