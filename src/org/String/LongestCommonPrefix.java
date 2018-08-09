package org.String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String a[] = { "abbb", "abb", "abbad", "abcc" };

        String min = a[0];
        for (String s : a) {
            if (s.length() < min.length()) {
                min = s;
            }
        }
        System.out.println(min);

        for (String s : a) {
            if (!s.startsWith(min)) {
                min = min.substring(0, (min.length() - 1));
            }

        }
        System.out.println(min);

    }

}
