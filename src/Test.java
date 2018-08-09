import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       

        System.out.println("Number of test cases");
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            System.out.println("Enter the array size of #" + (i + 1) + "testcase");
            int arraySize = sc.nextInt();
            int arr[] = new int[arraySize];
            int brr[] = new int[arraySize];
            System.out.println("Enter the"+arraySize+"Elements");
            for (int j = 0; j < arraySize; j++) {
                arr[j] = sc.nextInt();
            }
         
            int flag=0;

            for (int k= 1; k < arraySize -1; k++) {
                brr = Arrays.copyOf(arr, arraySize);
                Arrays.sort(brr,0,k);
                Arrays.sort(brr,k+1,arraySize);
                
                if(arr[k]>brr[k-1] && arr[k]<brr[k+1])
                {
                    
                    System.out.println(arr[k]);
                    break;
                }
                else
                {
                    if(flag==0)
                    System.out.println("-1");
                }
            }

            
        }

    }
}