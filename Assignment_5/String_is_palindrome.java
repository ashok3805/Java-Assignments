package Assignment5;
import java.util.Scanner;
public class String_is_palindrome {
	static boolean checkpalindrome(String s, int left, int right) {
		if(left>=right) {
			return true;
		}
		if(s.charAt(left)!=s.charAt(right)) {
			return false;
		}
		return checkpalindrome(s,left+1,right-1);
	}
	static boolean isPalindrome(String s) {
		int left=0;
		int right = s.length()-1;
		return checkpalindrome(s,left,right);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(isPalindrome(s)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
