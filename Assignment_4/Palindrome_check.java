package Assignment_4;
import java.util.Scanner;

public class Palindrome_check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String res = "";
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++) {
			res = str.charAt(i)+res;
		}
		System.out.println(res);
		if(str.equals(res))
			System.out.println(res+" is palindrome");
		else
			System.out.println(res+" is not Paliondrome");
		
		

	}

}
