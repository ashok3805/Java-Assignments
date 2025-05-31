package Assignment3;
import java.util.Scanner;
public class Search_an_element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the value of the array:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the search element:");
		int s = sc.nextInt();
		int flag=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==s) {
				System.out.println("Index of the array: "+i);
				flag++;
			}
		}
		if(flag==0) {
			System.out.println("Not found");
		}

	}

}
