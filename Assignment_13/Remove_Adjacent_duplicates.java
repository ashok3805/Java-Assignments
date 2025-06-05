package Assignment_13;
import java.util.Stack;

public class Remove_Adjacent_duplicates {
	static String RemoveDuplicates(String str) {
		Stack<Character> st = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(char ch : str.toCharArray()) {
			if(!st.isEmpty() && st.peek() == ch) {
				st.pop();
			}
			else {
				st.push(ch);
			}
		}
		for(char ch : st) {
			sb.append(ch);
		}
		return sb.toString();
	}
	public static void main(String[] args) {

		String str = "abbaca";
		System.out.println(RemoveDuplicates(str));

	}

}
