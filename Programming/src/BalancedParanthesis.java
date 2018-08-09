import java.util.Stack;

public class BalancedParanthesis {

    public static void main(String[] args) {

        char exp[] = { '{', '(', ')', '}', '[', ']' ,'{','}'};
        if (checkforBalance(exp)) {
            System.out.println("balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }

    private static boolean checkforBalance(char[] exp) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < exp.length; i++) {
            if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
                stack.push(exp[i]);
            else {
                if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        checkforMatch(exp[i], stack.pop());
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean checkforMatch(char char1, Character char2) {

        if (char1 == '}' && char2 == '{') {
            return true;
        } else if (char1 == ']' && char2 == '[') {
            return true;
        }

        else if (char1 == ')' && char2 == '(') {
            return true;
        }
        return false;
    }

}
