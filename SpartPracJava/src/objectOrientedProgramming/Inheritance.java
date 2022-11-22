//package objectOrientedProgramming;
//
//class Animal{
//	String name;
//	
//	public void cry() {
//		System.out.println(name + "is crying.");
//	}
//}
//class Dog extends Animal{
//	Dog(String name){
//		this.name = name;
//	}
//	public void swim() {
//		System.out.println(name + "is swiming.");
//	}
//}
//
//
//
//
//public class Inheritance {
//    public static void main(String[] args) {
//        Dog dog = new Dog("코코");
//        dog.cry();
//        dog.swim();
//        
//        Animal dog2 = new Dog("미미");
//        // 실제 객체는 도그지만, 변수를 선언한 타입은 animal이기 때문에. 
//        // animal에 있는 기능만 사용할 수 있다.
//        dog2.cry();
////        dog2.swim();
//    }
//}