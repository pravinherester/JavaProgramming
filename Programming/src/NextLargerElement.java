
public class NextLargerElement {
    public static void main(String[] args) {

        int array[] = { 9, 4, 2, 7, 5, 9 };
        findNextLargerElemt(array, array.length);
    }

    private static void findNextLargerElemt(int[] array, int length) {
       int nexlargerArray[]=new int[length];
       for(int i=0;i<length;i++)
       {
           for (int j=i+1;j<length;j++)
           {
               if(array[i]<array[j])
               {
                   nexlargerArray[i]=array[j];
                   break;
               }
           }
       }
       
       for(int i=0;i<nexlargerArray.length;i++)
       {
           System.out.println(nexlargerArray[i]);
       }
    }
}
