public class P001{
  Node head;
	 
	static class Node {
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}

  int getNthNode(int position){

  }

  public static void main(String[] args) {
    P001 ll = new P001();
		ll.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		ll.head.next = second;
		second.next=third;

		
  }




}