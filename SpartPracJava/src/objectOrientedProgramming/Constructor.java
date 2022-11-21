package objectOrientedProgramming;
// 메서드의 일종인데 new 를부를 때만 나오는 것
// 초기화 담당
// 생성자는 return 값이 없음.
class DefaultValueTest {
    byte byteDefaultValue;
    int intDefaultValue;
    short shortDefaultValue;
    long longDefaultValue;
    float floatDefaultValue;
    double doubleDefaultValue;
    boolean booleanDefaultValue;
    String referenceDefaultValue;
}
public class Constructor {

	public static void main(String[] args) {
	
		
		        DefaultValueTest defaultValueTest = new DefaultValueTest();
		        System.out.println("byte default: " + defaultValueTest.byteDefaultValue);
		        System.out.println("short default: " + defaultValueTest.shortDefaultValue);
		        System.out.println("int default: " + defaultValueTest.intDefaultValue);
		        System.out.println("long default: " + defaultValueTest.longDefaultValue);
		        System.out.println("float default: " + defaultValueTest.floatDefaultValue);
		        System.out.println("double default: " + defaultValueTest.doubleDefaultValue);
		        System.out.println("boolean default: " + defaultValueTest.booleanDefaultValue);
		        System.out.println("reference default: " + defaultValueTest.referenceDefaultValue);
	
	}

}
