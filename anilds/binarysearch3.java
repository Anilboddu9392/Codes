public class binarysearch3
{
    public static void main(String[] args) 
    {
       int nums[]={1,3,5,7,9,11,13};
       int target=11;

        // METHOD-1
       //int result=binarySearch(nums,target);
       
//        if(result!=-1)
//          System.out.println("the element is :"+ result);
//        else
//          System.out.println("the element is not found ");    
//     }
//     public static int binarySearch(int[] nums, int target) 
//     {
//         int left=0;
//         int right=nums.length-1;
//         while(left<=right)
//         { 
//           int mid=(left+right)/2;

//            if(nums[mid] == target){
//               return mid;
//            }
//            else if(nums[mid] < target){
//               left=mid+1;
//            }
//           else
//               right=mid-1;
//         }
//           return -1;
//     }
// }

//METHOD-2
//USING RECURSIONN OF BINARY

     int result=binarySearch(nums,target,0,nums.length-1);
       if(result!=-1)
         System.out.println("the element is :"+ result);
       else
         System.out.println("the element is not found ");    
    }
     
    public static int binarySearch(int[] nums, int target,int left,int right) 
        {
            // int left=0;
            // int right=nums.length-1;
            if(left<=right){ 
              int mid=(left+right)/2;
              if(nums[mid] == target)
                  return mid;
               else if(nums[mid] < target)
                  return binarySearch(nums, target,mid+1,right);
              else
                  return binarySearch(nums, target,left,mid+1);
            }
              return -1;
         }

   }      
