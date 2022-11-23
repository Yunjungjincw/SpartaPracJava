package objectOrientedProgramming.OOPquiz;

public class GrandParent extends Human implements Walkable{
	public GrandParent(String name, int age) {
		super(name, age, 1);
	}

	@Override
	public void walk(int x, int y) {
		printWhoAmI();
		System.out.println("걷기 속도: "+speed);
		this.x = x;
		this.y = y;
		System.out.println("Walked to " + getLocation());
	}
	
}
