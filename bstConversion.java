import java.util.*;
import java.util.Scanner;
public class bstConversion {

    class Node{
        int data;
        Node left, right;
        public Node(int value)
        {
            this.data = value;
            left = right = null;
        }
    }
    
    Node root;
    bstConversion()
    {
        root = null;
    }
    
    Node insert(Node node,int key)
    {
        if(node == null)
        {
            node = new Node(key);
        }
        
        if(key < node.data){
            node.left = insert(node.left, key);
        }
        
        else if(key > node.data){
            node.right = insert(node.right, key);
        }
        return node;
    }
    
    void inOrderTraversal(Node node){
        if(node != null){
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }
    
    void postOrderTraversal(Node node){
        if(node != null){
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }
    
    public static void main(String[] args) {

        bstConversion bs = new bstConversion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        int node = sc.nextInt();

        while(node-- > 0)
         {
            int t = sc.nextInt();
            bs.root = bs.insert(bs.root, t);
        }
        System.out.print("Inorder : ");
        bs.inOrderTraversal(bs.root);
        System.out.println();
        
        System.out.print("Post-order : ");
        bs.postOrderTraversal(bs.root);
        
    }
    
}