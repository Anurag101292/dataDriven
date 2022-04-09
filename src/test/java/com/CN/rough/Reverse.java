package com.CN.rough;

public class Reverse {


    static void reverses(String str) {

        char[] inputArray = str.toCharArray();
        char[] result = new char[inputArray.length];

        // Mark spaces in result
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' ';
            }
        }
        // Traverse input string from beginning
        // and put characters in result from end
        int j = result.length - 1;
        for (int i = 0; i < inputArray.length; i++) {

            // Ignore spaces in input string
            if (inputArray[i] != ' ') {

                // ignore spaces in result.
                if (result[j] == ' ') {
                    j--;
                }
                result[j] = inputArray[i];
                j--;
            }
        }
        System.out.println(String.valueOf(result));
    }


    public static String reverse_at_place(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] ch = str.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while (i < j) {
            swap(ch, i, j);
            i++;
            j--;
        }
        return new String(ch);
    }
    public static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static void isReverse(String str) {
        char[] ch = str.toCharArray();
        int l = ch.length - 1;
        for (int i = l; i >= 0; i--) {
            System.out.print(ch[i]);
        } }
    // Java program to ReverseString using StringBuil
    public static void newreverse(String input) {

        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder
        // input1
        input1.append(input);

        // reverse StringBuilder input1
        input1.reverse();

        // print reversed String
        System.out.println(input1);
    }


    public static void main(String[] args) {
        isReverse("internship at geeks for geeks");
        System.out.println();
        reverses("internship at geeks for geeks");
        newreverse("internship at geeks for geeks");
        System.out.println("rev at place"+reverse_at_place("internship at geeks for geeks"));


    }
}
