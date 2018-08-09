package org.programming.arrays;

public class SubArraySum {

    public static void main(String[] args) {
        SubArraySum arraysum = new SubArraySum();
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 9;
        arraysum.subArraySum(arr, n, sum);
    }

    private void subArraySum(int[] arr, int n, int sum) {
       int curr_subArraySum=arr[0];
       int start = 0, i;
       for(i=1;i<n;i++)
       {
           while(curr_subArraySum>sum && start<i-1)
           {
               curr_subArraySum=curr_subArraySum-arr[i];
               start++;
           }
           curr_subArraySum=arr[i]+curr_subArraySum;
           if(sum==curr_subArraySum)
           {
               System.out.println("Sub Array found");
               break;
           }
           
           // Add this element to curr_sum
           if (i < n)
               curr_subArraySum = curr_subArraySum + arr[i];
            
       }
         
       }
        
    }

   

