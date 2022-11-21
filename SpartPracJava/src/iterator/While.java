package iterator;

public class While {

	public static void main(String[] args) {
		int i =0;
		int sum=0;
		
		while(i<10) {
			if(i==4) {
				i++;
				//i++이 없으면 무한루프에 빠지게됨
				continue;
				// continue 다음에 올 식을 건더 띄고 진행을 한다.
			}
			sum+=(i+1);
			i++;
		}
		System.out.println(sum);
		
		
		// do while 문 : 조건을 확인하지 않고 수행을 먼저하는 것.
		do {
			sum +=(i+1);
			i++;
		}while(i<10);
		System.out.println(sum);
	}
}
