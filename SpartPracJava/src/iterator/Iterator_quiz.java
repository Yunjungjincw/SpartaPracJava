package iterator;

import java.awt.dnd.DragSourceMotionListener;

public class Iterator_quiz {

	public static void main(String[] args) {
//		int sum = 0;
//		for(int i=0; i<=100; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//		
//		
//		
//		for(int i=5; i>=0; i--) {
//			System.out.println("카운트"+i);
//			
			
		//1부터 30 까지의 숫자를 더하고 ,홀수의 합, 짝수의 합을 구하시오 짝수 홀수 각각 구하시오
			int sum = 0;
			int sum2 = 0;
		for(int i =0; i<=30; i++) {
				if(i%2 == 0) {
					sum += i;
				} else if (i%2 == 1){
					sum2 += i;
			}
		}
		System.out.println("이건 짝수의 합 : "+sum);
		System.out.println("이건 홀수의 합 : "+sum2);
	}
}
