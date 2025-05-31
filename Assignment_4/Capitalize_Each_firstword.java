package Assignment_4;
import java.util.Scanner;
public class Capitalize_Each_firstword {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the String : ");
		 String str = sc.nextLine();
		 String[] ch = str.split(" ");
		 StringBuilder sb = new StringBuilder();
		 for(String word : ch) {
			 if(!word.isEmpty()) {
				 sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
			 }
		 }
		 String result = sb.toString().trim();
		 System.out.println("After Capitalize the each word : ");
		 System.out.println(result);

	}

}
