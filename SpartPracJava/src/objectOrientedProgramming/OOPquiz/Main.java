package objectOrientedProgramming.OOPquiz;

public class Main {

	public static void main(String[] args) {
		//객체를 생성하고, 파라미터 값을 준다.
		Human grandParent = new GrandParent("할아버지",100);
		Human parent = new Parent("아버지", 70);
		Human child = new Child("나", 30);
		
		
		// 객체를 생성한 3종류를 배열에 다시 담았다.
		Human[]humans = {grandParent, parent, child};
		// for each 분을 활용하여, 개인 정보를 출력
		for(Human human : humans) {
			System.out.println(human.name+", 나이: "+human.age+ ",속도: "+ human.speed + ", 장소: "+human.getLocation());
		}
		System.out.println("<활동 시작>");
		for(Human human : humans) {
			if(human instanceof Walkable) {
				// Walkable라는 인터페이스를 상속 받았는지 확인
				// 그 값이 true 라면 , if 문 확인, 아래 1을 찍어주고
				((Walkable)human).walk(1, 1); //==============>캐스팅이라고 한다.
				//walkable 의 인스턴스 타입으로 인식되고 있음.
				//왜냐하면 ,human.walk로는 불가능하기 때무넹.
				// 캐스팅이라고 한다.
				System.out.println("- - - - - - -");
			}
			if(human instanceof Runnable) {
				((Runnable)human).run(2, 2);
				
				System.out.println("- --- - - - - -");
			}
			if (human instanceof Swimmable) {
				((Swimmable)human).swim(3, -1);
				System.out.println("- - - - - - -");
			}
		}
	}
}
