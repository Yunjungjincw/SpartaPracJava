package objectOrientedProgramming;

interface Flyable{
	//구현하는 객체의 동작의 명세, 다중 상속이  가능하다.
	// implements 키워드를 가지고 구현한다. 메소드 시그니처만 선언이 가능하다.
	
	
	// 인터페이스는 멤버를 가지지 못하고 메소드만 정의한다.
	void fly(int x, int y, int z);
}

class Jungjin implements Flyable{
	// 여러개의 인터페이스를 구현할 수 있다. ( 상속과는 다르게)
	
	private int x,y,z;
	
	@Override
		public void fly(int x, int y, int z) {
			printLocation();
			System.out.println("이동합니다");
			this.x = x;
			this.y = y;
			this.z = z;
			printLocation();
		
	}
	public void printLocation() {
		System.out.println("현재위치 {" +x +","+y+","+z+")");
	}
	
}



public class Interface {
    public static void main(String[] args) {
        Flyable jungjin = new Jungjin();
        jungjin.fly(1, 2, 3);
    }
}