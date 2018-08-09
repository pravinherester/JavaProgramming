import java.util.Scanner;

public class ProductArray {
    public static void main(String[] args) {

        System.out.println("Number of test cases");
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            System.out.println("Enter the array size of #" + (i + 1) + "testcase");
            int arraySize = sc.nextInt();
            int arr[] = new int[arraySize];
            System.out.println("Enter the" + arraySize + "Elements");
            for (int j = 0; j < arraySize; j++) {
                arr[j] = sc.nextInt();
            }

            for (int j = 0; j < arr.length; j++) {
                int prod[] = new int[arr.length];
                prod[j] = prod(arr, arr[j]);
                System.out.println(prod[j]);

            }
        }

    }

    private static int prod(int[] a, int j) {
        int prod = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != j)
                prod *= a[i];
        }
        return prod;

    }

}
