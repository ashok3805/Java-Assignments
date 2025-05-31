package Assignment_4;
import java.util.Scanner;
public class Reverse_String_using_StringBuilder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		StringBuilder sb = new StringBuilder();
		String str = sc.nextLine();
		sb.append(str);
		StringBuilder rev = sb.reverse();
		System.out.println("After Reverse the string :");
		System.out.println(rev);
		

	}

}
