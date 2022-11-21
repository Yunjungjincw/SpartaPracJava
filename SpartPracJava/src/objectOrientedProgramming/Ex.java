package objectOrientedProgramming;

class Calculation {
	int add(int x, int y) {
		return x + y;
	}
	int subtract(int x , int y) {
		return x - y;
	}
}


public class Ex {
	
	
    public static void main(String[] args) {
		
    	Calculation calculation = new Calculation();
    	int addResult = calculation.add(1, 2);
    	calculation.add(100, 100);
    	int subtracResult = calculation.subtract(5, 3);
    	
    	System.out.println(addResult);
    	System.out.println(subtracResult);
    	System.out.println(calculation.add(100, 100));
    	

    }
}