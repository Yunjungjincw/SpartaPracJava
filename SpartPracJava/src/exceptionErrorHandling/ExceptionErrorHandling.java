package exceptionErrorHandling;

public class ExceptionErrorHandling {

	public static void main(String[] args) {
		int number = 10;
		int result;
		
		for(int i=10; i>= 0; i--) {
			try {
				result = number / i;
				// 자바에서는 어떤 숫자를 0으로 나누게 되면 잘못된 수식이라 떠서 예외가 발생한다.
				// 0 으로 나누게 되면 무한루프가 뜨기 때문에 예외가 발생
				//  Exception 발생: / by zero
				System.out.println(result);
			} catch (Exception e) {
				System.out.println("Exception 발생: "+ e.getMessage());
			}finally {
				System.out.println("항상 실행되는 finally 구문");
			}
		}

	}

}
