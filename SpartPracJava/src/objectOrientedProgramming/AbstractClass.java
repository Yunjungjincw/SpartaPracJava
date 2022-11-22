package objectOrientedProgramming;

abstract class Bird {
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


public class AbstractClass {
	public static void main(String[] args) {
//		Bird bird = new Bird();
		Cannot instantiate the type Bird
		
	}

}
