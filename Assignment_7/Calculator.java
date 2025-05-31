package Assignment_7;

public class Calculator {
	int result;
	static int operationCount=0;
	public void add(int a,int b) {
		result = a+b;
		operationCount++;
		System.out.println("Result: "+result);
	}
	public static void displayOperationCount() {
		System.out.println("Total Operation : "+operationCount);
	}
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator();
		c1.add(2, 3);
		c2.add(5, 7);
		Calculator.displayOperationCount();

	}
}

