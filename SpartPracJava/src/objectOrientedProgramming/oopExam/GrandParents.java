package objectOrientedProgramming.oopExam;

public class GrandParents implements Walkable{
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
		this.x = x+1;
		this.y = y+1;
		walkLocation();
		System.out.println();
	}

	@Override
	public void runAble(int a, int b) {
		runLocation();
		System.out.println("뛸 수 없습니다.");
	}
	@Override
	public void swimAble(int i, int j) {
		System.out.println("수영을 하지 못합니다.");
		
	}
}
