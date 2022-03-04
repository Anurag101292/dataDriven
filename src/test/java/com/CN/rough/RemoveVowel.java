package com.CN.rough;

public class RemoveVowel {


    public static String removeVowel(String str)
    {
        ////////////////////////////////////////////str.replaceAll()
        String str1=str.replaceAll("[aeiouAEIOU]","");
        System.out.print(str1);
        

        return str1;
    }

    public static void main(String[] args) {
        removeVowel("Anurag");
    }
}
