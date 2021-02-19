import java.util.LinkedList;
import java.util.Queue;

public class Tree {
  TNode<String> root;

  public void Node(){
    this.root=null;
  }

  public void insert(TNode<String> node, String key){
    if(root== null) this.root= new TNode<String>(key);

    Queue<TNode<String>> q = new LinkedList<TNode<String>>();
    q.add(node);

    while(!q.isEmpty()){
      node = q.peek();
      q.remove();
      if(node.left==null){
        node.left= new TNode<String>(key);
        break;
      } 
      else{ q.add(node.left);}

      if(node.right==null){ node.right= new TNode<String>(key);
        break;}
      else {q.add(node.right);}
      }
  }


  public void InOrderTraversak(TNode<String> node) {
    if(node==null) return;
    InOrderTraversak(node.left);
    System.out.print(node.data+" -> ");
    InOrderTraversak(node.right);
  }

  public static void main(String[] args){
    Tree T = new Tree();
    T.root= new TNode<String>("A");
    T.root.left = new TNode<String>("B");
    T.root.right = new TNode<String>("C");

    T.InOrderTraversak(T.root);

    T.insert(T.root, "D");
    T.insert(T.root, "E");
    System.out.println("");
    T.InOrderTraversak(T.root);
  }
}
