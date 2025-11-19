class stack
{
    int capacity=2;
    int stack[]=new int[capacity];
    int top=0;
    public void push(int data)
    {
        if(size()==capacity)
            expand();
        stack[top]=data;
        top++;     
    }
    private void expand() 
    {
        int length=size();
        int newStack[]=new int[capacity*2];
        System.arraycopy(stack,0, newStack,0, length);
        stack=newStack;
        capacity *=2;
    }
    int size() 
    {
        return top;
    }

    public int pop()
    {
        int data=0;
        if(isEmpty())
        {
         System.out.println("Stack is empty:");
        }
        else
        {
            top--;
           data=stack[top];
           stack[top]=0;
           shrink();
        }
        return data;
    }
    boolean isEmpty() 
    {
         return top<=0;
    }   
    private void shrink() 
    {
        int length=size();
        if(length<=(capacity/2)/2)
            capacity=capacity/2;
            int newStack[]=new int[capacity];
            System.arraycopy(stack,0, newStack,0, length);
            stack=newStack;   
    }
    public int peek()
    {
        int data=stack[top-1];
        return data;
    }
    public void show()
    {
        System.out.println("the elements:");
        for(int n:stack)
        {
            System.out.print(n+" ");

        }
        System.out.println( );
    }

}
public class dynamic_stack 
{
    public static void main(String[] args) 
    {
        stack nums=new stack();
        nums.push(17);
        nums.show();
        nums.push(27);
        nums.show();
        nums.push(37);
        nums.show();
        nums.push(47);
        nums.show();
        nums.push(57);
        nums.show();

        nums.pop();
        nums.show();
        nums.pop();
        nums.show();
        nums.pop();
        nums.show();
        nums.pop();
        nums.show();


        System.out.println(nums.isEmpty());
        System.out.println(nums.peek());
        System.out.println(nums.size());

    }
    
}
