public class insertion_sort1
{
    public static void main(String[] args) 
    {
        int arr[]={6,2,4,8,3,7};

       System.out.println("Before elements are:");
        for(int nums:arr)
        {    
              System.out.print(nums+" ");
        }

        for(int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        
        System.out.println();
        System.out.println("After elements are:");
        for(int nums:arr)
        {    
              System.out.print(nums+" ");
        }
    }    
}
