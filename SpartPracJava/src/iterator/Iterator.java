package iterator;

public class Iterator {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i<10; i++) {
			sum += (i + 1);
			// sum에 계속 i 을 더해주는데  그 i 에는 1을 또 더해서 계속 더해줌
			// 초기화 블럭 조건문 
		} 
		System.out.println(sum);
	}
}
