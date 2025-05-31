package Assignment_6;

import java.util.Scanner;

public class string_are_rotation_of_eachother {
	static boolean string(String s1, String s2) {
		int n=s1.length();
		for(int i=0;i<n;i++) {
			if(s1.equals(s2)) {
				return true;
			}
			char last = s1.charAt(s1.length()-1);
			s1=last+s1.substring(0,s1.length()-1);
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(string(s1,s2));

	}

}
