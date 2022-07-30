package com.CN.rough;

public class LongestSubSeqCount {

    public static void main(String[] args) {

        String a = "ababccbb";
        int len = longsubseq(a);
        System.out.println(len);

    }

    public static int longsubseq(String a) {

        String temp = "";
        int maxlen = -1;
        if (a.isEmpty()) {

            return 0;
        } else if (a.length() == 1) {
            return 1;
        }

        for (char k : a.toCharArray()) {
            String currentValue = String.valueOf(k);
            if (temp.contains(currentValue)) {
                temp = temp.substring(temp.indexOf(currentValue) + 1);
            }
            temp = temp + String.valueOf(k);
            maxlen = Math.max(temp.length(), maxlen);
        }
        return maxlen;

    }
}
