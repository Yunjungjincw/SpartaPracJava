package conditional;

public class ConditionalTernaryOperator {

	public static void main(String[] args) {
		int a = 11;
		String result = (a<10) ? "10보다 작습니다" : "10보다 큽니다.";
		// 괄호 안해도됨 a<10
		System.out.println(result);

	}

}
