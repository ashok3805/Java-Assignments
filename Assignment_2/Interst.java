package Assignment_2;
import java.util.Scanner;
public class Interst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double principal = sc.nextInt();
		double rate = sc.nextFloat();
		double time = sc.nextFloat();
		double SI = (principal*rate*time)/100;
		double amount = principal * Math.pow(1+rate/100, time);
		double CI = amount-principal;
		
		System.out.println("Simple Interest : "+SI);
		System.out.println("Compound Interest : " + CI);

	}

}
