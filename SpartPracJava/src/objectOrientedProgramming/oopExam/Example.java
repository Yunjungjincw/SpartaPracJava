package objectOrientedProgramming.oopExam;

public class Example {

	public static void main(String[] args) {
		System.out.println("---자식---");
		Walkable child = new Child();
		child.walkable(0, 0);
		child.runAble(0, 0);
		
		
		
		
		
		System.out.println("---부모---");
		Walkable parents = new Parents();
		parents.walkable(0, 0);
		parents.runAble(0, 0);
		
		
		
		
		
		System.out.println("---조부모---");
		Walkable grandparents = new GrandParents();
		grandparents.walkable(0, 0);
		grandparents.runAble(0, 0);
		
		

	}

}
