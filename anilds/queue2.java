class queue 
{
    int queue[]=new int[5];
    int size;
    int front;
    int rear;
    public void enqueue(int data)
    {
        if(! isFull())
        {
        queue[rear]=data;
        rear=(rear+1)%5;
        size=size+1;
        }
        else
        {
            System.out.println("queue is full");
        }
    }
    private boolean isFull()
    {
        return size==5;
    }

    public int dequeue()
    {
        int data=0;
        if(!isEmpty())
        {
        data=queue[front];
        front=(front+1)%5;
        size=size-1;
        }
        else
        {
          System.out.println("the queue is empty :");
        }
        return data;
    }
    private boolean isEmpty() 
    {
        return size==0;
    }
    public int getSize()
    {
        return size;
    }
    public int peek()
    {
        int data=queue[rear-1];
        return data;
    }

    public void show() 
    {
        // //System.out.print("the elements are :" +" ");
        // for(int i=0;i<size;i++)
        // {
        //     System.out.print(queue[(front+1)%5]+" ");
        // }
        System.out.println("the elements are:");
        for(int n:queue)
        {
            System.out.print(n+" ");
        }
        System.out.println();
    }
}
public class queue2 
{
    public static void main(String[] args) 
    {
        queue q =new queue();
        q.enqueue(11);
        q.enqueue(21);
        q.enqueue(31);
        q.show();
        System.out.println("the peek element is :"+q.peek());
        System.out.println("the deleted element is :"+q.dequeue());
        q.show();
        System.out.println("the deleted element is :"+q.dequeue());
        q.show();
        System.out.println("the deleted element is :"+q.dequeue());
        q.show();
        q.enqueue(40);
        q.show();
        q.enqueue(52);
        q.show();
        q.enqueue(70);
        q.show();
        q.enqueue(82);
        q.show();
        q.enqueue(2282);
        q.show();

        System.out.println("the peek element is :"+q.peek());
    }
    
}
