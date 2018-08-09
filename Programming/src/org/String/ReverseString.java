package org.String;

public class ReverseString {
    public static void main(String[] args) {

        String input = "babllo";
        System.out.println(reveseString(input));

        byte[] strArray = input.getBytes();
        byte[] resArray = new byte[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            resArray[i] = strArray[strArray.length - 1 - i];
        }

        System.out.println(new String(resArray));

        StringBuilder s = new StringBuilder();
        s.append(input);
        s.reverse();
        System.out.println(s);

        char[] chrarray = input.toCharArray();
        char[] resCharArray = new char[chrarray.length];
        for (int i = 0; i < chrarray.length; i++) {
            resCharArray[i] = chrarray[chrarray.length - 1 - i];
        }

        System.out.println(new String(resCharArray));

        for (int i = 0; i < chrarray.length / 2; i++) {
            char temp = chrarray[i];
            chrarray[i] = chrarray[chrarray.length - 1 - i];
            chrarray[chrarray.length - 1 - i] = temp;
        }

        System.out.println(new String(chrarray));

    }

    private static String reveseString(String input) {
        String reverse = "";
        if (input.length() == 1) {
            return input;
        } else {
            reverse = reverse + input.charAt(input.length() - 1) + reveseString(input.substring(0, input.length() - 1));
            return reverse;
        }

    }

}
