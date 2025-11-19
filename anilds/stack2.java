class stack
{
    int stack[]=new int[5];
    int top=0;
    public void push(int data)
     {
      if(top==stack.length)
        {
            System.out.println("Stack is full ");
        }
        else
        {
            stack[top]=data;
             top++;
        }
    }
    public int pop()
    {
        int data=0;
        if(isEmpty())
        {
            System.out.println("stack is empty");
        }
        else
        {
            top--;
            data=stack[top];
            stack[top]=0;
        }
        return data;
    }
    
    public int peek()
    {
        int data;
        data=stack[top-1];
        return data;
    }

    public void show()
    {
        System.out.println("the elements are:");
        for(int n:stack)
        {
            System.out.println(n+" ");
        }
        System.out.println();
    }

    public boolean isEmpty()
    {
        return top<=0;
    }

    public int size() {
        return top;
    }

}
public class stack2 
{
    public static void main(String[] args) 
    {
        stack nums=new stack();
        System.out.println(nums.isEmpty());

        nums.push(36);
        nums.push(45);
        nums.push(27);
        nums.push(52);
        nums.push(53);
        nums.push(11);
          
        System.out.println("the peek element is :"+nums.peek());
        nums.pop();

        System.out.println("the size of array is:"+nums.size());

        System.out.println(nums.isEmpty());

        nums.show();
        nums.pop();
        nums.show();
        System.out.println("the size of array is:"+nums.size());

       
    }    
}
