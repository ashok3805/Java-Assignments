package Assignment5;
import java.util.Scanner;
public class Calculate_power_of_number {
	static int power(int n,int p) {
		if(p==0) {
			return 1;
		}
		else
			return n*power(n,p-1);
	}
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		System.out.println("Enter the power of the number:");
		int p = sc.nextInt();
		System.out.println(power(n,p));
		
		

	}

}
