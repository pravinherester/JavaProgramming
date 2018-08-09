import java.util.Scanner;

public class ReadInputScanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array Size");
        int arrSize = Integer.parseInt(scan.nextLine());
        System.out.println(arrSize);
        
        int a[] = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            String token = scan.next();
            a[i] = Integer.parseInt(token);
        }

        int max = a[0];
        int min = a[0];

        for (int i = 1; i < arrSize; i++) {
            if (a[i] > max) {
                max = a[i];
            }

            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        
    }
}
