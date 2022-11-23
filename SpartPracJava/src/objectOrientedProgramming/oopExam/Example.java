package objectOrientedProgramming.oopExam;

public class Example {

	public static void main(String[] args) {
		System.out.println("---자식---");
		Walkable child = new Child();
		System.out.println("---걷기 시작---");
		child.walkable(0, 0);
		System.out.println("---달리기 시작---");
		child.runAble(0, 0);
		System.out.println("---수영 시작---");
		child.swimAble(0, 0);
		
		
		
		
		
		System.out.println("---부모---");
		Walkable parents = new Parents();
		System.out.println("---걷기 시작---");
		parents.walkable(0, 0);
		System.out.println("---달리기 시작---");
		parents.runAble(0, 0);
		System.out.println("---수영 시작---");
		parents.swimAble(0, 0);
		
		
		
		
		
		System.out.println("---조부모---");
		Walkable grandparents = new GrandParents();
		System.out.println("---걷기 시작---");
		grandparents.walkable(0, 0);
		System.out.println("---달리기 시작---");
		grandparents.runAble(0, 0);
		System.out.println("---수영 시작---");
		grandparents.swimAble(0, 0);
		
		
		

	}

}
