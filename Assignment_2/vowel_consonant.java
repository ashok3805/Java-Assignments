package Assignment_2;
import java.util.Scanner;
public class vowel_consonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().toLowerCase().charAt(0);
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			System.out.println(c+" is a Vowel");
		else
			System.out.println(c+" is a Consonant"); 

	}

}
