package Assignment_13;

import java.util.Arrays;

public class Stock_span_problem {
	static void calculateSpan(int[] price, int n, int[] span) {
		span[0] = 1;
		for(int i=1;i<n;i++) {
			span[i] = 1;
			for(int j=i-1;(j>=0 && price[i]>=price[j]);j--) {
				span[i]++;
			}
		}
	} 
	static void print(int[] arr, int n) {
			System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] price = {100,80,60,70,60,75,85};
		int n = price.length;
		int[] span = new int[n];
		calculateSpan(price,n,span);
		print(span,n);
		
		

	}

}
