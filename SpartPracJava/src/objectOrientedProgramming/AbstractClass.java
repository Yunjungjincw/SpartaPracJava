package objectOrientedProgramming;

abstract class Bird {
	//일반 클래스랑 똑같은데 , 객체를 생성할 수 없다.
	//extends 키워드를 사용 다중 상속 불가능
	// 추상 메소드에 대해서만 자식클래스에서 무조건 구현해야한다.
	private int x,y,z;
	
	void fly(int x, int y, int z) {
		printLocation();
		System.out.println("이동합니다");
		this.x = x;
		this.y = y;
		if(flyable(z)) {
			this.z = z;
		}else {
			System.out.println("그 높이로는 날 수 없습니다");
		}
		this.z = z;
		printLocation();
	}
	
	abstract boolean flyable(int z);
		
	
	public void printLocation() {
		System.out.println("현재위치 {" +x +","+y+","+z+")");
	}
}

class Pigeon extends Bird {

	@Override
	boolean flyable(int z) {
		
		
		return z < 10000;
	}
}

class Peacock extends Bird{

	@Override
	boolean flyable(int z) {
		return false;
	}
	
}

public class AbstractClass {
	public static void main(String[] args) {
		Bird pigeon = new Pigeon();
		Bird peacock = new Peacock();
		System.out.println("---비둘기----");
		pigeon.fly(1, 2, 3);
		System.out.println("---공작새---");
		peacock.fly(1, 2, 0);
		System.out.println("---비둘기---");
		pigeon.fly(1, 2, 30000);
		System.out.println("---공작새---");
		peacock.fly(3,3,3);
	
	}

}
