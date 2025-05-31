package Assignment3;
import java.util.Scanner;
public class Left_rotation_by_kth_Position {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the value of the array:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the position:");
		int k = sc.nextInt();
		System.out.println("Final values:");
		for(int i=k;i<n;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<=k;i++) {
			System.out.println(arr[i]);
		}
	}

}
