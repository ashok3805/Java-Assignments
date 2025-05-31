package Assignment_4;
import java.util.Scanner;
public class Remove_Duplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		String remove = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(remove.indexOf(ch)==-1) {
				remove = remove+ch;
			}
		}
		System.out.println("After removing the Duplicates:");
		System.out.println(remove);
		

	}

}
