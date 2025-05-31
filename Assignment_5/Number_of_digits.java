package Assignment5;
import java.util.Scanner;
public class Number_of_digits {
	static int count(int n) {
		if(n/10==0) {
			return 1;
		}
		return 1 + count(n/10);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		System.out.println("Number of digits : ");
		System.out.println(count(n));
		

	}

}
