package Assignment_4;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram_check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String : ");
		String str1 = sc.nextLine();
		System.out.println("Enter the Second String : ");
		String str2 = sc.nextLine();
		char[] arr1 = str1.replace(" ", "").toLowerCase().toCharArray();
		char[] arr2 = str2.replace(" ", "").toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1,arr2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}

	}

}
