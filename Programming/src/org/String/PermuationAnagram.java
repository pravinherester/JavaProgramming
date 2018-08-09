package org.String;

public class PermuationAnagram {
    public static void main(String[] args) {

        String a = "aabc";
        int n = a.length();
        /*
         * for(int i=0;i<a.length();i++) { for (int j=0;j<a.length();j++) System.out.println( swap(a, i, j)); }
         */

        premutation(a, 0, n - 1);

    }

    public static String swap(String a, int i, int j) {
        char[] ch = a.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }

    public static void premutation(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                // System.out.println(str);
                premutation(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }
}
