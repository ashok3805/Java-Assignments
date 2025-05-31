package Assignment_4;
import java.util.Scanner;
public class Count_vowels_consonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		String str1 = str.toLowerCase().replace(" ", "");
		int vowels=0;
		int consonant=0;
		for(int i=0;i<str1.length();i++) {
			char ch = str1.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vowels++;
			}
			else {
				consonant++;
			}
		}
		System.out.println("Vowels : "+vowels);
		System.out.println("Consonant : "+consonant);
		
	}

}
