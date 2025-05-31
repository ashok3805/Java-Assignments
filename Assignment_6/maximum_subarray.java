package Assignment_6;
import java.util.Scanner;
public class maximum_subarray {
	static int maximumarray(int[] arr) {
		int res = arr[0]; 
		for(int i=0;i<arr.length;i++) {
			int curr=0;
			for(int j=i;j<arr.length;j++) {
				curr = curr+arr[j];
				res = Math.max(res,curr);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maximumarray(arr));

	}

}
