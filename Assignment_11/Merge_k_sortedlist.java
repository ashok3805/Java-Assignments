package Assignment_11;
class ListNode{
	int data;
	ListNode next;
	ListNode(int data){
		this.data = data;
		this.next = null;
	}
}
public class Merge_k_sortedlist {
	    public static ListNode mergeKLists(ListNode[] lists) {
	        if(lists==null || lists.length==0)return null;
	        ListNode head = lists[0];
	        for(int i=1;i<lists.length;i++){
	            head = mergetwoList(head,lists[i]);
	        }
	        return head;
	    }
	     static ListNode mergetwoList(ListNode list1, ListNode list2){
	            ListNode res = new ListNode(0);
	            ListNode head = res;
	            while(list1!=null && list2!=null){
	                if(list1.data<list2.data){
	                    res.next = list1;
	                    list1 = list1.next;
	                }
	                else{
	                    res.next = list2;
	                    list2 = list2.next;
	                }
	                res = res.next;
	            }
	            if(list1!=null){
	                res.next = list1;
	            }
	            else{
	                res.next = list2;
	            }
	            return head.next;
	    }
	      public static void main(String[] args) {
	    	  int[][] lists = {{1,4,5},{1,3,4},{2,6}};
	    	  ListNode[] list = new ListNode[lists.length];
	    	  for(int i=0;i<lists.length;i++) {
	    		  ListNode res = new ListNode(0);
	    		  ListNode temp = res;
	    		  for(int val : lists[i]) {
	    			  temp.next = new ListNode(val);
	    			  temp = temp.next;
	    		  }
	    		  list[i] = res.next;
	    	  }
	    	  ListNode merge = mergeKLists(list);
	    	  while(merge != null) {
	    		  System.out.print(merge.data+" ");
	    		  merge = merge.next;
	    	  }
	    	  
	      }
	}

