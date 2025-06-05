package Assignment_13;
import java.util.Scanner;
import java.util.Stack;
public class Balanced_parenthesis {
	static boolean BalancedParenthesis(String str) {
		Stack<Character> st = new Stack<>();
		for(char ch : str.toCharArray()) {
			if(ch == '(' || ch == '[' || ch == '{') {
				st.push(ch);
			}
			else if(ch == ')' || ch == ']' || ch == '}') {
				char top = st.pop();
//				if((ch == ')' && top!='(') || (ch == ']' && top!='[') || (ch == '}' && top!='{')) {
//					return false;
//				}
			}
		}
		
		return st.isEmpty();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(BalancedParenthesis(str)) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Not Balanced");
		}

	}

}
