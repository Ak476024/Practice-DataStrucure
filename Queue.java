public class Queue {
  Node<String> front, rear;

  public Queue(){
    this.rear=this.front=null;
  }

  public void enqueue(String key){
    Node<String> node = new Node<String>(key);
    if(this.rear==null){
      this.rear=this.front = node; 
      return;
    } 

    this.rear.next=node;
    this.rear=node;

  }

  public void dequeue(){
    if(this.front==null) return;
    this.front= this.front.next;
    if(this.front==null) this.front=this.rear=null;
    
  }

  public Node<String> peek(){
    return this.front;
  }

  public static void main(String[] args){
    Queue q = new Queue();
    q.enqueue("A");
    q.enqueue("B");
    // System.out.println(q.peek());
    q.dequeue();
    System.out.println(q.peek());
  }

}
