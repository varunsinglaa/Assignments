import java.util.*;
import java.io.*;
class Node {
  Node left;
  Node right;
  int data;
}

class Main {
  public void levelOrder(Node node)
 {
    if (node == null) 
{
      return;
    }
    
    int h = getHeight(node);
    
    for(int i = 0; i <= h; i++)
 {
      GivenLevel(node, i + 1);
      System.out.println();
    }
  }
  
  public int getHeight(Node node)
 {
    if(node == null){
      return -1;
    }
    
    return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
  }
  
  public void GivenLevel(Node node, int level) {
    if(node == null)
     {
      return;
    }
    
    if(level == 1)
     {
      System.out.print(node.data + " ");
      return;
    }
    
    GivenLevel(node.left, level - 1);
    GivenLevel(node.right, level - 1);
  }

  public Node NewNode(int val) {
    Node newNode = new Node();
    newNode.data = val;
    newNode.left = null;
    newNode.right = null;
    return newNode;
  }
}

public class LevelOrder 
{

  public static void main(String[] args) 
{

    Main t = new Main();

    Node root = t.NewNode(10);
    root.left = t.NewNode(5);
    root.right = t.NewNode(3);
    root.left.left = t.NewNode(6);
    root.left.right = t.NewNode(8);
    root.right.right = t.NewNode(1);
     root.left.left.left = t.NewNode(10);
     root.right.right.left = t.NewNode(4);
     root.left.right.left = t.NewNode(5);
    root.left.right.right = t.NewNode(9);
    root.right.right.left.left = t.NewNode(7);

    t.levelOrder(root);
  }

}