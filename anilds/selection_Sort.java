public class selection_Sort
{
    public static void main(String[] args) 
    {
        int nums[]={6,2,4,8,3,7};
        int size=nums.length;
        int temp=0;
        int minIndex=-1;

        System.out.println("before sorting...");
        for(int num:nums){
           System.out.print(num+" ");
        }
        
        for(int i=0;i<size-1;i++)
        {
            minIndex=i;
            for(int j=i+1;j<size;j++)
            {
                if(nums[minIndex]>nums[j]) {
                    minIndex=j;
                }
            temp=nums[minIndex];
            nums[minIndex]=nums[j];
            nums[j]=temp;
             }
        }
        System.out.println();
        System.out.println("After sorting...");
        for(int num1:nums){
            System.out.print(num1+" ");
        }  
    }
}
