package objectOrientedProgramming;


class Animal{
	String name;
	String color;
	
	Animal(String name){
		this.name = name;
	}
	
	public void cry() {
		System.out.println(name + "is crying");
	}
}
class Dog extends Animal{
	
	public Dog(String name){
		super(name);
	}
	
	@Override
	public void cry() {
		System.out.println(name+"is barking");
	}
}


public class OverloadingOverriding {
	   public static void main(String[] args) {
	    	
		   //오버라이딩 했을 경우에는 상속 받은 자식클래스에 있는 메소드만 실행하
		   Animal dog = new Dog("코코");
		   dog.cry();

	    }
	   // 순서와 타입 갯수가 다 같은데 리턴 타입이 다를경우.  오버로딩으로 치지 않는다.
	   // 이름은 같고, 리턴 타입이 다르며, 순서 or 갯수, 타입이 다를 경우에만 오버로딩이라고 한다.
	   int add (int x, int y, int z) {
		   return x+y+z;
	   }
	   long add(int a, int b, long c) {
		   return a+b+c;
	   }
	   int add(int a, int b) {
		    int result = a + b;
		    return result;
		}
	}
