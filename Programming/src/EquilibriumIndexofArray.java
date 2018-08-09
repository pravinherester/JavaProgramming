
public class EquilibriumIndexofArray {
    public static void main(String[] args) {
        int a[] = { -7, 1, 5, 2, -4, 3, 0 };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
      
        int leftSum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum - a[i];
            if (leftSum == sum)
                System.out.println(a[i]);

            leftSum = leftSum + a[i];
        }
    }

}
