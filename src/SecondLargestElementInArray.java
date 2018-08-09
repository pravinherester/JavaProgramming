
public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        findSecondLargestElement(arr, arr.length);
    }

    private static void findSecondLargestElement(int[] arr, int length) {
        if (length <= 2) {
            System.out.println("input is not valid");
            return;
        }

        int first, second, third;
        first = second = third = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {

          /*  if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
*/
            if (arr[i]>first) {
                third = second;
                second = first;
                first=arr[i];
            }
            if (arr[i] > second && arr[i] != first) {
                second = arr[i];

            }

            if (arr[i] > third && arr[i] != second && arr[i] != first) {
                third = arr[i];

            }

        }

        System.out.println("Largest Value" + first);
        System.out.println("SecondLargestValue" + second);
        System.out.println("thirdLargestValue" + third);
    }

}

/*
 * 1) Initialize two variables first and second to INT_MIN as, first = second = INT_MIN 2) Start traversing the array, a) If the current element in array say arr[i] is greater than first. Then update
 * first and second as, second = first first = arr[i] b) If the current element is in between first and second, then update second to store the value of current variable as second = arr[i] 3) Return
 * the value stored in second.
 * 
 * { 12, 35, 1, 10, 34, 1 }
 * 
 * 1)first =0;second=0 loop start 5 iterations: iteration1 : 2)a 12>0 second=0; first=12; b 12>0&12!=12
 * 
 * iteration2:
 * 
 * 2) a 35>12 second=12; first=35 b 35>12 &35!=35
 * 
 * iteration3
 * 
 * 2) a 1 >35
 * 
 * b 1>12 and 1!=35
 * 
 * itertion 4
 * 
 * 2) a 10>35 b 10>12 and 10!=35
 * 
 * iteration 5:
 * 
 * 2 a 34 >35 b 34>12 and 34!=35 second=34
 * 
 * iteration 6
 * 
 * 2 a 1 >35 b 1>34 and 1!=35
 * 
 * 
 * print (first, second) 34,35
 * 
 */