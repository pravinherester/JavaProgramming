package org.String;

public class ReverseSentence {
    public static void main(String[] args) {

        String a = "abc.efg.ijk";
        String b[] = a.split("\\.");
        for (int i = 0; i < b.length; i++) {
            /*
             * StringBuilder s = new StringBuilder(); s.append(b[i]); s.reverse(); b[i] = s.toString(); System.out.println(b[i]);
             */
            b[i] = reverseAString(b[i]);
        }

        a = String.join(".", b);
        System.out.println(a);
    }

    public static String reverseAString(String word) {
        char[] chrarray = word.toCharArray();
        for (int i = 0; i < chrarray.length / 2; i++) {
            char temp = chrarray[i];
            chrarray[i] = chrarray[chrarray.length - 1 - i];
            chrarray[chrarray.length - 1 - i] = temp;
        }
        return new String(chrarray);
    }

}
