package objectOrientedProgramming.oopExam;

public class Parents implements Walkable{
	String name;
	int old;
	int x,y;
	int a,b;
	
	public void walkLocation(){
		System.out.println("현재 위치{"+x+","+y+"}");
		
		}
	public void runLocation() {
		System.out.println("달리기 현재 위치{"+a+","+b+"}");
	}

	@Override
	public void walkable(int x, int y) {
		walkLocation();
		System.out.println("앞으로 걷습니다.");
		this.x = x+3;
		this.y = y+3;
		walkLocation();
		System.out.println();
	}
	@Override
	public void runAble(int a, int b) {
		runLocation();
		System.out.println("뛰기 시작합니다");
		this.a = a+5;
		this.b = b+5;
		runLocation();
		
	}
}
