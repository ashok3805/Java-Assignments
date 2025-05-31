package Assignment5;
import java.util.Scanner;
public class count_occurence_character {
	static int countchar(char ch, int ind,String str) {
		if(ind==str.length())
			return 0;
		int count=0;
		if(str.charAt(ind)==ch) {
			count++;
		}
		count = count+countchar(ch,ind+1,str);
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		System.out.println("Enter the character to find:");
		char ch = sc.next().charAt(0);
		System.out.println(countchar(ch,0,str));

	}

}
