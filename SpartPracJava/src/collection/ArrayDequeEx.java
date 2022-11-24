package collection;

import java.util.ArrayDeque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
		//앞쪽에 값을 넣기
		arrayDeque.addFirst(1);
		arrayDeque.addFirst(2);
		arrayDeque.addFirst(3);
		arrayDeque.addFirst(4);
		
		System.out.println(arrayDeque);

		
		arrayDeque.addLast(0);
		System.out.println(arrayDeque);
		
		//맨 앞으로 들어감. addFirst와 비슷하지만, 
		// que에 크기가 문제가 생길 때
		// offerFirst 는 false라는 값을 리턴하고,
		// addFirst는 exception 이 나온다.	
		arrayDeque.offerFirst(10);
		System.out.println(arrayDeque);
		arrayDeque.offerLast(-1);
		System.out.println(arrayDeque);
		
		arrayDeque.push(22);
		System.out.println(arrayDeque);
		//꺼내고 리턴해줌. 맨마지막에 넣었던게 22이니까 22를 꺼내고 다시 리턴.
		System.out.println(arrayDeque.pop());
		System.out.println(arrayDeque);
//		
		//폴도 꺼내는건데..
		System.out.println(arrayDeque.poll());
		System.out.println(arrayDeque);
//		
		//맨앞에 있는 값 꺼내보는거 리턴은 안해줌
		System.out.println(arrayDeque.peek());
		System.out.println(arrayDeque);
		System.out.println(arrayDeque.size());
		arrayDeque.clear();
		System.out.println(arrayDeque);
		System.out.println(arrayDeque.isEmpty());
	
		
	
		
		
	}

}
