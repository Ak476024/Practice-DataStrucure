public class TNode<T> {
  T data;
  TNode<T> right,left;

  public TNode(T data){
    this.data=data;
    this.right= this.left=null;
  }
}
