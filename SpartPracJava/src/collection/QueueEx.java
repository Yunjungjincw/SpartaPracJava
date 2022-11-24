package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		Queue <Integer>queue = new LinkedList<>();
		queue.add(1);
		queue.add(5);
		queue.add(3);
		queue.add(9);
		System.out.println(queue);
		
		//앞에 있는 것을 빼내면서 리턴해주는 것.
		System.out.println(queue.poll());
		System.out.println(queue);
		
		//peek은 가장 맨앞에 있는 값을 확인하지만, 삭제하진 않아, 잠깐 꺼내기만 하는거.
		System.out.println(queue.peek());
		System.out.println(queue);
	}
}
