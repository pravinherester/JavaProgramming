
public class FindMissingNumber {
    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 6, 5 };
        findmissingNumber(a, a.length);
        int b[] = { 1, 2, 3, 4, 5, 6, 5 };
        findDuplicateNumber(b, b.length);

    }

    private static void findDuplicateNumber(int[] b, int length) {
        int originalSize = length - 1;
        int sum = originalSize * (originalSize + 1) / 2;
        int total = 0;
        for (int i = 0; i < length; i++) {
            total = total + b[i];
        }

        int duplicateNumber = total - sum;
        System.out.println(duplicateNumber);
    }

    private static void findmissingNumber(int[] a, int length) {

        int total = (length + 1) * (length + 2) / 2;
        int x1 = 0;
        int x2 = 0;

        for (int i = 0; i < a.length; i++) {
            total = total - a[i];
            x1 = x1 ^ a[i];
        }

        for (int i = 1; i < a.length + 2; i++) {

            x2 = x2 ^ i;
        }
        System.out.println(total);
        /*
         * System.out.println(x1); System.out.println(x2); System.out.println(x1 ^ x2);
         */

    }

}
