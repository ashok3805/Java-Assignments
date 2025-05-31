package Assignment_1;
import java.util.Scanner;

public class BItwise_operator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Bitwise AND : "+ (a&b));
		System.out.println("Bitwise OR : "+ (a|b));
		System.out.println("Bitwise XOR : "+ (a^b));
		System.out.println("Left Shift a : "+ (a<<2));
		System.out.println("Left Shift b : " + (b<<2));
		System.out.println("Right Shift a : "+ (a>>2));
		System.out.println("Right Shift b : " +(b>>2));
		

	}

}
