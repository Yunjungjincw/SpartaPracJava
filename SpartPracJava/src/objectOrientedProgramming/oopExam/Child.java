package objectOrientedProgramming.oopExam;

public class Child implements Walkable{
	String name;
	int old;
	int x,y;
	int a,b;
	
	public void walkLocation(){
		System.out.println("현재 위치{"+x+","+y+"}");
		}
	
	@Override
	public void walkable(int x, int y) {
		walkLocation();
		System.out.println("앞으로 걷습니다.");
		this.x = x+5;
		this.y = y+5;
		walkLocation();
		System.out.println();
	}
	
	@Override
	public void runAble(int a, int b) {
		runLocation();
		System.out.println("뛰기 시작합니다");
		this.a =a+7;
		this.b = b+7;
		runLocation();
	}
	public void runLocation() {
		System.out.println("달리기 현재 위치{"+a+","+b+"}");
	}
	
 
}
