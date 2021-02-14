
public class LinkedList {
	Node head;
	 
	static class Node {
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	 void traverse(){
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp= temp.next;
		}
	}
	 
	 void insertAtBack(Node node) {
		 Node temp = head;
		 while(temp!=null) {
			 if(temp.next==null) {
				 temp.next=node;
				 break;
			 }
			 temp=temp.next;
			 
		 }
		 
	 }
	 
	 void insertAtFront(Node node ) {
		 Node temp = head;
		 node.next=temp;
		 head = node;
	 }
	 
	 void insertAfter(int data, Node node) {
		 Node temp = head;
		 while(temp!=null) {
			 if(temp.data == data) {
				node.next=temp.next;
				temp.next=node;
				break;
			 }
			 temp= temp.next;
		 }
	 }
	 
	 void deleteAtGivenPosition(int position) {
		 
	 }
	 
	 int getLength(Node node) {
		 
		 if (node.next!=null) {
			 return 1+ getLength(node.next);
		 }
		 return 1;
	 };
	 
	 boolean searchElement(Node head, int x) {
		 if (head == null) return false;
		 if(head.data== x) return true;
		 return searchElement(head.next,x);
		
	 }

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		ll.head.next = second;
		second.next=third;
		
		Node fourth = new Node(4);
		ll.insertAtBack(fourth);
		Node fifth = new Node(5);
		ll.insertAtFront(fifth);
		Node sixth = new Node(6);
		ll.insertAfter(4,sixth);
//		ll.traverse();

		System.out.println(ll.getLength(ll.head));
		
		System.out.println(ll.searchElement(ll.head,6));
		
		

	}

}
