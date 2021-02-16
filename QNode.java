public class QNode<T> {
  T data;
  QNode<T> next;

  public QNode(T data){
    this.data=data;
    next=null;
  }
}
