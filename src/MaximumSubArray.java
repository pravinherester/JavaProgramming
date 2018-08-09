
public class MaximumSubArray {

    public static void main(String[] args) {
        int a[] = { 1, 2, 5,3, 1,0,1,-5 };
        int SumMaxSubarray = findmaxSubArray(a, a.length);
        System.out.println(SumMaxSubarray);

        int SumMaxSubarrayNegative = findMaxNegativeSubArray(a, a.length);
        System.out.println(SumMaxSubarrayNegative);
    }

    private static int findmaxSubArray(int[] a, int length) {
      int maxEndingHere=0;
      int maxSoFar=0;
      
      for(int i =0;i<a.length;i++)
      {
          if(maxEndingHere < 0)
          {
              maxEndingHere=0;
          }
          
          else
          {
              maxEndingHere=a[i]+maxEndingHere;
          }
          
          if(maxEndingHere>maxSoFar)
          {
              maxSoFar=maxEndingHere;
          }
      }
      
      return maxSoFar;
    }

    private static int findMaxNegativeSubArray(int[] a, int length) {
        int maxEndinghere = a[0];
        int maxSoFar = a[0];
        for (int i = 0; i < a.length; i++) {
            maxEndinghere = Math.max(a[i], (a[i]+maxEndinghere));
            maxSoFar = Math.max(maxEndinghere, maxSoFar);
        }
        return maxSoFar;
    }

  
}
