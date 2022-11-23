package objectOrientedProgramming.OOPquiz;

public class Human {
	String name; 
	int age;
	int speed;
	int x,y;
	
	public Human(String name, int age, int speed, int x, int y) {
		this.name = name;
		this.age = age;
		this.speed = speed;
		this.x = x;
		this.y = y;
	}
	
	public Human(String name, int age, int speed) {
		// constructor 이용
		//생성자는 초기화 기능을 가지고 있지
		this(name,age, speed,0,0);
	}
	public String getLocation() {
		//위치 정보를 나타내주는 메소드를 생성.
		return "("+x + "," + y +")";
	}
	protected void printWhoAmI() {
		// 인적 정보를 나타내주는 메소드를 생성.
		System.out.println("My name is "+ name + "." + age + "aged." );
	}
}
