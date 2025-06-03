package Assignment_9;
import java.util.Scanner;
public class Mountain_Array {

	
	public static int binarySearch(int[] arr,int start,int end,int target,boolean ascending){
		while(start<end) {
			int mid = start+(end-start)/2;
			int mid_val = arr[mid];
			if(mid_val==target) {
				return mid;
			}
			if(ascending) {
				if(target<mid_val) {
					end = mid-1;
				}
				else {
					start = mid+1;					
					}
			}
			else {
				if(target>mid_val) {
					end = mid-1;
				}
				else {
					start = mid+1;
				}
			}
		}
		return -1;
}
	public static void main(String[] args) {
		int[] MountainArray = {1,2,3,4,5,3,1};
		int target = 3;
		int n = MountainArray.length;
		int start = 0;
		int end = n-1;
		int mid = 0;
		while(start<end) {
		    mid = start + (end-start)/2;
			int mid_val = MountainArray[mid];
			int next_val = MountainArray[mid+1];
			if(mid_val<next_val) {
				start = mid+1;
			}
			else {
				end = mid;
			}
		}
		int peak = mid;
		int result = binarySearch(MountainArray,0,peak,target,true);
		if(result!=-1) {
			System.out.println(result);
			return;
		}
		result = binarySearch(MountainArray,peak+1,n-1,target,false);
		if(result!=-1) {
			System.out.println(result);
		}
		else {
			System.out.println("Element not found");
		}
		

	}

}
