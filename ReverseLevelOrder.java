import java.util.*;

class Node 
{
  Node left;
  Node right;
  int data;
}

class Reverse {
  
  public void reverseLevelOrder(Node root)
  {
    if (root == null)
    {
      return;
    }
    
    int height = Height(root);
    
    
    for(int i = height; i >= 0; i--)
    {
      print(root, i + 1);
      
      System.out.println();
    }
  }
  
  public int Height(Node root) 
  {
    
    if(root == null)
    {
      return -1;
    }
    
    return Math.max(Height(root.left), Height(root.right)) + 1;
  }
  
  public void print(Node root, int level) 
  {
  	
    if(root == null) 
    {
      return;
    }
    
    if(level == 1) 
    {
      System.out.print(root.data+" ");
      return;
    }
    
    print(root.left, level - 1);
    print(root.right, level - 1);
  }

  public Node Node1(int val) 
  
  {
    Node newNode = new Node();
    newNode.data = val;
    newNode.left = null;
    newNode.right = null;
    
    
    return newNode;
  }
}

public class ReverseLevelOrder {

  public static void main(String[] args) {

    Reverse t = new Reverse();

    Node root = t.Node1(1);
    root.left = t.Node1(8);
    root.right = t.Node1(4);
    root.right.left = t.Node1(3);
    root.left.right = t.Node1(7);
    root.left.right.left = t.Node1(5);
    root.left.right.right = t.Node1(10);
    root.right.right = t.Node1(6);
    root.right.right.left = t.Node1(2);
    root.right.right.right = t.Node1(12);

    t.reverseLevelOrder(root);
  }

}