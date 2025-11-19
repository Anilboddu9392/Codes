class Node
{
    int data;
    Node left;
    Node right;

   public Node(int data)
    {
      this.data=data;
    }
}
class binary_Tree
{
    Node root;
    public void insert(int data)
    {
        root=insertRec(root,data);
    }
    private Node insertRec(Node root, int data) //RECURSION 
    {
       if(root==null)
         root=new Node(data);
       else if(data < root.data)
       {
         root.left=insertRec(root.left, data);
       }  
       else if(data > root.data)
       {
         root.right=insertRec(root.right, data);
       }  
       return root;
    }

    //for printing we use here "INORDER()" i.e "left root right"
    public void inorder()
    {
        inorderRec(root);
    }
    public void inorderRec(Node root) //RECURSION
    {
       if(root!=null)
      {
         inorderRec(root.left);
         System.out.print(root.data +" ");
         inorderRec(root.right);
      }
    }

    //for printing we use here "PREORDER()" i.e "root left right"
    public void preorder()
    {
        preorderRec(root);
    }
    public void preorderRec(Node root) //RECURSION
    {
        if(root!=null)
        {
           System.out.print(root.data +" ");
           preorderRec(root.left);
           preorderRec(root.right);
        }
    }
    //for printing we use here "POSTORDER()" i.e "left right root"
    public void postorder() 
    {
        postorderRec(root);
    }
    public void postorderRec(Node root)//RECURSION
    {
        if(root!=null)
       {
         preorderRec(root.left);
         preorderRec(root.right);
         System.out.print(root.data +" ");
      }
      
    }
}
public class tree2 
{
    public static void main(String[] args) 
    {
        binary_Tree tree=new binary_Tree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);
        
    System.out.print("the inorder elements are :");
       tree.inorder();
      
       System.out.println( );
       System.out.print("the preorder elements are :");
       tree.preorder();

       System.out.println( );
       System.out.print("the postorder elements are :");
       tree.postorder();
             
    }
}
