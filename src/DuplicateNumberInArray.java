import java.util.Scanner;

public class DuplicateNumberInArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size");
        int arrSize = Integer.parseInt(scan.nextLine());
        int a[] = new int[arrSize];
        System.out.println("Enter array Elements");
        
       for (int i = 0; i < arrSize; i++) {
            a[i] = Integer.parseInt(scan.nextLine());
       }  
      
        for (int i = 0; i < a.length-1; i++) {

            for (int j =i+1; j < a.length; j++) {
                if (a[i] == a[j] ) {
                    System.out.println("Duplicate value" + a[j]);

                }
            }
        }
    }
}

