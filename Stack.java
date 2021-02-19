public class Stack {
  Node<String>front;

  public Stack(){
    this.front=null;
  }

  public void push(String key){
    Node<String> node = new Node<String>(key);
    if(front==null){
      this.front = node;
      return;
    }
    node.next= this.front;
    this.front= node;
  }

  public void pop(){
    if ( this.front==null) return;
    this.front= this.front.next;
  }

  public String peek(){
    return this.front.data;
  }

  public static void main(String[] args){
    Stack s = new Stack();
    s.push("A");
    s.push("B");
    s.push("C");
    s.pop();
    System.out.println(s.peek());

  }


}
