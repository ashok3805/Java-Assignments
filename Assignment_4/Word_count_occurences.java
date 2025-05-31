package Assignment_4;
import java.util.Scanner;
public class Word_count_occurences {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str1 = sc.nextLine().replace(".", "");
		System.out.println("Enter the search string : ");
		String str2 = sc.nextLine();
		int count=0;
		String[] word = str1.split(" ");
		for(String words : word) {
			if(words.equals(str2)) {
				count++;
			}
		}
		System.out.println("The word "+str2+" occured "+count+" times.");
		

	}

}
