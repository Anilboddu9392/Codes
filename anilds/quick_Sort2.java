public class quick_Sort2 
{
    public static void quickSort(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int pi=partition(arr,low,high);
            quickSort(arr, low, pi-1);
            quickSort(arr,pi+1,high);
        }
    }   
    private static int partition(int[] arr, int low, int high) 
    {
                   int pivot=arr[high];
                   int i=low-1;
                   for(int j=low;j<high;j++)
                   {
                       if(arr[j]<pivot)
                      {
                          i++;
                          int temp=arr[i];
                          arr[i]=arr[j];
                          arr[j]=temp;                        
                      }
                   }
                   //for last two elements
                  int temp=arr[i+1];
                  arr[i+1]=arr[high];
                  arr[high]=temp;
                
                
                 return i+1;

    }
    
    public static void main(String[] args) 
    {
        int arr[]={5,3,8,1,4,2};
        quickSort(arr,0,arr.length-1);

        for(int nums:arr)
        {
            System.out.print(nums+" ");
        }
        
    }
    
}
