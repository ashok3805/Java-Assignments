package Assignment3;
import java.util.Scanner;
public class Duplicate_elements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tghe size of the Array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the value of the array: ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Duplicate element of the array:");
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}

	}

}
