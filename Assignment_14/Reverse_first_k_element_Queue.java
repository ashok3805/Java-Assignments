package Assignment_14;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class Reverse_first_k_element_Queue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new ArrayDeque<>();
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int data = sc.nextInt();
			q.offer(data);
		}
		System.out.print("Queue : "+ q +" ");
		Stack<Integer> st = new Stack<>();
		int k = sc.nextInt();
		int len = q.size()-k;
		while(!q.isEmpty() && k>0) {
			st.push(q.remove());
			k--;
		}
		while(!st.isEmpty()) {
			q.offer(st.pop());
		}
		while(len>0) {
			q.offer(q.remove());
			len--;
		}
		System.out.println("Reversing the Queue : "+q);
	}
	
	
}
