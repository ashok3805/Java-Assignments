package Assignment_2;
import java.util.Scanner;
public class prime_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		for(int num=2 ; num<=n ; num++) {
		for(i=2;i<num;i++) {
			if(num%i==0) {
				break;
			}
		}
		if(i==num) {
			System.out.print(num+" ");
		}
		}
	}

}
