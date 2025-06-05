package Assignment_11;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
public class Delete_Node {
	
	public void DeleteNode(Node node) {
		if(node == null || node.next == null)return;
        node.data = node.next.data;
        node.next = node.next.next;
        }
	public static void main(String[] args) {
		Node head = new Node(4);
		head.next = new Node(5);
		head.next.next = new Node(1);
		head.next.next.next = new Node(9);
		
		Node delete = head.next;
		
		Delete_Node dl = new Delete_Node();
		dl.DeleteNode(delete);
		
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
	}
}

