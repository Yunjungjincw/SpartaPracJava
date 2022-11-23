package objectOrientedProgramming.OOPquiz;

// 부모 클래스에 만들지 않고, 왜 인터페이스에 만들었지?
//인터페이스는 객체의 특정 행동의 특징을 정의하는 간단한 문법입니다. 
//인터페이스는 함수의 특징(method signature)인 
//접근제어자, 리턴타입, 메소드 이름만을 정의합니다. 
//함수의 내용은 없습니다. 
//인터페이스를 구현하는 클래스는 인터페이스에 존재하는 함수의 내용({} 중괄호 안의 내용)을 
//반드시 구현해야합니다.

public interface Walkable {
	void walk(int x, int y);
}
