import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = Integer.parseInt(scan.nextLine());
        reverseMethod(num);
        System.out.println();
        usingWhileLoop(num);
    }

    private static int reverseMethod(int num) {
        if (num < 10) {
            System.out.print(num);
            return num;
        }

        else {
            System.out.print(num % 10);
            reverseMethod(num / 10);
        }
        return num;

    }

    private static void usingWhileLoop(int num) {
        int reverseNum = 0;

        while (num != 0) {
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + num % 10;
            num = num / 10;
        }
        System.out.println(reverseNum);

    }

}
