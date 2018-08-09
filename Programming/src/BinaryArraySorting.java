public class BinaryArraySorting {

    public static void main(String[] args) {
        int a[] = { 1, 1, 0, 1, 0, 1 };
        int modifiedArray[] = sortBinaryArray(a, a.length);
        displayArray(modifiedArray);
    }

    private static int[] sortBinaryArray(int[] a, int length) {

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (a[j] ==0) {
                    swap(a, i, j);
                    break;
                }
            }
        }
        return a;
    }
    
    
   /* private static int[] sortBinaryArray(int[] a, int length) {
        int array[] = a;
        for (int i = 0; i < length-1; i++) {
            for(int j=i+1;j<length -1;j++)
            {
            if (array[j] == 0) {
                array = swap(a, j, i);
                break;
            } 
            }
        }
        return array;
    }*/

    private static int[] swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;

    }

    private static void displayArray(int[] modifiedArray) {
        for (int i = 0; i < modifiedArray.length; i++) {
            System.out.println(modifiedArray[i]);
        }

    }

}
