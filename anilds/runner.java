//DECLARING THE VARAIBLES INA CLASS NODE
class Node
{
    int data;
    Node next;
} 
// DOING THE IMPLEMENTATION IN THE CLASS LINKEDLIST2
class linkedlist2 
{
    Node head;//DECLARING THE "HEAD VARIABLE " HERE.
   
    //INSERTING THE NODE AT THE END OF THE LINKED-LIST. 
    public void insert(int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;

        if(head==null)//CHECKING THE LINKED-LIST IS EMPTY OR NOT.
        {
            head=node;
        }
        else //IF IT IS NOT EMPTY ENTER THE ELSE LOOP.
        {
            Node n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
    }

    //INSERTED AT THE BEGGINING OF THE LINKED-LIST.
    public void insertAtStart(int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;
        node.next=head;
        head=node;
    }

    //INSERTED AT A PARTICULAR INDEX IN THE LINKED-LIST.
    public void insertAt(int index,int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;
        
        if(index==0)//IF THE INSERTING INDEX IS AT POSITION "0".
        {
            insertAtStart(data);
        }
        else//OTHERWISE
        {
            Node n=head;
            for(int i=0;i<index-1;i++)
            {
                n=n.next;
            }
            node.next=n.next;
            n.next=node;
        }
    } 

    //deleting a particular element using index value
    public void deleteAt(int index)
    {
        if(index==0)//IF THE DELETING INDEX IS "0" THEN DO THIS.
        {
            head=head.next;
        }
        else //OTHERWISE
        {
            Node n=head;
            Node n1=null;
            for(int i=0;i<index-1;i++)
            {
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;
            System.out.println("the deleted element is:"+n1.data);
        }

    }
    //DISPLAYING ALL THE NODES PRESENT IN THE LINKED-LIST.
    public void show()
    {
        Node node=head;
        while(node.next!=null)
        {
            System.out.println(node.data+" ");
            node=node.next;
        }
        System.out.println(node.data+" ");
    }
}
//MAIN CLASS ,COMPILATION STARTS FROM MAIN-METHOD.
public class  runner
{
    public static void main(String[] args) 
    {
        linkedlist2 list =new linkedlist2();
        list.insert(36);//INSERT AT END.
        list.insert(45);//INSERT AT END.
        list.insert(27);//INSERT AT END.

        list.insertAtStart(17);//INSERT-AT-BEGGINING.

        list.insertAt(3,52);//INSERT-AT-PARTICULAR-INDEX.

        list.deleteAt(3);//DELETING.

        list.show();//DISPLAYING ALL THE ELEMENTS.
    }
}
