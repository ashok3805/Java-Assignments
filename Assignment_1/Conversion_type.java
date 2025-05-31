package Assignment_1;
import java.util.Scanner;
public class Conversion_type {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		float b = sc.nextFloat();
		char c = sc.next().charAt(0);
		
		float d = (float)a;
		b += d;
		int ascii = (int)c;
		a += ascii;
		System.out.println(b);
		System.out.println(a);
		

	}

}
