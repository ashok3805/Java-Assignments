package Assignment_17;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
		left = right = null;
	}
}
public class count_no_of_leafnodes {
	
	static int countLeafNode(Node root) {
	
		if(root == null)
			return 0;
//		Queue<Node> q = new LinkedList<>();
//		q.offer(root);
//		int count = 1;
//		while(!q.isEmpty()) {
//			Node temp = q.poll();
//			if(temp.left == null && temp.right == null) {
//				count++;
//			}
//			if(temp.left!=null) q.offer(temp.left);
//			if(temp.right!=null) q.offer(temp.right);
//		}
//		return count;
		if(root.left==null && root.right==null) {
			return 1;
		}
		return countLeafNode(root.left)+countLeafNode(root.right);
		
		
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
//		root.right.left = new Node(60);
//		root.right.right = new Node(70);
		System.out.print(countLeafNode(root));
	}
}
