package Assignment_4;
import java.util.Scanner;
public class Toggle_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				sb.append(Character.toLowerCase(ch));
			}
			else if(Character.isLowerCase(ch)){
				sb.append(Character.toUpperCase(ch));
			}
			else {
				sb.append(ch);
			}
		}
		System.out.println("After Toggled the String : ");
		System.out.println(sb);

	}

}
