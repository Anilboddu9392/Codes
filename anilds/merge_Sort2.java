public class merge_Sort2 
{
    //DECLARING THE MERGESORT HERE AND "DIVIDING THE ARRY IN SINGLE-ELEMENT-ARRAY"
    public static void mergeSort(int[] arr,int l,int r)
    {
        if(l<r)
        {
           int mid=(l+r)/2;
           mergeSort(arr,l,mid);
           mergeSort(arr,mid+1,r);

           Merge(arr,l,mid,r);//DECLARING THE MERGING FUNCTION HERE
        }
    }

    //MERGE THE ARRAY IN THE ASCENDING USING "MERTGE-FUNCTION"
    private static void Merge(int[] arr, int l, int mid, int r) 
    {
        int n1=mid-l+1;
        int n2=r-mid;
        int larr[]=new int[n1];
        int rarr[]=new int[n2];

        for(int x=0;x<n1;x++)
        {
            larr[x]=arr[l+x];
        }
        for(int x=0;x<n2;x++)
        {
            rarr[x]=arr[mid+1+x];
        }

        int i=0;
        int j=0;
        int k=l;
        //MERGING THE "TWO-ARRAY-ELEMENTS INTO ONE ARRAY-ELEMENT"
        while(i<n1 && j<n2)
        {
            if(larr[i]<=rarr[j])
             {
                arr[k]=larr[i];
                i++;
            }
            else
            {
                arr[k]=rarr[j];
                j++;
            }
            k++;
        }
        //TAKING THE REMANING ELEMENTS AFTER THE COMPARSION OF TWO DIFFERENT ARRAY IS COMPLETED 
        while(i<n1)
        {
            arr[k]=larr[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k]=rarr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) 
    {
        int arr[]={8,5,1,4,6,2};
        System.out.println("Before sorting");
        for(int n:arr){
            System.out.println(n+" ");
        }
        mergeSort(arr,0,arr.length-1);
        
        System.out.println("After sorting");
        for(int n:arr){
            System.out.print(n+" ");
        }       
    }
    
}
