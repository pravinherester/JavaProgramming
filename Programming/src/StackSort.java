import java.util.Stack;

public class StackSort {

    public static void main(String[] args) {
        Stack<Integer> stac = new Stack<Integer>();
        stac.add(5);
        stac.add(9);
        stac.add(1);
        stac.add(4);
        stac.add(6);
        stac.add(7);
     //   Stack<Integer> Output = sortStack(stac);
         sortStackRecursiveMethod(stac);
        System.out.println(stac);
    }

    private static void sortStackRecursiveMethod(Stack<Integer> stac) {
        if (!stac.isEmpty()) {
            int x = stac.pop();
            sortStackRecursiveMethod(stac);
          
            sortedInsert(stac, x);
        }

    }

    private static void sortedInsert(Stack<Integer> stac, int x) {
        if (stac.isEmpty() || x > stac.peek()) {
            stac.push(x);
            return;
        }
        int temp = stac.pop();
        sortedInsert(stac, x);
        stac.push(temp);

    }

    private static Stack sortStack(Stack<Integer> stac) {
        Stack<Integer> tempStack = new Stack<Integer>();

        while (!stac.isEmpty()) {
            int curr = stac.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > curr) {

                stac.push(tempStack.pop());

            }
            tempStack.push(curr);
        }

        return tempStack;
    }

}
