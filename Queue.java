public class Queue {
  QNode<String> front, rear;

  public Queue(){
    this.rear=this.front=null;
  }

  public void enqueue(String key){
    QNode<String> node = new QNode<String>(key);
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

  public String peek(){
    return this.front.data;
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
