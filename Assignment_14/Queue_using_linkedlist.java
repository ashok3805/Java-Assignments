package Assignment_14;

class Node{
	int data;
	Node next = null;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
public class Queue_using_linkedlist {
	Node rear,front;
	public Queue_using_linkedlist() {
		front= rear = null;
	}
	
	void Enqueue(int data) {
		Node newNode = new Node(data);
		if(rear == null) {
			front = rear = newNode;
			return;
		}
		rear.next = newNode;
		rear = newNode;
	}
	void Deque() {
		if(front == null) {
			System.out.print("Queue is Empty");
			return;
		}
		front = front.next;
		if(front==null)
			rear = null;
	}
	int peek() {
		if(front==null) {
			System.out.print("Queue is Empty");
			return -1;
		}
		return front.data;
		
	}
	void display() {
		
		if(front==null) {
			System.out.print("Queue is Empty");
			return;
		}
		Node temp = front;
		while(temp!=null) {
			System.out.print(temp.data+" --> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		Queue_using_linkedlist q = new Queue_using_linkedlist();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		q.display();
		q.Deque();
		q.display();
		System.out.print("Front element : ");
		System.out.print(q.peek());
		}

}
