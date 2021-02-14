/**
Get Element at Nth positon
*/
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
		Node temp = head;
		int count=0;
		while(temp!=null){
			++count;
			if(count== position) return temp.data;
			temp=temp.next;
		}
		return -1;
  }

  public static void main(String[] args) {
    P001 ll = new P001();
		ll.head = new Node(1);
		Node second = new Node(4);
		Node third = new Node(3);
		
		ll.head.next = second;
		second.next=third;

		System.out.println(ll.getNthNode(4));


  }




}