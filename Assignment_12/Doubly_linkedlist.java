package Assignment_12;
import java.util.Scanner;

class Node{
	int data;
	Node prev;
	Node next;
	Node(int data){
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}
class Doubly_linked{
	Node head;
	
	void begin(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		if(head!=null)
			head.prev = newNode;
		head = newNode;
	}
	void middle(int data) {
		Node newNode = new Node(data);
		Node temp = head;
		int count = 1;
		while(temp!=null && count<2) {
			temp = temp.next;
			count++;
		}
		if(temp!=null && temp.next!=null) {
			newNode.next = temp.next;
			newNode.prev = temp;
			temp.next = newNode;
			temp.next.prev = newNode;
		}
		
	}
	
	void DeleteFirst() {
		if(head == null)return;
		head = head.next;
		if(head!=null) {
			head.prev = null;
		}
	}
	
	void DeleteLast() {
		if(head == null)return;
		if(head.next == null) {
			head = null;
			return;
		}
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.prev.next = null;
	}
	void DeleteMiddle() {
		Node temp = head;
		int count = 1;
		while(temp.next!=null && count<3) {
			temp = temp.next;
			count++;
		}
		if(temp!=null && temp.prev!=null && temp.next!=null) {
			temp.next.prev = temp.prev;
			temp.prev.next = temp.next;
		}
	}
	void end(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
		}
	}
	void print() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" --> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
//	void back() {
//		Node temp = head;
//		while(temp.next!=null) {
//			temp = temp.next;		
//		}
//		Node tail = temp;
//		while(tail!=null) {
//			System.out.print(tail.data+" --> ");
//			tail = tail.prev;
//		}
//		System.out.println("null");
//	}
	
}
public class Doubly_linkedlist {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Doubly_linked dl = new Doubly_linked();
		System.out.println("Enter the number of nodes: ");
		int n = sc.nextInt();
		System.out.println("Enter the values: ");
		for(int i=0;i<n;i++) {
			int value = sc.nextInt();
			dl.end(value);
		}
		System.out.println("Present Nodes : ");
		dl.print();
//		System.out.println("Insert the node at begining : ");
//		dl.begin(90);
//		dl.print();
//		System.out.println("Insert the node at end : ");
//		dl.end(40);
//		dl.print();
		
//		System.out.println("Insert the element in the 3rd position : ");
//		dl.middle(60);
//		dl.print();
//		System.out.println("Delete the first Node : ");
//		dl.DeleteFirst();
//		dl.print();
//		System.out.println("Delete the last node : ");
//		dl.DeleteLast();
//		dl.print();
//		System.out.println("Delete the Middle Node : ");
//		dl.DeleteMiddle();
//		dl.print();
//		System.out.println("Forward order : ");
//		dl.print();
		
		System.out.println("Delete the Middle Node : ");
		dl.DeleteMiddle();
		dl.print();
		
	}

}
