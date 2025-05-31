package Assignment_1;
import java.util.Scanner;
public class Arthimetic_Expression {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double c = sc.nextDouble();
		int add = a+b;
		int sub = a-b;
		int mul = a*b;
		float div = a/b;
		
		double res = add*c;
		System.out.println(res);
	}

}
