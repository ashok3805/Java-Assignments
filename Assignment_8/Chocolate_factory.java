package Assignment_8;

import java.util.Scanner;

public class Chocolate_factory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0)
				count++;
			else {
				System.out.println(arr[i]);
			}
		}
		for(int i=0;i<count;i++) {
			System.out.println("0");
		}
	}

}
