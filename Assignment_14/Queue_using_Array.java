package Assignment_14;

public class Queue_using_Array {
	int front = 0,rear = -1;
	int max = 5;
	int[] arr = new int[max];
		
		public void Enque(int data) {
			if(rear == max-1) {
				System.out.println("Queue is Full");
			}
			arr[++rear] = data;
		}
		public void Deque() {
			
			if(front > rear) {
				System.out.println("Queue is Empty");
			}
			System.out.println("Deque element : "+arr[front]);
			front++;
		}
		public void display() {
			if(front > rear) {
				System.out.println("Queue is Empty");
			}
			for(int i=front;i<=rear;i++) {
				System.out.print(arr[i]+" ");
			}
		}
	
	 public static void main(String[] args) {
		 Queue_using_Array q = new Queue_using_Array();
		 q.Enque(10);
		 q.Enque(20);
		 q.Enque(30);
		 System.out.println("display the array");
		 q.display();
		 q.Deque();
		 q.display();
		 q.Deque();
		 q.display();
	 }
}
